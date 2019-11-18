package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipboardEventInit extends EventInit {
  var clipboardData: js.UndefOr[org.scalajs.dom.raw.DataTransfer | Null] = js.undefined
}

object ClipboardEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    clipboardData: org.scalajs.dom.raw.DataTransfer = null,
    composed: js.UndefOr[scala.Boolean] = js.undefined
  ): ClipboardEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (clipboardData != null) __obj.updateDynamic("clipboardData")(clipboardData.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipboardEventInit]
  }
}

