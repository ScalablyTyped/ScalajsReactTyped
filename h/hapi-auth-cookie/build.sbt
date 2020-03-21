organization := "org.scalablytyped.japgolly"
name := "hapi-auth-cookie"
version := "10.0-dt-20190318Z-6e08e0"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "boom" % "7.3-dt-20200226Z-8a8676",
  "org.scalablytyped.japgolly" %%% "catbox" % "10.0-dt-20190219Z-f6eb0d",
  "org.scalablytyped.japgolly" %%% "hapi" % "18.0-dt-20200227Z-797c11",
  "org.scalablytyped.japgolly" %%% "iron" % "5.0-dt-20180214Z-afcf3a",
  "org.scalablytyped.japgolly" %%% "joi" % "14.3-dt-20200227Z-9c4132",
  "org.scalablytyped.japgolly" %%% "mime-db" % "1.27-dt-20190322Z-630eaa",
  "org.scalablytyped.japgolly" %%% "mimos" % "3.0-dt-20200225Z-015a9f",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "podium" % "1.0-dt-20200225Z-98196d",
  "org.scalablytyped.japgolly" %%% "shot" % "4.0-dt-20181002Z-f0e30a",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
