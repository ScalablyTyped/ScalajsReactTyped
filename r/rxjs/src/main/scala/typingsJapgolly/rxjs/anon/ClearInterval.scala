package typingsJapgolly.rxjs.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.rxjs.distTypesInternalSchedulerIntervalProviderMod.ClearIntervalFunction
import typingsJapgolly.rxjs.distTypesInternalSchedulerIntervalProviderMod.SetIntervalFunction
import typingsJapgolly.rxjs.distTypesInternalSchedulerTimerHandleMod.TimerHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearInterval extends StObject {
  
  def clearInterval(handle: TimerHandle): Unit
  @JSName("clearInterval")
  var clearInterval_Original: ClearIntervalFunction
  
  def setInterval(handler: js.Function0[Unit], timeout: Double, args: Any*): TimerHandle
  def setInterval(handler: js.Function0[Unit], timeout: Unit, args: Any*): TimerHandle
  @JSName("setInterval")
  var setInterval_Original: SetIntervalFunction
}
object ClearInterval {
  
  inline def apply(clearInterval: /* handle */ TimerHandle => Callback, setInterval: SetIntervalFunction): ClearInterval = {
    val __obj = js.Dynamic.literal(clearInterval = js.Any.fromFunction1((t0: /* handle */ TimerHandle) => clearInterval(t0).runNow()), setInterval = setInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearInterval]
  }
  
  extension [Self <: ClearInterval](x: Self) {
    
    inline def setClearInterval(value: /* handle */ TimerHandle => Callback): Self = StObject.set(x, "clearInterval", js.Any.fromFunction1((t0: /* handle */ TimerHandle) => value(t0).runNow()))
    
    inline def setSetInterval(value: SetIntervalFunction): Self = StObject.set(x, "setInterval", value.asInstanceOf[js.Any])
  }
}
