package typingsJapgolly.yandexDashMaps.yandexDashMapsMod.control

import typingsJapgolly.yandexDashMaps.Anon_AdjustMapMargin
import typingsJapgolly.yandexDashMaps.Anon_Expanded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouteButtonParameters extends js.Object {
  var options: js.UndefOr[Anon_AdjustMapMargin] = js.undefined
  var state: js.UndefOr[Anon_Expanded] = js.undefined
}

object IRouteButtonParameters {
  @scala.inline
  def apply(options: Anon_AdjustMapMargin = null, state: Anon_Expanded = null): IRouteButtonParameters = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouteButtonParameters]
  }
}

