package typingsJapgolly.reactNativeElements.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelButtonProps extends StObject {
  
  var cancelButtonTitle: String
  
  var clearIcon: Name
  
  def onBlur(): Any
  
  def onCancel(): Any
  
  def onChangeText(): Any
  
  def onClear(): Any
  
  def onFocus(): Any
  
  var searchIcon: Name
  
  var showCancel: Boolean
  
  var showLoading: Boolean
  
  var value: String
}
object CancelButtonProps {
  
  inline def apply(
    cancelButtonTitle: String,
    clearIcon: Name,
    onBlur: CallbackTo[Any],
    onCancel: CallbackTo[Any],
    onChangeText: CallbackTo[Any],
    onClear: CallbackTo[Any],
    onFocus: CallbackTo[Any],
    searchIcon: Name,
    showCancel: Boolean,
    showLoading: Boolean,
    value: String
  ): CancelButtonProps = {
    val __obj = js.Dynamic.literal(cancelButtonTitle = cancelButtonTitle.asInstanceOf[js.Any], clearIcon = clearIcon.asInstanceOf[js.Any], onBlur = onBlur.toJsFn, onCancel = onCancel.toJsFn, onChangeText = onChangeText.toJsFn, onClear = onClear.toJsFn, onFocus = onFocus.toJsFn, searchIcon = searchIcon.asInstanceOf[js.Any], showCancel = showCancel.asInstanceOf[js.Any], showLoading = showLoading.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelButtonProps]
  }
  
  extension [Self <: CancelButtonProps](x: Self) {
    
    inline def setCancelButtonTitle(value: String): Self = StObject.set(x, "cancelButtonTitle", value.asInstanceOf[js.Any])
    
    inline def setClearIcon(value: Name): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: CallbackTo[Any]): Self = StObject.set(x, "onBlur", value.toJsFn)
    
    inline def setOnCancel(value: CallbackTo[Any]): Self = StObject.set(x, "onCancel", value.toJsFn)
    
    inline def setOnChangeText(value: CallbackTo[Any]): Self = StObject.set(x, "onChangeText", value.toJsFn)
    
    inline def setOnClear(value: CallbackTo[Any]): Self = StObject.set(x, "onClear", value.toJsFn)
    
    inline def setOnFocus(value: CallbackTo[Any]): Self = StObject.set(x, "onFocus", value.toJsFn)
    
    inline def setSearchIcon(value: Name): Self = StObject.set(x, "searchIcon", value.asInstanceOf[js.Any])
    
    inline def setShowCancel(value: Boolean): Self = StObject.set(x, "showCancel", value.asInstanceOf[js.Any])
    
    inline def setShowLoading(value: Boolean): Self = StObject.set(x, "showLoading", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
