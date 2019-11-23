organization := "org.gulliblytyped.japgolly"
name := "expo-file-system"
version := "7.0.0-5079e3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "csstype" % "2.6.6-926676",
  "org.gulliblytyped.japgolly" %%% "prop-types" % "15.7-dt-20190924Z-2e958d",
  "org.gulliblytyped.japgolly" %%% "react" % "16.9-dt-20191122Z-580648",
  "org.gulliblytyped.japgolly" %%% "react-native" % "0.60-dt-20191121Z-06b8d5",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-6f398d",
  "org.gulliblytyped.japgolly" %%% "unimodules__core" % "4.0.0-734425",
  "org.gulliblytyped.japgolly" %%% "unimodules__react-native-adapter" % "4.0.0-9c4e21")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        