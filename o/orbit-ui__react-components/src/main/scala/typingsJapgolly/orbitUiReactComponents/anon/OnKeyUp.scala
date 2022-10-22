package typingsJapgolly.orbitUiReactComponents.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnKeyUp extends StObject {
  
  var onBlur: Unit
  
  def onClick(event: ReactEventFrom[Element]): Unit
  
  var onFocus: Unit
  
  def onKeyDown(event: ReactKeyboardEventFrom[Element]): Unit
  
  def onKeyUp(event: ReactKeyboardEventFrom[Element]): Unit
  
  var onMouseEnter: Unit
}
object OnKeyUp {
  
  inline def apply(
    onBlur: Unit,
    onClick: ReactEventFrom[Element] => Callback,
    onFocus: Unit,
    onKeyDown: ReactKeyboardEventFrom[Element] => Callback,
    onKeyUp: ReactKeyboardEventFrom[Element] => Callback,
    onMouseEnter: Unit
  ): OnKeyUp = {
    val __obj = js.Dynamic.literal(onBlur = onBlur.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: ReactEventFrom[Element]) => onClick(t0).runNow()), onFocus = onFocus.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element]) => onKeyDown(t0).runNow()), onKeyUp = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element]) => onKeyUp(t0).runNow()), onMouseEnter = onMouseEnter.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnKeyUp]
  }
  
  extension [Self <: OnKeyUp](x: Self) {
    
    inline def setOnBlur(value: Unit): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: ReactEventFrom[Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactEventFrom[Element]) => value(t0).runNow()))
    
    inline def setOnFocus(value: Unit): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    inline def setOnKeyDown(value: ReactKeyboardEventFrom[Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element]) => value(t0).runNow()))
    
    inline def setOnKeyUp(value: ReactKeyboardEventFrom[Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element]) => value(t0).runNow()))
    
    inline def setOnMouseEnter(value: Unit): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
  }
}
