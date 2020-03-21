organization := "org.scalablytyped.japgolly"
name := "expo"
version := "35.0.1-715773"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "csstype" % "2.6.6-ec7cc3",
  "org.scalablytyped.japgolly" %%% "expo-asset" % "7.0.0-9b7e6b",
  "org.scalablytyped.japgolly" %%% "expo-constants" % "7.0.1-471072",
  "org.scalablytyped.japgolly" %%% "expo-font" % "7.0.0-48691c",
  "org.scalablytyped.japgolly" %%% "expo-linear-gradient" % "7.0.1-ae5055",
  "org.scalablytyped.japgolly" %%% "expo-sqlite" % "7.0.0-6c6d30",
  "org.scalablytyped.japgolly" %%% "expo__vector-icons" % "9.0-dt-20190213Z-2c3376",
  "org.scalablytyped.japgolly" %%% "fbemitter" % "2.0.0-dt-20200226Z-322ada",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20190924Z-d18e40",
  "org.scalablytyped.japgolly" %%% "react" % "16.9-dt-20200227Z-a90427",
  "org.scalablytyped.japgolly" %%% "react-native" % "0.61-dt-20200225Z-df5d21",
  "org.scalablytyped.japgolly" %%% "react-native-vector-icons" % "6.4-dt-20191220Z-c1f37d",
  "org.scalablytyped.japgolly" %%% "react-native-view-shot" % "2.6.0-bf99dd",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "unimodules__react-native-adapter" % "4.0.0-6eda88")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
