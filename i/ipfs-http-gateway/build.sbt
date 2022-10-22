organization := "org.scalablytyped.japgolly"
name := "ipfs-http-gateway"
version := "0.11.1-2c4ad3"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "dns-over-http-resolver" % "2.1.0-2746fa",
  "org.scalablytyped.japgolly" %%% "hapi__boom" % "10.0.0-5c8657",
  "org.scalablytyped.japgolly" %%% "hapi__catbox" % "10.2-dt-20211202Z-0c1ff3",
  "org.scalablytyped.japgolly" %%% "hapi__hapi" % "20.0-dt-20220525Z-1c9204",
  "org.scalablytyped.japgolly" %%% "hapi__iron" % "7.0.0-613230",
  "org.scalablytyped.japgolly" %%% "hapi__mimos" % "7.0.0-ed34ce",
  "org.scalablytyped.japgolly" %%% "hapi__shot" % "6.0.0-f7515a",
  "org.scalablytyped.japgolly" %%% "ipfs-core-types" % "0.12.1-7860f0",
  "org.scalablytyped.japgolly" %%% "ipfs-unixfs" % "7.0.0-da231d",
  "org.scalablytyped.japgolly" %%% "ipld__dag-pb" % "2.1.18-f83fc2",
  "org.scalablytyped.japgolly" %%% "it-pushable" % "3.1.0-ae1cec",
  "org.scalablytyped.japgolly" %%% "it-stream-types" % "1.0.4-8f8bd7",
  "org.scalablytyped.japgolly" %%% "joi" % "17.6.3-89f02e",
  "org.scalablytyped.japgolly" %%% "libp2p__interface-connection" % "3.0.2-e41344",
  "org.scalablytyped.japgolly" %%% "libp2p__interface-keychain" % "1.0.3-07fa87",
  "org.scalablytyped.japgolly" %%% "libp2p__interface-peer-id" % "1.0.5-714e9d",
  "org.scalablytyped.japgolly" %%% "libp2p__interface-peer-info" % "1.0.3-06c661",
  "org.scalablytyped.japgolly" %%% "libp2p__interface-pubsub" % "2.1.0-9ccaec",
  "org.scalablytyped.japgolly" %%% "libp2p__interfaces" % "3.0.3-3515af",
  "org.scalablytyped.japgolly" %%% "libp2p__logger" % "2.0.2-38a408",
  "org.scalablytyped.japgolly" %%% "multiformats" % "10.0.0-d3f5bb",
  "org.scalablytyped.japgolly" %%% "multiformats__multiaddr" % "11.0.1-297df5",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "uint8arraylist" % "2.3.2-ef4ad6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
