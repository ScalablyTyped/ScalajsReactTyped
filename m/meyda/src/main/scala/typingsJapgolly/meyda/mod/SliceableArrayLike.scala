package typingsJapgolly.meyda.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliceableArrayLike[T] extends ArrayLike[T] {
  def slice(start: Double, end: Double): SliceableArrayLike[T]
}

object SliceableArrayLike {
  @scala.inline
  def apply[T](length: Double, slice: (Double, Double) => CallbackTo[SliceableArrayLike[T]]): SliceableArrayLike[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("slice")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => slice(t0, t1).runNow()))
    __obj.asInstanceOf[SliceableArrayLike[T]]
  }
}

