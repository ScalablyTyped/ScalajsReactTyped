package typingsJapgolly.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasZM extends js.Object {
  var hasM: js.UndefOr[Boolean] = js.undefined
  var hasZ: js.UndefOr[Boolean] = js.undefined
}

object HasZM {
  @scala.inline
  def apply(hasM: js.UndefOr[Boolean] = js.undefined, hasZ: js.UndefOr[Boolean] = js.undefined): HasZM = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasM)) __obj.updateDynamic("hasM")(hasM.asInstanceOf[js.Any])
    if (!js.isUndefined(hasZ)) __obj.updateDynamic("hasZ")(hasZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasZM]
  }
}

