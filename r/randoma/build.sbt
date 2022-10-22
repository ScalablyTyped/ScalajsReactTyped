organization := "org.scalablytyped.japgolly"
name := "randoma"
version := "2.0.0-d9b76b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "color" % "3.0-dt-20220819Z-e37132",
  "org.scalablytyped.japgolly" %%% "color-convert" % "2.0-dt-20211202Z-a515d2",
  "org.scalablytyped.japgolly" %%% "color-name" % "1.1-dt-20211202Z-a25391",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
