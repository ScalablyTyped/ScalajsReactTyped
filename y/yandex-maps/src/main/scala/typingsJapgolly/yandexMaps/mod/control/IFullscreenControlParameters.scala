package typingsJapgolly.yandexMaps.mod.control

import typingsJapgolly.yandexMaps.AnonExpanded
import typingsJapgolly.yandexMaps.AnonTitle
import typingsJapgolly.yandexMaps.IBaseButtonParametersOptiAdjustMapMargin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFullscreenControlParameters extends js.Object {
  var data: js.UndefOr[AnonTitle] = js.undefined
  var options: js.UndefOr[IBaseButtonParametersOptiAdjustMapMargin] = js.undefined
  var state: js.UndefOr[AnonExpanded] = js.undefined
}

object IFullscreenControlParameters {
  @scala.inline
  def apply(
    data: AnonTitle = null,
    options: IBaseButtonParametersOptiAdjustMapMargin = null,
    state: AnonExpanded = null
  ): IFullscreenControlParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFullscreenControlParameters]
  }
}

