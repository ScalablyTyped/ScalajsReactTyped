package typingsJapgolly.jpm

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jpm.FFAddonSDK.BrowserWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsPrivate extends js.Object {
  var isPrivate: js.UndefOr[Boolean] = js.undefined
  var onActivate: js.UndefOr[js.Function1[/* window */ BrowserWindow, _]] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* window */ BrowserWindow, _]] = js.undefined
  var onDeactivate: js.UndefOr[js.Function1[/* window */ BrowserWindow, _]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* window */ BrowserWindow, _]] = js.undefined
  var url: String
}

object AnonIsPrivate {
  @scala.inline
  def apply(
    url: String,
    isPrivate: js.UndefOr[Boolean] = js.undefined,
    onActivate: /* window */ BrowserWindow => CallbackTo[js.Any] = null,
    onClose: /* window */ BrowserWindow => CallbackTo[js.Any] = null,
    onDeactivate: /* window */ BrowserWindow => CallbackTo[js.Any] = null,
    onOpen: /* window */ BrowserWindow => CallbackTo[js.Any] = null
  ): AnonIsPrivate = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(isPrivate)) __obj.updateDynamic("isPrivate")(isPrivate.asInstanceOf[js.Any])
    if (onActivate != null) __obj.updateDynamic("onActivate")(js.Any.fromFunction1((t0: /* window */ typingsJapgolly.jpm.FFAddonSDK.BrowserWindow) => onActivate(t0).runNow()))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* window */ typingsJapgolly.jpm.FFAddonSDK.BrowserWindow) => onClose(t0).runNow()))
    if (onDeactivate != null) __obj.updateDynamic("onDeactivate")(js.Any.fromFunction1((t0: /* window */ typingsJapgolly.jpm.FFAddonSDK.BrowserWindow) => onDeactivate(t0).runNow()))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1((t0: /* window */ typingsJapgolly.jpm.FFAddonSDK.BrowserWindow) => onOpen(t0).runNow()))
    __obj.asInstanceOf[AnonIsPrivate]
  }
}

