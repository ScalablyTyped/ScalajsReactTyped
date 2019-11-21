organization := "org.gulliblytyped.japgolly"
name := "expo-location"
version := "7.0.0-9b56bf"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "csstype" % "2.6.6-f3bc82",
  "org.gulliblytyped.japgolly" %%% "prop-types" % "15.7-dt-20190924Z-090a31",
  "org.gulliblytyped.japgolly" %%% "react" % "16.9-dt-20191025Z-992e25",
  "org.gulliblytyped.japgolly" %%% "react-native" % "0.60-dt-20191028Z-c92f84",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-c9d0d4",
  "org.gulliblytyped.japgolly" %%% "unimodules__core" % "4.0.0-d959dd",
  "org.gulliblytyped.japgolly" %%% "unimodules__react-native-adapter" % "4.0.0-e01a96")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        