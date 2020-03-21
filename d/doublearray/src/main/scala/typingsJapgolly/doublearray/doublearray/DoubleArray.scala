package typingsJapgolly.doublearray.doublearray

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.doublearray.AnonAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoubleArray extends js.Object {
  var bc: BaseAndCheck
  def calc(): AnonAll
  def commonPrefixSearch(key: String): KeyValue
  def contain(key: String): Boolean
  def dump(): String
  def lookup(key: String): Double
  def size(): Double
  def traverse(parent: Double, code: Double): Double
}

object DoubleArray {
  @scala.inline
  def apply(
    bc: BaseAndCheck,
    calc: CallbackTo[AnonAll],
    commonPrefixSearch: String => CallbackTo[KeyValue],
    contain: String => CallbackTo[Boolean],
    dump: CallbackTo[String],
    lookup: String => CallbackTo[Double],
    size: CallbackTo[Double],
    traverse: (Double, Double) => CallbackTo[Double]
  ): DoubleArray = {
    val __obj = js.Dynamic.literal(bc = bc.asInstanceOf[js.Any])
    __obj.updateDynamic("calc")(calc.toJsFn)
    __obj.updateDynamic("commonPrefixSearch")(js.Any.fromFunction1((t0: java.lang.String) => commonPrefixSearch(t0).runNow()))
    __obj.updateDynamic("contain")(js.Any.fromFunction1((t0: java.lang.String) => contain(t0).runNow()))
    __obj.updateDynamic("dump")(dump.toJsFn)
    __obj.updateDynamic("lookup")(js.Any.fromFunction1((t0: java.lang.String) => lookup(t0).runNow()))
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.updateDynamic("traverse")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => traverse(t0, t1).runNow()))
    __obj.asInstanceOf[DoubleArray]
  }
}

