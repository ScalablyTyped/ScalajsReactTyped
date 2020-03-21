package typingsJapgolly.angularToastr.mod.angularAugmentingMod.toastr

import japgolly.scalajs.react.Callback
import typingsJapgolly.angularToastr.AnonError
import typingsJapgolly.angularToastr.AnonProgressbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastConfig extends IToastBaseConfig {
  var iconClasses: js.UndefOr[AnonError] = js.undefined
}

object IToastConfig {
  @scala.inline
  def apply(
    allowHtml: js.UndefOr[Boolean] = js.undefined,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    closeHtml: String = null,
    extendedTimeOut: Int | Double = null,
    extraData: js.Any = null,
    iconClasses: AnonError = null,
    messageClass: String = null,
    onHidden: (/* wasClicked */ Boolean, /* toast */ IToast) => Callback = null,
    onShown: /* toast */ IToast => Callback = null,
    onTap: /* toast */ IToast => Callback = null,
    progressBar: js.UndefOr[Boolean] = js.undefined,
    tapToDismiss: js.UndefOr[Boolean] = js.undefined,
    templates: AnonProgressbar = null,
    timeOut: Int | Double = null,
    titleClass: String = null,
    toastClass: String = null
  ): IToastConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHtml)) __obj.updateDynamic("allowHtml")(allowHtml.asInstanceOf[js.Any])
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (closeHtml != null) __obj.updateDynamic("closeHtml")(closeHtml.asInstanceOf[js.Any])
    if (extendedTimeOut != null) __obj.updateDynamic("extendedTimeOut")(extendedTimeOut.asInstanceOf[js.Any])
    if (extraData != null) __obj.updateDynamic("extraData")(extraData.asInstanceOf[js.Any])
    if (iconClasses != null) __obj.updateDynamic("iconClasses")(iconClasses.asInstanceOf[js.Any])
    if (messageClass != null) __obj.updateDynamic("messageClass")(messageClass.asInstanceOf[js.Any])
    if (onHidden != null) __obj.updateDynamic("onHidden")(js.Any.fromFunction2((t0: /* wasClicked */ scala.Boolean, t1: /* toast */ typingsJapgolly.angularToastr.mod.angularAugmentingMod.toastr.IToast) => onHidden(t0, t1).runNow()))
    if (onShown != null) __obj.updateDynamic("onShown")(js.Any.fromFunction1((t0: /* toast */ typingsJapgolly.angularToastr.mod.angularAugmentingMod.toastr.IToast) => onShown(t0).runNow()))
    if (onTap != null) __obj.updateDynamic("onTap")(js.Any.fromFunction1((t0: /* toast */ typingsJapgolly.angularToastr.mod.angularAugmentingMod.toastr.IToast) => onTap(t0).runNow()))
    if (!js.isUndefined(progressBar)) __obj.updateDynamic("progressBar")(progressBar.asInstanceOf[js.Any])
    if (!js.isUndefined(tapToDismiss)) __obj.updateDynamic("tapToDismiss")(tapToDismiss.asInstanceOf[js.Any])
    if (templates != null) __obj.updateDynamic("templates")(templates.asInstanceOf[js.Any])
    if (timeOut != null) __obj.updateDynamic("timeOut")(timeOut.asInstanceOf[js.Any])
    if (titleClass != null) __obj.updateDynamic("titleClass")(titleClass.asInstanceOf[js.Any])
    if (toastClass != null) __obj.updateDynamic("toastClass")(toastClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToastConfig]
  }
}

