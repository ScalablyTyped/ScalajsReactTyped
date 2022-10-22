package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import typingsJapgolly.mfiles.MFiles.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDashboardEvents
  extends StObject
     with IEvents {
  
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IDashboardEvents {
  
  inline def apply(Register: (Event, js.Function) => Double, Unregister: Double => Callback): IDashboardEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1((t0: Double) => Unregister(t0).runNow()))
    __obj.asInstanceOf[IDashboardEvents]
  }
  
  extension [Self <: IDashboardEvents](x: Self) {
    
    inline def setOnStarted(value: Callback): Self = StObject.set(x, "OnStarted", value.toJsFn)
    
    inline def setOnStartedUndefined: Self = StObject.set(x, "OnStarted", js.undefined)
    
    inline def setOnStop(value: Callback): Self = StObject.set(x, "OnStop", value.toJsFn)
    
    inline def setOnStopUndefined: Self = StObject.set(x, "OnStop", js.undefined)
  }
}
