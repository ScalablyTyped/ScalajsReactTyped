package typingsJapgolly.senchaTouch.Ext.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDelayedTask
  extends StObject
     with IBase {
  
  /** [Method] Cancel the last queued timeout */
  var cancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Cancels any pending timeout and queues a new one
    * @param delay Number The milliseconds to delay
    * @param newFn Function Overrides the original function passed when instantiated.
    * @param newScope Object Overrides the original scope passed when instantiated. Remember that if no scope is specified, this will refer to the browser window.
    * @param newArgs Array Overrides the original args passed when instantiated.
    */
  var delay: js.UndefOr[
    js.Function4[
      /* delay */ js.UndefOr[Double], 
      /* newFn */ js.UndefOr[Any], 
      /* newScope */ js.UndefOr[Any], 
      /* newArgs */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Returns the value of args
    * @returns Object
    */
  var getArgs: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of delay
    * @returns Object
    */
  var getDelay: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of fn
    * @returns Object
    */
  var getFn: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of interval
    * @returns Object
    */
  var getInterval: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of scope
    * @returns Object
    */
  var getScope: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Sets the value of args
    * @param args Object The new value.
    */
  var setArgs: js.UndefOr[js.Function1[/* args */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of delay
    * @param delay Object The new value.
    */
  var setDelay: js.UndefOr[js.Function1[/* delay */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of fn
    * @param fn Object The new value.
    */
  var setFn: js.UndefOr[js.Function1[/* fn */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of interval
    * @param interval Object The new value.
    */
  var setInterval: js.UndefOr[js.Function1[/* interval */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of scope
    * @param scope Object The new value.
    */
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[Any], Unit]] = js.undefined
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
      value: (/* delay */ js.UndefOr[Double], /* newFn */ js.UndefOr[Any], /* newScope */ js.UndefOr[Any], /* newArgs */ js.UndefOr[Array]) => Callback
    ): Self = StObject.set(x, "delay", js.Any.fromFunction4((t0: /* delay */ js.UndefOr[Double], t1: /* newFn */ js.UndefOr[Any], t2: /* newScope */ js.UndefOr[Any], t3: /* newArgs */ js.UndefOr[Array]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setGetArgs(value: CallbackTo[Any]): Self = StObject.set(x, "getArgs", value.toJsFn)
    
    inline def setGetArgsUndefined: Self = StObject.set(x, "getArgs", js.undefined)
    
    inline def setGetDelay(value: CallbackTo[Any]): Self = StObject.set(x, "getDelay", value.toJsFn)
    
    inline def setGetDelayUndefined: Self = StObject.set(x, "getDelay", js.undefined)
    
    inline def setGetFn(value: CallbackTo[Any]): Self = StObject.set(x, "getFn", value.toJsFn)
    
    inline def setGetFnUndefined: Self = StObject.set(x, "getFn", js.undefined)
    
    inline def setGetInterval(value: CallbackTo[Any]): Self = StObject.set(x, "getInterval", value.toJsFn)
    
    inline def setGetIntervalUndefined: Self = StObject.set(x, "getInterval", js.undefined)
    
    inline def setGetScope(value: CallbackTo[Any]): Self = StObject.set(x, "getScope", value.toJsFn)
    
    inline def setGetScopeUndefined: Self = StObject.set(x, "getScope", js.undefined)
    
    inline def setSetArgs(value: /* args */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setArgs", js.Any.fromFunction1((t0: /* args */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetArgsUndefined: Self = StObject.set(x, "setArgs", js.undefined)
    
    inline def setSetDelay(value: /* delay */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setDelay", js.Any.fromFunction1((t0: /* delay */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetDelayUndefined: Self = StObject.set(x, "setDelay", js.undefined)
    
    inline def setSetFn(value: /* fn */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setFn", js.Any.fromFunction1((t0: /* fn */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetFnUndefined: Self = StObject.set(x, "setFn", js.undefined)
    
    inline def setSetInterval(value: /* interval */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setInterval", js.Any.fromFunction1((t0: /* interval */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetIntervalUndefined: Self = StObject.set(x, "setInterval", js.undefined)
    
    inline def setSetScope(value: /* scope */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setScope", js.Any.fromFunction1((t0: /* scope */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetScopeUndefined: Self = StObject.set(x, "setScope", js.undefined)
  }
}
