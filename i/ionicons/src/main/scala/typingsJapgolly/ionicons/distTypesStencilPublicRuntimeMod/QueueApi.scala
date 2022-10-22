package typingsJapgolly.ionicons.distTypesStencilPublicRuntimeMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueApi extends StObject {
  
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var flush: js.UndefOr[js.Function1[/* cb */ js.UndefOr[js.Function0[Unit]], Unit]] = js.undefined
  
  def read(cb: RafCallback): Unit
  
  def tick(cb: RafCallback): Unit
  
  def write(cb: RafCallback): Unit
}
object QueueApi {
  
  inline def apply(read: RafCallback => Callback, tick: RafCallback => Callback, write: RafCallback => Callback): QueueApi = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1((t0: RafCallback) => read(t0).runNow()), tick = js.Any.fromFunction1((t0: RafCallback) => tick(t0).runNow()), write = js.Any.fromFunction1((t0: RafCallback) => write(t0).runNow()))
    __obj.asInstanceOf[QueueApi]
  }
  
  extension [Self <: QueueApi](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setFlush(value: /* cb */ js.UndefOr[js.Function0[Unit]] => Callback): Self = StObject.set(x, "flush", js.Any.fromFunction1((t0: /* cb */ js.UndefOr[js.Function0[Unit]]) => value(t0).runNow()))
    
    inline def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
    
    inline def setRead(value: RafCallback => Callback): Self = StObject.set(x, "read", js.Any.fromFunction1((t0: RafCallback) => value(t0).runNow()))
    
    inline def setTick(value: RafCallback => Callback): Self = StObject.set(x, "tick", js.Any.fromFunction1((t0: RafCallback) => value(t0).runNow()))
    
    inline def setWrite(value: RafCallback => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: RafCallback) => value(t0).runNow()))
  }
}
