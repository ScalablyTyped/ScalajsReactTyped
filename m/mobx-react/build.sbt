organization := "org.gulliblytyped.japgolly"
name := "mobx-react"
version := "6.1.4-513f37"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "csstype" % "2.6.6-5023da",
  "org.gulliblytyped.japgolly" %%% "mobx-react-lite" % "1.5.0-04e45d",
  "org.gulliblytyped.japgolly" %%% "prop-types" % "15.7-dt-20190924Z-2d597e",
  "org.gulliblytyped.japgolly" %%% "react" % "16.9-dt-20191025Z-485300",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-b7faa7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        