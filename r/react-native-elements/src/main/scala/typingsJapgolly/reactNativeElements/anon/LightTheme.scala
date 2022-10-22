package typingsJapgolly.reactNativeElements.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LightTheme extends StObject {
  
  var lightTheme: Boolean
  
  def onBlur(): Any
  
  def onChangeText(): Any
  
  def onClear(): Any
  
  def onFocus(): Any
  
  var round: Boolean
  
  var showLoading: Boolean
  
  var value: String
}
object LightTheme {
  
  inline def apply(
    lightTheme: Boolean,
    onBlur: CallbackTo[Any],
    onChangeText: CallbackTo[Any],
    onClear: CallbackTo[Any],
    onFocus: CallbackTo[Any],
    round: Boolean,
    showLoading: Boolean,
    value: String
  ): LightTheme = {
    val __obj = js.Dynamic.literal(lightTheme = lightTheme.asInstanceOf[js.Any], onBlur = onBlur.toJsFn, onChangeText = onChangeText.toJsFn, onClear = onClear.toJsFn, onFocus = onFocus.toJsFn, round = round.asInstanceOf[js.Any], showLoading = showLoading.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightTheme]
  }
  
  extension [Self <: LightTheme](x: Self) {
    
    inline def setLightTheme(value: Boolean): Self = StObject.set(x, "lightTheme", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: CallbackTo[Any]): Self = StObject.set(x, "onBlur", value.toJsFn)
    
    inline def setOnChangeText(value: CallbackTo[Any]): Self = StObject.set(x, "onChangeText", value.toJsFn)
    
    inline def setOnClear(value: CallbackTo[Any]): Self = StObject.set(x, "onClear", value.toJsFn)
    
    inline def setOnFocus(value: CallbackTo[Any]): Self = StObject.set(x, "onFocus", value.toJsFn)
    
    inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    inline def setShowLoading(value: Boolean): Self = StObject.set(x, "showLoading", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
