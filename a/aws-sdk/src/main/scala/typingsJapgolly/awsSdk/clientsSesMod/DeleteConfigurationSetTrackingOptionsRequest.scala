package typingsJapgolly.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConfigurationSetTrackingOptionsRequest extends StObject {
  
  /**
    * The name of the configuration set from which you want to delete the tracking options.
    */
  var ConfigurationSetName: typingsJapgolly.awsSdk.clientsSesMod.ConfigurationSetName
}
object DeleteConfigurationSetTrackingOptionsRequest {
  
  inline def apply(ConfigurationSetName: ConfigurationSetName): DeleteConfigurationSetTrackingOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigurationSetTrackingOptionsRequest]
  }
  
  extension [Self <: DeleteConfigurationSetTrackingOptionsRequest](x: Self) {
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
  }
}
