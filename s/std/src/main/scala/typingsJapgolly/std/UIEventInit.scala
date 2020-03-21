package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIEventInit extends EventInit {
  var detail: js.UndefOr[Double] = js.undefined
  var view: js.UndefOr[Window_ | Null] = js.undefined
}

object UIEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    detail: Int | Double = null,
    view: Window_ = null
  ): UIEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIEventInit]
  }
}

