organization := "org.scalablytyped.japgolly"
name := "koa-html-minifier"
version := "1.0-dt-20180823Z-e0590d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "accepts" % "1.3-dt-20180214Z-594f28",
  "org.scalablytyped.japgolly" %%% "body-parser" % "1.19-dt-20200210Z-4a5e75",
  "org.scalablytyped.japgolly" %%% "clean-css" % "4.2-dt-20200226Z-a0e85d",
  "org.scalablytyped.japgolly" %%% "connect" % "v3.4.0-dt-20200226Z-95dbfc",
  "org.scalablytyped.japgolly" %%% "cookies" % "0.7-dt-20191002Z-d532d7",
  "org.scalablytyped.japgolly" %%% "express" % "4.17-dt-20200227Z-53e249",
  "org.scalablytyped.japgolly" %%% "express-serve-static-core" % "4.17-dt-20200225Z-03e3c9",
  "org.scalablytyped.japgolly" %%% "html-minifier" % "3.5-dt-20200226Z-80d3a8",
  "org.scalablytyped.japgolly" %%% "keygrip" % "1.0-dt-20191226Z-7cf96a",
  "org.scalablytyped.japgolly" %%% "koa" % "2.11.0-dt-20200226Z-a73fe3",
  "org.scalablytyped.japgolly" %%% "mime" % "2.0-dt-20191126Z-36a89f",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "range-parser" % "1.2-dt-20181016Z-d1bce1",
  "org.scalablytyped.japgolly" %%% "relateurl" % "v0.2.6-dt-20200227Z-2485af",
  "org.scalablytyped.japgolly" %%% "serve-static" % "1.13-dt-20200227Z-bb2b34",
  "org.scalablytyped.japgolly" %%% "source-map" % "0.7.3-1b2e50",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "uglify-js" % "3.0-dt-20200225Z-0ef4a7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
