package typingsJapgolly.chartJs.anon

import typingsJapgolly.chartJs.chartJsStrings.scatter
import typingsJapgolly.chartJs.mod.Scriptable
import typingsJapgolly.chartJs.mod.ScriptableContext
import typingsJapgolly.chartJs.typesBasicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  autoPadding :boolean,   padding :chart.js.chart.js.Scriptable<number | std.Partial<chart.js.chart.js/types/geometric.ChartArea>, chart.js.chart.js.ScriptableContext<'scatter'>>}> */
trait PartialautoPaddingbooleanAutoPaddingPadding extends StObject {
  
  var autoPadding: js.UndefOr[Boolean] = js.undefined
  
  var padding: js.UndefOr[Scriptable[Double | PartialChartArea, ScriptableContext[scatter]]] = js.undefined
}
object PartialautoPaddingbooleanAutoPaddingPadding {
  
  inline def apply(): PartialautoPaddingbooleanAutoPaddingPadding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialautoPaddingbooleanAutoPaddingPadding]
  }
  
  extension [Self <: PartialautoPaddingbooleanAutoPaddingPadding](x: Self) {
    
    inline def setAutoPadding(value: Boolean): Self = StObject.set(x, "autoPadding", value.asInstanceOf[js.Any])
    
    inline def setAutoPaddingUndefined: Self = StObject.set(x, "autoPadding", js.undefined)
    
    inline def setPadding(value: Scriptable[Double | PartialChartArea, ScriptableContext[scatter]]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingFunction2(
      value: (ScriptableContext[scatter], /* options */ AnyObject) => js.UndefOr[Double | PartialChartArea]
    ): Self = StObject.set(x, "padding", js.Any.fromFunction2(value))
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
