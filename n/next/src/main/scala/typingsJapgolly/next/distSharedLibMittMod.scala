package typingsJapgolly.next

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibMittMod {
  
  @JSImport("next/dist/shared/lib/mitt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): MittEmitter[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[MittEmitter[String]]
  
  @js.native
  trait Handler extends StObject {
    
    def apply(evts: Any*): Unit = js.native
  }
  
  trait MittEmitter[T] extends StObject {
    
    def emit(`type`: T, evts: Any*): Unit
    
    def off(`type`: T, handler: Handler): Unit
    
    def on(`type`: T, handler: Handler): Unit
  }
  object MittEmitter {
    
    inline def apply[T](
      emit: (T, /* repeated */ Any) => Callback,
      off: (T, Handler) => Callback,
      on: (T, Handler) => Callback
    ): MittEmitter[T] = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2((t0: T, t1: /* repeated */ Any) => (emit(t0, t1)).runNow()), off = js.Any.fromFunction2((t0: T, t1: Handler) => (off(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: T, t1: Handler) => (on(t0, t1)).runNow()))
      __obj.asInstanceOf[MittEmitter[T]]
    }
    
    extension [Self <: MittEmitter[?], T](x: Self & MittEmitter[T]) {
      
      inline def setEmit(value: (T, /* repeated */ Any) => Callback): Self = StObject.set(x, "emit", js.Any.fromFunction2((t0: T, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
      
      inline def setOff(value: (T, Handler) => Callback): Self = StObject.set(x, "off", js.Any.fromFunction2((t0: T, t1: Handler) => (value(t0, t1)).runNow()))
      
      inline def setOn(value: (T, Handler) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: T, t1: Handler) => (value(t0, t1)).runNow()))
    }
  }
}
