organization := "org.scalablytyped.japgolly"
name := "antd"
version := "4.0.0-fc0bcd"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "ant-design__react-slick" % "0.25.5-a336d6",
  "org.scalablytyped.japgolly" %%% "csstype" % "2.6.6-ec7cc3",
  "org.scalablytyped.japgolly" %%% "dayjs" % "1.8.20-57075e",
  "org.scalablytyped.japgolly" %%% "moment" % "2.24.0-8e4e98",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20190924Z-d18e40",
  "org.scalablytyped.japgolly" %%% "rc-field-form" % "1.0.1-e6c838",
  "org.scalablytyped.japgolly" %%% "rc-mentions" % "1.0.1-ed2d85",
  "org.scalablytyped.japgolly" %%% "rc-menu" % "8.0.2-e30cf1",
  "org.scalablytyped.japgolly" %%% "rc-notification" % "4.0.0-6485ea",
  "org.scalablytyped.japgolly" %%% "rc-picker" % "1.1.2-d03f09",
  "org.scalablytyped.japgolly" %%% "rc-select" % "v5.9.0-dt-20200226Z-23661a",
  "org.scalablytyped.japgolly" %%% "rc-table" % "7.0.0-eef346",
  "org.scalablytyped.japgolly" %%% "rc-tree" % "1.11-dt-20190212Z-d3c4ce",
  "org.scalablytyped.japgolly" %%% "rc-tree-select" % "3.0.2-39c888",
  "org.scalablytyped.japgolly" %%% "react" % "16.9-dt-20200227Z-a90427",
  "org.scalablytyped.japgolly" %%% "scroll-into-view-if-needed" % "2.2.22-6119fe",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
