organization := "org.scalablytyped.japgolly"
name := "web3-eth-ens"
version := "1.2.6-23e077"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "bn_dot_js" % "4.11-dt-20200225Z-f6128f",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "web3-core" % "1.2.6-9dbdcd",
  "org.scalablytyped.japgolly" %%% "web3-core-helpers" % "1.2.6-d0c088",
  "org.scalablytyped.japgolly" %%% "web3-core-method" % "1.2.6-1c6ed7",
  "org.scalablytyped.japgolly" %%% "web3-eth-contract" % "1.2.6-e45b4b",
  "org.scalablytyped.japgolly" %%% "web3-utils" % "1.2.6-8ef6b9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
