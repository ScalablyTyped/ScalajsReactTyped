package typingsJapgolly.samchon.icasegeneratorMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICaseGenerator extends js.Object {
  /**
    * Get index'th case.
    *
    * @param index Index number
    * @return The row of the index'th in combined permuation case
    */
  def at(index: Double): js.Array[Double]
  /**
    * Get size of all cases.
    *
    * @return Get a number of the all cases.
    */
  def size(): Double
}

object ICaseGenerator {
  @scala.inline
  def apply(at: Double => CallbackTo[js.Array[Double]], size: CallbackTo[Double]): ICaseGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("at")(js.Any.fromFunction1((t0: scala.Double) => at(t0).runNow()))
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.asInstanceOf[ICaseGenerator]
  }
}

