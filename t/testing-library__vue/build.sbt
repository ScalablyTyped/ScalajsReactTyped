organization := "org.scalablytyped.japgolly"
name := "testing-library__vue"
version := "2.0-dt-20190816Z-08efff"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "pretty-format" % "24.9.0-47ff69",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "testing-library__dom" % "6.12-dt-20200210Z-f8b538",
  "org.scalablytyped.japgolly" %%% "vue" % "2.6.11-c0c123",
  "org.scalablytyped.japgolly" %%% "vue-router" % "3.1.5-e32299",
  "org.scalablytyped.japgolly" %%% "vuex" % "3.1.2-cb386c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
