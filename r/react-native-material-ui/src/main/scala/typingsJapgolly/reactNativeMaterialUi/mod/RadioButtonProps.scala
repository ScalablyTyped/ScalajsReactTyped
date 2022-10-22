package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadioButtonProps extends StObject {
  
  var checked: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var label: String
  
  def onSelect(value: String): Unit
  
  var theme: js.UndefOr[String] = js.undefined
  
  var value: String | Double
}
object RadioButtonProps {
  
  inline def apply(label: String, onSelect: String => Callback, value: String | Double): RadioButtonProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1((t0: String) => onSelect(t0).runNow()), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioButtonProps]
  }
  
  extension [Self <: RadioButtonProps](x: Self) {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOnSelect(value: String => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
