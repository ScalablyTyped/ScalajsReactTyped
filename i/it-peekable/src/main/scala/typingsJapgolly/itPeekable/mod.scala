package typingsJapgolly.itPeekable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.AsyncIterable
import typingsJapgolly.std.AsyncIterator
import typingsJapgolly.std.Iterable
import typingsJapgolly.std.Iterator
import typingsJapgolly.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @template T
    * @typedef {Object} Peek
    * @property {() => IteratorResult<T, void>} peek
    */
  /**
    * @template T
    * @typedef {Object} AsyncPeek
    * @property {() => Promise<IteratorResult<T, void>>} peek
    */
  /**
    * @template T
    * @typedef {Object} Push
    * @property {(value:T) => void} push
    */
  /**
    * @template T
    * @typedef {Iterable<T> & Peek<T> & Push<T> & Iterator<T>} Peekable<T>
    */
  /**
    * @template T
    * @typedef {AsyncIterable<T> & AsyncPeek<T> & Push<T> & AsyncIterator<T>} AsyncPeekable<T>
    */
  /**
    * @template {Iterable<any> | AsyncIterable<any>} I
    * @param {I} iterable
    * @returns {I extends Iterable<infer T>
    *  ? Peekable<T>
    *  : I extends AsyncIterable<infer T>
    *  ? AsyncPeekable<T>
    *  : never
    * }
    */
  inline def apply[I /* <: js.Iterable[Any] | AsyncIterable[Any] */](iterable: I): /* import warning: importer.ImportType#apply Failed type conversion: I extends std.Iterable<infer T> ? it-peekable.it-peekable.Peekable<T> : I extends std.AsyncIterable<infer T_1> ? it-peekable.it-peekable.AsyncPeekable<T_1> : never */ js.Any = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: I extends std.Iterable<infer T> ? it-peekable.it-peekable.Peekable<T> : I extends std.AsyncIterable<infer T_1> ? it-peekable.it-peekable.AsyncPeekable<T_1> : never */ js.Any]
  
  @JSImport("it-peekable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AsyncPeek[T] extends StObject {
    
    def peek(): js.Promise[IteratorResult[T, Unit]]
  }
  object AsyncPeek {
    
    inline def apply[T](peek: CallbackTo[js.Promise[IteratorResult[T, Unit]]]): AsyncPeek[T] = {
      val __obj = js.Dynamic.literal(peek = peek.toJsFn)
      __obj.asInstanceOf[AsyncPeek[T]]
    }
    
    extension [Self <: AsyncPeek[?], T](x: Self & AsyncPeek[T]) {
      
      inline def setPeek(value: CallbackTo[js.Promise[IteratorResult[T, Unit]]]): Self = StObject.set(x, "peek", value.toJsFn)
    }
  }
  
  /**
    * <T>
    */
  @js.native
  trait AsyncPeekable[T]
    extends StObject
       with AsyncIterable[T]
       with AsyncPeek[T]
       with Push[T]
       with AsyncIterator[T, Any, Unit]
  
  trait Peek[T] extends StObject {
    
    def peek(): IteratorResult[T, Unit]
  }
  object Peek {
    
    inline def apply[T](peek: CallbackTo[IteratorResult[T, Unit]]): Peek[T] = {
      val __obj = js.Dynamic.literal(peek = peek.toJsFn)
      __obj.asInstanceOf[Peek[T]]
    }
    
    extension [Self <: Peek[?], T](x: Self & Peek[T]) {
      
      inline def setPeek(value: CallbackTo[IteratorResult[T, Unit]]): Self = StObject.set(x, "peek", value.toJsFn)
    }
  }
  
  /**
    * <T>
    */
  @js.native
  trait Peekable[T]
    extends StObject
       with Iterable[T]
       with Peek[T]
       with Push[T]
       with Iterator[T, Any, Unit]
  
  trait Push[T] extends StObject {
    
    def push(value: T): Unit
  }
  object Push {
    
    inline def apply[T](push: T => Callback): Push[T] = {
      val __obj = js.Dynamic.literal(push = js.Any.fromFunction1((t0: T) => push(t0).runNow()))
      __obj.asInstanceOf[Push[T]]
    }
    
    extension [Self <: Push[?], T](x: Self & Push[T]) {
      
      inline def setPush(value: T => Callback): Self = StObject.set(x, "push", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    }
  }
}
