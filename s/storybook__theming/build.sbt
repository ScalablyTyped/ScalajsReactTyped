organization := "org.scalablytyped.japgolly"
name := "storybook__theming"
version := "5.3.13-e2d395"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "csstype" % "2.6.6-ec7cc3",
  "org.scalablytyped.japgolly" %%% "emotion-theming" % "10.0.27-781279",
  "org.scalablytyped.japgolly" %%% "emotion__core" % "10.0.20-0e81d9",
  "org.scalablytyped.japgolly" %%% "emotion__serialize" % "0.11.11-978262",
  "org.scalablytyped.japgolly" %%% "emotion__styled" % "10.0.23-12e386",
  "org.scalablytyped.japgolly" %%% "emotion__styled-base" % "10.0.24-f71674",
  "org.scalablytyped.japgolly" %%% "emotion__utils" % "0.11.2-faa2eb",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20190924Z-d18e40",
  "org.scalablytyped.japgolly" %%% "react" % "16.9-dt-20200227Z-a90427",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
