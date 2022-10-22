organization := "org.scalablytyped.japgolly"
name := "ipfs-bitswap"
version := "12.0.6-5610a3"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "achingbrain__nat-port-mapper" % "1.0.7-8a7ac6",
  "org.scalablytyped.japgolly" %%% "achingbrain__ssdp" % "4.0.1-72c8d0",
  "org.scalablytyped.japgolly" %%% "debug" % "4.1-dt-20211202Z-7cd5bd",
  "org.scalablytyped.japgolly" %%% "dns-over-http-resolver" % "2.1.0-2746fa",
  "org.scalablytyped.japgolly" %%% "events" % "3.0-dt-20211202Z-30431b",
  "org.scalablytyped.japgolly" %%% "interface-blockstore" % "3.0.0-ba4ed2",
  "org.scalablytyped.japgolly" %%% "interface-datastore" % "7.0.1-1eab29",
  "org.scalablytyped.japgolly" %%% "interface-store" % "3.0.1-fdb8b3",
  "org.scalablytyped.japgolly" %%% "it-pushable" % "3.1.0-ae1cec",
  "org.scalablytyped.japgolly" %%% "it-stream-types" % "1.0.4-8f8bd7",
  "org.scalablytyped.japgolly" %%% "libp2p" % "0.39.2-94af7e",
  "org.scalablytyped.japgolly" %%% "libp2p__components" % "2.1.0-94742f",
  "org.scalablytyped.japgolly" %%% "libp2p__interface-address-manager" % "1.0.3-c6c47c",
  "org.scalablytyped.japgolly" %%% "libp2p__interface-connection" % "3.0.2-e41344",
  "org.scalablytyped.japgolly" %%% "libp2p__interface-connection-encrypter" % "2.0.1-e99257",
  "org.scalablytyped.japgolly" %%% "libp2p__interface-connection-manager" % "1.1.1-2404ce",
  "org.scalablytyped.japgolly" %%% "libp2p__interface-content-routing" % "1.0.2-d83be3",
  "org.scalablytyped.japgolly" %%% "libp2p__interface-dht" % "1.0.1-407fef",
  "org.scalablytyped.japgolly" %%% "libp2p__interface-metrics" % "3.0.0-8fadda",
  "org.scalablytyped.japgolly" %%% "libp2p__interface-peer-discovery" % "1.0.1-b06806",
  "org.scalablytyped.japgolly" %%% "libp2p__interface-peer-id" % "1.0.5-714e9d",
  "org.scalablytyped.japgolly" %%% "libp2p__interface-peer-info" % "1.0.3-06c661",
  "org.scalablytyped.japgolly" %%% "libp2p__interface-peer-routing" % "1.0.1-0defd0",
  "org.scalablytyped.japgolly" %%% "libp2p__interface-peer-store" % "1.2.2-3de4a3",
  "org.scalablytyped.japgolly" %%% "libp2p__interface-pubsub" % "2.1.0-9ccaec",
  "org.scalablytyped.japgolly" %%% "libp2p__interface-record" % "2.0.1-72004e",
  "org.scalablytyped.japgolly" %%% "libp2p__interface-registrar" % "2.0.3-b5bed0",
  "org.scalablytyped.japgolly" %%% "libp2p__interface-stream-muxer" % "2.0.2-d651bc",
  "org.scalablytyped.japgolly" %%% "libp2p__interface-transport" % "1.0.4-63029a",
  "org.scalablytyped.japgolly" %%% "libp2p__interfaces" % "3.0.3-3515af",
  "org.scalablytyped.japgolly" %%% "ms" % "v0.7.1-dt-20220818Z-ed60be",
  "org.scalablytyped.japgolly" %%% "multiformats" % "10.0.0-d3f5bb",
  "org.scalablytyped.japgolly" %%% "multiformats__multiaddr" % "11.0.1-297df5",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "p-defer" % "4.0.0-a998af",
  "org.scalablytyped.japgolly" %%% "protons-runtime" % "3.1.0-ec4fbc",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "timeout-abort-controller" % "3.0.0-8783be",
  "org.scalablytyped.japgolly" %%% "uint8arraylist" % "2.3.2-ef4ad6",
  "org.scalablytyped.japgolly" %%% "uint8arrays" % "4.0.2-812bee",
  "org.scalablytyped.japgolly" %%% "vascosantos__moving-average" % "1.1.0-5bb4ff")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
