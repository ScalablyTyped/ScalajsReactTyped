package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesSankeyDataLabelsFormatterContextObject
  extends StObject
     with PointLabelObject {
  
  /**
    * The node object. The node name, if defined, is available through
    * `this.point.name`.
    */
  @JSName("point")
  var point_SeriesSankeyDataLabelsFormatterContextObject: SankeyNodeObject
}
object SeriesSankeyDataLabelsFormatterContextObject {
  
  inline def apply(colorIndex: Double, percentage: Double, point: SankeyNodeObject, series: Series): SeriesSankeyDataLabelsFormatterContextObject = {
    val __obj = js.Dynamic.literal(colorIndex = colorIndex.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesSankeyDataLabelsFormatterContextObject]
  }
  
  extension [Self <: SeriesSankeyDataLabelsFormatterContextObject](x: Self) {
    
    inline def setPoint(value: SankeyNodeObject): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
  }
}
