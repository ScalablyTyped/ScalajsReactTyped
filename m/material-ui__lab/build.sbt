organization := "org.scalablytyped.japgolly"
name := "material-ui__lab"
version := "4.0.0-alpha.61-6df68c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "csstype" % "3.1.1-6f6894",
  "org.scalablytyped.japgolly" %%% "enzyme" % "3.10-dt-20220818Z-335cd9",
  "org.scalablytyped.japgolly" %%% "jss" % "10.9.2-8ccb97",
  "org.scalablytyped.japgolly" %%% "material-ui__core" % "4.12.4-78b0ef",
  "org.scalablytyped.japgolly" %%% "material-ui__styles" % "4.11.5-e05861",
  "org.scalablytyped.japgolly" %%% "material-ui__system" % "4.12.2-31b720",
  "org.scalablytyped.japgolly" %%% "material-ui__types" % "5.1.0-d952ce",
  "org.scalablytyped.japgolly" %%% "popper_dot_js" % "1.16.1-b54a2f",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20220407Z-2e1de8",
  "org.scalablytyped.japgolly" %%% "react" % "18.0-dt-20220922Z-c9da7d",
  "org.scalablytyped.japgolly" %%% "scheduler" % "0.16-dt-20211202Z-ea969a",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
