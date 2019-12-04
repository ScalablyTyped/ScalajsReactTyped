organization := "org.gulliblytyped.japgolly"
name := "express-serve-static-core"
version := "4.17-dt-20191115Z-b062ae"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "node" % "12.12-dt-20191126Z-fec8d2",
  "org.gulliblytyped.japgolly" %%% "range-parser" % "1.2-dt-20181016Z-0c72b1",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-ed3398")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        