package typingsJapgolly.lowdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLowSyncMod {
  
  @JSImport("lowdb/lib/LowSync", "LowSync")
  @js.native
  open class LowSync[T] protected () extends StObject {
    def this(adapter: SyncAdapter[T]) = this()
    
    var adapter: SyncAdapter[T] = js.native
    
    var data: T | Null = js.native
    
    def read(): Unit = js.native
    
    def write(): Unit = js.native
  }
  
  trait SyncAdapter[T] extends StObject {
    
    def read(): T | Null
    
    def write(data: T): Unit
  }
  object SyncAdapter {
    
    inline def apply[T](read: CallbackTo[T | Null], write: T => Callback): SyncAdapter[T] = {
      val __obj = js.Dynamic.literal(read = read.toJsFn, write = js.Any.fromFunction1((t0: T) => write(t0).runNow()))
      __obj.asInstanceOf[SyncAdapter[T]]
    }
    
    extension [Self <: SyncAdapter[?], T](x: Self & SyncAdapter[T]) {
      
      inline def setRead(value: CallbackTo[T | Null]): Self = StObject.set(x, "read", value.toJsFn)
      
      inline def setWrite(value: T => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    }
  }
}
