package typingsJapgolly.reactDayPicker.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.ChangeEventHandler
import typingsJapgolly.react.mod.FocusEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The props to attach to the input field when using {@link useInput}. */
/* Inlined std.Pick<react.react.InputHTMLAttributes<std.HTMLInputElement>, 'onBlur' | 'onChange' | 'onFocus' | 'value' | 'placeholder'> */
trait InputHTMLAttributes extends StObject {
  
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  
  var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
  
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
}
object InputHTMLAttributes {
  
  inline def apply(): InputHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputHTMLAttributes]
  }
  
  extension [Self <: InputHTMLAttributes](x: Self) {
    
    inline def setOnBlur(value: ReactFocusEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnFocus(value: ReactFocusEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
