package typingsJapgolly.orbitUiReactComponents.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBlurOnFocus extends StObject {
  
  def onBlur(event: ReactFocusEventFrom[Element]): Unit
  
  def onFocus(event: ReactFocusEventFrom[Element]): Unit
}
object OnBlurOnFocus {
  
  inline def apply(
    onBlur: ReactFocusEventFrom[Element] => Callback,
    onFocus: ReactFocusEventFrom[Element] => Callback
  ): OnBlurOnFocus = {
    val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction1((t0: ReactFocusEventFrom[Element]) => onBlur(t0).runNow()), onFocus = js.Any.fromFunction1((t0: ReactFocusEventFrom[Element]) => onFocus(t0).runNow()))
    __obj.asInstanceOf[OnBlurOnFocus]
  }
  
  extension [Self <: OnBlurOnFocus](x: Self) {
    
    inline def setOnBlur(value: ReactFocusEventFrom[Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element]) => value(t0).runNow()))
    
    inline def setOnFocus(value: ReactFocusEventFrom[Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element]) => value(t0).runNow()))
  }
}
