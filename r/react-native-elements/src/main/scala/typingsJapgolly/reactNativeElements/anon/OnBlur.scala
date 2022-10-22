package typingsJapgolly.reactNativeElements.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBlur extends StObject {
  
  def onBlur(): Any
  
  def onCancel(): Any
  
  def onChangeText(): Any
  
  def onClear(): Any
  
  def onFocus(): Any
}
object OnBlur {
  
  inline def apply(
    onBlur: CallbackTo[Any],
    onCancel: CallbackTo[Any],
    onChangeText: CallbackTo[Any],
    onClear: CallbackTo[Any],
    onFocus: CallbackTo[Any]
  ): OnBlur = {
    val __obj = js.Dynamic.literal(onBlur = onBlur.toJsFn, onCancel = onCancel.toJsFn, onChangeText = onChangeText.toJsFn, onClear = onClear.toJsFn, onFocus = onFocus.toJsFn)
    __obj.asInstanceOf[OnBlur]
  }
  
  extension [Self <: OnBlur](x: Self) {
    
    inline def setOnBlur(value: CallbackTo[Any]): Self = StObject.set(x, "onBlur", value.toJsFn)
    
    inline def setOnCancel(value: CallbackTo[Any]): Self = StObject.set(x, "onCancel", value.toJsFn)
    
    inline def setOnChangeText(value: CallbackTo[Any]): Self = StObject.set(x, "onChangeText", value.toJsFn)
    
    inline def setOnClear(value: CallbackTo[Any]): Self = StObject.set(x, "onClear", value.toJsFn)
    
    inline def setOnFocus(value: CallbackTo[Any]): Self = StObject.set(x, "onFocus", value.toJsFn)
  }
}
