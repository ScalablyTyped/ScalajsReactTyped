organization := "org.scalablytyped.japgolly"
name := "aws-sdk__credential-provider-imds"
version := "3.188.0-e23a1f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "aws-sdk__node-config-provider" % "3.188.0-6156a6",
  "org.scalablytyped.japgolly" %%% "aws-sdk__shared-ini-file-loader" % "3.188.0-e2b9f4",
  "org.scalablytyped.japgolly" %%% "aws-sdk__types" % "3.188.0-7582dd",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
