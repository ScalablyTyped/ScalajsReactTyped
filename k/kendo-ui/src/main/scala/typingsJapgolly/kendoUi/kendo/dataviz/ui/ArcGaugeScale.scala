package typingsJapgolly.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcGaugeScale extends StObject {
  
  var endAngle: js.UndefOr[Double] = js.undefined
  
  var labels: js.UndefOr[ArcGaugeScaleLabels] = js.undefined
  
  var majorTicks: js.UndefOr[ArcGaugeScaleMajorTicks] = js.undefined
  
  var majorUnit: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var minorTicks: js.UndefOr[ArcGaugeScaleMinorTicks] = js.undefined
  
  var minorUnit: js.UndefOr[Double] = js.undefined
  
  var rangeDistance: js.UndefOr[Double] = js.undefined
  
  var rangeLineCap: js.UndefOr[String] = js.undefined
  
  var rangePlaceholderColor: js.UndefOr[String] = js.undefined
  
  var rangeSize: js.UndefOr[Double] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var startAngle: js.UndefOr[Double] = js.undefined
}
object ArcGaugeScale {
  
  inline def apply(): ArcGaugeScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcGaugeScale]
  }
  
  extension [Self <: ArcGaugeScale](x: Self) {
    
    inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    inline def setLabels(value: ArcGaugeScaleLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMajorTicks(value: ArcGaugeScaleMajorTicks): Self = StObject.set(x, "majorTicks", value.asInstanceOf[js.Any])
    
    inline def setMajorTicksUndefined: Self = StObject.set(x, "majorTicks", js.undefined)
    
    inline def setMajorUnit(value: Double): Self = StObject.set(x, "majorUnit", value.asInstanceOf[js.Any])
    
    inline def setMajorUnitUndefined: Self = StObject.set(x, "majorUnit", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMinorTicks(value: ArcGaugeScaleMinorTicks): Self = StObject.set(x, "minorTicks", value.asInstanceOf[js.Any])
    
    inline def setMinorTicksUndefined: Self = StObject.set(x, "minorTicks", js.undefined)
    
    inline def setMinorUnit(value: Double): Self = StObject.set(x, "minorUnit", value.asInstanceOf[js.Any])
    
    inline def setMinorUnitUndefined: Self = StObject.set(x, "minorUnit", js.undefined)
    
    inline def setRangeDistance(value: Double): Self = StObject.set(x, "rangeDistance", value.asInstanceOf[js.Any])
    
    inline def setRangeDistanceUndefined: Self = StObject.set(x, "rangeDistance", js.undefined)
    
    inline def setRangeLineCap(value: String): Self = StObject.set(x, "rangeLineCap", value.asInstanceOf[js.Any])
    
    inline def setRangeLineCapUndefined: Self = StObject.set(x, "rangeLineCap", js.undefined)
    
    inline def setRangePlaceholderColor(value: String): Self = StObject.set(x, "rangePlaceholderColor", value.asInstanceOf[js.Any])
    
    inline def setRangePlaceholderColorUndefined: Self = StObject.set(x, "rangePlaceholderColor", js.undefined)
    
    inline def setRangeSize(value: Double): Self = StObject.set(x, "rangeSize", value.asInstanceOf[js.Any])
    
    inline def setRangeSizeUndefined: Self = StObject.set(x, "rangeSize", js.undefined)
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
  }
}
