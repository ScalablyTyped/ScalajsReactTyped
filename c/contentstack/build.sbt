organization := "org.scalablytyped.japgolly"
name := "contentstack"
version := "3.15.3-af93e9"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "contentstack__utils" % "1.1.2-46bef1",
  "org.scalablytyped.japgolly" %%% "css-select" % "5.1.0-f6af6e",
  "org.scalablytyped.japgolly" %%% "css-what" % "6.1.0-6a159f",
  "org.scalablytyped.japgolly" %%% "node-html-parser" % "6.1.1-783f60",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
