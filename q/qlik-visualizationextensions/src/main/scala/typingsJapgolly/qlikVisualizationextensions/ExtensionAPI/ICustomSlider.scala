package typingsJapgolly.qlikVisualizationextensions.ExtensionAPI

import typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.slider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICustomSlider
  extends StObject
     with ICustomControl {
  
  var component: slider
  
  var defaultValue: Double
  
  var max: Double
  
  var min: Double
  
  var step: Double
}
object ICustomSlider {
  
  inline def apply(
    defaultValue: Double,
    label: String,
    max: Double,
    min: Double,
    ref: String,
    step: Double,
    `type`: String
  ): ICustomSlider = {
    val __obj = js.Dynamic.literal(component = "slider", defaultValue = defaultValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomSlider]
  }
  
  extension [Self <: ICustomSlider](x: Self) {
    
    inline def setComponent(value: slider): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
