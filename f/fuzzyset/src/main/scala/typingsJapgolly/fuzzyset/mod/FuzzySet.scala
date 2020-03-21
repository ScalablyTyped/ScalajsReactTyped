package typingsJapgolly.fuzzyset.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FuzzySet extends js.Object {
  def add(value: String): Boolean
  def get(candidate: String): js.Array[js.Tuple2[Double, String]]
  def isEmpty(): Boolean
  def length(): Double
  def values(): js.Array[String]
}

object FuzzySet {
  @scala.inline
  def apply(
    add: String => CallbackTo[Boolean],
    get: String => CallbackTo[js.Array[js.Tuple2[Double, String]]],
    isEmpty: CallbackTo[Boolean],
    length: CallbackTo[Double],
    values: CallbackTo[js.Array[String]]
  ): FuzzySet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: java.lang.String) => add(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("isEmpty")(isEmpty.toJsFn)
    __obj.updateDynamic("length")(length.toJsFn)
    __obj.updateDynamic("values")(values.toJsFn)
    __obj.asInstanceOf[FuzzySet]
  }
}

