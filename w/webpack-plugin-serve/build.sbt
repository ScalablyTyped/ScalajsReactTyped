organization := "org.scalablytyped.japgolly"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-b1434a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "accepts" % "1.3-dt-20180214Z-594f28",
  "org.scalablytyped.japgolly" %%% "anymatch" % "1.3-dt-20190212Z-ec06c4",
  "org.scalablytyped.japgolly" %%% "body-parser" % "1.19-dt-20200210Z-4a5e75",
  "org.scalablytyped.japgolly" %%% "braces" % "3.0-dt-20190422Z-85b342",
  "org.scalablytyped.japgolly" %%% "connect" % "v3.4.0-dt-20200226Z-95dbfc",
  "org.scalablytyped.japgolly" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-e3a9cb",
  "org.scalablytyped.japgolly" %%% "cookies" % "0.7-dt-20191002Z-d532d7",
  "org.scalablytyped.japgolly" %%% "express" % "4.17-dt-20200227Z-53e249",
  "org.scalablytyped.japgolly" %%% "express-serve-static-core" % "4.17-dt-20200225Z-03e3c9",
  "org.scalablytyped.japgolly" %%% "fast-glob" % "2.2.7-43bb85",
  "org.scalablytyped.japgolly" %%% "http-proxy" % "1.17-dt-20200226Z-5c3498",
  "org.scalablytyped.japgolly" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-99b40e",
  "org.scalablytyped.japgolly" %%% "keygrip" % "1.0-dt-20191226Z-7cf96a",
  "org.scalablytyped.japgolly" %%% "koa" % "2.11.0-dt-20200226Z-a73fe3",
  "org.scalablytyped.japgolly" %%% "koa-compress" % "v2.x-dt-20200226Z-59f18d",
  "org.scalablytyped.japgolly" %%% "koa-send" % "4.1-dt-20200226Z-c823c1",
  "org.scalablytyped.japgolly" %%% "koa-static" % "4.0-dt-20200226Z-2165d6",
  "org.scalablytyped.japgolly" %%% "micromatch" % "4.0-dt-20200226Z-151cf5",
  "org.scalablytyped.japgolly" %%% "mime" % "2.0-dt-20191126Z-36a89f",
  "org.scalablytyped.japgolly" %%% "mrmlnc__readdir-enhanced" % "2.2.1-fefe9e",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "range-parser" % "1.2-dt-20181016Z-d1bce1",
  "org.scalablytyped.japgolly" %%% "serve-static" % "1.13-dt-20200227Z-bb2b34",
  "org.scalablytyped.japgolly" %%% "source-list-map" % "v0.1.6-dt-20200225Z-55ccc1",
  "org.scalablytyped.japgolly" %%% "source-map" % "0.7.3-1b2e50",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "tapable" % "v1.0.0-dt-20200225Z-02549a",
  "org.scalablytyped.japgolly" %%% "uglify-js" % "3.0-dt-20200225Z-0ef4a7",
  "org.scalablytyped.japgolly" %%% "webpack" % "4.41-dt-20200227Z-6e50fb",
  "org.scalablytyped.japgolly" %%% "webpack-sources" % "0.1-dt-20200225Z-a1eff2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
