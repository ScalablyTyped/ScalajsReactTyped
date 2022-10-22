organization := "org.scalablytyped.japgolly"
name := "samchon-framework"
version := "2.1.4-c74831"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "ecol" % "1.1.1-adc789",
  "org.scalablytyped.japgolly" %%% "samchon" % "2.1.4-0bf5e8",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "sxml" % "1.0.4-c2e4c8",
  "org.scalablytyped.japgolly" %%% "url-variables" % "1.0.3-223f83")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
