package typingsJapgolly.angularUiNotification.mod.uiNotification

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGlobalMessageOptions extends js.Object {
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var horizontalSpacing: js.UndefOr[Double] = js.undefined
  var maxCount: js.UndefOr[Double] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* element */ js.Any, _]] = js.undefined
  var positionX: js.UndefOr[XPosition] = js.undefined
  var positionY: js.UndefOr[YPosition] = js.undefined
  var replaceMessage: js.UndefOr[Boolean] = js.undefined
  var startRight: js.UndefOr[Double] = js.undefined
  var startTop: js.UndefOr[Double] = js.undefined
  var templateUrl: js.UndefOr[String] = js.undefined
  var verticalSpacing: js.UndefOr[Double] = js.undefined
}

object IGlobalMessageOptions {
  @scala.inline
  def apply(
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    delay: Int | Double = null,
    horizontalSpacing: Int | Double = null,
    maxCount: Int | Double = null,
    onClose: /* element */ js.Any => CallbackTo[js.Any] = null,
    positionX: XPosition = null,
    positionY: YPosition = null,
    replaceMessage: js.UndefOr[Boolean] = js.undefined,
    startRight: Int | Double = null,
    startTop: Int | Double = null,
    templateUrl: String = null,
    verticalSpacing: Int | Double = null
  ): IGlobalMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (horizontalSpacing != null) __obj.updateDynamic("horizontalSpacing")(horizontalSpacing.asInstanceOf[js.Any])
    if (maxCount != null) __obj.updateDynamic("maxCount")(maxCount.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* element */ js.Any) => onClose(t0).runNow()))
    if (positionX != null) __obj.updateDynamic("positionX")(positionX.asInstanceOf[js.Any])
    if (positionY != null) __obj.updateDynamic("positionY")(positionY.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceMessage)) __obj.updateDynamic("replaceMessage")(replaceMessage.asInstanceOf[js.Any])
    if (startRight != null) __obj.updateDynamic("startRight")(startRight.asInstanceOf[js.Any])
    if (startTop != null) __obj.updateDynamic("startTop")(startTop.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (verticalSpacing != null) __obj.updateDynamic("verticalSpacing")(verticalSpacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGlobalMessageOptions]
  }
}

