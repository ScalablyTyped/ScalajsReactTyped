package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchFieldInterface extends js.Object {
  /**
  	 * getValue should return the current search text.
  	 */
  def getValue(): String
  /**
  	 * setValue should update the current search text to the given value.
  	 */
  def setValue(search: String): Unit
}

object SearchFieldInterface {
  @scala.inline
  def apply(getValue: CallbackTo[String], setValue: String => Callback): SearchFieldInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: java.lang.String) => setValue(t0).runNow()))
    __obj.asInstanceOf[SearchFieldInterface]
  }
}

