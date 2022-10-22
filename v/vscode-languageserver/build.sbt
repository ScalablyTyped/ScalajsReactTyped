organization := "org.scalablytyped.japgolly"
name := "vscode-languageserver"
version := "8.0.2-89a057"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "vscode-jsonrpc" % "8.0.2-9231e1",
  "org.scalablytyped.japgolly" %%% "vscode-languageserver-protocol" % "3.17.2-818217",
  "org.scalablytyped.japgolly" %%% "vscode-languageserver-types" % "3.17.2-1182b9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
