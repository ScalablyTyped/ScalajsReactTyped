package typingsJapgolly.knockoutRx

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.knockoutRx.Rx.Observable
import typingsJapgolly.rxCoreBinding.Rx.ISubject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutObservableFunctions[T] extends StObject {
  
  def toObservableWithReplyLatest(): Observable[T]
  
  def toSubject(): ISubject[T]
}
object KnockoutObservableFunctions {
  
  inline def apply[T](toObservableWithReplyLatest: CallbackTo[Observable[T]], toSubject: CallbackTo[ISubject[T]]): KnockoutObservableFunctions[T] = {
    val __obj = js.Dynamic.literal(toObservableWithReplyLatest = toObservableWithReplyLatest.toJsFn, toSubject = toSubject.toJsFn)
    __obj.asInstanceOf[KnockoutObservableFunctions[T]]
  }
  
  extension [Self <: KnockoutObservableFunctions[?], T](x: Self & KnockoutObservableFunctions[T]) {
    
    inline def setToObservableWithReplyLatest(value: CallbackTo[Observable[T]]): Self = StObject.set(x, "toObservableWithReplyLatest", value.toJsFn)
    
    inline def setToSubject(value: CallbackTo[ISubject[T]]): Self = StObject.set(x, "toSubject", value.toJsFn)
  }
}
