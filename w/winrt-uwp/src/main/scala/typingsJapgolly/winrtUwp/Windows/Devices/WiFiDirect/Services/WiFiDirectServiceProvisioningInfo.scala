package typingsJapgolly.winrtUwp.Windows.Devices.WiFiDirect.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains provisioning information about a Wi-Fi Direct Service. */
trait WiFiDirectServiceProvisioningInfo extends StObject {
  
  /** Gets a value indicating whether Wi-Fi Direct Point to Point (P2P) group formation is needed. */
  var isGroupFormationNeeded: Boolean
  
  /** Gets a value describing the configuration method in use. */
  var selectedConfigurationMethod: WiFiDirectServiceConfigurationMethod
}
object WiFiDirectServiceProvisioningInfo {
  
  inline def apply(isGroupFormationNeeded: Boolean, selectedConfigurationMethod: WiFiDirectServiceConfigurationMethod): WiFiDirectServiceProvisioningInfo = {
    val __obj = js.Dynamic.literal(isGroupFormationNeeded = isGroupFormationNeeded.asInstanceOf[js.Any], selectedConfigurationMethod = selectedConfigurationMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectServiceProvisioningInfo]
  }
  
  extension [Self <: WiFiDirectServiceProvisioningInfo](x: Self) {
    
    inline def setIsGroupFormationNeeded(value: Boolean): Self = StObject.set(x, "isGroupFormationNeeded", value.asInstanceOf[js.Any])
    
    inline def setSelectedConfigurationMethod(value: WiFiDirectServiceConfigurationMethod): Self = StObject.set(x, "selectedConfigurationMethod", value.asInstanceOf[js.Any])
  }
}
