organization := "org.scalablytyped.japgolly"
name := "jupyterlab__completer"
version := "3.4.8-3b0689"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "csstype" % "3.1.1-6f6894",
  "org.scalablytyped.japgolly" %%% "free-style" % "4.1.0-e24760",
  "org.scalablytyped.japgolly" %%% "jupyterlab__codeeditor" % "3.4.8-1be9ea",
  "org.scalablytyped.japgolly" %%% "jupyterlab__coreutils" % "5.4.8-1ef8c9",
  "org.scalablytyped.japgolly" %%% "jupyterlab__nbformat" % "3.4.8-f54e5c",
  "org.scalablytyped.japgolly" %%% "jupyterlab__observables" % "4.4.8-2ce4bb",
  "org.scalablytyped.japgolly" %%% "jupyterlab__services" % "6.4.8-4413bf",
  "org.scalablytyped.japgolly" %%% "jupyterlab__settingregistry" % "3.4.8-e84666",
  "org.scalablytyped.japgolly" %%% "jupyterlab__shared-models" % "3.4.8-fbc604",
  "org.scalablytyped.japgolly" %%% "jupyterlab__statedb" % "3.4.8-b6bde3",
  "org.scalablytyped.japgolly" %%% "jupyterlab__translation" % "3.4.8-a56198",
  "org.scalablytyped.japgolly" %%% "jupyterlab__ui-components" % "3.4.8-05a00c",
  "org.scalablytyped.japgolly" %%% "lib0" % "0.2.52-8fc191",
  "org.scalablytyped.japgolly" %%% "lumino__algorithm" % "1.9.2-147e30",
  "org.scalablytyped.japgolly" %%% "lumino__commands" % "1.20.1-bc4958",
  "org.scalablytyped.japgolly" %%% "lumino__coreutils" % "1.12.1-93beef",
  "org.scalablytyped.japgolly" %%% "lumino__disposable" % "1.10.2-d4a6c7",
  "org.scalablytyped.japgolly" %%% "lumino__messaging" % "1.10.3-4da0f7",
  "org.scalablytyped.japgolly" %%% "lumino__polling" % "1.11.2-d03709",
  "org.scalablytyped.japgolly" %%% "lumino__signaling" % "1.10.2-08c11b",
  "org.scalablytyped.japgolly" %%% "lumino__virtualdom" % "1.14.2-25af81",
  "org.scalablytyped.japgolly" %%% "lumino__widgets" % "1.34.1-e3b5a0",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20220407Z-2e1de8",
  "org.scalablytyped.japgolly" %%% "react" % "18.0-dt-20220922Z-c9da7d",
  "org.scalablytyped.japgolly" %%% "rollup" % "3.2.2-3943b7",
  "org.scalablytyped.japgolly" %%% "scheduler" % "0.16-dt-20211202Z-ea969a",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "typestyle" % "2.4.0-949903",
  "org.scalablytyped.japgolly" %%% "y-protocols" % "1.0.5-293085",
  "org.scalablytyped.japgolly" %%% "yjs" % "13.5.41-9cc176")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
