package typingsJapgolly.asyncIterableStream

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.AsyncIterable
import typingsJapgolly.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* note: abstract class */ @JSImport("async-iterable-stream", JSImport.Namespace)
  @js.native
  open class ^[T] ()
    extends StObject
       with AsyncIterableStream[T] {
    
    /* CompleteClass */
    override def next(): js.Promise[IteratorResult[T, Any]] = js.native
    
    /* CompleteClass */
    override def `return`(): Unit = js.native
  }
  
  @js.native
  trait AsyncIterableStream[T]
    extends StObject
       with AsyncIterator[T]
       with AsyncIterable[T] {
    
    def createAsyncIterable(): AsyncIterable[T] = js.native
    def createAsyncIterable(timeout: Double): AsyncIterable[T] = js.native
    
    def createAsyncIterator(): AsyncIterator[T] = js.native
    def createAsyncIterator(timeout: Double): AsyncIterator[T] = js.native
    
    def next(timeout: Double): js.Promise[IteratorResult[T, Any]] = js.native
    
    def once(): js.Promise[T] = js.native
    def once(timeout: Double): js.Promise[T] = js.native
  }
  
  trait AsyncIterator[T] extends StObject {
    
    def next(): js.Promise[IteratorResult[T, Any]]
    
    def `return`(): Unit
  }
  object AsyncIterator {
    
    inline def apply[T](next: CallbackTo[js.Promise[IteratorResult[T, Any]]], `return`: Callback): AsyncIterator[T] = {
      val __obj = js.Dynamic.literal(next = next.toJsFn)
      __obj.updateDynamic("return")(`return`.toJsFn)
      __obj.asInstanceOf[AsyncIterator[T]]
    }
    
    extension [Self <: AsyncIterator[?], T](x: Self & AsyncIterator[T]) {
      
      inline def setNext(value: CallbackTo[js.Promise[IteratorResult[T, Any]]]): Self = StObject.set(x, "next", value.toJsFn)
      
      inline def setReturn(value: Callback): Self = StObject.set(x, "return", value.toJsFn)
    }
  }
}
