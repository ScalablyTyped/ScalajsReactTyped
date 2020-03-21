package typingsJapgolly.jpm

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jpm.jpmStrings.end
import typingsJapgolly.jpm.jpmStrings.ready
import typingsJapgolly.jpm.jpmStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllow extends js.Object {
  var allow: js.UndefOr[AnonScript] = js.undefined
  var contentScript: js.UndefOr[String | js.Array[String]] = js.undefined
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.undefined
  var contentScriptOptions: js.UndefOr[js.Any] = js.undefined
  var contentScriptWhen: js.UndefOr[start | ready | end] = js.undefined
  var contentURL: js.UndefOr[String] = js.undefined
  var include: js.UndefOr[String | (js.Array[js.RegExp | String]) | js.RegExp] = js.undefined
  var onMessage: js.UndefOr[js.Function1[/* message */ String, _]] = js.undefined
}

object AnonAllow {
  @scala.inline
  def apply(
    allow: AnonScript = null,
    contentScript: String | js.Array[String] = null,
    contentScriptFile: String | js.Array[String] = null,
    contentScriptOptions: js.Any = null,
    contentScriptWhen: start | ready | end = null,
    contentURL: String = null,
    include: String | (js.Array[js.RegExp | String]) | js.RegExp = null,
    onMessage: /* message */ String => CallbackTo[js.Any] = null
  ): AnonAllow = {
    val __obj = js.Dynamic.literal()
    if (allow != null) __obj.updateDynamic("allow")(allow.asInstanceOf[js.Any])
    if (contentScript != null) __obj.updateDynamic("contentScript")(contentScript.asInstanceOf[js.Any])
    if (contentScriptFile != null) __obj.updateDynamic("contentScriptFile")(contentScriptFile.asInstanceOf[js.Any])
    if (contentScriptOptions != null) __obj.updateDynamic("contentScriptOptions")(contentScriptOptions.asInstanceOf[js.Any])
    if (contentScriptWhen != null) __obj.updateDynamic("contentScriptWhen")(contentScriptWhen.asInstanceOf[js.Any])
    if (contentURL != null) __obj.updateDynamic("contentURL")(contentURL.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1((t0: /* message */ java.lang.String) => onMessage(t0).runNow()))
    __obj.asInstanceOf[AnonAllow]
  }
}

