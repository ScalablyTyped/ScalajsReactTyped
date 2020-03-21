package typingsJapgolly.yandexMaps.mod.control

import typingsJapgolly.yandexMaps.AnonImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouteEditorParameters extends js.Object {
  var data: js.UndefOr[AnonImage] = js.undefined
  var options: js.UndefOr[IBaseButtonParametersOptions] = js.undefined
  var state: js.UndefOr[js.Object] = js.undefined
}

object IRouteEditorParameters {
  @scala.inline
  def apply(data: AnonImage = null, options: IBaseButtonParametersOptions = null, state: js.Object = null): IRouteEditorParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouteEditorParameters]
  }
}

