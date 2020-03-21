organization := "org.scalablytyped.japgolly"
name := "ant-design__react-native"
version := "3.2.2-5b83d0"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "bang88__react-native-drawer-layout" % "2.0.3-12fe1e",
  "org.scalablytyped.japgolly" %%% "csstype" % "2.6.6-ec7cc3",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20190924Z-d18e40",
  "org.scalablytyped.japgolly" %%% "react" % "16.9-dt-20200227Z-a90427",
  "org.scalablytyped.japgolly" %%% "react-native" % "0.61-dt-20200225Z-df5d21",
  "org.scalablytyped.japgolly" %%% "react-native-collapsible" % "1.5.1-002a03",
  "org.scalablytyped.japgolly" %%% "react-native-community__viewpager" % "1.1.7-6a5b82",
  "org.scalablytyped.japgolly" %%% "react-native-modal-popover" % "0.0.12-071e4b",
  "org.scalablytyped.japgolly" %%% "react-native-swipeout" % "2.3.6-7e1c93",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
