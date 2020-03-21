package typingsJapgolly.streamjs.Stream

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iterator[T] extends js.Object {
  var done: Boolean
  def next(): T
}

object Iterator {
  @scala.inline
  def apply[T](done: Boolean, next: CallbackTo[T]): Iterator[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.asInstanceOf[Iterator[T]]
  }
}

