package typingsJapgolly.rxjs

import japgolly.scalajs.react.Callback
import typingsJapgolly.rxjs.anon.CancelAnimationFrame
import typingsJapgolly.rxjs.distTypesInternalSubscriptionMod.Subscription
import typingsJapgolly.std.FrameRequestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalSchedulerAnimationFrameProviderMod {
  
  @JSImport("rxjs/dist/types/internal/scheduler/animationFrameProvider", "animationFrameProvider")
  @js.native
  val animationFrameProvider: AnimationFrameProvider_ = js.native
  
  trait AnimationFrameProvider_ extends StObject {
    
    def cancelAnimationFrame(handle: Double): Unit
    @JSName("cancelAnimationFrame")
    var cancelAnimationFrame_Original: js.Function1[/* handle */ Double, Unit]
    
    var delegate: js.UndefOr[CancelAnimationFrame] = js.undefined
    
    def requestAnimationFrame(callback: FrameRequestCallback): Double
    @JSName("requestAnimationFrame")
    var requestAnimationFrame_Original: js.Function1[/* callback */ FrameRequestCallback, Double]
    
    def schedule(callback: FrameRequestCallback): Subscription
  }
  object AnimationFrameProvider_ {
    
    inline def apply(
      cancelAnimationFrame: /* handle */ Double => Callback,
      requestAnimationFrame: /* callback */ FrameRequestCallback => Double,
      schedule: FrameRequestCallback => Subscription
    ): AnimationFrameProvider_ = {
      val __obj = js.Dynamic.literal(cancelAnimationFrame = js.Any.fromFunction1((t0: /* handle */ Double) => cancelAnimationFrame(t0).runNow()), requestAnimationFrame = js.Any.fromFunction1(requestAnimationFrame), schedule = js.Any.fromFunction1(schedule))
      __obj.asInstanceOf[AnimationFrameProvider_]
    }
    
    extension [Self <: AnimationFrameProvider_](x: Self) {
      
      inline def setCancelAnimationFrame(value: /* handle */ Double => Callback): Self = StObject.set(x, "cancelAnimationFrame", js.Any.fromFunction1((t0: /* handle */ Double) => value(t0).runNow()))
      
      inline def setDelegate(value: CancelAnimationFrame): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
      
      inline def setRequestAnimationFrame(value: /* callback */ FrameRequestCallback => Double): Self = StObject.set(x, "requestAnimationFrame", js.Any.fromFunction1(value))
      
      inline def setSchedule(value: FrameRequestCallback => Subscription): Self = StObject.set(x, "schedule", js.Any.fromFunction1(value))
    }
  }
}
