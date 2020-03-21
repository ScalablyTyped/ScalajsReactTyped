package typingsJapgolly.yandexMaps.mod.control

import typingsJapgolly.yandexMaps.AnonContent
import typingsJapgolly.yandexMaps.AnonEnabled
import typingsJapgolly.yandexMaps.IBaseButtonParametersOptiFloat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListBoxParameters extends IButtonParameters {
  @JSName("options")
  var options_IListBoxParameters: js.UndefOr[IBaseButtonParametersOptiFloat] = js.undefined
}

object IListBoxParameters {
  @scala.inline
  def apply(
    data: AnonContent = null,
    options: IBaseButtonParametersOptiFloat = null,
    state: AnonEnabled = null
  ): IListBoxParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListBoxParameters]
  }
}

