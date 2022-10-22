package typingsJapgolly.gestalt.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DangerouslyDisableOnNavigationEvent extends StObject {
  
  def dangerouslyDisableOnNavigation(): Unit
  
  var event: (ReactMouseEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element]) | (ReactKeyboardEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element])
}
object DangerouslyDisableOnNavigationEvent {
  
  inline def apply(
    dangerouslyDisableOnNavigation: Callback,
    event: (ReactMouseEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element]) | (ReactKeyboardEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element])
  ): DangerouslyDisableOnNavigationEvent = {
    val __obj = js.Dynamic.literal(dangerouslyDisableOnNavigation = dangerouslyDisableOnNavigation.toJsFn, event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[DangerouslyDisableOnNavigationEvent]
  }
  
  extension [Self <: DangerouslyDisableOnNavigationEvent](x: Self) {
    
    inline def setDangerouslyDisableOnNavigation(value: Callback): Self = StObject.set(x, "dangerouslyDisableOnNavigation", value.toJsFn)
    
    inline def setEvent(
      value: (ReactMouseEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element]) | (ReactKeyboardEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element])
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
