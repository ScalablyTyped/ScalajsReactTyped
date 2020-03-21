organization := "org.scalablytyped.japgolly"
name := "koa-pino-logger"
version := "2.1-dt-20190816Z-b6878a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "accepts" % "1.3-dt-20180214Z-594f28",
  "org.scalablytyped.japgolly" %%% "body-parser" % "1.19-dt-20200210Z-4a5e75",
  "org.scalablytyped.japgolly" %%% "connect" % "v3.4.0-dt-20200226Z-95dbfc",
  "org.scalablytyped.japgolly" %%% "cookies" % "0.7-dt-20191002Z-d532d7",
  "org.scalablytyped.japgolly" %%% "express" % "4.17-dt-20200227Z-53e249",
  "org.scalablytyped.japgolly" %%% "express-serve-static-core" % "4.17-dt-20200225Z-03e3c9",
  "org.scalablytyped.japgolly" %%% "keygrip" % "1.0-dt-20191226Z-7cf96a",
  "org.scalablytyped.japgolly" %%% "koa" % "2.11.0-dt-20200226Z-a73fe3",
  "org.scalablytyped.japgolly" %%% "mime" % "2.0-dt-20191126Z-36a89f",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "pino" % "5.15-dt-20200206Z-8ae2a6",
  "org.scalablytyped.japgolly" %%% "pino-http" % "4.3-dt-20191003Z-4c36ff",
  "org.scalablytyped.japgolly" %%% "pino-std-serializers" % "2.4-dt-20190701Z-be88be",
  "org.scalablytyped.japgolly" %%% "range-parser" % "1.2-dt-20181016Z-d1bce1",
  "org.scalablytyped.japgolly" %%% "serve-static" % "1.13-dt-20200227Z-bb2b34",
  "org.scalablytyped.japgolly" %%% "sonic-boom" % "0.7-dt-20190819Z-4e9923",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
