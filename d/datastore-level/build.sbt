organization := "org.scalablytyped.japgolly"
name := "datastore-level"
version := "0.14-dt-20200225Z-9a0a63"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "abstract-leveldown" % "5.0-dt-20180913Z-e5bd14",
  "org.scalablytyped.japgolly" %%% "interface-datastore" % "0.8-dt-20191210Z-12aded",
  "org.scalablytyped.japgolly" %%% "levelup" % "4.3-dt-20200226Z-055e5f",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
