package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistogramSeries extends StObject {
  
  /** The color of the column representing this series in each bucket. This field is optional. Deprecated: Use bar_color_style. */
  var barColor: js.UndefOr[Color] = js.undefined
  
  /** The color of the column representing this series in each bucket. This field is optional. If bar_color is also set, this field takes precedence. */
  var barColorStyle: js.UndefOr[ColorStyle] = js.undefined
  
  /** The data for this histogram series. */
  var data: js.UndefOr[ChartData] = js.undefined
}
object HistogramSeries {
  
  inline def apply(): HistogramSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramSeries]
  }
  
  extension [Self <: HistogramSeries](x: Self) {
    
    inline def setBarColor(value: Color): Self = StObject.set(x, "barColor", value.asInstanceOf[js.Any])
    
    inline def setBarColorStyle(value: ColorStyle): Self = StObject.set(x, "barColorStyle", value.asInstanceOf[js.Any])
    
    inline def setBarColorStyleUndefined: Self = StObject.set(x, "barColorStyle", js.undefined)
    
    inline def setBarColorUndefined: Self = StObject.set(x, "barColor", js.undefined)
    
    inline def setData(value: ChartData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
