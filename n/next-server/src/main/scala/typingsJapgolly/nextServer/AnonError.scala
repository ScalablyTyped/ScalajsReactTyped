package typingsJapgolly.nextServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: js.UndefOr[js.Error | Null] = js.undefined
  var isLoading: js.UndefOr[Boolean] = js.undefined
  var pastDelay: js.UndefOr[Boolean] = js.undefined
  var timedOut: js.UndefOr[Boolean] = js.undefined
}

object AnonError {
  @scala.inline
  def apply(
    error: js.Error = null,
    isLoading: js.UndefOr[Boolean] = js.undefined,
    pastDelay: js.UndefOr[Boolean] = js.undefined,
    timedOut: js.UndefOr[Boolean] = js.undefined
  ): AnonError = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading.asInstanceOf[js.Any])
    if (!js.isUndefined(pastDelay)) __obj.updateDynamic("pastDelay")(pastDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(timedOut)) __obj.updateDynamic("timedOut")(timedOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

