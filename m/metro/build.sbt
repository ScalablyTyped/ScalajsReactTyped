organization := "org.scalablytyped.japgolly"
name := "metro"
version := "0.66-dt-20220106Z-402252"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "babel__code-frame" % "7.0-dt-20211202Z-685d32",
  "org.scalablytyped.japgolly" %%% "metro-babel-transformer" % "0.66-dt-20211202Z-d76d61",
  "org.scalablytyped.japgolly" %%% "metro-cache" % "0.66-dt-20211202Z-3aad5a",
  "org.scalablytyped.japgolly" %%% "metro-config" % "0.66-dt-20211202Z-76f221",
  "org.scalablytyped.japgolly" %%% "metro-core" % "0.66-dt-20211202Z-702baa",
  "org.scalablytyped.japgolly" %%% "metro-resolver" % "0.66-dt-20211202Z-f6a5d4",
  "org.scalablytyped.japgolly" %%% "metro-source-map" % "0.66-dt-20211202Z-d587a4",
  "org.scalablytyped.japgolly" %%% "metro-transform-worker" % "0.66-dt-20211202Z-b7f9e1",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
