organization := "org.scalablytyped.japgolly"
name := "ember-data"
version := "3.1-dt-20200227Z-9a4b2d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "ember" % "3.1-dt-20200225Z-78101e",
  "org.scalablytyped.japgolly" %%% "ember__application" % "3.0-dt-20200106Z-c87fa5",
  "org.scalablytyped.japgolly" %%% "ember__array" % "3.0-dt-20191126Z-4be376",
  "org.scalablytyped.japgolly" %%% "ember__component" % "3.0-dt-20191126Z-760e3b",
  "org.scalablytyped.japgolly" %%% "ember__controller" % "3.0-dt-20190503Z-5c6ef9",
  "org.scalablytyped.japgolly" %%% "ember__debug" % "3.0-dt-20191126Z-41f8d3",
  "org.scalablytyped.japgolly" %%% "ember__engine" % "3.0-dt-20191126Z-f6cbbd",
  "org.scalablytyped.japgolly" %%% "ember__error" % "3.0-dt-20190213Z-d973d8",
  "org.scalablytyped.japgolly" %%% "ember__object" % "3.1-dt-20200225Z-182421",
  "org.scalablytyped.japgolly" %%% "ember__polyfills" % "3.0-dt-20191126Z-46b4be",
  "org.scalablytyped.japgolly" %%% "ember__routing" % "3.0-dt-20200225Z-6c22e8",
  "org.scalablytyped.japgolly" %%% "ember__runloop" % "3.0-dt-20191126Z-c70d75",
  "org.scalablytyped.japgolly" %%% "ember__service" % "3.0-dt-20190503Z-865b3c",
  "org.scalablytyped.japgolly" %%% "ember__template" % "3.0-dt-20191126Z-525c38",
  "org.scalablytyped.japgolly" %%% "ember__test" % "3.0-dt-20191126Z-877cbb",
  "org.scalablytyped.japgolly" %%% "ember__utils" % "3.0-dt-20200225Z-df67dc",
  "org.scalablytyped.japgolly" %%% "jquery" % "3.3-dt-20200225Z-1ffbf2",
  "org.scalablytyped.japgolly" %%% "rsvp" % "4.0-dt-20200225Z-5d7297",
  "org.scalablytyped.japgolly" %%% "sizzle" % "2.3-dt-20181006Z-7d1fc9",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
