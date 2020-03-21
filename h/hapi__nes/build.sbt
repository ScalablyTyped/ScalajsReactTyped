organization := "org.scalablytyped.japgolly"
name := "hapi__nes"
version := "11.0-dt-20200225Z-fad867"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "hapi__boom" % "9.0.0-2ec35d",
  "org.scalablytyped.japgolly" %%% "hapi__catbox" % "10.2-dt-20190521Z-182bb0",
  "org.scalablytyped.japgolly" %%% "hapi__hapi" % "19.0-dt-20200227Z-654799",
  "org.scalablytyped.japgolly" %%% "hapi__iron" % "6.0.0-e27567",
  "org.scalablytyped.japgolly" %%% "hapi__joi" % "16.0-dt-20200225Z-f14e6d",
  "org.scalablytyped.japgolly" %%% "hapi__mimos" % "4.1-dt-20200225Z-43d59e",
  "org.scalablytyped.japgolly" %%% "hapi__podium" % "3.4-dt-20200225Z-20478c",
  "org.scalablytyped.japgolly" %%% "hapi__shot" % "4.1-dt-20190404Z-896cee",
  "org.scalablytyped.japgolly" %%% "mime-db" % "1.27-dt-20190322Z-630eaa",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
