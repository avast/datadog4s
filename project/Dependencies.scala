import sbt._
object Dependencies {
  object Cats {
    val core   = "org.typelevel" %% "cats-core"   % "2.3.1"
    val effect = "org.typelevel" %% "cats-effect" % "2.3.1"
  }

  object Datadog {
    val statsDClient = "com.datadoghq" % "java-dogstatsd-client" % "2.10.5"
  }

  object Http4s {
    val core = "org.http4s" %% "http4s-core" % "0.21.15"
  }

  object Testing {
    val mockitoScalatest = "org.mockito"   %% "mockito-scala-scalatest" % "1.15.1"
    val munit            = "org.scalameta" %% "munit"                   % "0.7.20"
  }

  object Logging {
    val logback = "ch.qos.logback" % "logback-classic" % "1.2.3"
  }

  object Mdoc {
    val libMdoc = "org.scalameta" %% "mdoc" % "2.2.14" excludeAll (ExclusionRule(
      organization = "org.slf4j"
    ))
  }

  object ScalaModules {
    val collectionCompat = "org.scala-lang.modules" %% "scala-collection-compat" % "2.3.1"
  }

}
