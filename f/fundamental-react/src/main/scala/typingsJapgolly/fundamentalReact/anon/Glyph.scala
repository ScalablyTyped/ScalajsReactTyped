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

trait Glyph extends StObject {
  
  var callback: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLButtonElement], Unit]] = js.undefined
  
  var glyph: String
  
  var label: js.UndefOr[String] = js.undefined
  
  var menu: js.UndefOr[Node] = js.undefined
  
  var notificationCount: Double
}
object Glyph {
  
  inline def apply(glyph: String, notificationCount: Double): Glyph = {
    val __obj = js.Dynamic.literal(glyph = glyph.asInstanceOf[js.Any], notificationCount = notificationCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Glyph]
  }
  
  extension [Self <: Glyph](x: Self) {
    
    inline def setCallback(value: /* event */ ReactMouseEventFrom[HTMLButtonElement] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => value(t0).runNow()))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setGlyph(value: String): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMenu(value: VdomNode): Self = StObject.set(x, "menu", value.rawNode.asInstanceOf[js.Any])
    
    inline def setMenuNull: Self = StObject.set(x, "menu", null)
    
    inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    inline def setMenuVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "menu", js.Array(value*))
    
    inline def setMenuVdomElement(value: VdomElement): Self = StObject.set(x, "menu", value.rawElement.asInstanceOf[js.Any])
    
    inline def setNotificationCount(value: Double): Self = StObject.set(x, "notificationCount", value.asInstanceOf[js.Any])
  }
}
