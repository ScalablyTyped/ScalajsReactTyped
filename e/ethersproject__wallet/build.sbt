organization := "org.scalablytyped.japgolly"
name := "ethersproject__wallet"
version := "5.7.0-c31bb5"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "ethersproject__abstract-provider" % "5.7.0-410867",
  "org.scalablytyped.japgolly" %%% "ethersproject__abstract-signer" % "5.7.0-d839d2",
  "org.scalablytyped.japgolly" %%% "ethersproject__bignumber" % "5.7.0-d7bef1",
  "org.scalablytyped.japgolly" %%% "ethersproject__bytes" % "5.7.0-44783d",
  "org.scalablytyped.japgolly" %%% "ethersproject__hdnode" % "5.7.0-932a69",
  "org.scalablytyped.japgolly" %%% "ethersproject__json-wallets" % "5.7.0-9ac0bc",
  "org.scalablytyped.japgolly" %%% "ethersproject__logger" % "5.7.0-6c361d",
  "org.scalablytyped.japgolly" %%% "ethersproject__networks" % "5.7.1-ef0035",
  "org.scalablytyped.japgolly" %%% "ethersproject__properties" % "5.7.0-84449c",
  "org.scalablytyped.japgolly" %%% "ethersproject__signing-key" % "5.7.0-879206",
  "org.scalablytyped.japgolly" %%% "ethersproject__transactions" % "5.7.0-d50198",
  "org.scalablytyped.japgolly" %%% "ethersproject__web" % "5.7.1-bc9e1d",
  "org.scalablytyped.japgolly" %%% "ethersproject__wordlists" % "5.7.0-154ede",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
