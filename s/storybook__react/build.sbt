organization := "org.gulliblytyped.japgolly"
name := "storybook__react"
version := "5.2.6-dab8ac"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "csstype" % "2.6.6-42c42f",
  "org.gulliblytyped.japgolly" %%% "emotion-theming" % "10.0.19-b58dea",
  "org.gulliblytyped.japgolly" %%% "emotion__core" % "10.0.20-da01bb",
  "org.gulliblytyped.japgolly" %%% "emotion__serialize" % "0.11.11-75c143",
  "org.gulliblytyped.japgolly" %%% "emotion__styled" % "10.0.23-0af10b",
  "org.gulliblytyped.japgolly" %%% "emotion__styled-base" % "10.0.24-3193c7",
  "org.gulliblytyped.japgolly" %%% "emotion__utils" % "0.11.2-63ed4b",
  "org.gulliblytyped.japgolly" %%% "history" % "4.7.2-dt-20191126Z-a1dd63",
  "org.gulliblytyped.japgolly" %%% "node" % "12.12-dt-20191126Z-fec8d2",
  "org.gulliblytyped.japgolly" %%% "prop-types" % "15.7-dt-20190924Z-56dadc",
  "org.gulliblytyped.japgolly" %%% "reach__router" % "1.2-dt-20191009Z-bb20a0",
  "org.gulliblytyped.japgolly" %%% "react" % "16.9-dt-20191126Z-082653",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-ed3398",
  "org.gulliblytyped.japgolly" %%% "storybook__addons" % "5.2.6-304d8e",
  "org.gulliblytyped.japgolly" %%% "storybook__api" % "5.2.6-70fda6",
  "org.gulliblytyped.japgolly" %%% "storybook__channels" % "5.2.6-7e08ca",
  "org.gulliblytyped.japgolly" %%% "storybook__theming" % "5.2.6-14a02b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        