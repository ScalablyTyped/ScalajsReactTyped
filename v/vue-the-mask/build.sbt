organization := "org.scalablytyped.japgolly"
name := "vue-the-mask"
version := "0.11-dt-20211202Z-9d2e2d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "vue__reactivity" % "3.2.41-30a97e",
  "org.scalablytyped.japgolly" %%% "vue__runtime-core" % "3.2.41-0507a9",
  "org.scalablytyped.japgolly" %%% "vue__shared" % "3.2.41-27d6be")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
