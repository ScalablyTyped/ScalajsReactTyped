package typingsJapgolly.yandexMaps.mod.control

import typingsJapgolly.yandexMaps.AnonBoundedBy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchControlParameters extends js.Object {
  var data: js.UndefOr[js.Object] = js.undefined
  var options: js.UndefOr[AnonBoundedBy] = js.undefined
  var state: js.UndefOr[js.Object] = js.undefined
}

object ISearchControlParameters {
  @scala.inline
  def apply(data: js.Object = null, options: AnonBoundedBy = null, state: js.Object = null): ISearchControlParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchControlParameters]
  }
}

