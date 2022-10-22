organization := "org.scalablytyped.japgolly"
name := "ethereumjs-tx"
version := "2.1.2-337cea"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "bn_dot_js" % "5.1-dt-20220829Z-191285",
  "org.scalablytyped.japgolly" %%% "buffer" % "6.0.3-40f891",
  "org.scalablytyped.japgolly" %%% "ethereumjs-common" % "1.5.2-ca02d5",
  "org.scalablytyped.japgolly" %%% "ethereumjs-util" % "7.1.5-fe20c3",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "rlp" % "3.0.0-df3236",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
