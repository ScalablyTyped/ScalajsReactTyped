organization := "org.gulliblytyped.japgolly"
name := "expo"
version := "35.0.1-3f3b4d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "csstype" % "2.6.6-f3bc82",
  "org.gulliblytyped.japgolly" %%% "expo-asset" % "7.0.0-710981",
  "org.gulliblytyped.japgolly" %%% "expo-constants" % "7.0.1-66f3b8",
  "org.gulliblytyped.japgolly" %%% "fbemitter" % "2.0.0-dt-20190503Z-206e6c",
  "org.gulliblytyped.japgolly" %%% "prop-types" % "15.7-dt-20190924Z-090a31",
  "org.gulliblytyped.japgolly" %%% "react" % "16.9-dt-20191025Z-864456",
  "org.gulliblytyped.japgolly" %%% "react-native" % "0.60-dt-20191028Z-9edcb0",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-c9d0d4",
  "org.gulliblytyped.japgolly" %%% "unimodules__react-native-adapter" % "4.0.0-85b3af")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        