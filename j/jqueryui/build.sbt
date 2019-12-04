organization := "org.gulliblytyped.japgolly"
name := "jqueryui"
version := "1.12-dt-20191104Z-9fedf4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "jquery" % "3.3-dt-20191126Z-91c8fc",
  "org.gulliblytyped.japgolly" %%% "sizzle" % "2.3-dt-20181006Z-810239",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-ed3398")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        