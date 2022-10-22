organization := "org.scalablytyped.japgolly"
name := "fullcalendar__vue"
version := "5.11.2-b562b6"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "fullcalendar__common" % "5.11.3-bdf4e3",
  "org.scalablytyped.japgolly" %%% "fullcalendar__core" % "5.11.3-fe7f2e",
  "org.scalablytyped.japgolly" %%% "preact" % "10.11.2-bc2f53",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
