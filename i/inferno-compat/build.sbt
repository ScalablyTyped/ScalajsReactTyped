organization := "org.scalablytyped.japgolly"
name := "inferno-compat"
version := "8.0.3-6975a4"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "csstype" % "3.1.1-6f6894",
  "org.scalablytyped.japgolly" %%% "inferno" % "8.0.3-34a4ca",
  "org.scalablytyped.japgolly" %%% "inferno-create-class" % "8.0.3-daaac8",
  "org.scalablytyped.japgolly" %%% "inferno-vnode-flags" % "8.0.3-9df076",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
