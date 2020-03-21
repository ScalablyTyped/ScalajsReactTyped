organization := "org.scalablytyped.japgolly"
name := "gulp-imagemin"
version := "7.0-dt-20200228Z-94366e"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "imagemin" % "7.0-dt-20190909Z-0ba063",
  "org.scalablytyped.japgolly" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-a55e92",
  "org.scalablytyped.japgolly" %%% "imagemin-mozjpeg" % "8.0-dt-20190924Z-9f5331",
  "org.scalablytyped.japgolly" %%% "imagemin-optipng" % "5.2-dt-20180825Z-0a1315",
  "org.scalablytyped.japgolly" %%% "imagemin-svgo" % "7.0-dt-20180825Z-c2423c",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "svgo" % "1.3-dt-20200226Z-a42052")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
