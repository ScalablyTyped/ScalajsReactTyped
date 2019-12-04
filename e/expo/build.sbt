organization := "org.gulliblytyped.japgolly"
name := "expo"
version := "35.0.1-734996"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "csstype" % "2.6.6-42c42f",
  "org.gulliblytyped.japgolly" %%% "expo-asset" % "7.0.0-e21f7d",
  "org.gulliblytyped.japgolly" %%% "expo-constants" % "7.0.1-f0bd2d",
  "org.gulliblytyped.japgolly" %%% "expo-font" % "7.0.0-ac1994",
  "org.gulliblytyped.japgolly" %%% "expo-linear-gradient" % "7.0.1-ee1de7",
  "org.gulliblytyped.japgolly" %%% "expo-sqlite" % "7.0.0-5f4d03",
  "org.gulliblytyped.japgolly" %%% "expo__vector-icons" % "9.0-dt-20190213Z-de9314",
  "org.gulliblytyped.japgolly" %%% "fbemitter" % "2.0.0-dt-20190503Z-1ca0ad",
  "org.gulliblytyped.japgolly" %%% "prop-types" % "15.7-dt-20190924Z-56dadc",
  "org.gulliblytyped.japgolly" %%% "react" % "16.9-dt-20191126Z-082653",
  "org.gulliblytyped.japgolly" %%% "react-native" % "0.60-dt-20191121Z-c756b0",
  "org.gulliblytyped.japgolly" %%% "react-native-vector-icons" % "6.4-dt-20191126Z-9d5408",
  "org.gulliblytyped.japgolly" %%% "react-native-view-shot" % "2.6.0-a533ba",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-ed3398",
  "org.gulliblytyped.japgolly" %%% "unimodules__react-native-adapter" % "4.0.0-c36c8e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        