package typingsJapgolly.sharepoint.SP.UI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SPNotifications.EventID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Notify {
  
  trait Notification extends StObject {
    
    def Hide(bNoAnimate: Boolean): Unit
    
    def Show(bNoAnimate: Boolean): Unit
    
    def get_id(): String
  }
  object Notification {
    
    inline def apply(Hide: Boolean => Callback, Show: Boolean => Callback, get_id: CallbackTo[String]): Notification = {
      val __obj = js.Dynamic.literal(Hide = js.Any.fromFunction1((t0: Boolean) => Hide(t0).runNow()), Show = js.Any.fromFunction1((t0: Boolean) => Show(t0).runNow()), get_id = get_id.toJsFn)
      __obj.asInstanceOf[Notification]
    }
    
    extension [Self <: Notification](x: Self) {
      
      inline def setGet_id(value: CallbackTo[String]): Self = StObject.set(x, "get_id", value.toJsFn)
      
      inline def setHide(value: Boolean => Callback): Self = StObject.set(x, "Hide", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setShow(value: Boolean => Callback): Self = StObject.set(x, "Show", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    }
  }
  
  trait NotificationContainer extends StObject {
    
    def Clear(): Unit
    
    def GetCount(): Double
    
    def SetEventHandler(eventId: EventID, eventHandler: Any): Unit
  }
  object NotificationContainer {
    
    inline def apply(Clear: Callback, GetCount: CallbackTo[Double], SetEventHandler: (EventID, Any) => Callback): NotificationContainer = {
      val __obj = js.Dynamic.literal(Clear = Clear.toJsFn, GetCount = GetCount.toJsFn, SetEventHandler = js.Any.fromFunction2((t0: EventID, t1: Any) => (SetEventHandler(t0, t1)).runNow()))
      __obj.asInstanceOf[NotificationContainer]
    }
    
    extension [Self <: NotificationContainer](x: Self) {
      
      inline def setClear(value: Callback): Self = StObject.set(x, "Clear", value.toJsFn)
      
      inline def setGetCount(value: CallbackTo[Double]): Self = StObject.set(x, "GetCount", value.toJsFn)
      
      inline def setSetEventHandler(value: (EventID, Any) => Callback): Self = StObject.set(x, "SetEventHandler", js.Any.fromFunction2((t0: EventID, t1: Any) => (value(t0, t1)).runNow()))
    }
  }
}
