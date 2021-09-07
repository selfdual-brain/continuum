name := "continuum"

version := "0.1"

scalaVersion := "2.13.6"

idePackagePrefix := Some("com.selfdualbrain.continuum")

libraryDependencies ++= {
  Seq(
    "ch.qos.logback" % "logback-classic" % "1.1.7",
    "org.scala-lang.modules" %% "scala-collection-contrib" % "0.2.2",
    "org.scalatest" %% "scalatest" % "3.2.3" % Test
  )
}
