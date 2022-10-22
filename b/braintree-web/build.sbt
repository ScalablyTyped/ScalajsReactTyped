organization := "org.scalablytyped.japgolly"
name := "braintree-web"
version := "3.75-dt-20220916Z-52a069"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "googlepay" % "0.6-dt-20220624Z-d64a78",
  "org.scalablytyped.japgolly" %%% "paypal-checkout-components" % "4.0-dt-20220214Z-f8ca9f",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
