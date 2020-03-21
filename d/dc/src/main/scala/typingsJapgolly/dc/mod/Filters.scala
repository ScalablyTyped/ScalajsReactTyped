package typingsJapgolly.dc.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filters extends js.Object {
  def HierarchyFilter(path: String): Filter
  def RangedFilter(low: Double, high: Double): Filter
  def RangedTwoDimensionalFilter(arr: js.Array[js.Array[Double]]): Filter
  def TwoDimensionalFilter(filter: js.Array[Double]): Filter
}

object Filters {
  @scala.inline
  def apply(
    HierarchyFilter: String => CallbackTo[Filter],
    RangedFilter: (Double, Double) => CallbackTo[Filter],
    RangedTwoDimensionalFilter: js.Array[js.Array[Double]] => CallbackTo[Filter],
    TwoDimensionalFilter: js.Array[Double] => CallbackTo[Filter]
  ): Filters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("HierarchyFilter")(js.Any.fromFunction1((t0: java.lang.String) => HierarchyFilter(t0).runNow()))
    __obj.updateDynamic("RangedFilter")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => RangedFilter(t0, t1).runNow()))
    __obj.updateDynamic("RangedTwoDimensionalFilter")(js.Any.fromFunction1((t0: js.Array[js.Array[scala.Double]]) => RangedTwoDimensionalFilter(t0).runNow()))
    __obj.updateDynamic("TwoDimensionalFilter")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => TwoDimensionalFilter(t0).runNow()))
    __obj.asInstanceOf[Filters]
  }
}

