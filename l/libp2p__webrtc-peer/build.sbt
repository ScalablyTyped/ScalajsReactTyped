organization := "org.scalablytyped.japgolly"
name := "libp2p__webrtc-peer"
version := "2.0.0-9de7ea"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "it-pushable" % "3.1.0-ae1cec",
  "org.scalablytyped.japgolly" %%% "it-stream-types" % "1.0.4-8f8bd7",
  "org.scalablytyped.japgolly" %%% "libp2p__interfaces" % "3.0.3-3515af",
  "org.scalablytyped.japgolly" %%% "libp2p__logger" % "2.0.2-38a408",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
