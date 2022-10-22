organization := "org.scalablytyped.japgolly"
name := "jupyterlab__statedb"
version := "3.4.8-b6bde3"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "lumino__algorithm" % "1.9.2-147e30",
  "org.scalablytyped.japgolly" %%% "lumino__commands" % "1.20.1-bc4958",
  "org.scalablytyped.japgolly" %%% "lumino__coreutils" % "1.12.1-93beef",
  "org.scalablytyped.japgolly" %%% "lumino__disposable" % "1.10.2-d4a6c7",
  "org.scalablytyped.japgolly" %%% "lumino__signaling" % "1.10.2-08c11b",
  "org.scalablytyped.japgolly" %%% "lumino__virtualdom" % "1.14.2-25af81",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
