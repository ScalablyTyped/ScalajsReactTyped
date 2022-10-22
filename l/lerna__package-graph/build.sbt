organization := "org.scalablytyped.japgolly"
name := "lerna__package-graph"
version := "5.1-dt-20220608Z-92159f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "lerna__package" % "5.1-dt-20220608Z-879d2a",
  "org.scalablytyped.japgolly" %%% "npm-package-arg" % "6.1-dt-20211202Z-57658f",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
