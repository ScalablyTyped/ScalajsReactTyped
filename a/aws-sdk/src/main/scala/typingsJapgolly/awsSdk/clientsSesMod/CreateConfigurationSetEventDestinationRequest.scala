package typingsJapgolly.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConfigurationSetEventDestinationRequest extends StObject {
  
  /**
    * The name of the configuration set that the event destination should be associated with.
    */
  var ConfigurationSetName: typingsJapgolly.awsSdk.clientsSesMod.ConfigurationSetName
  
  /**
    * An object that describes the AWS service that email sending event information will be published to.
    */
  var EventDestination: typingsJapgolly.awsSdk.clientsSesMod.EventDestination
}
object CreateConfigurationSetEventDestinationRequest {
  
  inline def apply(ConfigurationSetName: ConfigurationSetName, EventDestination: EventDestination): CreateConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], EventDestination = EventDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationSetEventDestinationRequest]
  }
  
  extension [Self <: CreateConfigurationSetEventDestinationRequest](x: Self) {
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setEventDestination(value: EventDestination): Self = StObject.set(x, "EventDestination", value.asInstanceOf[js.Any])
  }
}
