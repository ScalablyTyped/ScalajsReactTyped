package typingsJapgolly.kendoUi.kendo.data

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotTransportWithFunctionOperations
  extends StObject
     with PivotTransport {
  
  @JSName("discover")
  var discover_PivotTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, Unit]] = js.undefined
  
  @JSName("read")
  var read_PivotTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, Unit]] = js.undefined
}
object PivotTransportWithFunctionOperations {
  
  inline def apply(): PivotTransportWithFunctionOperations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTransportWithFunctionOperations]
  }
  
  extension [Self <: PivotTransportWithFunctionOperations](x: Self) {
    
    inline def setDiscover(value: /* options */ DataSourceTransportOptions => Callback): Self = StObject.set(x, "discover", js.Any.fromFunction1((t0: /* options */ DataSourceTransportOptions) => value(t0).runNow()))
    
    inline def setDiscoverUndefined: Self = StObject.set(x, "discover", js.undefined)
    
    inline def setRead(value: /* options */ DataSourceTransportOptions => Callback): Self = StObject.set(x, "read", js.Any.fromFunction1((t0: /* options */ DataSourceTransportOptions) => value(t0).runNow()))
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
  }
}
