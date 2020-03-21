organization := "org.scalablytyped.japgolly"
name := "rx_dot_wamp"
version := "0.5.0-dt-20200225Z-477537"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "autobahn" % "18.10-dt-20200225Z-686c09",
  "org.scalablytyped.japgolly" %%% "rx-core" % "4.0-dt-20200225Z-9f9e3f",
  "org.scalablytyped.japgolly" %%% "rx-lite" % "4.0-dt-20200225Z-6dc133",
  "org.scalablytyped.japgolly" %%% "rx-lite-aggregates" % "4.0-dt-20200225Z-7cc447",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "when" % "2.4.0-dt-20200225Z-1da905")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
