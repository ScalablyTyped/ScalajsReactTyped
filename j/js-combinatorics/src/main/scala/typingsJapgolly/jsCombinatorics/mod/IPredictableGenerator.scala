package typingsJapgolly.jsCombinatorics.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPredictableGenerator[T] extends IGenerator[T] {
  /**
  		 * Returns the nth element (indexed from 0).
  		 */
  def nth(n: Double): T
}

object IPredictableGenerator {
  @scala.inline
  def apply[T](
    filter: js.Function1[T, Boolean] => CallbackTo[js.Array[T]],
    forEach: js.Function1[T, Unit] => Callback,
    length: Double,
    map: js.Function1[T, js.Any] => CallbackTo[js.Array[js.Any]],
    next: CallbackTo[T],
    nth: Double => CallbackTo[T],
    toArray: CallbackTo[js.Array[T]]
  ): IPredictableGenerator[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: js.Function1[T, scala.Boolean]) => filter(t0).runNow()))
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: js.Function1[T, scala.Unit]) => forEach(t0).runNow()))
    __obj.updateDynamic("map")(js.Any.fromFunction1((t0: js.Function1[T, js.Any]) => map(t0).runNow()))
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("nth")(js.Any.fromFunction1((t0: scala.Double) => nth(t0).runNow()))
    __obj.updateDynamic("toArray")(toArray.toJsFn)
    __obj.asInstanceOf[IPredictableGenerator[T]]
  }
}

