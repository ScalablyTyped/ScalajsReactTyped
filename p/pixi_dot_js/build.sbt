organization := "org.scalablytyped.japgolly"
name := "pixi_dot_js"
version := "6.5.6-cd9906"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "eventemitter3" % "4.0.7-a15150",
  "org.scalablytyped.japgolly" %%% "offscreencanvas" % "2019.7-dt-20220526Z-509f29",
  "org.scalablytyped.japgolly" %%% "pixi__accessibility" % "6.5.6-1cf80e",
  "org.scalablytyped.japgolly" %%% "pixi__app" % "6.5.6-68748a",
  "org.scalablytyped.japgolly" %%% "pixi__compressed-textures" % "6.5.6-28b926",
  "org.scalablytyped.japgolly" %%% "pixi__constants" % "6.5.6-a7f54b",
  "org.scalablytyped.japgolly" %%% "pixi__core" % "6.5.6-0145df",
  "org.scalablytyped.japgolly" %%% "pixi__display" % "6.5.6-8e481d",
  "org.scalablytyped.japgolly" %%% "pixi__extensions" % "6.5.6-1b09f5",
  "org.scalablytyped.japgolly" %%% "pixi__extract" % "6.5.6-e73d66",
  "org.scalablytyped.japgolly" %%% "pixi__filter-alpha" % "6.5.6-22709f",
  "org.scalablytyped.japgolly" %%% "pixi__filter-blur" % "6.5.6-9bdf47",
  "org.scalablytyped.japgolly" %%% "pixi__filter-color-matrix" % "6.5.6-2f173c",
  "org.scalablytyped.japgolly" %%% "pixi__filter-displacement" % "6.5.6-1977cb",
  "org.scalablytyped.japgolly" %%% "pixi__filter-fxaa" % "6.5.6-fdf60f",
  "org.scalablytyped.japgolly" %%% "pixi__filter-noise" % "6.5.6-0ffa21",
  "org.scalablytyped.japgolly" %%% "pixi__graphics" % "6.5.6-532323",
  "org.scalablytyped.japgolly" %%% "pixi__interaction" % "6.5.6-c4f79d",
  "org.scalablytyped.japgolly" %%% "pixi__loaders" % "6.5.6-0e3c79",
  "org.scalablytyped.japgolly" %%% "pixi__math" % "6.5.6-0dd125",
  "org.scalablytyped.japgolly" %%% "pixi__mesh" % "6.5.6-615cba",
  "org.scalablytyped.japgolly" %%% "pixi__mesh-extras" % "6.5.6-817597",
  "org.scalablytyped.japgolly" %%% "pixi__particle-container" % "6.5.6-531d0d",
  "org.scalablytyped.japgolly" %%% "pixi__prepare" % "6.5.6-e33b1d",
  "org.scalablytyped.japgolly" %%% "pixi__runner" % "6.5.6-678891",
  "org.scalablytyped.japgolly" %%% "pixi__settings" % "6.5.6-30031c",
  "org.scalablytyped.japgolly" %%% "pixi__sprite" % "6.5.6-bb054e",
  "org.scalablytyped.japgolly" %%% "pixi__sprite-animated" % "6.5.6-a4d8f8",
  "org.scalablytyped.japgolly" %%% "pixi__sprite-tiling" % "6.5.6-4335df",
  "org.scalablytyped.japgolly" %%% "pixi__spritesheet" % "6.5.6-fa01c9",
  "org.scalablytyped.japgolly" %%% "pixi__text" % "6.5.6-59aa39",
  "org.scalablytyped.japgolly" %%% "pixi__text-bitmap" % "6.5.6-1adec3",
  "org.scalablytyped.japgolly" %%% "pixi__ticker" % "6.5.6-e6bc97",
  "org.scalablytyped.japgolly" %%% "pixi__utils" % "6.5.6-4a3a53",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
