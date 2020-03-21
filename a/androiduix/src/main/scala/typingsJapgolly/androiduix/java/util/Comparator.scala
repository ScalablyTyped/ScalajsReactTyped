package typingsJapgolly.androiduix.java.util

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comparator[T] extends js.Object {
  def compare(o1: T, o2: T): Double
}

object Comparator {
  @scala.inline
  def apply[T](compare: (T, T) => CallbackTo[Double]): Comparator[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compare")(js.Any.fromFunction2((t0: T, t1: T) => compare(t0, t1).runNow()))
    __obj.asInstanceOf[Comparator[T]]
  }
}

