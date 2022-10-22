package typingsJapgolly.expoConfigPlugins.buildMod

import typingsJapgolly.expoConfigPlugins.anon.OmitPluginHistoryItemvers
import typingsJapgolly.expoConfigPlugins.anon.PickExpoConfiginternal
import typingsJapgolly.expoConfigPlugins.buildUtilsHistoryMod.PluginHistoryItem
import typingsJapgolly.expoConfigTypes.mod.ExpoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object History {
  
  @JSImport("@expo/config-plugins/build", "History")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addHistoryItem(config: ExpoConfig, item: OmitPluginHistoryItemvers): ExpoConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("addHistoryItem")(config.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[ExpoConfig]
  
  inline def getHistoryItem(config: PickExpoConfiginternal, name: String): PluginHistoryItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getHistoryItem")(config.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[PluginHistoryItem | Null]
}
