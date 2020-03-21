organization := "org.scalablytyped.japgolly"
name := "vscode-languageserver"
version := "5.2.1-ab4d4c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "vscode-jsonrpc" % "4.0.0-c9070f",
  "org.scalablytyped.japgolly" %%% "vscode-languageserver-protocol" % "3.14.1-5a0d4c",
  "org.scalablytyped.japgolly" %%% "vscode-languageserver-types" % "3.15.1-e10a0e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
