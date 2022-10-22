package typingsJapgolly.consumableStream

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.AsyncIterable
import typingsJapgolly.std.AsyncIterator
import typingsJapgolly.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* note: abstract class */ @JSImport("consumable-stream", JSImport.Namespace)
  @js.native
  open class ^[T] ()
    extends StObject
       with ConsumableStream[T]
  
  @js.native
  trait ConsumableStream[T]
    extends StObject
       with AsyncIterator[T, Any, Unit]
       with AsyncIterable[T] {
    
    def createConsumer(): Consumer[T] = js.native
    def createConsumer(timeout: Double): Consumer[T] = js.native
    
    def next(): js.Promise[IteratorResult[T, Any]] = js.native
    def next(timeout: Double): js.Promise[IteratorResult[T, Any]] = js.native
    
    def once(): js.Promise[T] = js.native
    def once(timeout: Double): js.Promise[T] = js.native
  }
  
  trait Consumer[T] extends StObject {
    
    def next(): js.Promise[IteratorResult[T, Any]]
    
    def `return`(): Unit
  }
  object Consumer {
    
    inline def apply[T](next: CallbackTo[js.Promise[IteratorResult[T, Any]]], `return`: Callback): Consumer[T] = {
      val __obj = js.Dynamic.literal(next = next.toJsFn)
      __obj.updateDynamic("return")(`return`.toJsFn)
      __obj.asInstanceOf[Consumer[T]]
    }
    
    extension [Self <: Consumer[?], T](x: Self & Consumer[T]) {
      
      inline def setNext(value: CallbackTo[js.Promise[IteratorResult[T, Any]]]): Self = StObject.set(x, "next", value.toJsFn)
      
      inline def setReturn(value: Callback): Self = StObject.set(x, "return", value.toJsFn)
    }
  }
}
