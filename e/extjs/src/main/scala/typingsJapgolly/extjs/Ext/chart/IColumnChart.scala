package typingsJapgolly.extjs.Ext.chart

import typingsJapgolly.extjs.Ext.chart.series.IBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColumnChart
  extends StObject
     with IBar {
  
  /** [Config Option] (String) */
  @JSName("axis")
  var axis_IColumnChart: js.UndefOr[String] = js.undefined
}
object IColumnChart {
  
  inline def apply(): IColumnChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnChart]
  }
  
  extension [Self <: IColumnChart](x: Self) {
    
    inline def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
  }
}
