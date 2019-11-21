organization := "org.gulliblytyped.japgolly"
name := "antd"
version := "3.25.1-78bbc1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "ant-design__create-react-context" % "0.2.4-888d9b",
  "org.gulliblytyped.japgolly" %%% "csstype" % "2.6.6-f3bc82",
  "org.gulliblytyped.japgolly" %%% "moment" % "2.24.0-dcfd2c",
  "org.gulliblytyped.japgolly" %%% "prop-types" % "15.7-dt-20190924Z-090a31",
  "org.gulliblytyped.japgolly" %%% "rc-mentions" % "0.4.1-f89108",
  "org.gulliblytyped.japgolly" %%% "rc-menu" % "7.5.3-6e261a",
  "org.gulliblytyped.japgolly" %%% "react" % "16.9-dt-20191025Z-864456",
  "org.gulliblytyped.japgolly" %%% "react-slick" % "0.23-dt-20190503Z-f662bd",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-c9d0d4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        