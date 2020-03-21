package typingsJapgolly.oibackoff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackoffOptions extends js.Object {
  var algorithm: js.UndefOr[
    typingsJapgolly.oibackoff.oibackoffStrings.incremental | typingsJapgolly.oibackoff.oibackoffStrings.exponential | typingsJapgolly.oibackoff.oibackoffStrings.fibonacci
  ] = js.undefined
  var delayRatio: js.UndefOr[Double] = js.undefined
  var maxDelay: js.UndefOr[Double] = js.undefined
  var maxTries: js.UndefOr[Double] = js.undefined
}

object BackoffOptions {
  @scala.inline
  def apply(
    algorithm: typingsJapgolly.oibackoff.oibackoffStrings.incremental | typingsJapgolly.oibackoff.oibackoffStrings.exponential | typingsJapgolly.oibackoff.oibackoffStrings.fibonacci = null,
    delayRatio: Int | Double = null,
    maxDelay: Int | Double = null,
    maxTries: Int | Double = null
  ): BackoffOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (delayRatio != null) __obj.updateDynamic("delayRatio")(delayRatio.asInstanceOf[js.Any])
    if (maxDelay != null) __obj.updateDynamic("maxDelay")(maxDelay.asInstanceOf[js.Any])
    if (maxTries != null) __obj.updateDynamic("maxTries")(maxTries.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackoffOptions]
  }
}

