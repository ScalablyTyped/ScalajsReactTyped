package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetoxAliasedConfigurationMultiApps
  extends StObject
     with DetoxAliasedConfiguration {
  
  var apps: js.Array[String]
  
  var device: DetoxAliasedDevice
  
  var `type`: js.UndefOr[scala.Nothing] = js.undefined
}
object DetoxAliasedConfigurationMultiApps {
  
  inline def apply(apps: js.Array[String], device: DetoxAliasedDevice): DetoxAliasedConfigurationMultiApps = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetoxAliasedConfigurationMultiApps]
  }
  
  extension [Self <: DetoxAliasedConfigurationMultiApps](x: Self) {
    
    inline def setApps(value: js.Array[String]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    inline def setAppsVarargs(value: String*): Self = StObject.set(x, "apps", js.Array(value*))
    
    inline def setDevice(value: DetoxAliasedDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
  }
}
