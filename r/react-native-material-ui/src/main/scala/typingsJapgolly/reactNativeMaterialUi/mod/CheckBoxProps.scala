package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeMaterialUi.anon.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckBoxProps extends StObject {
  
  var checked: js.UndefOr[Boolean] = js.undefined
  
  var checkedIcon: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var label: String
  
  def onCheck(checked: Boolean): Unit
  
  var style: js.UndefOr[Label] = js.undefined
  
  var uncheckedIcon: js.UndefOr[String] = js.undefined
  
  var value: String | Double
}
object CheckBoxProps {
  
  inline def apply(label: String, onCheck: Boolean => Callback, value: String | Double): CheckBoxProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onCheck = js.Any.fromFunction1((t0: Boolean) => onCheck(t0).runNow()), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckBoxProps]
  }
  
  extension [Self <: CheckBoxProps](x: Self) {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedIcon(value: String): Self = StObject.set(x, "checkedIcon", value.asInstanceOf[js.Any])
    
    inline def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOnCheck(value: Boolean => Callback): Self = StObject.set(x, "onCheck", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setStyle(value: Label): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUncheckedIcon(value: String): Self = StObject.set(x, "uncheckedIcon", value.asInstanceOf[js.Any])
    
    inline def setUncheckedIconUndefined: Self = StObject.set(x, "uncheckedIcon", js.undefined)
    
    inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
