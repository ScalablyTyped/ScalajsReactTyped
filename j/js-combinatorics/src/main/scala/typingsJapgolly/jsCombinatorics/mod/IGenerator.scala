package typingsJapgolly.jsCombinatorics.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGenerator[T] extends js.Object {
  /**
  		 * Returns the total number of elements to be generated. This equals the result of calling
    * `generator.toArray().length` but it is precalculated without actually generating any elements.
  		 * Handy when doing setup for a potentially long-running loop.
  		 */
  var length: Double
  /**
  		 * Returns an array of elements that return `true` for the filter function.
  		 */
  def filter(predicate: js.Function1[/* item */ T, Boolean]): js.Array[T]
  /**
  		 * Applies the callback function for each element.
  		 */
  def forEach(f: js.Function1[/* item */ T, Unit]): Unit
  /**
  		 * Returns an array that is the output of calling the callback function separately on each element.
  		 */
  def map[TResult](f: js.Function1[/* item */ T, TResult]): js.Array[TResult]
  /**
  		 * Returns the element or undefined if no more elements are available.
  		 */
  def next(): T
  /**
  		 * Returns an array of all elements.
  		 */
  def toArray(): js.Array[T]
}

object IGenerator {
  @scala.inline
  def apply[T](
    filter: js.Function1[/* item */ T, Boolean] => CallbackTo[js.Array[T]],
    forEach: js.Function1[/* item */ T, Unit] => Callback,
    length: Double,
    map: js.Function1[/* item */ T, js.Any] => CallbackTo[js.Array[js.Any]],
    next: CallbackTo[T],
    toArray: CallbackTo[js.Array[T]]
  ): IGenerator[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: js.Function1[/* item */ T, scala.Boolean]) => filter(t0).runNow()))
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: js.Function1[/* item */ T, scala.Unit]) => forEach(t0).runNow()))
    __obj.updateDynamic("map")(js.Any.fromFunction1((t0: js.Function1[/* item */ T, js.Any]) => map(t0).runNow()))
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("toArray")(toArray.toJsFn)
    __obj.asInstanceOf[IGenerator[T]]
  }
}

