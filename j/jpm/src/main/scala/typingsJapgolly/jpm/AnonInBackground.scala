package typingsJapgolly.jpm

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jpm.FFAddonSDK.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInBackground extends js.Object {
  var inBackground: js.UndefOr[Boolean] = js.undefined
  var inNewWindow: js.UndefOr[Boolean] = js.undefined
  var isPinned: js.UndefOr[Boolean] = js.undefined
  var onActivate: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.undefined
  var onDeactivate: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.undefined
  var onPageShow: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.undefined
  var onReady: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.undefined
  var url: String
}

object AnonInBackground {
  @scala.inline
  def apply(
    url: String,
    inBackground: js.UndefOr[Boolean] = js.undefined,
    inNewWindow: js.UndefOr[Boolean] = js.undefined,
    isPinned: js.UndefOr[Boolean] = js.undefined,
    onActivate: /* tab */ Tab => CallbackTo[js.Any] = null,
    onClose: /* tab */ Tab => CallbackTo[js.Any] = null,
    onDeactivate: /* tab */ Tab => CallbackTo[js.Any] = null,
    onLoad: /* tab */ Tab => CallbackTo[js.Any] = null,
    onOpen: /* tab */ Tab => CallbackTo[js.Any] = null,
    onPageShow: /* tab */ Tab => CallbackTo[js.Any] = null,
    onReady: /* tab */ Tab => CallbackTo[js.Any] = null
  ): AnonInBackground = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(inBackground)) __obj.updateDynamic("inBackground")(inBackground.asInstanceOf[js.Any])
    if (!js.isUndefined(inNewWindow)) __obj.updateDynamic("inNewWindow")(inNewWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(isPinned)) __obj.updateDynamic("isPinned")(isPinned.asInstanceOf[js.Any])
    if (onActivate != null) __obj.updateDynamic("onActivate")(js.Any.fromFunction1((t0: /* tab */ typingsJapgolly.jpm.FFAddonSDK.Tab) => onActivate(t0).runNow()))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* tab */ typingsJapgolly.jpm.FFAddonSDK.Tab) => onClose(t0).runNow()))
    if (onDeactivate != null) __obj.updateDynamic("onDeactivate")(js.Any.fromFunction1((t0: /* tab */ typingsJapgolly.jpm.FFAddonSDK.Tab) => onDeactivate(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* tab */ typingsJapgolly.jpm.FFAddonSDK.Tab) => onLoad(t0).runNow()))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1((t0: /* tab */ typingsJapgolly.jpm.FFAddonSDK.Tab) => onOpen(t0).runNow()))
    if (onPageShow != null) __obj.updateDynamic("onPageShow")(js.Any.fromFunction1((t0: /* tab */ typingsJapgolly.jpm.FFAddonSDK.Tab) => onPageShow(t0).runNow()))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1((t0: /* tab */ typingsJapgolly.jpm.FFAddonSDK.Tab) => onReady(t0).runNow()))
    __obj.asInstanceOf[AnonInBackground]
  }
}

