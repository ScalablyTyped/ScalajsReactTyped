package typingsJapgolly.bintrees.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iterator[T] extends js.Object {
  def data(): T
  def next(): T
  def prev(): T
}

object Iterator {
  @scala.inline
  def apply[T](data: CallbackTo[T], next: CallbackTo[T], prev: CallbackTo[T]): Iterator[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.toJsFn)
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("prev")(prev.toJsFn)
    __obj.asInstanceOf[Iterator[T]]
  }
}

