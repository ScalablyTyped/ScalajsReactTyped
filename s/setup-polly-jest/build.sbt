organization := "org.scalablytyped.japgolly"
name := "setup-polly-jest"
version := "0.5-dt-20211202Z-6b8875"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "pollyjs__adapter" % "4.3-dt-20211202Z-436621",
  "org.scalablytyped.japgolly" %%% "pollyjs__core" % "4.3-dt-20211202Z-da72d3",
  "org.scalablytyped.japgolly" %%% "pollyjs__persister" % "4.3-dt-20211202Z-a78928",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
