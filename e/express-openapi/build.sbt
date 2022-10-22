organization := "org.scalablytyped.japgolly"
name := "express-openapi"
version := "12.0.2-aab2ad"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "ajv" % "8.11.0-e04284",
  "org.scalablytyped.japgolly" %%% "express" % "4.17-dt-20220913Z-2651ea",
  "org.scalablytyped.japgolly" %%% "express-serve-static-core" % "0.1.1-5aecff",
  "org.scalablytyped.japgolly" %%% "mime" % "3.0-dt-20220804Z-38356b",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "openapi-default-setter" % "12.0.2-90f667",
  "org.scalablytyped.japgolly" %%% "openapi-framework" % "12.0.2-afcb14",
  "org.scalablytyped.japgolly" %%% "openapi-request-coercer" % "12.0.2-153fe0",
  "org.scalablytyped.japgolly" %%% "openapi-request-validator" % "12.0.2-87072c",
  "org.scalablytyped.japgolly" %%% "openapi-response-validator" % "12.0.2-0fc787",
  "org.scalablytyped.japgolly" %%% "openapi-security-handler" % "12.0.2-29fb2c",
  "org.scalablytyped.japgolly" %%% "openapi-types" % "12.0.2-9db679",
  "org.scalablytyped.japgolly" %%% "qs" % "6.9-dt-20220913Z-9097c1",
  "org.scalablytyped.japgolly" %%% "re2" % "1.17.7-1eb746",
  "org.scalablytyped.japgolly" %%% "serve-static" % "1.15-dt-20220729Z-4a727e",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "ts-log" % "2.2.5-ed78b5",
  "org.scalablytyped.japgolly" %%% "uri-js" % "4.4.1-ea7df5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
