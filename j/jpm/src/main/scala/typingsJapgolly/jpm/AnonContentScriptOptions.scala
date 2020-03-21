package typingsJapgolly.jpm

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentScriptOptions extends js.Object {
  var contentScript: js.UndefOr[String | js.Array[String]] = js.undefined
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.undefined
  var contentScriptOptions: js.UndefOr[js.Object] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, _]] = js.undefined
  var onMessage: js.UndefOr[js.Function1[/* message */ String, _]] = js.undefined
}

object AnonContentScriptOptions {
  @scala.inline
  def apply(
    contentScript: String | js.Array[String] = null,
    contentScriptFile: String | js.Array[String] = null,
    contentScriptOptions: js.Object = null,
    onError: /* error */ js.Error => CallbackTo[js.Any] = null,
    onMessage: /* message */ String => CallbackTo[js.Any] = null
  ): AnonContentScriptOptions = {
    val __obj = js.Dynamic.literal()
    if (contentScript != null) __obj.updateDynamic("contentScript")(contentScript.asInstanceOf[js.Any])
    if (contentScriptFile != null) __obj.updateDynamic("contentScriptFile")(contentScriptFile.asInstanceOf[js.Any])
    if (contentScriptOptions != null) __obj.updateDynamic("contentScriptOptions")(contentScriptOptions.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onError(t0).runNow()))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1((t0: /* message */ java.lang.String) => onMessage(t0).runNow()))
    __obj.asInstanceOf[AnonContentScriptOptions]
  }
}

