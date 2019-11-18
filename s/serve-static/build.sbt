organization := "org.gulliblytyped.japgolly"
name := "serve-static"
version := "1.13-dt-20190819Z-535d5f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "express-serve-static-core" % "4.16-dt-20191101Z-c093b6",
  "org.gulliblytyped.japgolly" %%% "mime" % "2.0-dt-20190205Z-ef6654",
  "org.gulliblytyped.japgolly" %%% "node" % "12.12-dt-20191108Z-baf114",
  "org.gulliblytyped.japgolly" %%% "range-parser" % "1.2-dt-20181016Z-bf3406",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-b7faa7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        