organization := "org.scalablytyped.japgolly"
name := "vue__reactivity-transform"
version := "3.2.41-56cf98"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "babel__parser" % "7.19.4-03fc7e",
  "org.scalablytyped.japgolly" %%% "babel__types" % "7.19.4-3aab9c",
  "org.scalablytyped.japgolly" %%% "magic-string" % "0.26.7-a42afe",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
