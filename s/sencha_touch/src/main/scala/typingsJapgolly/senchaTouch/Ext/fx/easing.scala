package typingsJapgolly.senchaTouch.Ext.fx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object easing {
  
  trait IAbstract
    extends StObject
       with IBase {
    
    /** [Method] Returns the value of startTime
      * @returns Number
      */
    var getStartTime: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of startValue
      * @returns Number
      */
    var getStartValue: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Sets the value of startTime
      * @param startTime Number The new value.
      */
    var setStartTime: js.UndefOr[js.Function1[/* startTime */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of startValue
      * @param startValue Number The new value.
      */
    var setStartValue: js.UndefOr[js.Function1[/* startValue */ js.UndefOr[Double], Unit]] = js.undefined
  }
  object IAbstract {
    
    inline def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    extension [Self <: IAbstract](x: Self) {
      
      inline def setGetStartTime(value: CallbackTo[Double]): Self = StObject.set(x, "getStartTime", value.toJsFn)
      
      inline def setGetStartTimeUndefined: Self = StObject.set(x, "getStartTime", js.undefined)
      
      inline def setGetStartValue(value: CallbackTo[Double]): Self = StObject.set(x, "getStartValue", value.toJsFn)
      
      inline def setGetStartValueUndefined: Self = StObject.set(x, "getStartValue", js.undefined)
      
      inline def setSetStartTime(value: /* startTime */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setStartTime", js.Any.fromFunction1((t0: /* startTime */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetStartTimeUndefined: Self = StObject.set(x, "setStartTime", js.undefined)
      
      inline def setSetStartValue(value: /* startValue */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setStartValue", js.Any.fromFunction1((t0: /* startValue */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetStartValueUndefined: Self = StObject.set(x, "setStartValue", js.undefined)
    }
  }
  
  trait IBounce
    extends StObject
       with IAbstract {
    
    /** [Method] Returns the value of acceleration
      * @returns Number
      */
    var getAcceleration: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of springTension
      * @returns Number
      */
    var getSpringTension: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of startVelocity
      * @returns Number
      */
    var getStartVelocity: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Sets the value of acceleration
      * @param acceleration Number The new value.
      */
    var setAcceleration: js.UndefOr[js.Function1[/* acceleration */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of springTension
      * @param springTension Number The new value.
      */
    var setSpringTension: js.UndefOr[js.Function1[/* springTension */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of startVelocity
      * @param startVelocity Number The new value.
      */
    var setStartVelocity: js.UndefOr[js.Function1[/* startVelocity */ js.UndefOr[Double], Unit]] = js.undefined
  }
  object IBounce {
    
    inline def apply(): IBounce = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBounce]
    }
    
    extension [Self <: IBounce](x: Self) {
      
      inline def setGetAcceleration(value: CallbackTo[Double]): Self = StObject.set(x, "getAcceleration", value.toJsFn)
      
      inline def setGetAccelerationUndefined: Self = StObject.set(x, "getAcceleration", js.undefined)
      
      inline def setGetSpringTension(value: CallbackTo[Double]): Self = StObject.set(x, "getSpringTension", value.toJsFn)
      
      inline def setGetSpringTensionUndefined: Self = StObject.set(x, "getSpringTension", js.undefined)
      
      inline def setGetStartVelocity(value: CallbackTo[Double]): Self = StObject.set(x, "getStartVelocity", value.toJsFn)
      
      inline def setGetStartVelocityUndefined: Self = StObject.set(x, "getStartVelocity", js.undefined)
      
      inline def setSetAcceleration(value: /* acceleration */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setAcceleration", js.Any.fromFunction1((t0: /* acceleration */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetAccelerationUndefined: Self = StObject.set(x, "setAcceleration", js.undefined)
      
      inline def setSetSpringTension(value: /* springTension */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setSpringTension", js.Any.fromFunction1((t0: /* springTension */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetSpringTensionUndefined: Self = StObject.set(x, "setSpringTension", js.undefined)
      
      inline def setSetStartVelocity(value: /* startVelocity */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setStartVelocity", js.Any.fromFunction1((t0: /* startVelocity */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetStartVelocityUndefined: Self = StObject.set(x, "setStartVelocity", js.undefined)
    }
  }
  
  trait IBoundMomentum
    extends StObject
       with IAbstract {
    
    /** [Config Option] (Object) */
    var bounce: js.UndefOr[Any] = js.undefined
    
    /** [Method] Returns the value of bounce
      * @returns Object
      */
    var getBounce: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of maxMomentumValue
      * @returns Number
      */
    var getMaxMomentumValue: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of minMomentumValue
      * @returns Number
      */
    var getMinMomentumValue: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of minVelocity
      * @returns Number
      */
    var getMinVelocity: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of momentum
      * @returns Object
      */
    var getMomentum: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of startVelocity
      * @returns Number
      */
    var getStartVelocity: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Config Option] (Number) */
    var minVelocity: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Object) */
    var momentum: js.UndefOr[Any] = js.undefined
    
    /** [Method] Sets the value of bounce
      * @param bounce Object The new value.
      */
    var setBounce: js.UndefOr[js.Function1[/* bounce */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of maxMomentumValue
      * @param maxMomentumValue Number The new value.
      */
    var setMaxMomentumValue: js.UndefOr[js.Function1[/* maxMomentumValue */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of minMomentumValue
      * @param minMomentumValue Number The new value.
      */
    var setMinMomentumValue: js.UndefOr[js.Function1[/* minMomentumValue */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of minVelocity
      * @param minVelocity Number The new value.
      */
    var setMinVelocity: js.UndefOr[js.Function1[/* minVelocity */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of momentum
      * @param momentum Object The new value.
      */
    var setMomentum: js.UndefOr[js.Function1[/* momentum */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of startVelocity
      * @param startVelocity Number The new value.
      */
    var setStartVelocity: js.UndefOr[js.Function1[/* startVelocity */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Config Option] (Number) */
    var startVelocity: js.UndefOr[Double] = js.undefined
  }
  object IBoundMomentum {
    
    inline def apply(): IBoundMomentum = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBoundMomentum]
    }
    
    extension [Self <: IBoundMomentum](x: Self) {
      
      inline def setBounce(value: Any): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
      
      inline def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
      
      inline def setGetBounce(value: CallbackTo[Any]): Self = StObject.set(x, "getBounce", value.toJsFn)
      
      inline def setGetBounceUndefined: Self = StObject.set(x, "getBounce", js.undefined)
      
      inline def setGetMaxMomentumValue(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxMomentumValue", value.toJsFn)
      
      inline def setGetMaxMomentumValueUndefined: Self = StObject.set(x, "getMaxMomentumValue", js.undefined)
      
      inline def setGetMinMomentumValue(value: CallbackTo[Double]): Self = StObject.set(x, "getMinMomentumValue", value.toJsFn)
      
      inline def setGetMinMomentumValueUndefined: Self = StObject.set(x, "getMinMomentumValue", js.undefined)
      
      inline def setGetMinVelocity(value: CallbackTo[Double]): Self = StObject.set(x, "getMinVelocity", value.toJsFn)
      
      inline def setGetMinVelocityUndefined: Self = StObject.set(x, "getMinVelocity", js.undefined)
      
      inline def setGetMomentum(value: CallbackTo[Any]): Self = StObject.set(x, "getMomentum", value.toJsFn)
      
      inline def setGetMomentumUndefined: Self = StObject.set(x, "getMomentum", js.undefined)
      
      inline def setGetStartVelocity(value: CallbackTo[Double]): Self = StObject.set(x, "getStartVelocity", value.toJsFn)
      
      inline def setGetStartVelocityUndefined: Self = StObject.set(x, "getStartVelocity", js.undefined)
      
      inline def setMinVelocity(value: Double): Self = StObject.set(x, "minVelocity", value.asInstanceOf[js.Any])
      
      inline def setMinVelocityUndefined: Self = StObject.set(x, "minVelocity", js.undefined)
      
      inline def setMomentum(value: Any): Self = StObject.set(x, "momentum", value.asInstanceOf[js.Any])
      
      inline def setMomentumUndefined: Self = StObject.set(x, "momentum", js.undefined)
      
      inline def setSetBounce(value: /* bounce */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setBounce", js.Any.fromFunction1((t0: /* bounce */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetBounceUndefined: Self = StObject.set(x, "setBounce", js.undefined)
      
      inline def setSetMaxMomentumValue(value: /* maxMomentumValue */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setMaxMomentumValue", js.Any.fromFunction1((t0: /* maxMomentumValue */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetMaxMomentumValueUndefined: Self = StObject.set(x, "setMaxMomentumValue", js.undefined)
      
      inline def setSetMinMomentumValue(value: /* minMomentumValue */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setMinMomentumValue", js.Any.fromFunction1((t0: /* minMomentumValue */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetMinMomentumValueUndefined: Self = StObject.set(x, "setMinMomentumValue", js.undefined)
      
      inline def setSetMinVelocity(value: /* minVelocity */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setMinVelocity", js.Any.fromFunction1((t0: /* minVelocity */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetMinVelocityUndefined: Self = StObject.set(x, "setMinVelocity", js.undefined)
      
      inline def setSetMomentum(value: /* momentum */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setMomentum", js.Any.fromFunction1((t0: /* momentum */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetMomentumUndefined: Self = StObject.set(x, "setMomentum", js.undefined)
      
      inline def setSetStartVelocity(value: /* startVelocity */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setStartVelocity", js.Any.fromFunction1((t0: /* startVelocity */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetStartVelocityUndefined: Self = StObject.set(x, "setStartVelocity", js.undefined)
      
      inline def setStartVelocity(value: Double): Self = StObject.set(x, "startVelocity", value.asInstanceOf[js.Any])
      
      inline def setStartVelocityUndefined: Self = StObject.set(x, "startVelocity", js.undefined)
    }
  }
  
  trait IEaseIn
    extends StObject
       with ILinear {
    
    /** [Method] Returns the value of exponent
      * @returns Number
      */
    var getExponent: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Sets the value of exponent
      * @param exponent Number The new value.
      */
    var setExponent: js.UndefOr[js.Function1[/* exponent */ js.UndefOr[Double], Unit]] = js.undefined
  }
  object IEaseIn {
    
    inline def apply(): IEaseIn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEaseIn]
    }
    
    extension [Self <: IEaseIn](x: Self) {
      
      inline def setGetExponent(value: CallbackTo[Double]): Self = StObject.set(x, "getExponent", value.toJsFn)
      
      inline def setGetExponentUndefined: Self = StObject.set(x, "getExponent", js.undefined)
      
      inline def setSetExponent(value: /* exponent */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setExponent", js.Any.fromFunction1((t0: /* exponent */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetExponentUndefined: Self = StObject.set(x, "setExponent", js.undefined)
    }
  }
  
  trait IEaseOut
    extends StObject
       with ILinear {
    
    /** [Method] Returns the value of exponent
      * @returns Number
      */
    var getExponent: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Sets the value of exponent
      * @param exponent Number The new value.
      */
    var setExponent: js.UndefOr[js.Function1[/* exponent */ js.UndefOr[Double], Unit]] = js.undefined
  }
  object IEaseOut {
    
    inline def apply(): IEaseOut = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEaseOut]
    }
    
    extension [Self <: IEaseOut](x: Self) {
      
      inline def setGetExponent(value: CallbackTo[Double]): Self = StObject.set(x, "getExponent", value.toJsFn)
      
      inline def setGetExponentUndefined: Self = StObject.set(x, "getExponent", js.undefined)
      
      inline def setSetExponent(value: /* exponent */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setExponent", js.Any.fromFunction1((t0: /* exponent */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetExponentUndefined: Self = StObject.set(x, "setExponent", js.undefined)
    }
  }
  
  trait ILinear
    extends StObject
       with IAbstract {
    
    /** [Method] Returns the value of duration
      * @returns Number
      */
    var getDuration: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of endValue
      * @returns Number
      */
    var getEndValue: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Sets the value of duration
      * @param duration Number The new value.
      */
    var setDuration: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of endValue
      * @param endValue Number The new value.
      */
    var setEndValue: js.UndefOr[js.Function1[/* endValue */ js.UndefOr[Double], Unit]] = js.undefined
  }
  object ILinear {
    
    inline def apply(): ILinear = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILinear]
    }
    
    extension [Self <: ILinear](x: Self) {
      
      inline def setGetDuration(value: CallbackTo[Double]): Self = StObject.set(x, "getDuration", value.toJsFn)
      
      inline def setGetDurationUndefined: Self = StObject.set(x, "getDuration", js.undefined)
      
      inline def setGetEndValue(value: CallbackTo[Double]): Self = StObject.set(x, "getEndValue", value.toJsFn)
      
      inline def setGetEndValueUndefined: Self = StObject.set(x, "getEndValue", js.undefined)
      
      inline def setSetDuration(value: /* duration */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setDuration", js.Any.fromFunction1((t0: /* duration */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetDurationUndefined: Self = StObject.set(x, "setDuration", js.undefined)
      
      inline def setSetEndValue(value: /* endValue */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setEndValue", js.Any.fromFunction1((t0: /* endValue */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetEndValueUndefined: Self = StObject.set(x, "setEndValue", js.undefined)
    }
  }
  
  trait IMomentum
    extends StObject
       with IAbstract {
    
    /** [Method] Returns the value of acceleration
      * @returns Number
      */
    var getAcceleration: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of friction
      * @returns Number
      */
    var getFriction: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of startVelocity
      * @returns Number
      */
    var getStartVelocity: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Sets the value of acceleration
      * @param acceleration Number The new value.
      */
    var setAcceleration: js.UndefOr[js.Function1[/* acceleration */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of friction
      * @param friction Number The new value.
      */
    var setFriction: js.UndefOr[js.Function1[/* friction */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of startVelocity
      * @param startVelocity Number The new value.
      */
    var setStartVelocity: js.UndefOr[js.Function1[/* startVelocity */ js.UndefOr[Double], Unit]] = js.undefined
  }
  object IMomentum {
    
    inline def apply(): IMomentum = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMomentum]
    }
    
    extension [Self <: IMomentum](x: Self) {
      
      inline def setGetAcceleration(value: CallbackTo[Double]): Self = StObject.set(x, "getAcceleration", value.toJsFn)
      
      inline def setGetAccelerationUndefined: Self = StObject.set(x, "getAcceleration", js.undefined)
      
      inline def setGetFriction(value: CallbackTo[Double]): Self = StObject.set(x, "getFriction", value.toJsFn)
      
      inline def setGetFrictionUndefined: Self = StObject.set(x, "getFriction", js.undefined)
      
      inline def setGetStartVelocity(value: CallbackTo[Double]): Self = StObject.set(x, "getStartVelocity", value.toJsFn)
      
      inline def setGetStartVelocityUndefined: Self = StObject.set(x, "getStartVelocity", js.undefined)
      
      inline def setSetAcceleration(value: /* acceleration */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setAcceleration", js.Any.fromFunction1((t0: /* acceleration */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetAccelerationUndefined: Self = StObject.set(x, "setAcceleration", js.undefined)
      
      inline def setSetFriction(value: /* friction */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setFriction", js.Any.fromFunction1((t0: /* friction */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetFrictionUndefined: Self = StObject.set(x, "setFriction", js.undefined)
      
      inline def setSetStartVelocity(value: /* startVelocity */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setStartVelocity", js.Any.fromFunction1((t0: /* startVelocity */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetStartVelocityUndefined: Self = StObject.set(x, "setStartVelocity", js.undefined)
    }
  }
}
