package typingsJapgolly.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSubstitutiondata extends js.Object {
  var draft: js.UndefOr[Boolean] = js.undefined
  var substitution_data: js.UndefOr[js.Any] = js.undefined
}

object AnonSubstitutiondata {
  @scala.inline
  def apply(draft: js.UndefOr[Boolean] = js.undefined, substitution_data: js.Any = null): AnonSubstitutiondata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(draft)) __obj.updateDynamic("draft")(draft.asInstanceOf[js.Any])
    if (substitution_data != null) __obj.updateDynamic("substitution_data")(substitution_data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSubstitutiondata]
  }
}

