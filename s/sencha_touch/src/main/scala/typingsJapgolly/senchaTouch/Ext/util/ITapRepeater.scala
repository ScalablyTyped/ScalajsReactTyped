package typingsJapgolly.senchaTouch.Ext.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITapRepeater
  extends StObject
     with typingsJapgolly.senchaTouch.Ext.mixin.IObservable {
  
  /** [Method] Returns the value of accelerate
    * @returns Boolean
    */
  var getAccelerate: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of delay
    * @returns Number
    */
  var getDelay: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of el
    * @returns Object
    */
  var getEl: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of interval
    * @returns Number
    */
  var getInterval: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of pressCls
    * @returns Object
    */
  var getPressCls: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of preventDefault
    * @returns Boolean
    */
  var getPreventDefault: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of stopDefault
    * @returns Boolean
    */
  var getStopDefault: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of timer
    * @returns Number
    */
  var getTimer: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_ITapRepeater: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[Any], 
      /* events */ js.UndefOr[Any], 
      typingsJapgolly.senchaTouch.Ext.mixin.IObservable
    ]
  ] = js.undefined
  
  /** [Method] Sets the value of accelerate
    * @param accelerate Boolean The new value.
    */
  var setAccelerate: js.UndefOr[js.Function1[/* accelerate */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of delay
    * @param delay Number The new value.
    */
  var setDelay: js.UndefOr[js.Function1[/* delay */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of el
    * @param el Object The new value.
    */
  var setEl: js.UndefOr[js.Function1[/* el */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of interval
    * @param interval Number The new value.
    */
  var setInterval: js.UndefOr[js.Function1[/* interval */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of pressCls
    * @param pressCls Object The new value.
    */
  var setPressCls: js.UndefOr[js.Function1[/* pressCls */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of preventDefault
    * @param preventDefault Boolean The new value.
    */
  var setPreventDefault: js.UndefOr[js.Function1[/* preventDefault */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of stopDefault
    * @param stopDefault Boolean The new value.
    */
  var setStopDefault: js.UndefOr[js.Function1[/* stopDefault */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of timer
    * @param timer Number The new value.
    */
  var setTimer: js.UndefOr[js.Function1[/* timer */ js.UndefOr[Double], Unit]] = js.undefined
}
object ITapRepeater {
  
  inline def apply(): ITapRepeater = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITapRepeater]
  }
  
  extension [Self <: ITapRepeater](x: Self) {
    
    inline def setGetAccelerate(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAccelerate", value.toJsFn)
    
    inline def setGetAccelerateUndefined: Self = StObject.set(x, "getAccelerate", js.undefined)
    
    inline def setGetDelay(value: CallbackTo[Double]): Self = StObject.set(x, "getDelay", value.toJsFn)
    
    inline def setGetDelayUndefined: Self = StObject.set(x, "getDelay", js.undefined)
    
    inline def setGetEl(value: CallbackTo[Any]): Self = StObject.set(x, "getEl", value.toJsFn)
    
    inline def setGetElUndefined: Self = StObject.set(x, "getEl", js.undefined)
    
    inline def setGetInterval(value: CallbackTo[Double]): Self = StObject.set(x, "getInterval", value.toJsFn)
    
    inline def setGetIntervalUndefined: Self = StObject.set(x, "getInterval", js.undefined)
    
    inline def setGetPressCls(value: CallbackTo[Any]): Self = StObject.set(x, "getPressCls", value.toJsFn)
    
    inline def setGetPressClsUndefined: Self = StObject.set(x, "getPressCls", js.undefined)
    
    inline def setGetPreventDefault(value: CallbackTo[Boolean]): Self = StObject.set(x, "getPreventDefault", value.toJsFn)
    
    inline def setGetPreventDefaultUndefined: Self = StObject.set(x, "getPreventDefault", js.undefined)
    
    inline def setGetStopDefault(value: CallbackTo[Boolean]): Self = StObject.set(x, "getStopDefault", value.toJsFn)
    
    inline def setGetStopDefaultUndefined: Self = StObject.set(x, "getStopDefault", js.undefined)
    
    inline def setGetTimer(value: CallbackTo[Double]): Self = StObject.set(x, "getTimer", value.toJsFn)
    
    inline def setGetTimerUndefined: Self = StObject.set(x, "getTimer", js.undefined)
    
    inline def setRelayEvents(
      value: (/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any]) => typingsJapgolly.senchaTouch.Ext.mixin.IObservable
    ): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
    
    inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
    
    inline def setSetAccelerate(value: /* accelerate */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setAccelerate", js.Any.fromFunction1((t0: /* accelerate */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetAccelerateUndefined: Self = StObject.set(x, "setAccelerate", js.undefined)
    
    inline def setSetDelay(value: /* delay */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setDelay", js.Any.fromFunction1((t0: /* delay */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetDelayUndefined: Self = StObject.set(x, "setDelay", js.undefined)
    
    inline def setSetEl(value: /* el */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setEl", js.Any.fromFunction1((t0: /* el */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetElUndefined: Self = StObject.set(x, "setEl", js.undefined)
    
    inline def setSetInterval(value: /* interval */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setInterval", js.Any.fromFunction1((t0: /* interval */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetIntervalUndefined: Self = StObject.set(x, "setInterval", js.undefined)
    
    inline def setSetPressCls(value: /* pressCls */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setPressCls", js.Any.fromFunction1((t0: /* pressCls */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetPressClsUndefined: Self = StObject.set(x, "setPressCls", js.undefined)
    
    inline def setSetPreventDefault(value: /* preventDefault */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setPreventDefault", js.Any.fromFunction1((t0: /* preventDefault */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetPreventDefaultUndefined: Self = StObject.set(x, "setPreventDefault", js.undefined)
    
    inline def setSetStopDefault(value: /* stopDefault */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setStopDefault", js.Any.fromFunction1((t0: /* stopDefault */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetStopDefaultUndefined: Self = StObject.set(x, "setStopDefault", js.undefined)
    
    inline def setSetTimer(value: /* timer */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setTimer", js.Any.fromFunction1((t0: /* timer */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetTimerUndefined: Self = StObject.set(x, "setTimer", js.undefined)
  }
}
