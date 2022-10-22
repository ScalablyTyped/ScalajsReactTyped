package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Watch[T] extends StObject {
  
  /** Closes the watch */
  def close(): Unit
  
  /** Synchronize with host and get updated program */
  def getProgram(): T
}
object Watch {
  
  inline def apply[T](close: Callback, getProgram: CallbackTo[T]): Watch[T] = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, getProgram = getProgram.toJsFn)
    __obj.asInstanceOf[Watch[T]]
  }
  
  extension [Self <: Watch[?], T](x: Self & Watch[T]) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setGetProgram(value: CallbackTo[T]): Self = StObject.set(x, "getProgram", value.toJsFn)
  }
}
