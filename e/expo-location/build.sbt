organization := "org.gulliblytyped.japgolly"
name := "expo-location"
version := "7.0.0-e912c1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "csstype" % "2.6.6-5023da",
  "org.gulliblytyped.japgolly" %%% "prop-types" % "15.7-dt-20190924Z-2d597e",
  "org.gulliblytyped.japgolly" %%% "react" % "16.9-dt-20191025Z-485300",
  "org.gulliblytyped.japgolly" %%% "react-native" % "0.60-dt-20191028Z-915ef8",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-b7faa7",
  "org.gulliblytyped.japgolly" %%% "unimodules__core" % "4.0.0-cb3b58",
  "org.gulliblytyped.japgolly" %%% "unimodules__react-native-adapter" % "4.0.0-3d2260")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        