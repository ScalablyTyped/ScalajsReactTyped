organization := "org.scalablytyped.japgolly"
name := "ionic__storage"
version := "2.2.0-59b77e"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "angular__compiler" % "8.2.14-5163d7",
  "org.scalablytyped.japgolly" %%% "angular__core" % "8.2.14-2e847b",
  "org.scalablytyped.japgolly" %%% "inquirer" % "6.5-dt-20200226Z-29a9c4",
  "org.scalablytyped.japgolly" %%% "localforage" % "1.7.3-a7e128",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "rxjs" % "6.5.4-a27765",
  "org.scalablytyped.japgolly" %%% "rxjs-compat" % "6.5.4-968493",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "through" % "0.0-unknown-dt-20200225Z-90fce9",
  "org.scalablytyped.japgolly" %%% "typescript" % "3.8.2-cfbb15")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
