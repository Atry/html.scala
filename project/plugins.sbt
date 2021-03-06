addSbtPlugin("com.thoughtworks.sbt-best-practice" % "sbt-best-practice" % "7.1.1")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.5")

addSbtPlugin("com.dwijnand" % "sbt-dynver" % "4.0.0")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.2")

addSbtPlugin("org.lyranthe.sbt" % "partial-unification" % "1.1.2")

addSbtPlugin("com.thoughtworks.example" % "sbt-example" % "6.0.1")

addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.15.0-0.6")

libraryDependencies += "net.sourceforge.htmlunit" % "htmlunit" % "2.35.0"

libraryDependencies += "io.circe" %% "circe-generic" % "0.11.1"

libraryDependencies += "com.softwaremill.sttp" %% "circe" % "1.6.4"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "0.6.1")
