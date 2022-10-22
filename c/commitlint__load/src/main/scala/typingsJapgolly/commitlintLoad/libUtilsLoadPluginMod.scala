package typingsJapgolly.commitlintLoad

import typingsJapgolly.commitlintTypes.libLoadMod.PluginRecords
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsLoadPluginMod {
  
  @JSImport("@commitlint/load/lib/utils/load-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(plugins: PluginRecords, pluginName: String): PluginRecords = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(plugins.asInstanceOf[js.Any], pluginName.asInstanceOf[js.Any])).asInstanceOf[PluginRecords]
  inline def default(plugins: PluginRecords, pluginName: String, debug: Boolean): PluginRecords = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(plugins.asInstanceOf[js.Any], pluginName.asInstanceOf[js.Any], debug.asInstanceOf[js.Any])).asInstanceOf[PluginRecords]
}
