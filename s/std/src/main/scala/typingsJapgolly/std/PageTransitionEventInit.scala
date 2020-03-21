package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageTransitionEventInit extends EventInit {
  var persisted: js.UndefOr[scala.Boolean] = js.undefined
}

object PageTransitionEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    persisted: js.UndefOr[scala.Boolean] = js.undefined
  ): PageTransitionEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (!js.isUndefined(persisted)) __obj.updateDynamic("persisted")(persisted.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageTransitionEventInit]
  }
}

