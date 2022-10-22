package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRoutingProfileConcurrencyRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The channels that agents can handle in the Contact Control Panel (CCP).
    */
  var MediaConcurrencies: typingsJapgolly.awsSdk.clientsConnectMod.MediaConcurrencies
  
  /**
    * The identifier of the routing profile.
    */
  var RoutingProfileId: typingsJapgolly.awsSdk.clientsConnectMod.RoutingProfileId
}
object UpdateRoutingProfileConcurrencyRequest {
  
  inline def apply(InstanceId: InstanceId, MediaConcurrencies: MediaConcurrencies, RoutingProfileId: RoutingProfileId): UpdateRoutingProfileConcurrencyRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], MediaConcurrencies = MediaConcurrencies.asInstanceOf[js.Any], RoutingProfileId = RoutingProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoutingProfileConcurrencyRequest]
  }
  
  extension [Self <: UpdateRoutingProfileConcurrencyRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setMediaConcurrencies(value: MediaConcurrencies): Self = StObject.set(x, "MediaConcurrencies", value.asInstanceOf[js.Any])
    
    inline def setMediaConcurrenciesVarargs(value: MediaConcurrency*): Self = StObject.set(x, "MediaConcurrencies", js.Array(value*))
    
    inline def setRoutingProfileId(value: RoutingProfileId): Self = StObject.set(x, "RoutingProfileId", value.asInstanceOf[js.Any])
  }
}
