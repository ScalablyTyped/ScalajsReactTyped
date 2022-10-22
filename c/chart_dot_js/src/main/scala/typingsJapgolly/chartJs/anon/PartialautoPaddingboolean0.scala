package typingsJapgolly.chartJs.anon

import typingsJapgolly.chartJs.chartJsStrings.pie
import typingsJapgolly.chartJs.mod.Scriptable
import typingsJapgolly.chartJs.mod.ScriptableContext
import typingsJapgolly.chartJs.typesBasicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  autoPadding :boolean,   padding :chart.js.chart.js.Scriptable<number | std.Partial<chart.js.chart.js/types/geometric.ChartArea>, chart.js.chart.js.ScriptableContext<'pie'>>}> */
trait PartialautoPaddingboolean0 extends StObject {
  
  var autoPadding: js.UndefOr[Boolean] = js.undefined
  
  var padding: js.UndefOr[Scriptable[Double | PartialChartArea, ScriptableContext[pie]]] = js.undefined
}
object PartialautoPaddingboolean0 {
  
  inline def apply(): PartialautoPaddingboolean0 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialautoPaddingboolean0]
  }
  
  extension [Self <: PartialautoPaddingboolean0](x: Self) {
    
    inline def setAutoPadding(value: Boolean): Self = StObject.set(x, "autoPadding", value.asInstanceOf[js.Any])
    
    inline def setAutoPaddingUndefined: Self = StObject.set(x, "autoPadding", js.undefined)
    
    inline def setPadding(value: Scriptable[Double | PartialChartArea, ScriptableContext[pie]]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingFunction2(value: (ScriptableContext[pie], /* options */ AnyObject) => js.UndefOr[Double | PartialChartArea]): Self = StObject.set(x, "padding", js.Any.fromFunction2(value))
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
