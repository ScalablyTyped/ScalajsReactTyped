package typingsJapgolly.wxServerSdk.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// type
trait AggregationOperators extends js.Object {
  def abs(operand: Double): Double
  def add(operand: js.Any*): js.Any
  def addToSet(expression: String): js.Any
  def allElementsTrue(expression: js.Array[String]): Boolean
  def and(expression: js.Array[Boolean]): Boolean
  def anyElementTrue(expression: js.Array[String]): Boolean
  def arrayElemAt(expression: js.Tuple2[String, Double]): js.Any
  def arrayToObject(expression: String): js.Object
  // arrayToObject(expression: [string, any][]): object
  // arrayToObject(expression: {k: string; v: any}[]): object
  def avg(expression: String): Double
  def lt(expression: String, value: Double): Boolean
  def lte(expression: String, value: Double): Boolean
}

object AggregationOperators {
  @scala.inline
  def apply(
    abs: Double => CallbackTo[Double],
    add: /* repeated */ js.Any => CallbackTo[js.Any],
    addToSet: String => CallbackTo[js.Any],
    allElementsTrue: js.Array[String] => CallbackTo[Boolean],
    and: js.Array[Boolean] => CallbackTo[Boolean],
    anyElementTrue: js.Array[String] => CallbackTo[Boolean],
    arrayElemAt: js.Tuple2[String, Double] => CallbackTo[js.Any],
    arrayToObject: String => CallbackTo[js.Object],
    avg: String => CallbackTo[Double],
    lt: (String, Double) => CallbackTo[Boolean],
    lte: (String, Double) => CallbackTo[Boolean]
  ): AggregationOperators = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abs")(js.Any.fromFunction1((t0: scala.Double) => abs(t0).runNow()))
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => add(t0).runNow()))
    __obj.updateDynamic("addToSet")(js.Any.fromFunction1((t0: java.lang.String) => addToSet(t0).runNow()))
    __obj.updateDynamic("allElementsTrue")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => allElementsTrue(t0).runNow()))
    __obj.updateDynamic("and")(js.Any.fromFunction1((t0: js.Array[scala.Boolean]) => and(t0).runNow()))
    __obj.updateDynamic("anyElementTrue")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => anyElementTrue(t0).runNow()))
    __obj.updateDynamic("arrayElemAt")(js.Any.fromFunction1((t0: js.Tuple2[java.lang.String, scala.Double]) => arrayElemAt(t0).runNow()))
    __obj.updateDynamic("arrayToObject")(js.Any.fromFunction1((t0: java.lang.String) => arrayToObject(t0).runNow()))
    __obj.updateDynamic("avg")(js.Any.fromFunction1((t0: java.lang.String) => avg(t0).runNow()))
    __obj.updateDynamic("lt")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => lt(t0, t1).runNow()))
    __obj.updateDynamic("lte")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => lte(t0, t1).runNow()))
    __obj.asInstanceOf[AggregationOperators]
  }
}

