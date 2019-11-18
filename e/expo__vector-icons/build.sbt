organization := "org.gulliblytyped.japgolly"
name := "expo__vector-icons"
version := "9.0-dt-20190213Z-97311f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "csstype" % "2.6.6-5023da",
  "org.gulliblytyped.japgolly" %%% "prop-types" % "15.7-dt-20190924Z-2d597e",
  "org.gulliblytyped.japgolly" %%% "react" % "16.9-dt-20191025Z-485300",
  "org.gulliblytyped.japgolly" %%% "react-native" % "0.60-dt-20191028Z-915ef8",
  "org.gulliblytyped.japgolly" %%% "react-native-vector-icons" % "6.4-dt-20190930Z-bb2221",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-b7faa7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        