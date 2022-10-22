package typingsJapgolly.nextServer

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibMittMod {
  
  @JSImport("next-server/dist/lib/mitt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): MittEmitter = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[MittEmitter]
  
  @js.native
  trait Handler extends StObject {
    
    def apply(evts: Any*): Unit = js.native
  }
  
  trait MittEmitter extends StObject {
    
    def emit(`type`: String, evts: Any*): Unit
    
    def off(`type`: String, handler: Handler): Unit
    
    def on(`type`: String, handler: Handler): Unit
  }
  object MittEmitter {
    
    inline def apply(
      emit: (String, /* repeated */ Any) => Callback,
      off: (String, Handler) => Callback,
      on: (String, Handler) => Callback
    ): MittEmitter = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (emit(t0, t1)).runNow()), off = js.Any.fromFunction2((t0: String, t1: Handler) => (off(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: String, t1: Handler) => (on(t0, t1)).runNow()))
      __obj.asInstanceOf[MittEmitter]
    }
    
    extension [Self <: MittEmitter](x: Self) {
      
      inline def setEmit(value: (String, /* repeated */ Any) => Callback): Self = StObject.set(x, "emit", js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
      
      inline def setOff(value: (String, Handler) => Callback): Self = StObject.set(x, "off", js.Any.fromFunction2((t0: String, t1: Handler) => (value(t0, t1)).runNow()))
      
      inline def setOn(value: (String, Handler) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: String, t1: Handler) => (value(t0, t1)).runNow()))
    }
  }
}
