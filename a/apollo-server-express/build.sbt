organization := "org.scalablytyped.japgolly"
name := "apollo-server-express"
version := "2.10.1-4bc4a3"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "accepts" % "1.3-dt-20180214Z-594f28",
  "org.scalablytyped.japgolly" %%% "apollo-cache-control" % "0.8.11-c40c3c",
  "org.scalablytyped.japgolly" %%% "apollo-datasource" % "0.7.0-fc15ee",
  "org.scalablytyped.japgolly" %%% "apollo-engine-reporting" % "1.6.0-b6a3dd",
  "org.scalablytyped.japgolly" %%% "apollo-engine-reporting-protobuf" % "0.4.4-1f6fd1",
  "org.scalablytyped.japgolly" %%% "apollo-link" % "1.2.13-f13d38",
  "org.scalablytyped.japgolly" %%% "apollo-server-caching" % "0.5.1-879eab",
  "org.scalablytyped.japgolly" %%% "apollo-server-core" % "2.10.1-f280fd",
  "org.scalablytyped.japgolly" %%% "apollo-server-env" % "2.4.3-7e3f25",
  "org.scalablytyped.japgolly" %%% "apollo-server-errors" % "2.3.4-969ad3",
  "org.scalablytyped.japgolly" %%% "apollo-server-plugin-base" % "0.6.10-7ffe05",
  "org.scalablytyped.japgolly" %%% "apollo-server-types" % "0.2.10-4b900d",
  "org.scalablytyped.japgolly" %%% "apollo__protobufjs" % "1.0.3-47da9f",
  "org.scalablytyped.japgolly" %%% "apollographql__apollo-tools" % "0.4.3-176fbb",
  "org.scalablytyped.japgolly" %%% "apollographql__graphql-playground-html" % "1.6.24-42bb8d",
  "org.scalablytyped.japgolly" %%% "body-parser" % "1.19-dt-20200210Z-4a5e75",
  "org.scalablytyped.japgolly" %%% "connect" % "v3.4.0-dt-20200226Z-95dbfc",
  "org.scalablytyped.japgolly" %%% "cookies" % "0.7-dt-20191002Z-d532d7",
  "org.scalablytyped.japgolly" %%% "cors" % "2.8-dt-20200225Z-7138b3",
  "org.scalablytyped.japgolly" %%% "eventemitter3" % "4.0.0-0d2eae",
  "org.scalablytyped.japgolly" %%% "express" % "4.17-dt-20200227Z-53e249",
  "org.scalablytyped.japgolly" %%% "express-serve-static-core" % "4.17-dt-20200225Z-03e3c9",
  "org.scalablytyped.japgolly" %%% "fs-capacitor" % "2.0-dt-20190509Z-ed81b5",
  "org.scalablytyped.japgolly" %%% "graphql" % "14.6.0-e3aedb",
  "org.scalablytyped.japgolly" %%% "graphql-extensions" % "0.10.10-bee541",
  "org.scalablytyped.japgolly" %%% "graphql-subscriptions" % "1.1.0-01beaa",
  "org.scalablytyped.japgolly" %%% "graphql-tools" % "4.0.6-7f0801",
  "org.scalablytyped.japgolly" %%% "graphql-upload" % "8.0-dt-20190826Z-6c91d1",
  "org.scalablytyped.japgolly" %%% "keygrip" % "1.0-dt-20191226Z-7cf96a",
  "org.scalablytyped.japgolly" %%% "koa" % "2.11.0-dt-20200226Z-a73fe3",
  "org.scalablytyped.japgolly" %%% "long" % "4.0.0-dt-20200226Z-4709c2",
  "org.scalablytyped.japgolly" %%% "mime" % "2.0-dt-20191126Z-36a89f",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "range-parser" % "1.2-dt-20181016Z-d1bce1",
  "org.scalablytyped.japgolly" %%% "serve-static" % "1.13-dt-20200227Z-bb2b34",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "subscriptions-transport-ws" % "0.9.16-9743a5",
  "org.scalablytyped.japgolly" %%% "ws" % "7.2-dt-20200227Z-0c2dec",
  "org.scalablytyped.japgolly" %%% "zen-observable-ts" % "0.8.20-bd524b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
