package typingsJapgolly.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationLayerAutomaticResponseRequest extends StObject {
  
  /**
    * Specifies the action setting that Shield Advanced should use in the WAF rules that it creates on behalf of the protected resource in response to DDoS attacks. You specify this as part of the configuration for the automatic application layer DDoS mitigation feature, when you enable or update automatic mitigation. Shield Advanced creates the WAF rules in a Shield Advanced-managed rule group, inside the web ACL that you have associated with the resource. 
    */
  var Action: ResponseAction
  
  /**
    * The ARN (Amazon Resource Name) of the resource.
    */
  var ResourceArn: typingsJapgolly.awsSdk.clientsShieldMod.ResourceArn
}
object UpdateApplicationLayerAutomaticResponseRequest {
  
  inline def apply(Action: ResponseAction, ResourceArn: ResourceArn): UpdateApplicationLayerAutomaticResponseRequest = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationLayerAutomaticResponseRequest]
  }
  
  extension [Self <: UpdateApplicationLayerAutomaticResponseRequest](x: Self) {
    
    inline def setAction(value: ResponseAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
