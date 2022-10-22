package typingsJapgolly.reactNativeChartsWrapper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisDependency extends StObject {
  
  var axisDependency: js.UndefOr[typingsJapgolly.reactNativeChartsWrapper.mod.AxisDependency] = js.undefined
  
  var scaleX: Double
  
  var scaleY: Double
  
  var xValue: Double
  
  var yValue: Double
}
object AxisDependency {
  
  inline def apply(scaleX: Double, scaleY: Double, xValue: Double, yValue: Double): AxisDependency = {
    val __obj = js.Dynamic.literal(scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], xValue = xValue.asInstanceOf[js.Any], yValue = yValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisDependency]
  }
  
  extension [Self <: AxisDependency](x: Self) {
    
    inline def setAxisDependency(value: typingsJapgolly.reactNativeChartsWrapper.mod.AxisDependency): Self = StObject.set(x, "axisDependency", value.asInstanceOf[js.Any])
    
    inline def setAxisDependencyUndefined: Self = StObject.set(x, "axisDependency", js.undefined)
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setXValue(value: Double): Self = StObject.set(x, "xValue", value.asInstanceOf[js.Any])
    
    inline def setYValue(value: Double): Self = StObject.set(x, "yValue", value.asInstanceOf[js.Any])
  }
}
