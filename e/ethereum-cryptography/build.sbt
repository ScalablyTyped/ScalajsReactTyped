organization := "org.scalablytyped.japgolly"
name := "ethereum-cryptography"
version := "1.1.2-a9807e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "noble__hashes" % "1.1.2-b84540",
  "org.scalablytyped.japgolly" %%% "noble__secp256k1" % "1.7.0-9546a5",
  "org.scalablytyped.japgolly" %%% "scure__bip32" % "1.1.0-2f8e15",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
