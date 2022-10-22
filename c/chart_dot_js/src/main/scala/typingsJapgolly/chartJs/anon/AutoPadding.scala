package typingsJapgolly.chartJs.anon

import typingsJapgolly.chartJs.mod.ChartType
import typingsJapgolly.chartJs.mod.Scriptable
import typingsJapgolly.chartJs.mod.ScriptableContext
import typingsJapgolly.chartJs.typesBasicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoPadding[TType /* <: ChartType */] extends StObject {
  
  var autoPadding: Boolean
  
  var padding: Scriptable[Double | PartialChartArea, ScriptableContext[TType]]
}
object AutoPadding {
  
  inline def apply[TType /* <: ChartType */](autoPadding: Boolean, padding: Scriptable[Double | PartialChartArea, ScriptableContext[TType]]): AutoPadding[TType] = {
    val __obj = js.Dynamic.literal(autoPadding = autoPadding.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoPadding[TType]]
  }
  
  extension [Self <: AutoPadding[?], TType /* <: ChartType */](x: Self & AutoPadding[TType]) {
    
    inline def setAutoPadding(value: Boolean): Self = StObject.set(x, "autoPadding", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Scriptable[Double | PartialChartArea, ScriptableContext[TType]]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingFunction2(
      value: (ScriptableContext[TType], /* options */ AnyObject) => js.UndefOr[Double | PartialChartArea]
    ): Self = StObject.set(x, "padding", js.Any.fromFunction2(value))
  }
}
