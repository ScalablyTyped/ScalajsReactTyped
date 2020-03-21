organization := "org.scalablytyped.japgolly"
name := "easy-api-request"
version := "0.0-unknown-dt-20200226Z-d04e1c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "body-parser" % "1.19-dt-20200210Z-4a5e75",
  "org.scalablytyped.japgolly" %%% "bunyan" % "1.8-dt-20200226Z-ec4c1d",
  "org.scalablytyped.japgolly" %%% "caseless" % "0.12-dt-20190311Z-d016a6",
  "org.scalablytyped.japgolly" %%% "connect" % "v3.4.0-dt-20200226Z-95dbfc",
  "org.scalablytyped.japgolly" %%% "express" % "4.17-dt-20200227Z-53e249",
  "org.scalablytyped.japgolly" %%% "express-serve-static-core" % "4.17-dt-20200225Z-03e3c9",
  "org.scalablytyped.japgolly" %%% "form-data" % "2.5.1-b08b8b",
  "org.scalablytyped.japgolly" %%% "mime" % "2.0-dt-20191126Z-36a89f",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "q" % "1.5-dt-20200225Z-91e923",
  "org.scalablytyped.japgolly" %%% "range-parser" % "1.2-dt-20181016Z-d1bce1",
  "org.scalablytyped.japgolly" %%% "request" % "2.48-dt-20191217Z-011ed5",
  "org.scalablytyped.japgolly" %%% "serve-static" % "1.13-dt-20200227Z-bb2b34",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "tough-cookie" % "2.3-dt-20191206Z-d45a45")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
