organization := "org.gulliblytyped.japgolly"
name := "serve-static"
version := "1.13-dt-20190819Z-b5e0da"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "express-serve-static-core" % "4.17-dt-20191115Z-b062ae",
  "org.gulliblytyped.japgolly" %%% "mime" % "2.0-dt-20191126Z-4d22ae",
  "org.gulliblytyped.japgolly" %%% "node" % "12.12-dt-20191126Z-fec8d2",
  "org.gulliblytyped.japgolly" %%% "range-parser" % "1.2-dt-20181016Z-0c72b1",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-ed3398")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        