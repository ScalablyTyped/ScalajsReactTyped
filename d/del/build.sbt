organization := "org.scalablytyped.japgolly"
name := "del"
version := "5.1.0-9176d6"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "braces" % "3.0-dt-20190422Z-85b342",
  "org.scalablytyped.japgolly" %%% "fast-glob" % "2.2.7-43bb85",
  "org.scalablytyped.japgolly" %%% "glob" % "7.1-dt-20200226Z-d017c7",
  "org.scalablytyped.japgolly" %%% "globby" % "10.0.2-47df4c",
  "org.scalablytyped.japgolly" %%% "micromatch" % "4.0-dt-20200226Z-151cf5",
  "org.scalablytyped.japgolly" %%% "minimatch" % "3.0-dt-20200226Z-7b8745",
  "org.scalablytyped.japgolly" %%% "mrmlnc__readdir-enhanced" % "2.2.1-fefe9e",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
