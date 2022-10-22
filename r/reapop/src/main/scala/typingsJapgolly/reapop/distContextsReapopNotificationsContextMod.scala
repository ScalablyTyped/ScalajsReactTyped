package typingsJapgolly.reapop

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Context
import typingsJapgolly.reapop.anon.FnCall
import typingsJapgolly.reapop.distReducersNotificationsTypesMod.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distContextsReapopNotificationsContextMod {
  
  @JSImport("reapop/dist/contexts/reapopNotificationsContext", "ReapopNotificationsContext")
  @js.native
  val ReapopNotificationsContext: Context[NotificationsContext] = js.native
  
  trait NotificationsContext extends StObject {
    
    def dismissNotification(id: String): Unit
    
    def dismissNotifications(): Unit
    
    var notifications: js.Array[Notification]
    
    @JSName("notify")
    var notify_FNotificationsContext: FnCall
  }
  object NotificationsContext {
    
    inline def apply(
      dismissNotification: String => Callback,
      dismissNotifications: Callback,
      notifications: js.Array[Notification],
      notify_ : FnCall
    ): NotificationsContext = {
      val __obj = js.Dynamic.literal(dismissNotification = js.Any.fromFunction1((t0: String) => dismissNotification(t0).runNow()), dismissNotifications = dismissNotifications.toJsFn, notifications = notifications.asInstanceOf[js.Any])
      __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationsContext]
    }
    
    extension [Self <: NotificationsContext](x: Self) {
      
      inline def setDismissNotification(value: String => Callback): Self = StObject.set(x, "dismissNotification", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setDismissNotifications(value: Callback): Self = StObject.set(x, "dismissNotifications", value.toJsFn)
      
      inline def setNotifications(value: js.Array[Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "notifications", js.Array(value*))
      
      inline def setNotify_(value: FnCall): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
    }
  }
}
