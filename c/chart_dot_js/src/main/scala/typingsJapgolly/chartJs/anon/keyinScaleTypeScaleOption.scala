package typingsJapgolly.chartJs.anon

import typingsJapgolly.chartJs.chartJsStrings.category
import typingsJapgolly.chartJs.chartJsStrings.linear
import typingsJapgolly.chartJs.chartJsStrings.logarithmic
import typingsJapgolly.chartJs.chartJsStrings.radialLinear
import typingsJapgolly.chartJs.chartJsStrings.time
import typingsJapgolly.chartJs.chartJsStrings.timeseries
import typingsJapgolly.chartJs.mod.ScaleOptionsByType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in chart.js.chart.js.ScaleType ]: chart.js.chart.js.ScaleOptionsByType<key>} */
trait keyinScaleTypeScaleOption extends StObject {
  
  var category: ScaleOptionsByType[typingsJapgolly.chartJs.chartJsStrings.category]
  
  var linear: ScaleOptionsByType[typingsJapgolly.chartJs.chartJsStrings.linear]
  
  var logarithmic: ScaleOptionsByType[typingsJapgolly.chartJs.chartJsStrings.logarithmic]
  
  var radialLinear: ScaleOptionsByType[typingsJapgolly.chartJs.chartJsStrings.radialLinear]
  
  var time: ScaleOptionsByType[typingsJapgolly.chartJs.chartJsStrings.time]
  
  var timeseries: ScaleOptionsByType[typingsJapgolly.chartJs.chartJsStrings.timeseries]
}
object keyinScaleTypeScaleOption {
  
  inline def apply(
    category: ScaleOptionsByType[category],
    linear: ScaleOptionsByType[linear],
    logarithmic: ScaleOptionsByType[logarithmic],
    radialLinear: ScaleOptionsByType[radialLinear],
    time: ScaleOptionsByType[time],
    timeseries: ScaleOptionsByType[timeseries]
  ): keyinScaleTypeScaleOption = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any], logarithmic = logarithmic.asInstanceOf[js.Any], radialLinear = radialLinear.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeseries = timeseries.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinScaleTypeScaleOption]
  }
  
  extension [Self <: keyinScaleTypeScaleOption](x: Self) {
    
    inline def setCategory(value: ScaleOptionsByType[category]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setLinear(value: ScaleOptionsByType[linear]): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
    
    inline def setLogarithmic(value: ScaleOptionsByType[logarithmic]): Self = StObject.set(x, "logarithmic", value.asInstanceOf[js.Any])
    
    inline def setRadialLinear(value: ScaleOptionsByType[radialLinear]): Self = StObject.set(x, "radialLinear", value.asInstanceOf[js.Any])
    
    inline def setTime(value: ScaleOptionsByType[time]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeseries(value: ScaleOptionsByType[timeseries]): Self = StObject.set(x, "timeseries", value.asInstanceOf[js.Any])
  }
}
