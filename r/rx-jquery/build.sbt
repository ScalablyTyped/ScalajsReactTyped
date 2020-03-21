organization := "org.scalablytyped.japgolly"
name := "rx-jquery"
version := "0.0-unknown-dt-20200227Z-c04ae6"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "jquery" % "3.3-dt-20200225Z-1ffbf2",
  "org.scalablytyped.japgolly" %%% "rx-core" % "4.0-dt-20200225Z-9f9e3f",
  "org.scalablytyped.japgolly" %%% "rx-core-binding" % "4.0-dt-20200225Z-06b9ef",
  "org.scalablytyped.japgolly" %%% "rx-lite" % "4.0-dt-20200225Z-6dc133",
  "org.scalablytyped.japgolly" %%% "rx-lite-aggregates" % "4.0-dt-20200225Z-7cc447",
  "org.scalablytyped.japgolly" %%% "rx-lite-async" % "4.0-dt-20200225Z-0a382f",
  "org.scalablytyped.japgolly" %%% "rx-lite-backpressure" % "4.0-dt-20200225Z-a5c013",
  "org.scalablytyped.japgolly" %%% "rx-lite-coincidence" % "4.0-dt-20200225Z-06e39c",
  "org.scalablytyped.japgolly" %%% "rx-lite-experimental" % "4.0-dt-20200225Z-d6569e",
  "org.scalablytyped.japgolly" %%% "rx-lite-joinpatterns" % "4.0-dt-20200225Z-fd31e5",
  "org.scalablytyped.japgolly" %%% "rx-lite-testing" % "4.0-dt-20200225Z-ce7a25",
  "org.scalablytyped.japgolly" %%% "rx-lite-time" % "4.0-dt-20200225Z-45ec4e",
  "org.scalablytyped.japgolly" %%% "rx-lite-virtualtime" % "4.0-dt-20200225Z-591c97",
  "org.scalablytyped.japgolly" %%% "sizzle" % "2.3-dt-20181006Z-7d1fc9",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
