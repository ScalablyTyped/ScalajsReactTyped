package typingsJapgolly.expoConfigPlugins

import typingsJapgolly.expoConfigPlugins.anon.FileContents
import typingsJapgolly.expoConfigPlugins.anon.FilePath_
import typingsJapgolly.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosXcodeProjectFileMod {
  
  @JSImport("@expo/config-plugins/build/ios/XcodeProjectFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBuildSourceFile(hasProjectNativeProjectRootFilePathFileContentsOverwrite: FileContents): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuildSourceFile")(hasProjectNativeProjectRootFilePathFileContentsOverwrite.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@expo/config-plugins/build/ios/XcodeProjectFile", "withBuildSourceFile")
  @js.native
  val withBuildSourceFile: ConfigPlugin[FilePath_] = js.native
}
