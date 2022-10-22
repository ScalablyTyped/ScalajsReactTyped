organization := "org.scalablytyped.japgolly"
name := "popmotion-pose"
version := "3.4.11-f574a3"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "popmotion__easing" % "1.0.2-982ef2",
  "org.scalablytyped.japgolly" %%% "pose-core" % "2.1.1-b781db",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "style-value-types" % "5.1.2-0eb427",
  "org.scalablytyped.japgolly" %%% "ts-essentials" % "9.3.0-7966ea")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
