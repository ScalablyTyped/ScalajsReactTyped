package typingsJapgolly.sipJs

import japgolly.scalajs.react.Callback
import typingsJapgolly.sipJs.libApiNotificationMod.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiSubscriptionDelegateMod {
  
  trait SubscriptionDelegate extends StObject {
    
    /**
      * Called upon receiving an incoming NOTIFY request.
      * @param notification - A notification. See {@link Notification} for details.
      */
    def onNotify(notification: Notification): Unit
  }
  object SubscriptionDelegate {
    
    inline def apply(onNotify: Notification => Callback): SubscriptionDelegate = {
      val __obj = js.Dynamic.literal(onNotify = js.Any.fromFunction1((t0: Notification) => onNotify(t0).runNow()))
      __obj.asInstanceOf[SubscriptionDelegate]
    }
    
    extension [Self <: SubscriptionDelegate](x: Self) {
      
      inline def setOnNotify(value: Notification => Callback): Self = StObject.set(x, "onNotify", js.Any.fromFunction1((t0: Notification) => value(t0).runNow()))
    }
  }
}
