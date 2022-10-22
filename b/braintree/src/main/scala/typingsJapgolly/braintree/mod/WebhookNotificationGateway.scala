package typingsJapgolly.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebhookNotificationGateway extends StObject {
  
  def parse(signature: String, payload: String): js.Promise[WebhookNotification]
}
object WebhookNotificationGateway {
  
  inline def apply(parse: (String, String) => js.Promise[WebhookNotification]): WebhookNotificationGateway = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction2(parse))
    __obj.asInstanceOf[WebhookNotificationGateway]
  }
  
  extension [Self <: WebhookNotificationGateway](x: Self) {
    
    inline def setParse(value: (String, String) => js.Promise[WebhookNotification]): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
  }
}
