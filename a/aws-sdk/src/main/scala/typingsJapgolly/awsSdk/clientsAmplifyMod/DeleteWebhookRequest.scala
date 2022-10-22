package typingsJapgolly.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWebhookRequest extends StObject {
  
  /**
    *  The unique ID for a webhook. 
    */
  var webhookId: WebhookId
}
object DeleteWebhookRequest {
  
  inline def apply(webhookId: WebhookId): DeleteWebhookRequest = {
    val __obj = js.Dynamic.literal(webhookId = webhookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWebhookRequest]
  }
  
  extension [Self <: DeleteWebhookRequest](x: Self) {
    
    inline def setWebhookId(value: WebhookId): Self = StObject.set(x, "webhookId", value.asInstanceOf[js.Any])
  }
}
