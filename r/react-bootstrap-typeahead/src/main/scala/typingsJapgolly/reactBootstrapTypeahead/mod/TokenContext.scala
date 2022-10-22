package typingsJapgolly.reactBootstrapTypeahead.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenContext extends StObject {
  
  var active: Boolean
  
  def onBlur(e: Any): Unit
  
  def onClick(e: Any): Unit
  
  def onFocus(e: Any): Unit
  
  def onKeyDown(e: Any): Unit
}
object TokenContext {
  
  inline def apply(
    active: Boolean,
    onBlur: Any => Callback,
    onClick: Any => Callback,
    onFocus: Any => Callback,
    onKeyDown: Any => Callback
  ): TokenContext = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1((t0: Any) => onBlur(t0).runNow()), onClick = js.Any.fromFunction1((t0: Any) => onClick(t0).runNow()), onFocus = js.Any.fromFunction1((t0: Any) => onFocus(t0).runNow()), onKeyDown = js.Any.fromFunction1((t0: Any) => onKeyDown(t0).runNow()))
    __obj.asInstanceOf[TokenContext]
  }
  
  extension [Self <: TokenContext](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: Any => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setOnClick(value: Any => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setOnFocus(value: Any => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setOnKeyDown(value: Any => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
