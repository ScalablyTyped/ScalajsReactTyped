package typingsJapgolly.awsSdk.clientsCodestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscribeRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the notification rule for which you want to create the association.
    */
  var Arn: NotificationRuleArn
  
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var ClientRequestToken: js.UndefOr[typingsJapgolly.awsSdk.clientsCodestarnotificationsMod.ClientRequestToken] = js.undefined
  
  var Target: typingsJapgolly.awsSdk.clientsCodestarnotificationsMod.Target
}
object SubscribeRequest {
  
  inline def apply(Arn: NotificationRuleArn, Target: Target): SubscribeRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeRequest]
  }
  
  extension [Self <: SubscribeRequest](x: Self) {
    
    inline def setArn(value: NotificationRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setTarget(value: Target): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
