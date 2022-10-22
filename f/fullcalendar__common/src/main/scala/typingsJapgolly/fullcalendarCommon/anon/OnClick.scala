package typingsJapgolly.fullcalendarCommon.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClick extends StObject {
  
  def onClick(ev: UIEvent): scala.Unit
  
  def onKeyDown(ev: KeyboardEvent): scala.Unit
  
  var tabIndex: Double
}
object OnClick {
  
  inline def apply(onClick: UIEvent => Callback, onKeyDown: KeyboardEvent => Callback, tabIndex: Double): OnClick = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1((t0: UIEvent) => onClick(t0).runNow()), onKeyDown = js.Any.fromFunction1((t0: KeyboardEvent) => onKeyDown(t0).runNow()), tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClick]
  }
  
  extension [Self <: OnClick](x: Self) {
    
    inline def setOnClick(value: UIEvent => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: UIEvent) => value(t0).runNow()))
    
    inline def setOnKeyDown(value: KeyboardEvent => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: KeyboardEvent) => value(t0).runNow()))
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
  }
}
