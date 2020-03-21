package typingsJapgolly.isArraySorted.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  /**
  		Same as [`Array#sort(comparator)`](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/Array/sort#Description).
  		@default (a, b) => a - b
  		*/
  def comparator(left: T, right: T): Double
}

object Options {
  @scala.inline
  def apply[T](comparator: (T, T) => CallbackTo[Double]): Options[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("comparator")(js.Any.fromFunction2((t0: T, t1: T) => comparator(t0, t1).runNow()))
    __obj.asInstanceOf[Options[T]]
  }
}

