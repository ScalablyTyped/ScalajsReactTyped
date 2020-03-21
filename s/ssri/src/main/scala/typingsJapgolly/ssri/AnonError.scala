package typingsJapgolly.ssri

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: js.UndefOr[Boolean] = js.undefined
  var pickAlgorithm: js.UndefOr[js.Function2[/* algo1 */ String, /* algo2 */ String, String]] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object AnonError {
  @scala.inline
  def apply(
    error: js.UndefOr[Boolean] = js.undefined,
    pickAlgorithm: (/* algo1 */ String, /* algo2 */ String) => CallbackTo[String] = null,
    size: Int | Double = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): AnonError = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (pickAlgorithm != null) __obj.updateDynamic("pickAlgorithm")(js.Any.fromFunction2((t0: /* algo1 */ java.lang.String, t1: /* algo2 */ java.lang.String) => pickAlgorithm(t0, t1).runNow()))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

