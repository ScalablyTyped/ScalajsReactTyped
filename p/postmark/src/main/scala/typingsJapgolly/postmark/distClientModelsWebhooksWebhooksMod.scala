package typingsJapgolly.postmark

import typingsJapgolly.postmark.distClientModelsWebhooksWebhookMod.Webhook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientModelsWebhooksWebhooksMod {
  
  trait Webhooks extends StObject {
    
    var Webhooks: js.Array[Webhook]
  }
  object Webhooks {
    
    inline def apply(Webhooks: js.Array[Webhook]): Webhooks = {
      val __obj = js.Dynamic.literal(Webhooks = Webhooks.asInstanceOf[js.Any])
      __obj.asInstanceOf[Webhooks]
    }
    
    extension [Self <: Webhooks](x: Self) {
      
      inline def setWebhooks(value: js.Array[Webhook]): Self = StObject.set(x, "Webhooks", value.asInstanceOf[js.Any])
      
      inline def setWebhooksVarargs(value: Webhook*): Self = StObject.set(x, "Webhooks", js.Array(value*))
    }
  }
}
