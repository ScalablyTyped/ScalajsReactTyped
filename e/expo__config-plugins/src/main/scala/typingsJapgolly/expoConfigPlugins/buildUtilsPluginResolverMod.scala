package typingsJapgolly.expoConfigPlugins

import typingsJapgolly.expoConfigPlugins.anon.FilePathIsPluginFile
import typingsJapgolly.expoConfigPlugins.anon.IsPluginFile
import typingsJapgolly.expoConfigPlugins.anon.PluginFile
import typingsJapgolly.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import typingsJapgolly.expoConfigPlugins.buildPluginDottypesMod.StaticPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsPluginResolverMod {
  
  @JSImport("@expo/config-plugins/build/utils/plugin-resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertInternalProjectRoot(): /* asserts projectRoot */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assertInternalProjectRoot")().asInstanceOf[/* asserts projectRoot */ Boolean]
  inline def assertInternalProjectRoot(projectRoot: String): /* asserts projectRoot */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assertInternalProjectRoot")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[/* asserts projectRoot */ Boolean]
  
  inline def moduleNameIsDirectFileReference(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("moduleNameIsDirectFileReference")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def normalizeStaticPlugin(plugin: String): StaticPlugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeStaticPlugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[StaticPlugin[Any]]
  inline def normalizeStaticPlugin(plugin: ConfigPlugin[Unit]): StaticPlugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeStaticPlugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[StaticPlugin[Any]]
  inline def normalizeStaticPlugin(plugin: StaticPlugin[Any]): StaticPlugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeStaticPlugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[StaticPlugin[Any]]
  
  @JSImport("@expo/config-plugins/build/utils/plugin-resolver", "pluginFileName")
  @js.native
  val pluginFileName: /* "app.plugin.js" */ String = js.native
  
  inline def resolveConfigPluginExport(hasPluginPluginFilePluginReferenceIsPluginFile: IsPluginFile): ConfigPlugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveConfigPluginExport")(hasPluginPluginFilePluginReferenceIsPluginFile.asInstanceOf[js.Any]).asInstanceOf[ConfigPlugin[Any]]
  
  inline def resolveConfigPluginFunction(projectRoot: String, pluginReference: String): ConfigPlugin[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveConfigPluginFunction")(projectRoot.asInstanceOf[js.Any], pluginReference.asInstanceOf[js.Any])).asInstanceOf[ConfigPlugin[Any]]
  
  inline def resolveConfigPluginFunctionWithInfo(projectRoot: String, pluginReference: String): PluginFile = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveConfigPluginFunctionWithInfo")(projectRoot.asInstanceOf[js.Any], pluginReference.asInstanceOf[js.Any])).asInstanceOf[PluginFile]
  
  inline def resolvePluginForModule(projectRoot: String, modulePath: String): FilePathIsPluginFile = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePluginForModule")(projectRoot.asInstanceOf[js.Any], modulePath.asInstanceOf[js.Any])).asInstanceOf[FilePathIsPluginFile]
}
