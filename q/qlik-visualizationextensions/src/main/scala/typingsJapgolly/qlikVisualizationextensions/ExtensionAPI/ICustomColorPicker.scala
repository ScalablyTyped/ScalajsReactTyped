package typingsJapgolly.qlikVisualizationextensions.ExtensionAPI

import typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.`color-picker`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICustomColorPicker
  extends StObject
     with ICustomControl {
  
  var component: `color-picker`
  
  var defaultValue: Double
}
object ICustomColorPicker {
  
  inline def apply(defaultValue: Double, label: String, ref: String, `type`: String): ICustomColorPicker = {
    val __obj = js.Dynamic.literal(component = "color-picker", defaultValue = defaultValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomColorPicker]
  }
  
  extension [Self <: ICustomColorPicker](x: Self) {
    
    inline def setComponent(value: `color-picker`): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
  }
}
