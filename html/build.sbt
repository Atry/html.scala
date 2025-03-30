enablePlugins(ScalaJSPlugin)

enablePlugins(ScalaJSBundlerPlugin)

enablePlugins(Example)

Test / requireJsDomEnv := true

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.2.19" % Test

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.4.0"

libraryDependencies += "com.thoughtworks.binding" %%% "bindable" % "3.0.0"

libraryDependencies += "com.thoughtworks.binding" %%% "binding" % "12.2.0"

libraryDependencies += "net.sourceforge.htmlunit" % "neko-htmlunit" % "2.70.0"

libraryDependencies += "com.thoughtworks.dsl" %%% "macros-reset" % "2.0.0"

libraryDependencies += "com.thoughtworks.dsl" %%% "keywords-await" % "2.0.0" % Test

webpack / version := "5.75.0"
