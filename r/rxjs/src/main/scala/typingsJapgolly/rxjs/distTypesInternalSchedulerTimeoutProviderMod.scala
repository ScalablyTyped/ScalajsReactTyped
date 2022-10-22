package typingsJapgolly.rxjs

import japgolly.scalajs.react.Callback
import typingsJapgolly.rxjs.anon.ClearTimeout
import typingsJapgolly.rxjs.distTypesInternalSchedulerTimerHandleMod.TimerHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalSchedulerTimeoutProviderMod {
  
  @JSImport("rxjs/dist/types/internal/scheduler/timeoutProvider", "timeoutProvider")
  @js.native
  val timeoutProvider: TimeoutProvider_ = js.native
  
  type ClearTimeoutFunction = js.Function1[/* handle */ TimerHandle, Unit]
  
  @js.native
  trait SetTimeoutFunction extends StObject {
    
    def apply(handler: js.Function0[Unit], timeout: Double, args: Any*): TimerHandle = js.native
    def apply(handler: js.Function0[Unit], timeout: Unit, args: Any*): TimerHandle = js.native
  }
  
  trait TimeoutProvider_ extends StObject {
    
    def clearTimeout(handle: TimerHandle): Unit
    @JSName("clearTimeout")
    var clearTimeout_Original: ClearTimeoutFunction
    
    var delegate: js.UndefOr[ClearTimeout] = js.undefined
    
    def setTimeout(handler: js.Function0[Unit], timeout: Double, args: Any*): TimerHandle
    def setTimeout(handler: js.Function0[Unit], timeout: Unit, args: Any*): TimerHandle
    @JSName("setTimeout")
    var setTimeout_Original: SetTimeoutFunction
  }
  object TimeoutProvider_ {
    
    inline def apply(clearTimeout: /* handle */ TimerHandle => Callback, setTimeout: SetTimeoutFunction): TimeoutProvider_ = {
      val __obj = js.Dynamic.literal(clearTimeout = js.Any.fromFunction1((t0: /* handle */ TimerHandle) => clearTimeout(t0).runNow()), setTimeout = setTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeoutProvider_]
    }
    
    extension [Self <: TimeoutProvider_](x: Self) {
      
      inline def setClearTimeout(value: /* handle */ TimerHandle => Callback): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction1((t0: /* handle */ TimerHandle) => value(t0).runNow()))
      
      inline def setDelegate(value: ClearTimeout): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
      
      inline def setSetTimeout(value: SetTimeoutFunction): Self = StObject.set(x, "setTimeout", value.asInstanceOf[js.Any])
    }
  }
}
