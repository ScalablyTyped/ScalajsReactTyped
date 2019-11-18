package typingsJapgolly.yandexDashMaps.yandexDashMapsMod.control

import typingsJapgolly.yandexDashMaps.Anon_Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouteEditorParameters extends js.Object {
  var data: js.UndefOr[Anon_Image] = js.undefined
  var options: js.UndefOr[IBaseButtonParametersOptions] = js.undefined
  var state: js.UndefOr[js.Object] = js.undefined
}

object IRouteEditorParameters {
  @scala.inline
  def apply(data: Anon_Image = null, options: IBaseButtonParametersOptions = null, state: js.Object = null): IRouteEditorParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouteEditorParameters]
  }
}

