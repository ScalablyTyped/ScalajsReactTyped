organization := "org.gulliblytyped.japgolly"
name := "react-redux"
version := "7.1-dt-20191018Z-fdb43f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "csstype" % "2.6.6-f3bc82",
  "org.gulliblytyped.japgolly" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-b7ca8c",
  "org.gulliblytyped.japgolly" %%% "prop-types" % "15.7-dt-20190924Z-090a31",
  "org.gulliblytyped.japgolly" %%% "react" % "16.9-dt-20191025Z-864456",
  "org.gulliblytyped.japgolly" %%% "redux" % "4.0.4-30f8e5",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-c9d0d4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        