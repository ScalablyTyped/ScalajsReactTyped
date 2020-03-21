organization := "org.scalablytyped.japgolly"
name := "connect-mongo"
version := "3.2.0-726473"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "body-parser" % "1.19-dt-20200210Z-4a5e75",
  "org.scalablytyped.japgolly" %%% "bson" % "4.0-dt-20200225Z-3bc22a",
  "org.scalablytyped.japgolly" %%% "connect" % "v3.4.0-dt-20200226Z-95dbfc",
  "org.scalablytyped.japgolly" %%% "express" % "4.17-dt-20200227Z-53e249",
  "org.scalablytyped.japgolly" %%% "express-serve-static-core" % "4.17-dt-20200225Z-03e3c9",
  "org.scalablytyped.japgolly" %%% "express-session" % "1.17-dt-20200227Z-22f662",
  "org.scalablytyped.japgolly" %%% "mime" % "2.0-dt-20191126Z-36a89f",
  "org.scalablytyped.japgolly" %%% "mongodb" % "3.5-dt-20200302Z-b1f491",
  "org.scalablytyped.japgolly" %%% "mongoose" % "5.7.12-dt-20200227Z-8d89d2",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "range-parser" % "1.2-dt-20181016Z-d1bce1",
  "org.scalablytyped.japgolly" %%% "serve-static" % "1.13-dt-20200227Z-bb2b34",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
