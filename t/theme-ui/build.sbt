organization := "org.scalablytyped.japgolly"
name := "theme-ui"
version := "0.3-dt-20200130Z-2832e1"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "csstype" % "2.6.6-ec7cc3",
  "org.scalablytyped.japgolly" %%% "emotion__core" % "10.0.20-0e81d9",
  "org.scalablytyped.japgolly" %%% "emotion__serialize" % "0.11.11-978262",
  "org.scalablytyped.japgolly" %%% "emotion__styled-base" % "10.0.24-f71674",
  "org.scalablytyped.japgolly" %%% "emotion__utils" % "0.11.2-faa2eb",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20190924Z-d18e40",
  "org.scalablytyped.japgolly" %%% "react" % "16.9-dt-20200227Z-a90427",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "styled-system" % "5.1-dt-20200221Z-cf9f59",
  "org.scalablytyped.japgolly" %%% "styled-system__css" % "5.0-dt-20200219Z-6bc167",
  "org.scalablytyped.japgolly" %%% "theme-ui__components" % "0.2-dt-20200225Z-e94d22")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
