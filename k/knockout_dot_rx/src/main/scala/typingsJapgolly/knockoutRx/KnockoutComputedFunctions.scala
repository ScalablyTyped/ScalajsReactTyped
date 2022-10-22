package typingsJapgolly.knockoutRx

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.knockoutRx.Rx.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutComputedFunctions[T] extends StObject {
  
  def toObservableWithReplyLatest(): Observable[T]
}
object KnockoutComputedFunctions {
  
  inline def apply[T](toObservableWithReplyLatest: CallbackTo[Observable[T]]): KnockoutComputedFunctions[T] = {
    val __obj = js.Dynamic.literal(toObservableWithReplyLatest = toObservableWithReplyLatest.toJsFn)
    __obj.asInstanceOf[KnockoutComputedFunctions[T]]
  }
  
  extension [Self <: KnockoutComputedFunctions[?], T](x: Self & KnockoutComputedFunctions[T]) {
    
    inline def setToObservableWithReplyLatest(value: CallbackTo[Observable[T]]): Self = StObject.set(x, "toObservableWithReplyLatest", value.toJsFn)
  }
}
