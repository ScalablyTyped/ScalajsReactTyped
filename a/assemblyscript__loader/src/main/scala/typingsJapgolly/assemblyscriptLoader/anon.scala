package typingsJapgolly.assemblyscriptLoader

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.assemblyscriptLoader.mod.ASUtil
import typingsJapgolly.std.Record
import typingsJapgolly.std.WebAssembly.Memory
import typingsJapgolly.std.WebAssembly.Table
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Abort extends StObject {
    
    var abort: js.UndefOr[
        js.Function4[/* msg */ Double, /* file */ Double, /* line */ Double, /* column */ Double, Unit]
      ] = js.undefined
    
    var mark: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var memory: js.UndefOr[Memory] = js.undefined
    
    var seed: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var table: js.UndefOr[Table] = js.undefined
    
    var trace: js.UndefOr[
        js.Function3[/* msg */ Double, /* numArgs */ js.UndefOr[Double], /* repeated */ Double, Unit]
      ] = js.undefined
  }
  object Abort {
    
    inline def apply(): Abort = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Abort]
    }
    
    extension [Self <: Abort](x: Self) {
      
      inline def setAbort(value: (/* msg */ Double, /* file */ Double, /* line */ Double, /* column */ Double) => Callback): Self = StObject.set(x, "abort", js.Any.fromFunction4((t0: /* msg */ Double, t1: /* file */ Double, t2: /* line */ Double, t3: /* column */ Double) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
      
      inline def setMark(value: Callback): Self = StObject.set(x, "mark", value.toJsFn)
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setMemory(value: Memory): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
      
      inline def setSeed(value: CallbackTo[Double]): Self = StObject.set(x, "seed", value.toJsFn)
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      inline def setTable(value: Table): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      inline def setTrace(value: (/* msg */ Double, /* numArgs */ js.UndefOr[Double], /* repeated */ Double) => Callback): Self = StObject.set(x, "trace", js.Any.fromFunction3((t0: /* msg */ Double, t1: /* numArgs */ js.UndefOr[Double], t2: /* repeated */ Double) => (value(t0, t1, t2)).runNow()))
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    }
  }
  
  trait Exports[T /* <: Record[String, Any] */] extends StObject {
    
    var exports: ASUtil & T
  }
  object Exports {
    
    inline def apply[T /* <: Record[String, Any] */](exports: ASUtil & T): Exports[T] = {
      val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exports[T]]
    }
    
    extension [Self <: Exports[?], T /* <: Record[String, Any] */](x: Self & Exports[T]) {
      
      inline def setExports(value: ASUtil & T): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    }
  }
}
