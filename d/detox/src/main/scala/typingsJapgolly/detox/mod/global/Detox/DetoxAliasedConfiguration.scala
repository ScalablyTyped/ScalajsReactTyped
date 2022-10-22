package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.detox.mod.global.Detox.DetoxAliasedConfigurationSingleApp
  - typingsJapgolly.detox.mod.global.Detox.DetoxAliasedConfigurationMultiApps
*/
trait DetoxAliasedConfiguration extends StObject
object DetoxAliasedConfiguration {
  
  inline def DetoxAliasedConfigurationMultiApps(apps: js.Array[String], device: DetoxAliasedDevice): typingsJapgolly.detox.mod.global.Detox.DetoxAliasedConfigurationMultiApps = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.detox.mod.global.Detox.DetoxAliasedConfigurationMultiApps]
  }
  
  inline def DetoxAliasedConfigurationSingleApp(app: String | DetoxAppConfig, device: DetoxAliasedDevice): typingsJapgolly.detox.mod.global.Detox.DetoxAliasedConfigurationSingleApp = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.detox.mod.global.Detox.DetoxAliasedConfigurationSingleApp]
  }
}
