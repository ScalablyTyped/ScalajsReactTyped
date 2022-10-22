package typingsJapgolly.orbitUiReactComponents.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnMouseEnter extends StObject {
  
  def onBlur(event: ReactFocusEventFrom[Element]): Unit
  
  var onClick: Unit
  
  def onFocus(event: ReactFocusEventFrom[Element]): Unit
  
  var onKeyDown: Unit
  
  var onKeyUp: Unit
  
  def onMouseEnter(event: ReactMouseEventFrom[Element]): Unit
}
object OnMouseEnter {
  
  inline def apply(
    onBlur: ReactFocusEventFrom[Element] => Callback,
    onClick: Unit,
    onFocus: ReactFocusEventFrom[Element] => Callback,
    onKeyDown: Unit,
    onKeyUp: Unit,
    onMouseEnter: ReactMouseEventFrom[Element] => Callback
  ): OnMouseEnter = {
    val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction1((t0: ReactFocusEventFrom[Element]) => onBlur(t0).runNow()), onClick = onClick.asInstanceOf[js.Any], onFocus = js.Any.fromFunction1((t0: ReactFocusEventFrom[Element]) => onFocus(t0).runNow()), onKeyDown = onKeyDown.asInstanceOf[js.Any], onKeyUp = onKeyUp.asInstanceOf[js.Any], onMouseEnter = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element]) => onMouseEnter(t0).runNow()))
    __obj.asInstanceOf[OnMouseEnter]
  }
  
  extension [Self <: OnMouseEnter](x: Self) {
    
    inline def setOnBlur(value: ReactFocusEventFrom[Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element]) => value(t0).runNow()))
    
    inline def setOnClick(value: Unit): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnFocus(value: ReactFocusEventFrom[Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element]) => value(t0).runNow()))
    
    inline def setOnKeyDown(value: Unit): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
    
    inline def setOnKeyUp(value: Unit): Self = StObject.set(x, "onKeyUp", value.asInstanceOf[js.Any])
    
    inline def setOnMouseEnter(value: ReactMouseEventFrom[Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element]) => value(t0).runNow()))
  }
}
