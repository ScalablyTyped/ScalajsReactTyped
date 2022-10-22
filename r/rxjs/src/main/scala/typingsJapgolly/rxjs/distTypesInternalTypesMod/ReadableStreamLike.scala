package typingsJapgolly.rxjs.distTypesInternalTypesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableStreamLike[T]
  extends StObject
     with _ObservableInput[T] {
  
  def getReader(): ReadableStreamDefaultReaderLike[T]
}
object ReadableStreamLike {
  
  inline def apply[T](getReader: CallbackTo[ReadableStreamDefaultReaderLike[T]]): ReadableStreamLike[T] = {
    val __obj = js.Dynamic.literal(getReader = getReader.toJsFn)
    __obj.asInstanceOf[ReadableStreamLike[T]]
  }
  
  extension [Self <: ReadableStreamLike[?], T](x: Self & ReadableStreamLike[T]) {
    
    inline def setGetReader(value: CallbackTo[ReadableStreamDefaultReaderLike[T]]): Self = StObject.set(x, "getReader", value.toJsFn)
  }
}
