package typingsJapgolly.yandexDashMaps.yandexDashMapsMod.control

import typingsJapgolly.yandexDashMaps.Anon_CollapseOnBlur
import typingsJapgolly.yandexDashMaps.Anon_Expanded
import typingsJapgolly.yandexDashMaps.Anon_Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFullscreenControlParameters extends js.Object {
  var data: js.UndefOr[Anon_Title] = js.undefined
  var options: js.UndefOr[IBaseButtonParametersOptions with Anon_CollapseOnBlur] = js.undefined
  var state: js.UndefOr[Anon_Expanded] = js.undefined
}

object IFullscreenControlParameters {
  @scala.inline
  def apply(
    data: Anon_Title = null,
    options: IBaseButtonParametersOptions with Anon_CollapseOnBlur = null,
    state: Anon_Expanded = null
  ): IFullscreenControlParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFullscreenControlParameters]
  }
}

