package typingsJapgolly.subscribeUiEvent.mod

import typingsJapgolly.std.AddEventListenerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeOptions extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var enableResizeInfo: js.UndefOr[Boolean] = js.undefined
  var enableScrollInfo: js.UndefOr[Boolean] = js.undefined
  var enableTouchInfo: js.UndefOr[Boolean] = js.undefined
  var eventOptions: js.UndefOr[AddEventListenerOptions] = js.undefined
  var throttleRate: js.UndefOr[Double] = js.undefined
  var useRAF: js.UndefOr[Boolean] = js.undefined
}

object SubscribeOptions {
  @scala.inline
  def apply(
    context: js.Any = null,
    enableResizeInfo: js.UndefOr[Boolean] = js.undefined,
    enableScrollInfo: js.UndefOr[Boolean] = js.undefined,
    enableTouchInfo: js.UndefOr[Boolean] = js.undefined,
    eventOptions: AddEventListenerOptions = null,
    throttleRate: Int | Double = null,
    useRAF: js.UndefOr[Boolean] = js.undefined
  ): SubscribeOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(enableResizeInfo)) __obj.updateDynamic("enableResizeInfo")(enableResizeInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(enableScrollInfo)) __obj.updateDynamic("enableScrollInfo")(enableScrollInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTouchInfo)) __obj.updateDynamic("enableTouchInfo")(enableTouchInfo.asInstanceOf[js.Any])
    if (eventOptions != null) __obj.updateDynamic("eventOptions")(eventOptions.asInstanceOf[js.Any])
    if (throttleRate != null) __obj.updateDynamic("throttleRate")(throttleRate.asInstanceOf[js.Any])
    if (!js.isUndefined(useRAF)) __obj.updateDynamic("useRAF")(useRAF.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeOptions]
  }
}

