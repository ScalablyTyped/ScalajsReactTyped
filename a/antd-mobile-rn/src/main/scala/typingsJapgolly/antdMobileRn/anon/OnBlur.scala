package typingsJapgolly.antdMobileRn.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.RegisteredStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBlur extends StObject {
  
  var disabled: Boolean
  
  def onBlur(): Unit
  
  def onChange(): Unit
  
  def onClear(): Unit
  
  def onFocus(): Unit
  
  def onSubmit(): Unit
  
  var placeholder: String
  
  var prefixCls: String
  
  var showCancelButton: Boolean
  
  var styles: StringDictionary[RegisteredStyle[Any]]
}
object OnBlur {
  
  inline def apply(
    disabled: Boolean,
    onBlur: Callback,
    onChange: Callback,
    onClear: Callback,
    onFocus: Callback,
    onSubmit: Callback,
    placeholder: String,
    prefixCls: String,
    showCancelButton: Boolean,
    styles: StringDictionary[RegisteredStyle[Any]]
  ): OnBlur = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onBlur = onBlur.toJsFn, onChange = onChange.toJsFn, onClear = onClear.toJsFn, onFocus = onFocus.toJsFn, onSubmit = onSubmit.toJsFn, placeholder = placeholder.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], showCancelButton = showCancelButton.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBlur]
  }
  
  extension [Self <: OnBlur](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: Callback): Self = StObject.set(x, "onBlur", value.toJsFn)
    
    inline def setOnChange(value: Callback): Self = StObject.set(x, "onChange", value.toJsFn)
    
    inline def setOnClear(value: Callback): Self = StObject.set(x, "onClear", value.toJsFn)
    
    inline def setOnFocus(value: Callback): Self = StObject.set(x, "onFocus", value.toJsFn)
    
    inline def setOnSubmit(value: Callback): Self = StObject.set(x, "onSubmit", value.toJsFn)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setShowCancelButton(value: Boolean): Self = StObject.set(x, "showCancelButton", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: StringDictionary[RegisteredStyle[Any]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
