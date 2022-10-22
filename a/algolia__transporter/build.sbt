organization := "org.scalablytyped.japgolly"
name := "algolia__transporter"
version := "4.14.2-ba7ca3"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "algolia__cache-common" % "4.14.2-90d397",
  "org.scalablytyped.japgolly" %%% "algolia__logger-common" % "4.14.2-7f8f3e",
  "org.scalablytyped.japgolly" %%% "algolia__requester-common" % "4.14.2-ea28a9",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
