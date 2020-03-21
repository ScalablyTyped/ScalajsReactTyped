organization := "org.scalablytyped.japgolly"
name := "antd-mobile-rn"
version := "2.3.3-ba578a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "csstype" % "2.6.6-ec7cc3",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20190924Z-d18e40",
  "org.scalablytyped.japgolly" %%% "rc-gesture" % "0.0.22-02789e",
  "org.scalablytyped.japgolly" %%% "react" % "16.9-dt-20200227Z-a90427",
  "org.scalablytyped.japgolly" %%% "react-native" % "0.61-dt-20200225Z-df5d21",
  "org.scalablytyped.japgolly" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-a43333",
  "org.scalablytyped.japgolly" %%% "rmc-cascader" % "5.0.3-7e71d4",
  "org.scalablytyped.japgolly" %%% "rmc-input-number" % "1.0.5-0f6bd5",
  "org.scalablytyped.japgolly" %%% "rmc-picker" % "5.0.10-3d4c79",
  "org.scalablytyped.japgolly" %%% "rmc-tabs" % "1.2.29-74d8c4",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
