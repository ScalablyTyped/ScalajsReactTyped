package typingsJapgolly.fundamentalReact.anon

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  var callback: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLButtonElement], Unit]] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var noNotificationsBody: js.UndefOr[Node] = js.undefined
  
  var notificationCount: Double
  
  var notificationsBody: js.UndefOr[Node] = js.undefined
}
object Label {
  
  inline def apply(notificationCount: Double): Label = {
    val __obj = js.Dynamic.literal(notificationCount = notificationCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  
  extension [Self <: Label](x: Self) {
    
    inline def setCallback(value: /* event */ ReactMouseEventFrom[HTMLButtonElement] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => value(t0).runNow()))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setNoNotificationsBody(value: VdomNode): Self = StObject.set(x, "noNotificationsBody", value.rawNode.asInstanceOf[js.Any])
    
    inline def setNoNotificationsBodyNull: Self = StObject.set(x, "noNotificationsBody", null)
    
    inline def setNoNotificationsBodyUndefined: Self = StObject.set(x, "noNotificationsBody", js.undefined)
    
    inline def setNoNotificationsBodyVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "noNotificationsBody", js.Array(value*))
    
    inline def setNoNotificationsBodyVdomElement(value: VdomElement): Self = StObject.set(x, "noNotificationsBody", value.rawElement.asInstanceOf[js.Any])
    
    inline def setNotificationCount(value: Double): Self = StObject.set(x, "notificationCount", value.asInstanceOf[js.Any])
    
    inline def setNotificationsBody(value: VdomNode): Self = StObject.set(x, "notificationsBody", value.rawNode.asInstanceOf[js.Any])
    
    inline def setNotificationsBodyNull: Self = StObject.set(x, "notificationsBody", null)
    
    inline def setNotificationsBodyUndefined: Self = StObject.set(x, "notificationsBody", js.undefined)
    
    inline def setNotificationsBodyVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "notificationsBody", js.Array(value*))
    
    inline def setNotificationsBodyVdomElement(value: VdomElement): Self = StObject.set(x, "notificationsBody", value.rawElement.asInstanceOf[js.Any])
  }
}
