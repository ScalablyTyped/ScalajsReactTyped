package typingsJapgolly.rxjs.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.rxjs.distTypesInternalSchedulerTimeoutProviderMod.ClearTimeoutFunction
import typingsJapgolly.rxjs.distTypesInternalSchedulerTimeoutProviderMod.SetTimeoutFunction
import typingsJapgolly.rxjs.distTypesInternalSchedulerTimerHandleMod.TimerHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearTimeout extends StObject {
  
  def clearTimeout(handle: TimerHandle): Unit
  @JSName("clearTimeout")
  var clearTimeout_Original: ClearTimeoutFunction
  
  def setTimeout(handler: js.Function0[Unit], timeout: Double, args: Any*): TimerHandle
  def setTimeout(handler: js.Function0[Unit], timeout: Unit, args: Any*): TimerHandle
  @JSName("setTimeout")
  var setTimeout_Original: SetTimeoutFunction
}
object ClearTimeout {
  
  inline def apply(clearTimeout: /* handle */ TimerHandle => Callback, setTimeout: SetTimeoutFunction): ClearTimeout = {
    val __obj = js.Dynamic.literal(clearTimeout = js.Any.fromFunction1((t0: /* handle */ TimerHandle) => clearTimeout(t0).runNow()), setTimeout = setTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearTimeout]
  }
  
  extension [Self <: ClearTimeout](x: Self) {
    
    inline def setClearTimeout(value: /* handle */ TimerHandle => Callback): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction1((t0: /* handle */ TimerHandle) => value(t0).runNow()))
    
    inline def setSetTimeout(value: SetTimeoutFunction): Self = StObject.set(x, "setTimeout", value.asInstanceOf[js.Any])
  }
}
