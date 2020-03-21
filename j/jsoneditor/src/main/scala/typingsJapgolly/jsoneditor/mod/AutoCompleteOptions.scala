package typingsJapgolly.jsoneditor.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteOptions extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  /**
    * @default [39, 35, 9]
    */
  var confirmKeys: js.UndefOr[js.Array[Double]] = js.undefined
  var getOptions: js.UndefOr[AutoCompleteOptionsGetter] = js.undefined
}

object AutoCompleteOptions {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    confirmKeys: js.Array[Double] = null,
    getOptions: (/* text */ String, /* path */ JSONPath, /* input */ String, /* editor */ JSONEditor) => CallbackTo[AutoCompleteCompletion | js.Promise[AutoCompleteCompletion]] = null
  ): AutoCompleteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (confirmKeys != null) __obj.updateDynamic("confirmKeys")(confirmKeys.asInstanceOf[js.Any])
    if (getOptions != null) __obj.updateDynamic("getOptions")(js.Any.fromFunction4((t0: /* text */ java.lang.String, t1: /* path */ typingsJapgolly.jsoneditor.mod.JSONPath, t2: /* input */ java.lang.String, t3: /* editor */ typingsJapgolly.jsoneditor.mod.JSONEditor) => getOptions(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[AutoCompleteOptions]
  }
}

