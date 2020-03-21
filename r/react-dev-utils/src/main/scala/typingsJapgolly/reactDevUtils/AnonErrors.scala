package typingsJapgolly.reactDevUtils

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrors extends js.Object {
  /**
    * Called when there are build errors.
    */
  def errors(errors: js.Array[String]): Unit
  /**
    * Called when there are build warnings.
    */
  def warnings(warnings: js.Array[String]): Unit
}

object AnonErrors {
  @scala.inline
  def apply(errors: js.Array[String] => Callback, warnings: js.Array[String] => Callback): AnonErrors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errors")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => errors(t0).runNow()))
    __obj.updateDynamic("warnings")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => warnings(t0).runNow()))
    __obj.asInstanceOf[AnonErrors]
  }
}

