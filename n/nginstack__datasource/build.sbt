organization := "org.scalablytyped.japgolly"
name := "nginstack__datasource"
version := "65.0-dt-20221014Z-f7f7c9"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "nginstack__engine" % "65.0-dt-20221014Z-87eacf",
  "org.scalablytyped.japgolly" %%% "nginstack__iquery" % "65.0-dt-20221014Z-a0b76b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
