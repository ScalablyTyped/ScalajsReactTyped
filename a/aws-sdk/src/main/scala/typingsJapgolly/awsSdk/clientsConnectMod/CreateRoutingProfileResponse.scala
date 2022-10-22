package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRoutingProfileResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the routing profile.
    */
  var RoutingProfileArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the routing profile.
    */
  var RoutingProfileId: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.RoutingProfileId] = js.undefined
}
object CreateRoutingProfileResponse {
  
  inline def apply(): CreateRoutingProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRoutingProfileResponse]
  }
  
  extension [Self <: CreateRoutingProfileResponse](x: Self) {
    
    inline def setRoutingProfileArn(value: ARN): Self = StObject.set(x, "RoutingProfileArn", value.asInstanceOf[js.Any])
    
    inline def setRoutingProfileArnUndefined: Self = StObject.set(x, "RoutingProfileArn", js.undefined)
    
    inline def setRoutingProfileId(value: RoutingProfileId): Self = StObject.set(x, "RoutingProfileId", value.asInstanceOf[js.Any])
    
    inline def setRoutingProfileIdUndefined: Self = StObject.set(x, "RoutingProfileId", js.undefined)
  }
}
