package typingsJapgolly.googleCloudCommon.utilMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.teenyRequest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeRequestConfig extends js.Object {
  /**
    * Automatically retry requests if the response is related to rate limits or
    * certain intermittent server errors. We will exponentially backoff
    * subsequent requests by default. (default: true)
    */
  var autoRetry: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum number of automatic retries attempted before returning the error.
    * (default: 3)
    */
  var maxRetries: js.UndefOr[Double] = js.undefined
  var retries: js.UndefOr[Double] = js.undefined
  var shouldRetryFn: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response[_]], Boolean]] = js.undefined
  var stream: js.UndefOr[Duplexify] = js.undefined
}

object MakeRequestConfig {
  @scala.inline
  def apply(
    autoRetry: js.UndefOr[Boolean] = js.undefined,
    maxRetries: Int | Double = null,
    retries: Int | Double = null,
    shouldRetryFn: /* response */ js.UndefOr[Response[js.Any]] => CallbackTo[Boolean] = null,
    stream: Duplexify = null
  ): MakeRequestConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRetry)) __obj.updateDynamic("autoRetry")(autoRetry.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (shouldRetryFn != null) __obj.updateDynamic("shouldRetryFn")(js.Any.fromFunction1((t0: /* response */ js.UndefOr[typingsJapgolly.teenyRequest.mod.Response[js.Any]]) => shouldRetryFn(t0).runNow()))
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeRequestConfig]
  }
}

