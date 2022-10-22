package typingsJapgolly.antdMobileRn.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultValue extends StObject {
  
  var defaultValue: Double
  
  var disabled: Boolean
  
  var maximumTrackTintColor: String
  
  var minimumTrackTintColor: String
  
  def onAfterChange(): Unit
  
  def onChange(): Unit
}
object DefaultValue {
  
  inline def apply(
    defaultValue: Double,
    disabled: Boolean,
    maximumTrackTintColor: String,
    minimumTrackTintColor: String,
    onAfterChange: Callback,
    onChange: Callback
  ): DefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], maximumTrackTintColor = maximumTrackTintColor.asInstanceOf[js.Any], minimumTrackTintColor = minimumTrackTintColor.asInstanceOf[js.Any], onAfterChange = onAfterChange.toJsFn, onChange = onChange.toJsFn)
    __obj.asInstanceOf[DefaultValue]
  }
  
  extension [Self <: DefaultValue](x: Self) {
    
    inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setMaximumTrackTintColor(value: String): Self = StObject.set(x, "maximumTrackTintColor", value.asInstanceOf[js.Any])
    
    inline def setMinimumTrackTintColor(value: String): Self = StObject.set(x, "minimumTrackTintColor", value.asInstanceOf[js.Any])
    
    inline def setOnAfterChange(value: Callback): Self = StObject.set(x, "onAfterChange", value.toJsFn)
    
    inline def setOnChange(value: Callback): Self = StObject.set(x, "onChange", value.toJsFn)
  }
}
