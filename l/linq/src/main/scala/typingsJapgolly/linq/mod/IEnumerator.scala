package typingsJapgolly.linq.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEnumerator[T] extends js.Object {
  def current(): T
  def dispose(): Unit
  def moveNext(): Boolean
}

object IEnumerator {
  @scala.inline
  def apply[T](current: CallbackTo[T], dispose: Callback, moveNext: CallbackTo[Boolean]): IEnumerator[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current")(current.toJsFn)
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("moveNext")(moveNext.toJsFn)
    __obj.asInstanceOf[IEnumerator[T]]
  }
}

