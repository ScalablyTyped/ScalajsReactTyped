organization := "org.scalablytyped.japgolly"
name := "lesgo"
version := "0.7-dt-20220817Z-99e894"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "aws-lambda" % "8.10-dt-20221012Z-e2b4dc",
  "org.scalablytyped.japgolly" %%% "aws-sdk" % "2.1234.0-93cbde",
  "org.scalablytyped.japgolly" %%% "data-api-client" % "1.2-dt-20220906Z-8bf1da",
  "org.scalablytyped.japgolly" %%% "elastic__elasticsearch" % "8.4.0-29c805",
  "org.scalablytyped.japgolly" %%% "elastic__transport" % "8.2.0-7e8851",
  "org.scalablytyped.japgolly" %%% "hpagent" % "1.0.0-7acf3e",
  "org.scalablytyped.japgolly" %%% "jsonwebtoken" % "8.5-dt-20220824Z-9a567d",
  "org.scalablytyped.japgolly" %%% "memcached" % "2.2-dt-20211202Z-640edf",
  "org.scalablytyped.japgolly" %%% "mysql2" % "2.3.3-b562a1",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "undici" % "5.11.0-1f9c99")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
