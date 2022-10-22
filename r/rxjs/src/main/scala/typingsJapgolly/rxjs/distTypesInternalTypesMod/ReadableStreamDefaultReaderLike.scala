package typingsJapgolly.rxjs.distTypesInternalTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rxjs.anon.Done
import typingsJapgolly.rxjs.anon.Value
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableStreamDefaultReaderLike[T] extends StObject {
  
  def read(): PromiseLike[Done[T] | Value]
  
  def releaseLock(): Unit
}
object ReadableStreamDefaultReaderLike {
  
  inline def apply[T](read: CallbackTo[PromiseLike[Done[T] | Value]], releaseLock: Callback): ReadableStreamDefaultReaderLike[T] = {
    val __obj = js.Dynamic.literal(read = read.toJsFn, releaseLock = releaseLock.toJsFn)
    __obj.asInstanceOf[ReadableStreamDefaultReaderLike[T]]
  }
  
  extension [Self <: ReadableStreamDefaultReaderLike[?], T](x: Self & ReadableStreamDefaultReaderLike[T]) {
    
    inline def setRead(value: CallbackTo[PromiseLike[Done[T] | Value]]): Self = StObject.set(x, "read", value.toJsFn)
    
    inline def setReleaseLock(value: Callback): Self = StObject.set(x, "releaseLock", value.toJsFn)
  }
}
