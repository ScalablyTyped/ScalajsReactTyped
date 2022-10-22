package typingsJapgolly.fullcalendarCommon.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnKeyDown extends StObject {
  
  def onKeyDown(ev: KeyboardEvent): scala.Unit
  
  var tabIndex: Double
}
object OnKeyDown {
  
  inline def apply(onKeyDown: KeyboardEvent => Callback, tabIndex: Double): OnKeyDown = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1((t0: KeyboardEvent) => onKeyDown(t0).runNow()), tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnKeyDown]
  }
  
  extension [Self <: OnKeyDown](x: Self) {
    
    inline def setOnKeyDown(value: KeyboardEvent => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: KeyboardEvent) => value(t0).runNow()))
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
  }
}
