package typingsJapgolly.antdMobileRn.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.RegisteredStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoHeight extends StObject {
  
  var autoHeight: Boolean
  
  var clear: Boolean
  
  var count: Double
  
  var editable: Boolean
  
  var error: Boolean
  
  var keyboardType: String
  
  var last: Boolean
  
  def onBlur(): Unit
  
  def onChange(): Unit
  
  def onErrorClick(): Unit
  
  def onFocus(): Unit
  
  var rows: Double
  
  var styles: StringDictionary[RegisteredStyle[Any]]
}
object AutoHeight {
  
  inline def apply(
    autoHeight: Boolean,
    clear: Boolean,
    count: Double,
    editable: Boolean,
    error: Boolean,
    keyboardType: String,
    last: Boolean,
    onBlur: Callback,
    onChange: Callback,
    onErrorClick: Callback,
    onFocus: Callback,
    rows: Double,
    styles: StringDictionary[RegisteredStyle[Any]]
  ): AutoHeight = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], keyboardType = keyboardType.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], onBlur = onBlur.toJsFn, onChange = onChange.toJsFn, onErrorClick = onErrorClick.toJsFn, onFocus = onFocus.toJsFn, rows = rows.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoHeight]
  }
  
  extension [Self <: AutoHeight](x: Self) {
    
    inline def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
    
    inline def setClear(value: Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setKeyboardType(value: String): Self = StObject.set(x, "keyboardType", value.asInstanceOf[js.Any])
    
    inline def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: Callback): Self = StObject.set(x, "onBlur", value.toJsFn)
    
    inline def setOnChange(value: Callback): Self = StObject.set(x, "onChange", value.toJsFn)
    
    inline def setOnErrorClick(value: Callback): Self = StObject.set(x, "onErrorClick", value.toJsFn)
    
    inline def setOnFocus(value: Callback): Self = StObject.set(x, "onFocus", value.toJsFn)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: StringDictionary[RegisteredStyle[Any]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
