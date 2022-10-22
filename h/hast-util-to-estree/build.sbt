organization := "org.scalablytyped.japgolly"
name := "hast-util-to-estree"
version := "2.1.0-937cbc"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "estree" % "1.0-dt-20220712Z-3bfa6e",
  "org.scalablytyped.japgolly" %%% "estree-jsx" % "0.0.1-5744db",
  "org.scalablytyped.japgolly" %%% "hast" % "2.3-dt-20211202Z-d15974",
  "org.scalablytyped.japgolly" %%% "mdast" % "3.0-dt-20211202Z-a36ed9",
  "org.scalablytyped.japgolly" %%% "mdast-util-from-markdown" % "1.2.0-e91c03",
  "org.scalablytyped.japgolly" %%% "mdast-util-mdx-expression" % "1.3.0-2caeb9",
  "org.scalablytyped.japgolly" %%% "mdast-util-mdx-jsx" % "2.1.0-e27669",
  "org.scalablytyped.japgolly" %%% "mdast-util-mdxjs-esm" % "1.3.0-071da7",
  "org.scalablytyped.japgolly" %%% "mdast-util-to-markdown" % "1.3.0-5dccd7",
  "org.scalablytyped.japgolly" %%% "micromark-util-types" % "1.0.2-3b0bd5",
  "org.scalablytyped.japgolly" %%% "property-information" % "6.1.1-d015c1",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "unist" % "2.0-dt-20220624Z-db00de")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
