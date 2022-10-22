organization := "org.scalablytyped.japgolly"
name := "activex-word"
version := "14.0-dt-20220705Z-4fef31"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "activex-office" % "16.0-dt-20220705Z-1ceec7",
  "org.scalablytyped.japgolly" %%% "activex-outlook" % "14.0-dt-20220705Z-1f55ac",
  "org.scalablytyped.japgolly" %%% "activex-stdole" % "2.0-dt-20220705Z-74843a",
  "org.scalablytyped.japgolly" %%% "activex-vbide" % "14.0-dt-20220705Z-eca1b0",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
