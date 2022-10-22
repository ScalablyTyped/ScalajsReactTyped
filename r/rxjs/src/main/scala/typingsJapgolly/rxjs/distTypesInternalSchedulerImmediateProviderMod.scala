package typingsJapgolly.rxjs

import japgolly.scalajs.react.Callback
import typingsJapgolly.rxjs.anon.ClearImmediate
import typingsJapgolly.rxjs.distTypesInternalSchedulerTimerHandleMod.TimerHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalSchedulerImmediateProviderMod {
  
  @JSImport("rxjs/dist/types/internal/scheduler/immediateProvider", "immediateProvider")
  @js.native
  val immediateProvider: ImmediateProvider_ = js.native
  
  type ClearImmediateFunction = js.Function1[/* handle */ TimerHandle, Unit]
  
  trait ImmediateProvider_ extends StObject {
    
    def clearImmediate(handle: TimerHandle): Unit
    @JSName("clearImmediate")
    var clearImmediate_Original: ClearImmediateFunction
    
    var delegate: js.UndefOr[ClearImmediate] = js.undefined
    
    def setImmediate(handler: js.Function0[Unit], args: Any*): TimerHandle
    @JSName("setImmediate")
    var setImmediate_Original: SetImmediateFunction
  }
  object ImmediateProvider_ {
    
    inline def apply(clearImmediate: /* handle */ TimerHandle => Callback, setImmediate: SetImmediateFunction): ImmediateProvider_ = {
      val __obj = js.Dynamic.literal(clearImmediate = js.Any.fromFunction1((t0: /* handle */ TimerHandle) => clearImmediate(t0).runNow()), setImmediate = setImmediate.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImmediateProvider_]
    }
    
    extension [Self <: ImmediateProvider_](x: Self) {
      
      inline def setClearImmediate(value: /* handle */ TimerHandle => Callback): Self = StObject.set(x, "clearImmediate", js.Any.fromFunction1((t0: /* handle */ TimerHandle) => value(t0).runNow()))
      
      inline def setDelegate(value: ClearImmediate): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
      
      inline def setSetImmediate(value: SetImmediateFunction): Self = StObject.set(x, "setImmediate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SetImmediateFunction extends StObject {
    
    def apply(handler: js.Function0[Unit], args: Any*): TimerHandle = js.native
  }
}
