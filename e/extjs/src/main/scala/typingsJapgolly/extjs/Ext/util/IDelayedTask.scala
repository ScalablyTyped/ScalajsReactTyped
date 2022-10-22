package typingsJapgolly.extjs.Ext.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.extjs.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDelayedTask extends StObject {
  
  /** [Method] Cancel the last queued timeout */
  var cancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] By default cancels any pending timeout and queues a new one
    * @param newDelay Number The milliseconds to delay
    * @param newFn Function Overrides function passed to constructor
    * @param newScope Object Overrides scope passed to constructor. Remember that if no scope is specified, this will refer to the browser window.
    * @param newArgs Array Overrides args passed to constructor
    */
  var delay: js.UndefOr[
    js.Function4[
      /* newDelay */ js.UndefOr[Double], 
      /* newFn */ js.UndefOr[Any], 
      /* newScope */ js.UndefOr[Any], 
      /* newArgs */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.undefined
  
  /** [Property] (Number) */
  var id: js.UndefOr[Double] = js.undefined
}
object IDelayedTask {
  
  inline def apply(): IDelayedTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDelayedTask]
  }
  
  extension [Self <: IDelayedTask](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setDelay(
      value: (/* newDelay */ js.UndefOr[Double], /* newFn */ js.UndefOr[Any], /* newScope */ js.UndefOr[Any], /* newArgs */ js.UndefOr[Array]) => Callback
    ): Self = StObject.set(x, "delay", js.Any.fromFunction4((t0: /* newDelay */ js.UndefOr[Double], t1: /* newFn */ js.UndefOr[Any], t2: /* newScope */ js.UndefOr[Any], t3: /* newArgs */ js.UndefOr[Array]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
