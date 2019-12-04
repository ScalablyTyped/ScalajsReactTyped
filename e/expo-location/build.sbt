organization := "org.gulliblytyped.japgolly"
name := "expo-location"
version := "7.0.0-70ee4b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "csstype" % "2.6.6-42c42f",
  "org.gulliblytyped.japgolly" %%% "prop-types" % "15.7-dt-20190924Z-56dadc",
  "org.gulliblytyped.japgolly" %%% "react" % "16.9-dt-20191126Z-082653",
  "org.gulliblytyped.japgolly" %%% "react-native" % "0.60-dt-20191121Z-c756b0",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-ed3398",
  "org.gulliblytyped.japgolly" %%% "unimodules__core" % "4.0.0-d90cb1",
  "org.gulliblytyped.japgolly" %%% "unimodules__react-native-adapter" % "4.0.0-c36c8e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        