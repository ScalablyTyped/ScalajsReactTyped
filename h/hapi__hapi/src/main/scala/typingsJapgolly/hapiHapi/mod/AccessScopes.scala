package typingsJapgolly.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessScopes extends js.Object {
  var forbidden: js.UndefOr[js.Array[String]] = js.undefined
  var required: js.UndefOr[js.Array[String]] = js.undefined
  var selection: js.UndefOr[js.Array[String]] = js.undefined
}

object AccessScopes {
  @scala.inline
  def apply(
    forbidden: js.Array[String] = null,
    required: js.Array[String] = null,
    selection: js.Array[String] = null
  ): AccessScopes = {
    val __obj = js.Dynamic.literal()
    if (forbidden != null) __obj.updateDynamic("forbidden")(forbidden.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessScopes]
  }
}

