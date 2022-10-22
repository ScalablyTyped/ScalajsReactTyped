organization := "org.scalablytyped.japgolly"
name := "material-components-web"
version := "14.0.0-feb4fa"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "material__auto-init" % "14.0.0-3b868d",
  "org.scalablytyped.japgolly" %%% "material__banner" % "14.0.0-d77ba9",
  "org.scalablytyped.japgolly" %%% "material__base" % "14.0.0-29b455",
  "org.scalablytyped.japgolly" %%% "material__checkbox" % "14.0.0-49d4d6",
  "org.scalablytyped.japgolly" %%% "material__chips" % "14.0.0-618e03",
  "org.scalablytyped.japgolly" %%% "material__circular-progress" % "14.0.0-15ad4f",
  "org.scalablytyped.japgolly" %%% "material__data-table" % "14.0.0-971530",
  "org.scalablytyped.japgolly" %%% "material__dialog" % "14.0.0-371c04",
  "org.scalablytyped.japgolly" %%% "material__dom" % "14.0.0-dc067e",
  "org.scalablytyped.japgolly" %%% "material__drawer" % "14.0.0-3c3766",
  "org.scalablytyped.japgolly" %%% "material__floating-label" % "14.0.0-401a87",
  "org.scalablytyped.japgolly" %%% "material__form-field" % "14.0.0-16e44b",
  "org.scalablytyped.japgolly" %%% "material__icon-button" % "14.0.0-f6554b",
  "org.scalablytyped.japgolly" %%% "material__line-ripple" % "14.0.0-25544d",
  "org.scalablytyped.japgolly" %%% "material__linear-progress" % "14.0.0-b2d26e",
  "org.scalablytyped.japgolly" %%% "material__list" % "14.0.0-71cc70",
  "org.scalablytyped.japgolly" %%% "material__menu" % "14.0.0-9d3278",
  "org.scalablytyped.japgolly" %%% "material__menu-surface" % "14.0.0-0e31af",
  "org.scalablytyped.japgolly" %%% "material__notched-outline" % "14.0.0-e0e38c",
  "org.scalablytyped.japgolly" %%% "material__progress-indicator" % "14.0.0-8dcbd0",
  "org.scalablytyped.japgolly" %%% "material__radio" % "14.0.0-b88a27",
  "org.scalablytyped.japgolly" %%% "material__ripple" % "14.0.0-caf9c9",
  "org.scalablytyped.japgolly" %%% "material__segmented-button" % "14.0.0-e366c6",
  "org.scalablytyped.japgolly" %%% "material__select" % "14.0.0-1e6d5b",
  "org.scalablytyped.japgolly" %%% "material__slider" % "14.0.0-866a0d",
  "org.scalablytyped.japgolly" %%% "material__snackbar" % "14.0.0-3d2553",
  "org.scalablytyped.japgolly" %%% "material__switch" % "14.0.0-e88851",
  "org.scalablytyped.japgolly" %%% "material__tab" % "14.0.0-e0db9c",
  "org.scalablytyped.japgolly" %%% "material__tab-bar" % "14.0.0-110d12",
  "org.scalablytyped.japgolly" %%% "material__tab-indicator" % "14.0.0-fdcaad",
  "org.scalablytyped.japgolly" %%% "material__tab-scroller" % "14.0.0-c6a123",
  "org.scalablytyped.japgolly" %%% "material__textfield" % "14.0.0-198d48",
  "org.scalablytyped.japgolly" %%% "material__tooltip" % "14.0.0-7d3a5c",
  "org.scalablytyped.japgolly" %%% "material__top-app-bar" % "14.0.0-f4bbcf",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
