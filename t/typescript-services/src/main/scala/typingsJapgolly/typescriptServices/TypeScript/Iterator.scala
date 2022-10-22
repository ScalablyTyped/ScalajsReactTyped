package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Iterator[T] extends StObject {
  
  def current(): T
  
  def moveNext(): Boolean
}
object Iterator {
  
  inline def apply[T](current: CallbackTo[T], moveNext: CallbackTo[Boolean]): Iterator[T] = {
    val __obj = js.Dynamic.literal(current = current.toJsFn, moveNext = moveNext.toJsFn)
    __obj.asInstanceOf[Iterator[T]]
  }
  
  extension [Self <: Iterator[?], T](x: Self & Iterator[T]) {
    
    inline def setCurrent(value: CallbackTo[T]): Self = StObject.set(x, "current", value.toJsFn)
    
    inline def setMoveNext(value: CallbackTo[Boolean]): Self = StObject.set(x, "moveNext", value.toJsFn)
  }
}
