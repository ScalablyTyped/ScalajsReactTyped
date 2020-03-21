organization := "org.scalablytyped.japgolly"
name := "babel__standalone"
version := "7.1-dt-20200220Z-7cf3f2"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "babel__core" % "7.1-dt-20200225Z-18de56",
  "org.scalablytyped.japgolly" %%% "babel__generator" % "7.6-dt-20191210Z-60f2e1",
  "org.scalablytyped.japgolly" %%% "babel__parser" % "7.8.4-d6139a",
  "org.scalablytyped.japgolly" %%% "babel__template" % "7.0-dt-20190213Z-5270ce",
  "org.scalablytyped.japgolly" %%% "babel__traverse" % "7.0-dt-20200225Z-78abb6",
  "org.scalablytyped.japgolly" %%% "babel__types" % "7.8.3-f87775",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
