organization := "org.gulliblytyped.japgolly"
name := "serve-static"
version := "1.13-dt-20190819Z-4e0976"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "express-serve-static-core" % "4.17-dt-20191115Z-c882ef",
  "org.gulliblytyped.japgolly" %%% "mime" % "2.0-dt-20190205Z-fc6f87",
  "org.gulliblytyped.japgolly" %%% "node" % "12.12-dt-20191123Z-b2d3cf",
  "org.gulliblytyped.japgolly" %%% "range-parser" % "1.2-dt-20181016Z-fafbe1",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-6f398d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        