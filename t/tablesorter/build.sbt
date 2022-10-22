organization := "org.scalablytyped.japgolly"
name := "tablesorter"
version := "2.31-dt-20211202Z-95f111"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "cldrjs" % "0.4.4-dt-20220818Z-154b73",
  "org.scalablytyped.japgolly" %%% "globalize" % "1.5-dt-20211202Z-de6a20",
  "org.scalablytyped.japgolly" %%% "jquery" % "3.5-dt-20220624Z-e18178",
  "org.scalablytyped.japgolly" %%% "jqueryui" % "1.12-dt-20211202Z-361b20",
  "org.scalablytyped.japgolly" %%% "select2" % "4.0-dt-20220127Z-96ddfa",
  "org.scalablytyped.japgolly" %%% "sizzle" % "2.3-dt-20211202Z-0d86ba",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
