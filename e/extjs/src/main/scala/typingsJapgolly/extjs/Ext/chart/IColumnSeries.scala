package typingsJapgolly.extjs.Ext.chart

import typingsJapgolly.extjs.Ext.chart.series.IBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColumnSeries
  extends StObject
     with IBar {
  
  /** [Config Option] (String) */
  @JSName("axis")
  var axis_IColumnSeries: js.UndefOr[String] = js.undefined
}
object IColumnSeries {
  
  inline def apply(): IColumnSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnSeries]
  }
  
  extension [Self <: IColumnSeries](x: Self) {
    
    inline def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
  }
}
