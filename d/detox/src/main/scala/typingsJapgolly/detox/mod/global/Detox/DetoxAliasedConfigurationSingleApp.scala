package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetoxAliasedConfigurationSingleApp
  extends StObject
     with DetoxAliasedConfiguration {
  
  var app: String | DetoxAppConfig
  
  var device: DetoxAliasedDevice
  
  var `type`: js.UndefOr[scala.Nothing] = js.undefined
}
object DetoxAliasedConfigurationSingleApp {
  
  inline def apply(app: String | DetoxAppConfig, device: DetoxAliasedDevice): DetoxAliasedConfigurationSingleApp = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetoxAliasedConfigurationSingleApp]
  }
  
  extension [Self <: DetoxAliasedConfigurationSingleApp](x: Self) {
    
    inline def setApp(value: String | DetoxAppConfig): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setDevice(value: DetoxAliasedDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
  }
}
