package typingsJapgolly.storybookApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.storybookApi.anon.Color
import typingsJapgolly.storybookApi.anon.Headline
import typingsJapgolly.storybookApi.mod.ModuleFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ModulesNotificationsMod {
  
  @JSImport("@storybook/api/dist/ts3.9/modules/notifications", "init")
  @js.native
  val init: ModuleFn = js.native
  
  trait Notification extends StObject {
    
    var content: Headline
    
    var icon: js.UndefOr[Color] = js.undefined
    
    var id: String
    
    var link: String
    
    var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Notification {
    
    inline def apply(content: Headline, id: String, link: String): Notification = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
      __obj.asInstanceOf[Notification]
    }
    
    extension [Self <: Notification](x: Self) {
      
      inline def setContent(value: Headline): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: Color): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setOnClear(value: Callback): Self = StObject.set(x, "onClear", value.toJsFn)
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
    }
  }
  
  trait SubAPI extends StObject {
    
    def addNotification(notification: Notification): Unit
    
    def clearNotification(id: String): Unit
  }
  object SubAPI {
    
    inline def apply(addNotification: Notification => Callback, clearNotification: String => Callback): SubAPI = {
      val __obj = js.Dynamic.literal(addNotification = js.Any.fromFunction1((t0: Notification) => addNotification(t0).runNow()), clearNotification = js.Any.fromFunction1((t0: String) => clearNotification(t0).runNow()))
      __obj.asInstanceOf[SubAPI]
    }
    
    extension [Self <: SubAPI](x: Self) {
      
      inline def setAddNotification(value: Notification => Callback): Self = StObject.set(x, "addNotification", js.Any.fromFunction1((t0: Notification) => value(t0).runNow()))
      
      inline def setClearNotification(value: String => Callback): Self = StObject.set(x, "clearNotification", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  trait SubState extends StObject {
    
    var notifications: js.Array[Notification]
  }
  object SubState {
    
    inline def apply(notifications: js.Array[Notification]): SubState = {
      val __obj = js.Dynamic.literal(notifications = notifications.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubState]
    }
    
    extension [Self <: SubState](x: Self) {
      
      inline def setNotifications(value: js.Array[Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "notifications", js.Array(value*))
    }
  }
}
