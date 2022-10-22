package typingsJapgolly.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConfigurationSetTrackingOptionsRequest extends StObject {
  
  /**
    * The name of the configuration set that the tracking options should be associated with.
    */
  var ConfigurationSetName: typingsJapgolly.awsSdk.clientsSesMod.ConfigurationSetName
  
  var TrackingOptions: typingsJapgolly.awsSdk.clientsSesMod.TrackingOptions
}
object CreateConfigurationSetTrackingOptionsRequest {
  
  inline def apply(ConfigurationSetName: ConfigurationSetName, TrackingOptions: TrackingOptions): CreateConfigurationSetTrackingOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], TrackingOptions = TrackingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationSetTrackingOptionsRequest]
  }
  
  extension [Self <: CreateConfigurationSetTrackingOptionsRequest](x: Self) {
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setTrackingOptions(value: TrackingOptions): Self = StObject.set(x, "TrackingOptions", value.asInstanceOf[js.Any])
  }
}
