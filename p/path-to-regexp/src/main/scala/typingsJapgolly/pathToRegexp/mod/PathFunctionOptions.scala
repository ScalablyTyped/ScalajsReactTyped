package typingsJapgolly.pathToRegexp.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathFunctionOptions extends js.Object {
  /**
    * Function for encoding input strings for output.
    */
  var encode: js.UndefOr[js.Function2[/* value */ String, /* token */ Key, String]] = js.undefined
  /**
    * When `false` the function can produce an invalid (unmatched) path. (default: `true`)
    */
  var validate: js.UndefOr[Boolean] = js.undefined
}

object PathFunctionOptions {
  @scala.inline
  def apply(
    encode: (/* value */ String, /* token */ Key) => CallbackTo[String] = null,
    validate: js.UndefOr[Boolean] = js.undefined
  ): PathFunctionOptions = {
    val __obj = js.Dynamic.literal()
    if (encode != null) __obj.updateDynamic("encode")(js.Any.fromFunction2((t0: /* value */ java.lang.String, t1: /* token */ typingsJapgolly.pathToRegexp.mod.Key) => encode(t0, t1).runNow()))
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathFunctionOptions]
  }
}

