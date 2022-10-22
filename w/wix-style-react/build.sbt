organization := "org.scalablytyped.japgolly"
name := "wix-style-react"
version := "10.58.0-bb1012"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "aria-query" % "5.0-dt-20211202Z-3dd6d4",
  "org.scalablytyped.japgolly" %%% "blocking-proxy" % "1.0.1-e7853c",
  "org.scalablytyped.japgolly" %%% "color" % "3.0-dt-20220819Z-e37132",
  "org.scalablytyped.japgolly" %%% "color-convert" % "2.0-dt-20211202Z-a515d2",
  "org.scalablytyped.japgolly" %%% "color-name" % "1.1-dt-20211202Z-a25391",
  "org.scalablytyped.japgolly" %%% "css-element-queries" % "1.2.3-bfe852",
  "org.scalablytyped.japgolly" %%% "csstype" % "3.1.1-6f6894",
  "org.scalablytyped.japgolly" %%% "date-fns" % "2.29.3-3c1548",
  "org.scalablytyped.japgolly" %%% "devtools-protocol" % "0.0.1059612-d86051",
  "org.scalablytyped.japgolly" %%% "dnd-core" % "16.0.1-87e755",
  "org.scalablytyped.japgolly" %%% "enzyme" % "3.10-dt-20220818Z-335cd9",
  "org.scalablytyped.japgolly" %%% "lodash" % "4.14-dt-20220928Z-eb2108",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "popper_dot_js" % "1.16.1-b54a2f",
  "org.scalablytyped.japgolly" %%% "pretty-format" % "29.2.0-dde28b",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20220407Z-2e1de8",
  "org.scalablytyped.japgolly" %%% "protractor" % "7.0.0-e0c521",
  "org.scalablytyped.japgolly" %%% "puppeteer" % "19.0.0-3fbb64",
  "org.scalablytyped.japgolly" %%% "q" % "1.5-dt-20220819Z-c894ec",
  "org.scalablytyped.japgolly" %%% "react" % "18.0-dt-20220922Z-c9da7d",
  "org.scalablytyped.japgolly" %%% "react-dom" % "18.0-dt-20220819Z-74fd4f",
  "org.scalablytyped.japgolly" %%% "redux" % "4.2.0-cbc283",
  "org.scalablytyped.japgolly" %%% "scheduler" % "0.16-dt-20211202Z-ea969a",
  "org.scalablytyped.japgolly" %%% "selenium-webdriver" % "4.1-dt-20220909Z-ba92c6",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "testing-library__dom" % "8.19.0-41ac32",
  "org.scalablytyped.japgolly" %%% "testing-library__react" % "13.4.0-841689",
  "org.scalablytyped.japgolly" %%% "unidriver__core" % "1.3.0-4ee259",
  "org.scalablytyped.japgolly" %%% "unidriver__jsdom-react" % "1.7.0-cf4691",
  "org.scalablytyped.japgolly" %%% "webdriver-js-extender" % "2.2.0-2f1d42",
  "org.scalablytyped.japgolly" %%% "wix-design-systems-locale-utils" % "1.68.0-6c6167",
  "org.scalablytyped.japgolly" %%% "wix-design-systems-providers" % "1.14.0-138f49",
  "org.scalablytyped.japgolly" %%% "wix-ui-test-utils" % "1.0.191-ab4162",
  "org.scalablytyped.japgolly" %%% "ws" % "8.5-dt-20220624Z-5c45c7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
