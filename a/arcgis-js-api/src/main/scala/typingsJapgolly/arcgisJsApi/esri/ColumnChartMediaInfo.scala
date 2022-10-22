package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnChartMediaInfo
  extends StObject
     with JSONSupport
     with MediaInfo
     with ChartMediaInfo {
  
  /**
    * Indicates the type of chart.
    *
    * @default column-chart
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ColumnChartMediaInfo.html#type)
    */
  val `type`: String
}
object ColumnChartMediaInfo {
  
  inline def apply(
    altText: String,
    caption: String,
    title: String,
    toJSON: CallbackTo[Any],
    `type`: String,
    value: ChartMediaInfoValue
  ): ColumnChartMediaInfo = {
    val __obj = js.Dynamic.literal(altText = altText.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], toJSON = toJSON.toJsFn, value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnChartMediaInfo]
  }
  
  extension [Self <: ColumnChartMediaInfo](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
