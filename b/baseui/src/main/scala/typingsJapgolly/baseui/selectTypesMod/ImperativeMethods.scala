package typingsJapgolly.baseui.selectTypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImperativeMethods extends StObject {
  
  def blur(): Unit
  
  def focus(): Unit
  
  def setDropdownOpen(a: Boolean): Any
  
  def setInputBlur(): Unit
  
  def setInputFocus(): Unit
  
  def setInputValue(a: String): Unit
}
object ImperativeMethods {
  
  inline def apply(
    blur: Callback,
    focus: Callback,
    setDropdownOpen: Boolean => Any,
    setInputBlur: Callback,
    setInputFocus: Callback,
    setInputValue: String => Callback
  ): ImperativeMethods = {
    val __obj = js.Dynamic.literal(blur = blur.toJsFn, focus = focus.toJsFn, setDropdownOpen = js.Any.fromFunction1(setDropdownOpen), setInputBlur = setInputBlur.toJsFn, setInputFocus = setInputFocus.toJsFn, setInputValue = js.Any.fromFunction1((t0: String) => setInputValue(t0).runNow()))
    __obj.asInstanceOf[ImperativeMethods]
  }
  
  extension [Self <: ImperativeMethods](x: Self) {
    
    inline def setBlur(value: Callback): Self = StObject.set(x, "blur", value.toJsFn)
    
    inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
    
    inline def setSetDropdownOpen(value: Boolean => Any): Self = StObject.set(x, "setDropdownOpen", js.Any.fromFunction1(value))
    
    inline def setSetInputBlur(value: Callback): Self = StObject.set(x, "setInputBlur", value.toJsFn)
    
    inline def setSetInputFocus(value: Callback): Self = StObject.set(x, "setInputFocus", value.toJsFn)
    
    inline def setSetInputValue(value: String => Callback): Self = StObject.set(x, "setInputValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
