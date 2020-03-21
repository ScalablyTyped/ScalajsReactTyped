package typingsJapgolly.knockoutRx

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.knockoutRx.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutComputedFunctions[T] extends js.Object {
  def toObservableWithReplyLatest(): Observable[T]
}

object KnockoutComputedFunctions {
  @scala.inline
  def apply[T](toObservableWithReplyLatest: CallbackTo[Observable[T]]): KnockoutComputedFunctions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toObservableWithReplyLatest")(toObservableWithReplyLatest.toJsFn)
    __obj.asInstanceOf[KnockoutComputedFunctions[T]]
  }
}

