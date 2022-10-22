package typingsJapgolly.redisClient

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibClientResp2ComposersInterfaceMod {
  
  trait Composer[T] extends StObject {
    
    def end(buffer: Buffer): T
    
    def reset(): Unit
    
    def write(buffer: Buffer): Unit
  }
  object Composer {
    
    inline def apply[T](end: Buffer => T, reset: Callback, write: Buffer => Callback): Composer[T] = {
      val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), reset = reset.toJsFn, write = js.Any.fromFunction1((t0: Buffer) => write(t0).runNow()))
      __obj.asInstanceOf[Composer[T]]
    }
    
    extension [Self <: Composer[?], T](x: Self & Composer[T]) {
      
      inline def setEnd(value: Buffer => T): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setWrite(value: Buffer => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: Buffer) => value(t0).runNow()))
    }
  }
}
