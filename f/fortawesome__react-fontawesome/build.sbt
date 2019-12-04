organization := "org.gulliblytyped.japgolly"
name := "fortawesome__react-fontawesome"
version := "0.1.7-535411"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "csstype" % "2.6.6-42c42f",
  "org.gulliblytyped.japgolly" %%% "fortawesome__fontawesome-common-types" % "0.2.25-48185d",
  "org.gulliblytyped.japgolly" %%% "fortawesome__fontawesome-svg-core" % "1.2.25-5e5e88",
  "org.gulliblytyped.japgolly" %%% "prop-types" % "15.7-dt-20190924Z-56dadc",
  "org.gulliblytyped.japgolly" %%% "react" % "16.9-dt-20191126Z-082653",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-ed3398")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        