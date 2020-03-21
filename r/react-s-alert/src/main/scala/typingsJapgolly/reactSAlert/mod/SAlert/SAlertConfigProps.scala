package typingsJapgolly.reactSAlert.mod.SAlert

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SAlertConfigProps extends js.Object {
  var beep: js.UndefOr[String | Boolean | SAlertBeepProps] = js.undefined
  var contentTemplate: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var customFields: js.UndefOr[js.Object] = js.undefined
  var effect: js.UndefOr[String] = js.undefined
  var html: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var stack: js.UndefOr[Boolean | SAlertStackProps] = js.undefined
  var timeout: js.UndefOr[String | Double] = js.undefined
}

object SAlertConfigProps {
  @scala.inline
  def apply(
    beep: String | Boolean | SAlertBeepProps = null,
    contentTemplate: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    customFields: js.Object = null,
    effect: String = null,
    html: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    onClose: js.UndefOr[Callback] = js.undefined,
    onShow: js.UndefOr[Callback] = js.undefined,
    position: String = null,
    stack: Boolean | SAlertStackProps = null,
    timeout: String | Double = null
  ): SAlertConfigProps = {
    val __obj = js.Dynamic.literal()
    if (beep != null) __obj.updateDynamic("beep")(beep.asInstanceOf[js.Any])
    if (contentTemplate != null) __obj.updateDynamic("contentTemplate")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => contentTemplate(t0).runNow()))
    if (customFields != null) __obj.updateDynamic("customFields")(customFields.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    onShow.foreach(p => __obj.updateDynamic("onShow")(p.toJsFn))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAlertConfigProps]
  }
}

