package typingsJapgolly.gestalt.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  def dangerouslyDisableOnNavigation(): Unit
  
  var event: ReactMouseEventFrom[HTMLAnchorElement] | ReactKeyboardEventFrom[HTMLAnchorElement]
}
object `1` {
  
  inline def apply(
    dangerouslyDisableOnNavigation: Callback,
    event: ReactMouseEventFrom[HTMLAnchorElement] | ReactKeyboardEventFrom[HTMLAnchorElement]
  ): `1` = {
    val __obj = js.Dynamic.literal(dangerouslyDisableOnNavigation = dangerouslyDisableOnNavigation.toJsFn, event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setDangerouslyDisableOnNavigation(value: Callback): Self = StObject.set(x, "dangerouslyDisableOnNavigation", value.toJsFn)
    
    inline def setEvent(value: ReactMouseEventFrom[HTMLAnchorElement] | ReactKeyboardEventFrom[HTMLAnchorElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
