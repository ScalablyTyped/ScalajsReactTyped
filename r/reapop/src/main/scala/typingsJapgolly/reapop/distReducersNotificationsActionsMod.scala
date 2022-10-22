package typingsJapgolly.reapop

import typingsJapgolly.reapop.anon.PartialNotification
import typingsJapgolly.reapop.distReducersNotificationsConstantsMod.NotificationAction.DismissNotification
import typingsJapgolly.reapop.distReducersNotificationsConstantsMod.NotificationAction.DismissNotifications
import typingsJapgolly.reapop.distReducersNotificationsConstantsMod.NotificationAction.UpsertNotification
import typingsJapgolly.reapop.distReducersNotificationsTypesMod.Notification
import typingsJapgolly.reapop.distReducersNotificationsTypesMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReducersNotificationsActionsMod {
  
  @JSImport("reapop/dist/reducers/notifications/actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dismissNotification(notificationId: String): DismissNotificationAction = ^.asInstanceOf[js.Dynamic].applyDynamic("dismissNotification")(notificationId.asInstanceOf[js.Any]).asInstanceOf[DismissNotificationAction]
  
  inline def dismissNotifications(): DismissNotificationsAction = ^.asInstanceOf[js.Dynamic].applyDynamic("dismissNotifications")().asInstanceOf[DismissNotificationsAction]
  
  inline def notify_(message: String): UpsertNotificationAction = ^.asInstanceOf[js.Dynamic].applyDynamic("notify")(message.asInstanceOf[js.Any]).asInstanceOf[UpsertNotificationAction]
  inline def notify_(message: String, options: PartialNotification): UpsertNotificationAction = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UpsertNotificationAction]
  inline def notify_(message: String, status: Status): UpsertNotificationAction = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(message.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[UpsertNotificationAction]
  inline def notify_(message: String, status: Status, options: PartialNotification): UpsertNotificationAction = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(message.asInstanceOf[js.Any], status.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UpsertNotificationAction]
  inline def notify_(notification: PartialNotification): UpsertNotificationAction = ^.asInstanceOf[js.Dynamic].applyDynamic("notify")(notification.asInstanceOf[js.Any]).asInstanceOf[UpsertNotificationAction]
  
  trait DismissNotificationAction
    extends StObject
       with NotificationActions {
    
    var payload: String
    
    var `type`: DismissNotification
  }
  object DismissNotificationAction {
    
    inline def apply(payload: String, `type`: DismissNotification): DismissNotificationAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DismissNotificationAction]
    }
    
    extension [Self <: DismissNotificationAction](x: Self) {
      
      inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: DismissNotification): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DismissNotificationsAction
    extends StObject
       with NotificationActions {
    
    var `type`: DismissNotifications
  }
  object DismissNotificationsAction {
    
    inline def apply(`type`: DismissNotifications): DismissNotificationsAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DismissNotificationsAction]
    }
    
    extension [Self <: DismissNotificationsAction](x: Self) {
      
      inline def setType(value: DismissNotifications): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reapop.distReducersNotificationsActionsMod.UpsertNotificationAction
    - typingsJapgolly.reapop.distReducersNotificationsActionsMod.DismissNotificationAction
    - typingsJapgolly.reapop.distReducersNotificationsActionsMod.DismissNotificationsAction
  */
  trait NotificationActions extends StObject
  object NotificationActions {
    
    inline def DismissNotificationAction(payload: String, `type`: DismissNotification): typingsJapgolly.reapop.distReducersNotificationsActionsMod.DismissNotificationAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reapop.distReducersNotificationsActionsMod.DismissNotificationAction]
    }
    
    inline def DismissNotificationsAction(`type`: DismissNotifications): typingsJapgolly.reapop.distReducersNotificationsActionsMod.DismissNotificationsAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reapop.distReducersNotificationsActionsMod.DismissNotificationsAction]
    }
    
    inline def UpsertNotificationAction(payload: Notification, `type`: UpsertNotification): typingsJapgolly.reapop.distReducersNotificationsActionsMod.UpsertNotificationAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reapop.distReducersNotificationsActionsMod.UpsertNotificationAction]
    }
  }
  
  trait UpsertNotificationAction
    extends StObject
       with NotificationActions {
    
    var payload: Notification
    
    var `type`: UpsertNotification
  }
  object UpsertNotificationAction {
    
    inline def apply(payload: Notification, `type`: UpsertNotification): UpsertNotificationAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpsertNotificationAction]
    }
    
    extension [Self <: UpsertNotificationAction](x: Self) {
      
      inline def setPayload(value: Notification): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: UpsertNotification): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
