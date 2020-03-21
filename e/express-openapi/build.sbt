organization := "org.scalablytyped.japgolly"
name := "express-openapi"
version := "5.0.0-c10771"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "ajv" % "6.11.0-6a0916",
  "org.scalablytyped.japgolly" %%% "body-parser" % "1.19-dt-20200210Z-4a5e75",
  "org.scalablytyped.japgolly" %%% "connect" % "v3.4.0-dt-20200226Z-95dbfc",
  "org.scalablytyped.japgolly" %%% "express" % "4.17-dt-20200227Z-53e249",
  "org.scalablytyped.japgolly" %%% "express-serve-static-core" % "4.17-dt-20200225Z-03e3c9",
  "org.scalablytyped.japgolly" %%% "mime" % "2.0-dt-20191126Z-36a89f",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "openapi-default-setter" % "2.1.0-1f8bc1",
  "org.scalablytyped.japgolly" %%% "openapi-framework" % "0.25.0-3241c6",
  "org.scalablytyped.japgolly" %%% "openapi-request-coercer" % "2.3.0-8427c7",
  "org.scalablytyped.japgolly" %%% "openapi-request-validator" % "4.1.0-08f759",
  "org.scalablytyped.japgolly" %%% "openapi-response-validator" % "4.0.0-fb7274",
  "org.scalablytyped.japgolly" %%% "openapi-security-handler" % "2.0.4-0cd6c6",
  "org.scalablytyped.japgolly" %%% "openapi-types" % "1.3.5-1f9f35",
  "org.scalablytyped.japgolly" %%% "range-parser" % "1.2-dt-20181016Z-d1bce1",
  "org.scalablytyped.japgolly" %%% "serve-static" % "1.13-dt-20200227Z-bb2b34",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "ts-log" % "2.1.4-a0c408")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
