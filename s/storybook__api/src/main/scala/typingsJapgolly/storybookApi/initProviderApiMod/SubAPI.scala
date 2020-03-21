package typingsJapgolly.storybookApi.initProviderApiMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubAPI extends js.Object {
  var renderPreview: js.UndefOr[js.Function0[Element]] = js.undefined
}

object SubAPI {
  @scala.inline
  def apply(renderPreview: js.UndefOr[CallbackTo[Element]] = js.undefined): SubAPI = {
    val __obj = js.Dynamic.literal()
    renderPreview.foreach(p => __obj.updateDynamic("renderPreview")(p.toJsFn))
    __obj.asInstanceOf[SubAPI]
  }
}

