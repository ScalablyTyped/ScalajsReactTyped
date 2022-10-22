package typingsJapgolly.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait View[D] extends StObject {
  
  var map: js.UndefOr[String | DocumentInfer[D]] = js.undefined
  
  var reduce: js.UndefOr[String | DocumentInfer[D]] = js.undefined
}
object View {
  
  inline def apply[D](): View[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[View[D]]
  }
  
  extension [Self <: View[?], D](x: Self & View[D]) {
    
    inline def setMap(value: String | DocumentInfer[D]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapFunction1(value: /* doc */ D & Document => japgolly.scalajs.react.Callback): Self = StObject.set(x, "map", js.Any.fromFunction1((t0: /* doc */ D & Document) => value(t0).runNow()))
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setReduce(value: String | DocumentInfer[D]): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
    
    inline def setReduceFunction1(value: /* doc */ D & Document => japgolly.scalajs.react.Callback): Self = StObject.set(x, "reduce", js.Any.fromFunction1((t0: /* doc */ D & Document) => value(t0).runNow()))
    
    inline def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
  }
}
