organization := "org.scalablytyped.japgolly"
name := "storybook-react-router"
version := "1.0-dt-20220726Z-0f969a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "ajv" % "8.11.0-e04284",
  "org.scalablytyped.japgolly" %%% "babel__core" % "7.1-dt-20220624Z-70ea58",
  "org.scalablytyped.japgolly" %%% "babel__generator" % "7.6-dt-20211223Z-d287e9",
  "org.scalablytyped.japgolly" %%% "babel__parser" % "7.19.4-03fc7e",
  "org.scalablytyped.japgolly" %%% "babel__template" % "7.4-dt-20211202Z-a6f3ab",
  "org.scalablytyped.japgolly" %%% "babel__traverse" % "7.18-dt-20220923Z-12cca0",
  "org.scalablytyped.japgolly" %%% "babel__types" % "7.19.4-3aab9c",
  "org.scalablytyped.japgolly" %%% "csstype" % "3.1.1-6f6894",
  "org.scalablytyped.japgolly" %%% "estree" % "1.0-dt-20220712Z-3bfa6e",
  "org.scalablytyped.japgolly" %%% "events" % "3.0-dt-20211202Z-30431b",
  "org.scalablytyped.japgolly" %%% "express" % "4.17-dt-20220913Z-2651ea",
  "org.scalablytyped.japgolly" %%% "express-serve-static-core" % "0.1.1-5aecff",
  "org.scalablytyped.japgolly" %%% "fork-ts-checker-webpack-plugin" % "7.2.13-5b95db",
  "org.scalablytyped.japgolly" %%% "json-schema" % "7.0-dt-20220325Z-c3cb4f",
  "org.scalablytyped.japgolly" %%% "mime" % "3.0-dt-20220804Z-38356b",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "node-abort-controller" % "3.0.1-459785",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20220407Z-2e1de8",
  "org.scalablytyped.japgolly" %%% "qs" % "6.9-dt-20220913Z-9097c1",
  "org.scalablytyped.japgolly" %%% "re2" % "1.17.7-1eb746",
  "org.scalablytyped.japgolly" %%% "react" % "18.0-dt-20220922Z-c9da7d",
  "org.scalablytyped.japgolly" %%% "react-element-to-jsx-string" % "15.0.0-36ebf2",
  "org.scalablytyped.japgolly" %%% "react-router" % "6.4.2-6bb02b",
  "org.scalablytyped.japgolly" %%% "remix-run__router" % "1.0.2-ff6c7c",
  "org.scalablytyped.japgolly" %%% "scheduler" % "0.16-dt-20211202Z-ea969a",
  "org.scalablytyped.japgolly" %%% "schema-utils" % "4.0.0-ecbca7",
  "org.scalablytyped.japgolly" %%% "serve-static" % "1.15-dt-20220729Z-4a727e",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "storybook__addons" % "6.5.12-a4b554",
  "org.scalablytyped.japgolly" %%% "storybook__api" % "6.5.12-f93a00",
  "org.scalablytyped.japgolly" %%% "storybook__channels" % "6.5.12-52ebc6",
  "org.scalablytyped.japgolly" %%% "storybook__core-common" % "6.5.12-b54f1a",
  "org.scalablytyped.japgolly" %%% "storybook__docs-tools" % "6.5.12-792e3e",
  "org.scalablytyped.japgolly" %%% "storybook__react" % "6.5.12-745766",
  "org.scalablytyped.japgolly" %%% "storybook__router" % "6.5.12-124f05",
  "org.scalablytyped.japgolly" %%% "storybook__store" % "6.5.12-c06a69",
  "org.scalablytyped.japgolly" %%% "storybook__theming" % "6.5.12-a0989f",
  "org.scalablytyped.japgolly" %%% "synchronous-promise" % "2.0.16-1b0e2a",
  "org.scalablytyped.japgolly" %%% "tapable" % "2.2.1-6e9028",
  "org.scalablytyped.japgolly" %%% "typescript" % "4.8.4-7a2e7a",
  "org.scalablytyped.japgolly" %%% "uri-js" % "4.4.1-ea7df5",
  "org.scalablytyped.japgolly" %%% "webpack" % "5.74.0-ca115e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
