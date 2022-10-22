organization := "org.scalablytyped.japgolly"
name := "webcola"
version := "3.4.0-1eec6b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "d3-dispatch" % "3.0-dt-20220624Z-7c5fac",
  "org.scalablytyped.japgolly" %%% "d3-drag" % "3.0-dt-20211202Z-3429d0",
  "org.scalablytyped.japgolly" %%% "d3-selection" % "3.0-dt-20220720Z-ea39dc",
  "org.scalablytyped.japgolly" %%% "d3-timer" % "3.0-dt-20211202Z-2ee647",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
