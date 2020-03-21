package typingsJapgolly.javascriptObfuscator.iarrayutilsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArrayUtils extends js.Object {
  /**
    * @param length
    * @return {number[]}
    */
  def createWithRange(length: Double): js.Array[Double]
  /**
    * @param array
    * @param times
    * @returns {T[]}
    */
  def rotate[T](array: js.Array[T], times: Double): js.Array[T]
  /**
    * @param array
    * @return {T[]}
    */
  def shuffle[T](array: js.Array[T]): js.Array[T]
}

object IArrayUtils {
  @scala.inline
  def apply(
    createWithRange: Double => CallbackTo[js.Array[Double]],
    rotate: (js.Array[js.Any], Double) => CallbackTo[js.Array[js.Any]],
    shuffle: js.Array[js.Any] => CallbackTo[js.Array[js.Any]]
  ): IArrayUtils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createWithRange")(js.Any.fromFunction1((t0: scala.Double) => createWithRange(t0).runNow()))
    __obj.updateDynamic("rotate")(js.Any.fromFunction2((t0: js.Array[js.Any], t1: scala.Double) => rotate(t0, t1).runNow()))
    __obj.updateDynamic("shuffle")(js.Any.fromFunction1((t0: js.Array[js.Any]) => shuffle(t0).runNow()))
    __obj.asInstanceOf[IArrayUtils]
  }
}

