package typingsJapgolly.kefir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeading extends js.Object {
  var leading: js.UndefOr[Boolean] = js.undefined
  var trailing: js.UndefOr[Boolean] = js.undefined
}

object AnonLeading {
  @scala.inline
  def apply(leading: js.UndefOr[Boolean] = js.undefined, trailing: js.UndefOr[Boolean] = js.undefined): AnonLeading = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leading)) __obj.updateDynamic("leading")(leading.asInstanceOf[js.Any])
    if (!js.isUndefined(trailing)) __obj.updateDynamic("trailing")(trailing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeading]
  }
}

