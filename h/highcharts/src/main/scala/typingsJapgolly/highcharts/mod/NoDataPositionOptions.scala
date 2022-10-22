package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoDataPositionOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) Horizontal alignment of the label.
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Vertical alignment of the label.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Horizontal offset of the label, in pixels.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Vertical offset of the label, in pixels.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object NoDataPositionOptions {
  
  inline def apply(): NoDataPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoDataPositionOptions]
  }
  
  extension [Self <: NoDataPositionOptions](x: Self) {
    
    inline def setAlign(value: AlignValue): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setVerticalAlign(value: VerticalAlignValue): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
