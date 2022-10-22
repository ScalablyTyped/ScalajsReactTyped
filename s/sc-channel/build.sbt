organization := "org.scalablytyped.japgolly"
name := "sc-channel"
version := "2.0-dt-20211202Z-e128fc"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "async-iterable-stream" % "3.0-dt-20211202Z-418fcb",
  "org.scalablytyped.japgolly" %%% "consumable-stream" % "2.0-dt-20220215Z-eba991",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "stream-demux" % "8.0-dt-20220215Z-891644",
  "org.scalablytyped.japgolly" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-94a351")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
