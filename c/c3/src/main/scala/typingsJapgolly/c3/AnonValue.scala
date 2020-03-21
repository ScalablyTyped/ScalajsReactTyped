package typingsJapgolly.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  /** List of remaining keys (besides the x key) to pull data for. */
  var value: js.Array[String]
  /** This is the key for the x-value in each row. */
  var x: js.UndefOr[String] = js.undefined
}

object AnonValue {
  @scala.inline
  def apply(value: js.Array[String], x: String = null): AnonValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue]
  }
}

