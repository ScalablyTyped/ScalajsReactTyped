organization := "org.scalablytyped.japgolly"
name := "google-cloud__spanner"
version := "6.1.4-87a71e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "big_dot_js" % "6.1-dt-20220913Z-843651",
  "org.scalablytyped.japgolly" %%% "eventemitter3" % "4.0.7-a15150",
  "org.scalablytyped.japgolly" %%% "gaxios" % "5.0.2-8fc171",
  "org.scalablytyped.japgolly" %%% "google-auth-library" % "8.5.2-6e2860",
  "org.scalablytyped.japgolly" %%% "google-cloud__common" % "4.0.2-a1b839",
  "org.scalablytyped.japgolly" %%% "google-cloud__precise-date" % "3.0.1-8fff6e",
  "org.scalablytyped.japgolly" %%% "google-gax" % "3.5.2-dc8320",
  "org.scalablytyped.japgolly" %%% "grpc__grpc-js" % "1.7.2-695a99",
  "org.scalablytyped.japgolly" %%% "grpc__proto-loader" % "0.7.3-978e90",
  "org.scalablytyped.japgolly" %%% "gtoken" % "6.1.2-8120f4",
  "org.scalablytyped.japgolly" %%% "long" % "5.2.0-c6f5b1",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "p-queue" % "7.3.0-32c364",
  "org.scalablytyped.japgolly" %%% "proto3-json-serializer" % "1.1.0-8be7de",
  "org.scalablytyped.japgolly" %%% "protobufjs" % "7.1.2-b1c8a5",
  "org.scalablytyped.japgolly" %%% "stack-trace" % "0.0-unknown-dt-20220818Z-366a7a",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "teeny-request" % "8.0.2-309216")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
