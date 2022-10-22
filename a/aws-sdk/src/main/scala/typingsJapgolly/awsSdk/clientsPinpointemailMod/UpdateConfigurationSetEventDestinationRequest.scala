package typingsJapgolly.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConfigurationSetEventDestinationRequest extends StObject {
  
  /**
    * The name of the configuration set that contains the event destination that you want to modify.
    */
  var ConfigurationSetName: typingsJapgolly.awsSdk.clientsPinpointemailMod.ConfigurationSetName
  
  /**
    * An object that defines the event destination.
    */
  var EventDestination: EventDestinationDefinition
  
  /**
    * The name of the event destination that you want to modify.
    */
  var EventDestinationName: typingsJapgolly.awsSdk.clientsPinpointemailMod.EventDestinationName
}
object UpdateConfigurationSetEventDestinationRequest {
  
  inline def apply(
    ConfigurationSetName: ConfigurationSetName,
    EventDestination: EventDestinationDefinition,
    EventDestinationName: EventDestinationName
  ): UpdateConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], EventDestination = EventDestination.asInstanceOf[js.Any], EventDestinationName = EventDestinationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationSetEventDestinationRequest]
  }
  
  extension [Self <: UpdateConfigurationSetEventDestinationRequest](x: Self) {
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setEventDestination(value: EventDestinationDefinition): Self = StObject.set(x, "EventDestination", value.asInstanceOf[js.Any])
    
    inline def setEventDestinationName(value: EventDestinationName): Self = StObject.set(x, "EventDestinationName", value.asInstanceOf[js.Any])
  }
}
