package typingsJapgolly.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigurationSetResponse extends StObject {
  
  /**
    * The configuration set object associated with the specified configuration set.
    */
  var ConfigurationSet: js.UndefOr[typingsJapgolly.awsSdk.clientsSesMod.ConfigurationSet] = js.undefined
  
  var DeliveryOptions: js.UndefOr[typingsJapgolly.awsSdk.clientsSesMod.DeliveryOptions] = js.undefined
  
  /**
    * A list of event destinations associated with the configuration set. 
    */
  var EventDestinations: js.UndefOr[typingsJapgolly.awsSdk.clientsSesMod.EventDestinations] = js.undefined
  
  /**
    * An object that represents the reputation settings for the configuration set. 
    */
  var ReputationOptions: js.UndefOr[typingsJapgolly.awsSdk.clientsSesMod.ReputationOptions] = js.undefined
  
  /**
    * The name of the custom open and click tracking domain associated with the configuration set.
    */
  var TrackingOptions: js.UndefOr[typingsJapgolly.awsSdk.clientsSesMod.TrackingOptions] = js.undefined
}
object DescribeConfigurationSetResponse {
  
  inline def apply(): DescribeConfigurationSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationSetResponse]
  }
  
  extension [Self <: DescribeConfigurationSetResponse](x: Self) {
    
    inline def setConfigurationSet(value: ConfigurationSet): Self = StObject.set(x, "ConfigurationSet", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetUndefined: Self = StObject.set(x, "ConfigurationSet", js.undefined)
    
    inline def setDeliveryOptions(value: DeliveryOptions): Self = StObject.set(x, "DeliveryOptions", value.asInstanceOf[js.Any])
    
    inline def setDeliveryOptionsUndefined: Self = StObject.set(x, "DeliveryOptions", js.undefined)
    
    inline def setEventDestinations(value: EventDestinations): Self = StObject.set(x, "EventDestinations", value.asInstanceOf[js.Any])
    
    inline def setEventDestinationsUndefined: Self = StObject.set(x, "EventDestinations", js.undefined)
    
    inline def setEventDestinationsVarargs(value: EventDestination*): Self = StObject.set(x, "EventDestinations", js.Array(value*))
    
    inline def setReputationOptions(value: ReputationOptions): Self = StObject.set(x, "ReputationOptions", value.asInstanceOf[js.Any])
    
    inline def setReputationOptionsUndefined: Self = StObject.set(x, "ReputationOptions", js.undefined)
    
    inline def setTrackingOptions(value: TrackingOptions): Self = StObject.set(x, "TrackingOptions", value.asInstanceOf[js.Any])
    
    inline def setTrackingOptionsUndefined: Self = StObject.set(x, "TrackingOptions", js.undefined)
  }
}
