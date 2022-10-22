organization := "org.scalablytyped.japgolly"
name := "vue-i18n"
version := "9.2.2-4f9669"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "intlify__core-base" % "9.2.2-76f8aa",
  "org.scalablytyped.japgolly" %%% "intlify__devtools-if" % "9.2.2-d5c053",
  "org.scalablytyped.japgolly" %%% "intlify__message-compiler" % "9.2.2-55f199",
  "org.scalablytyped.japgolly" %%% "intlify__shared" % "9.2.2-827a89",
  "org.scalablytyped.japgolly" %%% "intlify__vue-devtools" % "9.2.2-91b6fd",
  "org.scalablytyped.japgolly" %%% "source-map" % "0.7.4-4daf59",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "vue__reactivity" % "3.2.41-30a97e",
  "org.scalablytyped.japgolly" %%% "vue__runtime-core" % "3.2.41-0507a9",
  "org.scalablytyped.japgolly" %%% "vue__shared" % "3.2.41-27d6be")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
