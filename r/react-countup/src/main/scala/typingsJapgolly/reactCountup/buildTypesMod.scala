package typingsJapgolly.reactCountup

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import typingsJapgolly.countupJs.mod.CountUp
import typingsJapgolly.countupJs.mod.CountUpOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesMod {
  
  trait CallbackProps extends StObject {
    
    var onEnd: js.UndefOr[OnEndCallback] = js.undefined
    
    var onPauseResume: js.UndefOr[OnPauseResumeCallback] = js.undefined
    
    var onReset: js.UndefOr[OnResetCallback] = js.undefined
    
    var onStart: js.UndefOr[OnStartCallback] = js.undefined
    
    var onUpdate: js.UndefOr[OnUpdateCallback] = js.undefined
  }
  object CallbackProps {
    
    inline def apply(): CallbackProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallbackProps]
    }
    
    extension [Self <: CallbackProps](x: Self) {
      
      inline def setOnEnd(value: /* args */ OnEndArgs => Callback): Self = StObject.set(x, "onEnd", js.Any.fromFunction1((t0: /* args */ OnEndArgs) => value(t0).runNow()))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnPauseResume(value: /* args */ OnPauseResumeArgs => Callback): Self = StObject.set(x, "onPauseResume", js.Any.fromFunction1((t0: /* args */ OnPauseResumeArgs) => value(t0).runNow()))
      
      inline def setOnPauseResumeUndefined: Self = StObject.set(x, "onPauseResume", js.undefined)
      
      inline def setOnReset(value: /* args */ OnResetArgs => Callback): Self = StObject.set(x, "onReset", js.Any.fromFunction1((t0: /* args */ OnResetArgs) => value(t0).runNow()))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnStart(value: /* args */ OnStartArgs => Callback): Self = StObject.set(x, "onStart", js.Any.fromFunction1((t0: /* args */ OnStartArgs) => value(t0).runNow()))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setOnUpdate(value: /* args */ OnUpdateArgs => Callback): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1((t0: /* args */ OnUpdateArgs) => value(t0).runNow()))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    }
  }
  
  trait CommonProps
    extends StObject
       with CountUpInstanceProps {
    
    var delay: js.UndefOr[Double | Null] = js.undefined
  }
  object CommonProps {
    
    inline def apply(end: Double): CommonProps = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonProps]
    }
    
    extension [Self <: CommonProps](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayNull: Self = StObject.set(x, "delay", null)
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    }
  }
  
  trait CountUpApi extends StObject {
    
    var getCountUp: GetCountUpFn
    
    var pauseResume: VoidFn
    
    var reset: VoidFn
    
    var start: VoidFn
    
    var update: UpdateFn
  }
  object CountUpApi {
    
    inline def apply(
      getCountUp: /* recreate */ js.UndefOr[Boolean] => CountUp,
      pauseResume: Callback,
      reset: Callback,
      start: Callback,
      update: /* newEnd */ String | Double => Callback
    ): CountUpApi = {
      val __obj = js.Dynamic.literal(getCountUp = js.Any.fromFunction1(getCountUp), pauseResume = pauseResume.toJsFn, reset = reset.toJsFn, start = start.toJsFn, update = js.Any.fromFunction1((t0: /* newEnd */ String | Double) => update(t0).runNow()))
      __obj.asInstanceOf[CountUpApi]
    }
    
    extension [Self <: CountUpApi](x: Self) {
      
      inline def setGetCountUp(value: /* recreate */ js.UndefOr[Boolean] => CountUp): Self = StObject.set(x, "getCountUp", js.Any.fromFunction1(value))
      
      inline def setPauseResume(value: Callback): Self = StObject.set(x, "pauseResume", value.toJsFn)
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setUpdate(value: /* newEnd */ String | Double => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: /* newEnd */ String | Double) => value(t0).runNow()))
    }
  }
  
  trait CountUpInstanceProps
    extends StObject
       with CountUpOptions {
    
    var decimals: js.UndefOr[Double] = js.undefined
    
    var end: Double
    
    var start: js.UndefOr[Double] = js.undefined
  }
  object CountUpInstanceProps {
    
    inline def apply(end: Double): CountUpInstanceProps = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountUpInstanceProps]
    }
    
    extension [Self <: CountUpInstanceProps](x: Self) {
      
      inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
      
      inline def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  type GetCountUpFn = js.Function1[/* recreate */ js.UndefOr[Boolean], CountUp]
  
  trait OnEndArgs extends StObject {
    
    var pauseResume: VoidFn
    
    var reset: VoidFn
    
    var start: VoidFn
    
    var update: UpdateFn
  }
  object OnEndArgs {
    
    inline def apply(
      pauseResume: Callback,
      reset: Callback,
      start: Callback,
      update: /* newEnd */ String | Double => Callback
    ): OnEndArgs = {
      val __obj = js.Dynamic.literal(pauseResume = pauseResume.toJsFn, reset = reset.toJsFn, start = start.toJsFn, update = js.Any.fromFunction1((t0: /* newEnd */ String | Double) => update(t0).runNow()))
      __obj.asInstanceOf[OnEndArgs]
    }
    
    extension [Self <: OnEndArgs](x: Self) {
      
      inline def setPauseResume(value: Callback): Self = StObject.set(x, "pauseResume", value.toJsFn)
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setUpdate(value: /* newEnd */ String | Double => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: /* newEnd */ String | Double) => value(t0).runNow()))
    }
  }
  
  type OnEndCallback = js.Function1[/* args */ OnEndArgs, Unit]
  
  trait OnPauseResumeArgs extends StObject {
    
    var reset: VoidFn
    
    var start: VoidFn
    
    var update: UpdateFn
  }
  object OnPauseResumeArgs {
    
    inline def apply(reset: Callback, start: Callback, update: /* newEnd */ String | Double => Callback): OnPauseResumeArgs = {
      val __obj = js.Dynamic.literal(reset = reset.toJsFn, start = start.toJsFn, update = js.Any.fromFunction1((t0: /* newEnd */ String | Double) => update(t0).runNow()))
      __obj.asInstanceOf[OnPauseResumeArgs]
    }
    
    extension [Self <: OnPauseResumeArgs](x: Self) {
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setUpdate(value: /* newEnd */ String | Double => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: /* newEnd */ String | Double) => value(t0).runNow()))
    }
  }
  
  type OnPauseResumeCallback = js.Function1[/* args */ OnPauseResumeArgs, Unit]
  
  trait OnResetArgs extends StObject {
    
    var pauseResume: VoidFn
    
    var start: VoidFn
    
    var update: UpdateFn
  }
  object OnResetArgs {
    
    inline def apply(pauseResume: Callback, start: Callback, update: /* newEnd */ String | Double => Callback): OnResetArgs = {
      val __obj = js.Dynamic.literal(pauseResume = pauseResume.toJsFn, start = start.toJsFn, update = js.Any.fromFunction1((t0: /* newEnd */ String | Double) => update(t0).runNow()))
      __obj.asInstanceOf[OnResetArgs]
    }
    
    extension [Self <: OnResetArgs](x: Self) {
      
      inline def setPauseResume(value: Callback): Self = StObject.set(x, "pauseResume", value.toJsFn)
      
      inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setUpdate(value: /* newEnd */ String | Double => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: /* newEnd */ String | Double) => value(t0).runNow()))
    }
  }
  
  type OnResetCallback = js.Function1[/* args */ OnResetArgs, Unit]
  
  trait OnStartArgs extends StObject {
    
    var pauseResume: VoidFn
    
    var reset: VoidFn
    
    var update: UpdateFn
  }
  object OnStartArgs {
    
    inline def apply(pauseResume: Callback, reset: Callback, update: /* newEnd */ String | Double => Callback): OnStartArgs = {
      val __obj = js.Dynamic.literal(pauseResume = pauseResume.toJsFn, reset = reset.toJsFn, update = js.Any.fromFunction1((t0: /* newEnd */ String | Double) => update(t0).runNow()))
      __obj.asInstanceOf[OnStartArgs]
    }
    
    extension [Self <: OnStartArgs](x: Self) {
      
      inline def setPauseResume(value: Callback): Self = StObject.set(x, "pauseResume", value.toJsFn)
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setUpdate(value: /* newEnd */ String | Double => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: /* newEnd */ String | Double) => value(t0).runNow()))
    }
  }
  
  type OnStartCallback = js.Function1[/* args */ OnStartArgs, Unit]
  
  trait OnUpdateArgs extends StObject {
    
    var pauseResume: VoidFn
    
    var reset: VoidFn
    
    var start: VoidFn
  }
  object OnUpdateArgs {
    
    inline def apply(pauseResume: Callback, reset: Callback, start: Callback): OnUpdateArgs = {
      val __obj = js.Dynamic.literal(pauseResume = pauseResume.toJsFn, reset = reset.toJsFn, start = start.toJsFn)
      __obj.asInstanceOf[OnUpdateArgs]
    }
    
    extension [Self <: OnUpdateArgs](x: Self) {
      
      inline def setPauseResume(value: Callback): Self = StObject.set(x, "pauseResume", value.toJsFn)
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
    }
  }
  
  type OnUpdateCallback = js.Function1[/* args */ OnUpdateArgs, Unit]
  
  trait RenderCounterProps
    extends StObject
       with CountUpApi {
    
    var countUpRef: RefHandle[HTMLElement]
  }
  object RenderCounterProps {
    
    inline def apply(
      countUpRef: RefHandle[HTMLElement],
      getCountUp: /* recreate */ js.UndefOr[Boolean] => CountUp,
      pauseResume: Callback,
      reset: Callback,
      start: Callback,
      update: /* newEnd */ String | Double => Callback
    ): RenderCounterProps = {
      val __obj = js.Dynamic.literal(countUpRef = countUpRef.asInstanceOf[js.Any], getCountUp = js.Any.fromFunction1(getCountUp), pauseResume = pauseResume.toJsFn, reset = reset.toJsFn, start = start.toJsFn, update = js.Any.fromFunction1((t0: /* newEnd */ String | Double) => update(t0).runNow()))
      __obj.asInstanceOf[RenderCounterProps]
    }
    
    extension [Self <: RenderCounterProps](x: Self) {
      
      inline def setCountUpRef(value: RefHandle[HTMLElement]): Self = StObject.set(x, "countUpRef", value.asInstanceOf[js.Any])
    }
  }
  
  type UpdateFn = js.Function1[/* newEnd */ String | Double, Unit]
  
  type VoidFn = js.Function0[Unit]
}
