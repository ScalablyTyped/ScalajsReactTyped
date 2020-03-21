package typingsJapgolly.trustedTypes.mod._Global_

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrustedTypePolicyOptions extends js.Object {
  var createHTML: js.UndefOr[js.Function1[/* input */ String, String]] = js.undefined
  var createScript: js.UndefOr[js.Function1[/* input */ String, String]] = js.undefined
  var createScriptURL: js.UndefOr[js.Function1[/* input */ String, String]] = js.undefined
  var createURL: js.UndefOr[js.Function1[/* input */ String, String]] = js.undefined
}

object TrustedTypePolicyOptions {
  @scala.inline
  def apply(
    createHTML: /* input */ String => CallbackTo[String] = null,
    createScript: /* input */ String => CallbackTo[String] = null,
    createScriptURL: /* input */ String => CallbackTo[String] = null,
    createURL: /* input */ String => CallbackTo[String] = null
  ): TrustedTypePolicyOptions = {
    val __obj = js.Dynamic.literal()
    if (createHTML != null) __obj.updateDynamic("createHTML")(js.Any.fromFunction1((t0: /* input */ java.lang.String) => createHTML(t0).runNow()))
    if (createScript != null) __obj.updateDynamic("createScript")(js.Any.fromFunction1((t0: /* input */ java.lang.String) => createScript(t0).runNow()))
    if (createScriptURL != null) __obj.updateDynamic("createScriptURL")(js.Any.fromFunction1((t0: /* input */ java.lang.String) => createScriptURL(t0).runNow()))
    if (createURL != null) __obj.updateDynamic("createURL")(js.Any.fromFunction1((t0: /* input */ java.lang.String) => createURL(t0).runNow()))
    __obj.asInstanceOf[TrustedTypePolicyOptions]
  }
}

