package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disabled extends StObject {
  
  var disabled: Boolean
  
  def onBlur(): Any
  
  def onChange(): Any
  
  def onFocus(): Any
  
  var required: Boolean
}
object Disabled {
  
  inline def apply(
    disabled: Boolean,
    onBlur: CallbackTo[Any],
    onChange: CallbackTo[Any],
    onFocus: CallbackTo[Any],
    required: Boolean
  ): Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onBlur = onBlur.toJsFn, onChange = onChange.toJsFn, onFocus = onFocus.toJsFn, required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
  
  extension [Self <: Disabled](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: CallbackTo[Any]): Self = StObject.set(x, "onBlur", value.toJsFn)
    
    inline def setOnChange(value: CallbackTo[Any]): Self = StObject.set(x, "onChange", value.toJsFn)
    
    inline def setOnFocus(value: CallbackTo[Any]): Self = StObject.set(x, "onFocus", value.toJsFn)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
