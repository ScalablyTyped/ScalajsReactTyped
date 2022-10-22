package typingsJapgolly.reactChartjs2.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactChartjs2.distTypesMod.ChartJSOrUndefined
import typingsJapgolly.reactChartjs2.distTypesMod.ForwardedRef
import typingsJapgolly.reactChartjs2.reactChartjs2Strings.polarArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5`[TData, TLabel] extends StObject {
  
  var ref: js.UndefOr[ForwardedRef[ChartJSOrUndefined[polarArea, TData, TLabel]]] = js.undefined
}
object `5` {
  
  inline def apply[TData, TLabel](): `5`[TData, TLabel] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`5`[TData, TLabel]]
  }
  
  extension [Self <: `5`[?, ?], TData, TLabel](x: Self & (`5`[TData, TLabel])) {
    
    inline def setRef(value: ForwardedRef[ChartJSOrUndefined[polarArea, TData, TLabel]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ (ChartJSOrUndefined[polarArea, TData, TLabel]) | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: /* instance */ (ChartJSOrUndefined[polarArea, TData, TLabel]) | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
