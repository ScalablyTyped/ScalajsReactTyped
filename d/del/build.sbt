organization := "org.scalablytyped.japgolly"
name := "del"
version := "7.0.0-59f38e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "fast-glob" % "3.2.12-562d0b",
  "org.scalablytyped.japgolly" %%% "globby" % "13.1.2-0a6eca",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "nodelib__fs_dot_scandir" % "2.1.5-c85205",
  "org.scalablytyped.japgolly" %%% "nodelib__fs_dot_stat" % "2.0.5-e29e02",
  "org.scalablytyped.japgolly" %%% "nodelib__fs_dot_walk" % "1.2.8-894cf3",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
