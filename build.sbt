name := "scala-2-shenanigans"

version := "0.1"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "2.7.0",
  "org.typelevel" %% "cats-effect" % "3.3.12",
  "org.typelevel" %% "log4cats-core" % "2.3.1",
  "org.typelevel" %% "log4cats-slf4j" % "2.3.1",
  "ch.qos.logback" % "logback-classic" % "1.2.11",
  "net.logstash.logback" % "logstash-logback-encoder" % "7.2"
)

lazy val commonSettings = Seq(
  scalaVersion  := "2.13.6",
  javacOptions += " --illegal-access=warn",
)

lazy val root = (project in file("."))
  .settings(commonSettings: _*)
