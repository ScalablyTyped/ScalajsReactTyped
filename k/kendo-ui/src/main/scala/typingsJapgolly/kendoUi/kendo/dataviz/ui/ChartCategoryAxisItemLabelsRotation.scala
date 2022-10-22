package typingsJapgolly.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartCategoryAxisItemLabelsRotation extends StObject {
  
  var align: js.UndefOr[String] = js.undefined
  
  var angle: js.UndefOr[Double | String] = js.undefined
}
object ChartCategoryAxisItemLabelsRotation {
  
  inline def apply(): ChartCategoryAxisItemLabelsRotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartCategoryAxisItemLabelsRotation]
  }
  
  extension [Self <: ChartCategoryAxisItemLabelsRotation](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setAngle(value: Double | String): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
  }
}
