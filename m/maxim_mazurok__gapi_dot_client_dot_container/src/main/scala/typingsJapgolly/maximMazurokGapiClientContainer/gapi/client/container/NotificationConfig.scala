package typingsJapgolly.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationConfig extends StObject {
  
  /** Notification config for Pub/Sub. */
  var pubsub: js.UndefOr[PubSub] = js.undefined
}
object NotificationConfig {
  
  inline def apply(): NotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfig]
  }
  
  extension [Self <: NotificationConfig](x: Self) {
    
    inline def setPubsub(value: PubSub): Self = StObject.set(x, "pubsub", value.asInstanceOf[js.Any])
    
    inline def setPubsubUndefined: Self = StObject.set(x, "pubsub", js.undefined)
  }
}
