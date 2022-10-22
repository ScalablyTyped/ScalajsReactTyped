package typingsJapgolly.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseWebhookNotification extends StObject {
  
  var kind: WebhookNotificationKind
  
  var timestamp: js.Date
}
object BaseWebhookNotification {
  
  inline def apply(kind: WebhookNotificationKind, timestamp: js.Date): BaseWebhookNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseWebhookNotification]
  }
  
  extension [Self <: BaseWebhookNotification](x: Self) {
    
    inline def setKind(value: WebhookNotificationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
