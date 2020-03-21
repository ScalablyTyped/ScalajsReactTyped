package typingsJapgolly.knockoutRx

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.knockoutRx.Rx.Observable
import typingsJapgolly.rxCoreBinding.Rx.ISubject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutObservableFunctions[T] extends js.Object {
  def toObservableWithReplyLatest(): Observable[T]
  def toSubject(): ISubject[T]
}

object KnockoutObservableFunctions {
  @scala.inline
  def apply[T](toObservableWithReplyLatest: CallbackTo[Observable[T]], toSubject: CallbackTo[ISubject[T]]): KnockoutObservableFunctions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toObservableWithReplyLatest")(toObservableWithReplyLatest.toJsFn)
    __obj.updateDynamic("toSubject")(toSubject.toJsFn)
    __obj.asInstanceOf[KnockoutObservableFunctions[T]]
  }
}

