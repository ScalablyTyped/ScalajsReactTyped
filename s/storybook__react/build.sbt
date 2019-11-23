organization := "org.gulliblytyped.japgolly"
name := "storybook__react"
version := "5.2.6-961e29"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "csstype" % "2.6.6-926676",
  "org.gulliblytyped.japgolly" %%% "emotion-theming" % "10.0.19-283756",
  "org.gulliblytyped.japgolly" %%% "emotion__core" % "10.0.20-6b6487",
  "org.gulliblytyped.japgolly" %%% "emotion__serialize" % "0.11.11-9cb248",
  "org.gulliblytyped.japgolly" %%% "emotion__styled" % "10.0.23-253adf",
  "org.gulliblytyped.japgolly" %%% "emotion__styled-base" % "10.0.24-07dfe8",
  "org.gulliblytyped.japgolly" %%% "emotion__utils" % "0.11.2-ee4f75",
  "org.gulliblytyped.japgolly" %%% "history" % "4.7.2-dt-20190822Z-b75265",
  "org.gulliblytyped.japgolly" %%% "node" % "12.12-dt-20191123Z-b2d3cf",
  "org.gulliblytyped.japgolly" %%% "prop-types" % "15.7-dt-20190924Z-2e958d",
  "org.gulliblytyped.japgolly" %%% "reach__router" % "1.2-dt-20191009Z-fc1edc",
  "org.gulliblytyped.japgolly" %%% "react" % "16.9-dt-20191122Z-580648",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-6f398d",
  "org.gulliblytyped.japgolly" %%% "storybook__addons" % "5.2.6-0e6178",
  "org.gulliblytyped.japgolly" %%% "storybook__api" % "5.2.6-1012b7",
  "org.gulliblytyped.japgolly" %%% "storybook__channels" % "5.2.6-d17140",
  "org.gulliblytyped.japgolly" %%% "storybook__router" % "5.2.6-7d1478",
  "org.gulliblytyped.japgolly" %%% "storybook__theming" % "5.2.6-ac8727")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        