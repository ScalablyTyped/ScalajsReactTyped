package typingsJapgolly.nodeWit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WitEntityValue extends js.Object {
  var expressions: js.UndefOr[js.Array[String]] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object WitEntityValue {
  @scala.inline
  def apply(expressions: js.Array[String] = null, value: String = null): WitEntityValue = {
    val __obj = js.Dynamic.literal()
    if (expressions != null) __obj.updateDynamic("expressions")(expressions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WitEntityValue]
  }
}

