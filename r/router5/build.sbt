organization := "org.scalablytyped.japgolly"
name := "router5"
version := "8.0.1-2c2490"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "path-parser" % "6.1.0-b1eec6",
  "org.scalablytyped.japgolly" %%% "route-node" % "4.1.1-5f489b",
  "org.scalablytyped.japgolly" %%% "router5-transition-path" % "8.0.1-0b01e8",
  "org.scalablytyped.japgolly" %%% "search-params" % "4.0.1-a241aa",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
