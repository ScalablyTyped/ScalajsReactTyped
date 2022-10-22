organization := "org.scalablytyped.japgolly"
name := "chainsafe__libp2p-noise"
version := "8.0.1-765473"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "it-length-prefixed" % "8.0.2-be7946",
  "org.scalablytyped.japgolly" %%% "it-pb-stream" % "2.0.2-076425",
  "org.scalablytyped.japgolly" %%% "it-reader" % "6.0.1-680cd6",
  "org.scalablytyped.japgolly" %%% "it-stream-types" % "1.0.4-8f8bd7",
  "org.scalablytyped.japgolly" %%% "libp2p__interface-connection-encrypter" % "2.0.1-e99257",
  "org.scalablytyped.japgolly" %%% "libp2p__interface-peer-id" % "1.0.5-714e9d",
  "org.scalablytyped.japgolly" %%% "libp2p__logger" % "2.0.2-38a408",
  "org.scalablytyped.japgolly" %%% "multiformats" % "10.0.0-d3f5bb",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "protons-runtime" % "3.1.0-ec4fbc",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "uint8arraylist" % "2.3.2-ef4ad6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
