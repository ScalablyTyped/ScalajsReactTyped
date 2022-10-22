package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import typingsJapgolly.mfiles.MFiles.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITaskPaneEvents
  extends StObject
     with IEvents {
  
  var OnHidePane: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnShowPane: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object ITaskPaneEvents {
  
  inline def apply(Register: (Event, js.Function) => Double, Unregister: Double => Callback): ITaskPaneEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1((t0: Double) => Unregister(t0).runNow()))
    __obj.asInstanceOf[ITaskPaneEvents]
  }
  
  extension [Self <: ITaskPaneEvents](x: Self) {
    
    inline def setOnHidePane(value: Callback): Self = StObject.set(x, "OnHidePane", value.toJsFn)
    
    inline def setOnHidePaneUndefined: Self = StObject.set(x, "OnHidePane", js.undefined)
    
    inline def setOnShowPane(value: Callback): Self = StObject.set(x, "OnShowPane", value.toJsFn)
    
    inline def setOnShowPaneUndefined: Self = StObject.set(x, "OnShowPane", js.undefined)
    
    inline def setOnStarted(value: Callback): Self = StObject.set(x, "OnStarted", value.toJsFn)
    
    inline def setOnStartedUndefined: Self = StObject.set(x, "OnStarted", js.undefined)
    
    inline def setOnStop(value: Callback): Self = StObject.set(x, "OnStop", value.toJsFn)
    
    inline def setOnStopUndefined: Self = StObject.set(x, "OnStop", js.undefined)
  }
}
