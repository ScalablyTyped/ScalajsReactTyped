organization := "org.gulliblytyped.japgolly"
name := "material-ui__core"
version := "3.9.3-00bb1b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "csstype" % "2.6.6-5023da",
  "org.gulliblytyped.japgolly" %%% "jss" % "10.0.0-2e4a7a",
  "org.gulliblytyped.japgolly" %%% "popper_dot_js" % "1.16.0-e985dc",
  "org.gulliblytyped.japgolly" %%% "prop-types" % "15.7-dt-20190924Z-2d597e",
  "org.gulliblytyped.japgolly" %%% "react" % "16.9-dt-20191025Z-485300",
  "org.gulliblytyped.japgolly" %%% "react-transition-group" % "4.2-dt-20191002Z-92ed0c",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-b7faa7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        