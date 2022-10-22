organization := "org.scalablytyped.japgolly"
name := "ipfs-unixfs-exporter"
version := "8.0.6-d2c6f2"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "hamt-sharding" % "3.0.1-a81cf4",
  "org.scalablytyped.japgolly" %%% "interface-blockstore" % "3.0.0-ba4ed2",
  "org.scalablytyped.japgolly" %%% "interface-store" % "3.0.1-fdb8b3",
  "org.scalablytyped.japgolly" %%% "ipfs-unixfs" % "7.0.0-da231d",
  "org.scalablytyped.japgolly" %%% "ipld__dag-pb" % "2.1.18-f83fc2",
  "org.scalablytyped.japgolly" %%% "multiformats" % "10.0.0-d3f5bb",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
