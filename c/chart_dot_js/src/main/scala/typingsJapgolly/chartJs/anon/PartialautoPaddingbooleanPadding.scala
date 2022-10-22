package typingsJapgolly.chartJs.anon

import typingsJapgolly.chartJs.chartJsStrings.radar
import typingsJapgolly.chartJs.mod.Scriptable
import typingsJapgolly.chartJs.mod.ScriptableContext
import typingsJapgolly.chartJs.typesBasicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  autoPadding :boolean,   padding :chart.js.chart.js.Scriptable<number | std.Partial<chart.js.chart.js/types/geometric.ChartArea>, chart.js.chart.js.ScriptableContext<'radar'>>}> */
trait PartialautoPaddingbooleanPadding extends StObject {
  
  var autoPadding: js.UndefOr[Boolean] = js.undefined
  
  var padding: js.UndefOr[Scriptable[Double | PartialChartArea, ScriptableContext[radar]]] = js.undefined
}
object PartialautoPaddingbooleanPadding {
  
  inline def apply(): PartialautoPaddingbooleanPadding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialautoPaddingbooleanPadding]
  }
  
  extension [Self <: PartialautoPaddingbooleanPadding](x: Self) {
    
    inline def setAutoPadding(value: Boolean): Self = StObject.set(x, "autoPadding", value.asInstanceOf[js.Any])
    
    inline def setAutoPaddingUndefined: Self = StObject.set(x, "autoPadding", js.undefined)
    
    inline def setPadding(value: Scriptable[Double | PartialChartArea, ScriptableContext[radar]]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingFunction2(
      value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[Double | PartialChartArea]
    ): Self = StObject.set(x, "padding", js.Any.fromFunction2(value))
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
