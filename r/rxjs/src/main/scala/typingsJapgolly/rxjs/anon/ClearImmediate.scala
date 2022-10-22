package typingsJapgolly.rxjs.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.rxjs.distTypesInternalSchedulerImmediateProviderMod.ClearImmediateFunction
import typingsJapgolly.rxjs.distTypesInternalSchedulerImmediateProviderMod.SetImmediateFunction
import typingsJapgolly.rxjs.distTypesInternalSchedulerTimerHandleMod.TimerHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearImmediate extends StObject {
  
  def clearImmediate(handle: TimerHandle): Unit
  @JSName("clearImmediate")
  var clearImmediate_Original: ClearImmediateFunction
  
  def setImmediate(handler: js.Function0[Unit], args: Any*): TimerHandle
  @JSName("setImmediate")
  var setImmediate_Original: SetImmediateFunction
}
object ClearImmediate {
  
  inline def apply(clearImmediate: /* handle */ TimerHandle => Callback, setImmediate: SetImmediateFunction): ClearImmediate = {
    val __obj = js.Dynamic.literal(clearImmediate = js.Any.fromFunction1((t0: /* handle */ TimerHandle) => clearImmediate(t0).runNow()), setImmediate = setImmediate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearImmediate]
  }
  
  extension [Self <: ClearImmediate](x: Self) {
    
    inline def setClearImmediate(value: /* handle */ TimerHandle => Callback): Self = StObject.set(x, "clearImmediate", js.Any.fromFunction1((t0: /* handle */ TimerHandle) => value(t0).runNow()))
    
    inline def setSetImmediate(value: SetImmediateFunction): Self = StObject.set(x, "setImmediate", value.asInstanceOf[js.Any])
  }
}
