package outside

import com.thoughtworks.binding.Binding
import com.yang_bo.html.*
import org.scalajs.dom
import org.scalatest.funsuite.AnyFunSuite

class ExternalHtmlInterpolationSpec extends AnyFunSuite:
  test("html interpolation resolves adaptors outside its implementation package") {
    val key = "external-id"
    val element = html"<span id=$key></span>"
    assert(element.value.id == key)

    val child = Binding.Constant(dom.document.createTextNode("child"))
    val parent = html"<div>$child</div>"
    parent.watch()
    try assert(parent.value.textContent == "child")
    finally parent.unwatch()
  }
