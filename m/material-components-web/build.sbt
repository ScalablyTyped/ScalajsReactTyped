organization := "org.scalablytyped.japgolly"
name := "material-components-web"
version := "4.0.0-a70564"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "material__auto-init" % "0.35-dt-20190213Z-67560e",
  "org.scalablytyped.japgolly" %%% "material__base" % "0.35-dt-20191126Z-8f84c1",
  "org.scalablytyped.japgolly" %%% "material__checkbox" % "0.35-dt-20191126Z-78b11a",
  "org.scalablytyped.japgolly" %%% "material__chips" % "0.35-dt-20191126Z-53aa63",
  "org.scalablytyped.japgolly" %%% "material__data-table" % "4.0.0-1e0c65",
  "org.scalablytyped.japgolly" %%% "material__dialog" % "0.35-dt-20191126Z-f83685",
  "org.scalablytyped.japgolly" %%% "material__drawer" % "0.43-dt-20191126Z-2f7a8a",
  "org.scalablytyped.japgolly" %%% "material__floating-label" % "0.35-dt-20191126Z-c9fd30",
  "org.scalablytyped.japgolly" %%% "material__form-field" % "0.35-dt-20191126Z-0f4ca0",
  "org.scalablytyped.japgolly" %%% "material__grid-list" % "0.35-dt-20191126Z-ea8299",
  "org.scalablytyped.japgolly" %%% "material__icon-button" % "4.0.0-109097",
  "org.scalablytyped.japgolly" %%% "material__line-ripple" % "0.35-dt-20191126Z-2129f0",
  "org.scalablytyped.japgolly" %%% "material__linear-progress" % "0.35-dt-20191126Z-66e3b6",
  "org.scalablytyped.japgolly" %%% "material__list" % "0.43-dt-20191126Z-8bab59",
  "org.scalablytyped.japgolly" %%% "material__menu" % "0.35-dt-20191126Z-d88c65",
  "org.scalablytyped.japgolly" %%% "material__menu-surface" % "4.0.0-be098c",
  "org.scalablytyped.japgolly" %%% "material__notched-outline" % "0.35-dt-20191126Z-d44ac4",
  "org.scalablytyped.japgolly" %%% "material__radio" % "0.35-dt-20191126Z-e34528",
  "org.scalablytyped.japgolly" %%% "material__ripple" % "0.35-dt-20191126Z-69d8fb",
  "org.scalablytyped.japgolly" %%% "material__select" % "0.35-dt-20191126Z-acb61e",
  "org.scalablytyped.japgolly" %%% "material__selection-control" % "0.35-dt-20190213Z-fd56e9",
  "org.scalablytyped.japgolly" %%% "material__slider" % "0.35-dt-20191126Z-d1a8dc",
  "org.scalablytyped.japgolly" %%% "material__snackbar" % "0.35-dt-20191126Z-987ec5",
  "org.scalablytyped.japgolly" %%% "material__switch" % "4.0.0-fb6d07",
  "org.scalablytyped.japgolly" %%% "material__tab" % "0.35-dt-20191126Z-f7d80a",
  "org.scalablytyped.japgolly" %%% "material__tab-bar" % "4.0.0-878f59",
  "org.scalablytyped.japgolly" %%% "material__tab-indicator" % "4.0.0-d571cc",
  "org.scalablytyped.japgolly" %%% "material__tab-scroller" % "4.0.0-0e8349",
  "org.scalablytyped.japgolly" %%% "material__textfield" % "0.35-dt-20191126Z-4a1378",
  "org.scalablytyped.japgolly" %%% "material__top-app-bar" % "0.35-dt-20191126Z-fc16b1",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
