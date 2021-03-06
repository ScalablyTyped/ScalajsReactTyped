organization := "org.scalablytyped.japgolly"
name := "swagger-node-runner"
version := "0.6-dt-20190212Z-8fb56b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "body-parser" % "1.19-dt-20200210Z-4a5e75",
  "org.scalablytyped.japgolly" %%% "boom" % "7.3-dt-20200226Z-8a8676",
  "org.scalablytyped.japgolly" %%% "bunyan" % "1.8-dt-20200226Z-ec4c1d",
  "org.scalablytyped.japgolly" %%% "catbox" % "10.0-dt-20190219Z-f6eb0d",
  "org.scalablytyped.japgolly" %%% "connect" % "v3.4.0-dt-20200226Z-95dbfc",
  "org.scalablytyped.japgolly" %%% "express" % "4.17-dt-20200227Z-53e249",
  "org.scalablytyped.japgolly" %%% "express-serve-static-core" % "4.17-dt-20200225Z-03e3c9",
  "org.scalablytyped.japgolly" %%% "formidable" % "1.0.16-dt-20200225Z-cf44e7",
  "org.scalablytyped.japgolly" %%% "hapi" % "18.0-dt-20200227Z-797c11",
  "org.scalablytyped.japgolly" %%% "iron" % "5.0-dt-20180214Z-afcf3a",
  "org.scalablytyped.japgolly" %%% "joi" % "14.3-dt-20200227Z-9c4132",
  "org.scalablytyped.japgolly" %%% "mime" % "2.0-dt-20191126Z-36a89f",
  "org.scalablytyped.japgolly" %%% "mime-db" % "1.27-dt-20190322Z-630eaa",
  "org.scalablytyped.japgolly" %%% "mimos" % "3.0-dt-20200225Z-015a9f",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "podium" % "1.0-dt-20200225Z-98196d",
  "org.scalablytyped.japgolly" %%% "range-parser" % "1.2-dt-20181016Z-d1bce1",
  "org.scalablytyped.japgolly" %%% "restify" % "8.4-dt-20200225Z-8f0faf",
  "org.scalablytyped.japgolly" %%% "serve-static" % "1.13-dt-20200227Z-bb2b34",
  "org.scalablytyped.japgolly" %%% "shot" % "4.0-dt-20181002Z-f0e30a",
  "org.scalablytyped.japgolly" %%% "spdy" % "3.4-dt-20200227Z-9e93db",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "swagger-schema-official" % "2.0-dt-20200225Z-2f469e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
