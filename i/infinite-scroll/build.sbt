organization := "org.scalablytyped.japgolly"
name := "infinite-scroll"
version := "4.0-dt-20220624Z-088580"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "isotope-layout" % "3.0-dt-20211202Z-a2b0dc",
  "org.scalablytyped.japgolly" %%% "masonry-layout" % "4.2-dt-20220523Z-a58765",
  "org.scalablytyped.japgolly" %%% "packery" % "v1.4.1-dt-20220818Z-b4fe11",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
