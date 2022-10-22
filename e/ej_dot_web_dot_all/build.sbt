organization := "org.scalablytyped.japgolly"
name := "ej_dot_web_dot_all"
version := "20.2-dt-20220630Z-7a7b0e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "jquery" % "3.5-dt-20220624Z-e18178",
  "org.scalablytyped.japgolly" %%% "sizzle" % "2.3-dt-20211202Z-0d86ba",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
