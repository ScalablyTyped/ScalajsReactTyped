package typingsJapgolly.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapMarginOptions extends js.Object {
  var useMapMargin: js.UndefOr[Boolean] = js.undefined
}

object IMapMarginOptions {
  @scala.inline
  def apply(useMapMargin: js.UndefOr[Boolean] = js.undefined): IMapMarginOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useMapMargin)) __obj.updateDynamic("useMapMargin")(useMapMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapMarginOptions]
  }
}

