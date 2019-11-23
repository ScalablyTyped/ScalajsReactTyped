organization := "org.gulliblytyped.japgolly"
name := "material-ui__icons"
version := "4.5.1-bd61de"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "csstype" % "2.6.6-926676",
  "org.gulliblytyped.japgolly" %%% "jss" % "10.0.0-2386ab",
  "org.gulliblytyped.japgolly" %%% "material-ui__core" % "3.9.3-88eed7",
  "org.gulliblytyped.japgolly" %%% "popper_dot_js" % "1.16.0-bbeb4b",
  "org.gulliblytyped.japgolly" %%% "prop-types" % "15.7-dt-20190924Z-2e958d",
  "org.gulliblytyped.japgolly" %%% "react" % "16.9-dt-20191122Z-580648",
  "org.gulliblytyped.japgolly" %%% "react-transition-group" % "4.2-dt-20191002Z-55f418",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-6f398d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        