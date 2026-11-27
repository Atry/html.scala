addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.21.1")

libraryDependencies += "net.sourceforge.htmlunit" % "htmlunit" % "2.70.0"

libraryDependencies += "com.softwaremill.sttp" %% "circe" % "1.7.2"

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.4.0")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.23.0")

addSbtPlugin("com.thoughtworks.sbt-api-mappings" % "sbt-api-mappings" % "3.1.0")

addSbtPlugin("com.thoughtworks.sbt-scala-js-map" % "sbt-scala-js-map" % "4.1.1")
