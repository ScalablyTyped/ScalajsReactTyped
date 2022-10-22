package typingsJapgolly.antdMobileRn.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.RegisteredStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChange extends StObject {
  
  var disabled: Boolean
  
  def onChange(): Unit
  
  def onValueChange(): Unit
  
  var selectedIndex: Double
  
  var styles: StringDictionary[RegisteredStyle[Any]]
  
  var tintColor: String
  
  var values: js.Array[scala.Nothing]
}
object OnChange {
  
  inline def apply(
    disabled: Boolean,
    onChange: Callback,
    onValueChange: Callback,
    selectedIndex: Double,
    styles: StringDictionary[RegisteredStyle[Any]],
    tintColor: String,
    values: js.Array[scala.Nothing]
  ): OnChange = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onChange = onChange.toJsFn, onValueChange = onValueChange.toJsFn, selectedIndex = selectedIndex.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChange]
  }
  
  extension [Self <: OnChange](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Callback): Self = StObject.set(x, "onChange", value.toJsFn)
    
    inline def setOnValueChange(value: Callback): Self = StObject.set(x, "onValueChange", value.toJsFn)
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: StringDictionary[RegisteredStyle[Any]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[scala.Nothing]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: scala.Nothing*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
