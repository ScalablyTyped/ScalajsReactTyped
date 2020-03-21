package typingsJapgolly.fabric.fabricImplMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUtilArray extends js.Object {
  /**
  	 * Invokes method on all items in a given array
  	 * @param array Array to iterate over
  	 * @param method Name of a method to invoke
  	 */
  def invoke(array: js.Array[_], method: String): js.Array[_]
  /**
  	 * Finds maximum value in array (not necessarily "first" one)
  	 * @param array Array to iterate over
  	 */
  def max(array: js.Array[_], byProperty: String): js.Any
  /**
  	 * Finds minimum value in array (not necessarily "first" one)
  	 * @param array Array to iterate over
  	 */
  def min(array: js.Array[_], byProperty: String): js.Any
}

object IUtilArray {
  @scala.inline
  def apply(
    invoke: (js.Array[js.Any], String) => CallbackTo[js.Array[js.Any]],
    max: (js.Array[js.Any], String) => CallbackTo[js.Any],
    min: (js.Array[js.Any], String) => CallbackTo[js.Any]
  ): IUtilArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("invoke")(js.Any.fromFunction2((t0: js.Array[js.Any], t1: java.lang.String) => invoke(t0, t1).runNow()))
    __obj.updateDynamic("max")(js.Any.fromFunction2((t0: js.Array[js.Any], t1: java.lang.String) => max(t0, t1).runNow()))
    __obj.updateDynamic("min")(js.Any.fromFunction2((t0: js.Array[js.Any], t1: java.lang.String) => min(t0, t1).runNow()))
    __obj.asInstanceOf[IUtilArray]
  }
}

