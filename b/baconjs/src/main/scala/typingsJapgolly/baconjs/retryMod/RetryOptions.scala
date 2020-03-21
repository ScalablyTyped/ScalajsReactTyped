package typingsJapgolly.baconjs.retryMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryOptions[V] extends js.Object {
  /**
    *  Optional. A function that returns the time in milliseconds to wait before retrying. Defaults to `0`. The function is given a context object with the keys ```error``` (the error that occurred) and `retriesDone` (the number of retries already performed) to help determine the appropriate delay e.g. for an incremental backoff.
    */
  var delay: js.UndefOr[js.Function1[/* context */ RetryContext, Double]] = js.undefined
  /**
    * Optional. A function returning `true` to continue retrying, `false` to stop. Defaults to `true`. The error that occurred is given as a parameter. For example, there is usually no reason to retry a 404 HTTP error, whereas a 500 or a timeout might work on the next attempt.
    */
  var isRetryable: js.UndefOr[js.Function1[/* error */ js.Any, Boolean]] = js.undefined
  /**
    * Required. The number of times to retry the `source` function _in addition to the initial attempt_. The default value is 0 (zero) for retrying indefinitely.
    */
  var retries: js.UndefOr[Double] = js.undefined
  /**
    * Required. A function that produces an Observable. The function gets attempt number (starting from zero) as its argument.
    */
  def source(attemptNumber: Double): typingsJapgolly.baconjs.observableMod.default[V]
}

object RetryOptions {
  @scala.inline
  def apply[V](
    source: Double => CallbackTo[typingsJapgolly.baconjs.observableMod.default[V]],
    delay: /* context */ RetryContext => CallbackTo[Double] = null,
    isRetryable: /* error */ js.Any => CallbackTo[Boolean] = null,
    retries: Int | Double = null
  ): RetryOptions[V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("source")(js.Any.fromFunction1((t0: scala.Double) => source(t0).runNow()))
    if (delay != null) __obj.updateDynamic("delay")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.baconjs.retryMod.RetryContext) => delay(t0).runNow()))
    if (isRetryable != null) __obj.updateDynamic("isRetryable")(js.Any.fromFunction1((t0: /* error */ js.Any) => isRetryable(t0).runNow()))
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryOptions[V]]
  }
}

