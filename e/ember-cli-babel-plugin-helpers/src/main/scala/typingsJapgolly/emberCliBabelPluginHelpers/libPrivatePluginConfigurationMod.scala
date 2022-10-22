package typingsJapgolly.emberCliBabelPluginHelpers

import typingsJapgolly.emberCliBabelPluginHelpers.mod.BabelPluginConfig
import typingsJapgolly.emberCliBabelPluginHelpers.mod.ConfigurationTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPrivatePluginConfigurationMod {
  
  @JSImport("ember-cli-babel-plugin-helpers/lib/-private/plugin-configuration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findPluginIndex(plugins: js.Array[BabelPluginConfig], plugin: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findPluginIndex")(plugins.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getPluginsArray(target: js.Array[BabelPluginConfig]): js.Array[BabelPluginConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPluginsArray")(target.asInstanceOf[js.Any]).asInstanceOf[js.Array[BabelPluginConfig]]
  inline def getPluginsArray(target: ConfigurationTarget): js.Array[BabelPluginConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPluginsArray")(target.asInstanceOf[js.Any]).asInstanceOf[js.Array[BabelPluginConfig]]
}
