package typingsJapgolly.ngtoaster.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPopParams extends IToast {
  var toasterId: js.UndefOr[Double] = js.undefined
}

object IPopParams {
  @scala.inline
  def apply(
    body: String = null,
    bodyOutputType: String = null,
    clickHandler: /* evt */ Event_ => Callback = null,
    closeHtml: String = null,
    directiveData: js.Any = null,
    onHideCallback: /* toast */ IToast => Callback = null,
    onShowCallback: /* toast */ IToast => Callback = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    tapToDismiss: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    title: String = null,
    toastId: String | Double = null,
    toasterId: Int | Double = null,
    `type`: String = null
  ): IPopParams = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (bodyOutputType != null) __obj.updateDynamic("bodyOutputType")(bodyOutputType.asInstanceOf[js.Any])
    if (clickHandler != null) __obj.updateDynamic("clickHandler")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.std.Event_) => clickHandler(t0).runNow()))
    if (closeHtml != null) __obj.updateDynamic("closeHtml")(closeHtml.asInstanceOf[js.Any])
    if (directiveData != null) __obj.updateDynamic("directiveData")(directiveData.asInstanceOf[js.Any])
    if (onHideCallback != null) __obj.updateDynamic("onHideCallback")(js.Any.fromFunction1((t0: /* toast */ typingsJapgolly.ngtoaster.mod.IToast) => onHideCallback(t0).runNow()))
    if (onShowCallback != null) __obj.updateDynamic("onShowCallback")(js.Any.fromFunction1((t0: /* toast */ typingsJapgolly.ngtoaster.mod.IToast) => onShowCallback(t0).runNow()))
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.asInstanceOf[js.Any])
    if (!js.isUndefined(tapToDismiss)) __obj.updateDynamic("tapToDismiss")(tapToDismiss.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (toastId != null) __obj.updateDynamic("toastId")(toastId.asInstanceOf[js.Any])
    if (toasterId != null) __obj.updateDynamic("toasterId")(toasterId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPopParams]
  }
}

