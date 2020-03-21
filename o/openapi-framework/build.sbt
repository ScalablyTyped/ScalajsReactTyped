organization := "org.scalablytyped.japgolly"
name := "openapi-framework"
version := "0.25.0-3241c6"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "ajv" % "6.11.0-6a0916",
  "org.scalablytyped.japgolly" %%% "openapi-default-setter" % "2.1.0-1f8bc1",
  "org.scalablytyped.japgolly" %%% "openapi-request-coercer" % "2.3.0-8427c7",
  "org.scalablytyped.japgolly" %%% "openapi-request-validator" % "4.1.0-08f759",
  "org.scalablytyped.japgolly" %%% "openapi-response-validator" % "4.0.0-fb7274",
  "org.scalablytyped.japgolly" %%% "openapi-security-handler" % "2.0.4-0cd6c6",
  "org.scalablytyped.japgolly" %%% "openapi-types" % "1.3.5-1f9f35",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "ts-log" % "2.1.4-a0c408")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
