package typingsJapgolly.gaxios.commonMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryConfig extends js.Object {
  /**
    * The number of retries already attempted.
    */
  var currentRetryAttempt: js.UndefOr[Double] = js.undefined
  /**
    * The HTTP Methods that will be automatically retried.
    * Defaults to ['GET','PUT','HEAD','OPTIONS','DELETE']
    */
  var httpMethodsToRetry: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * When there is no response, the number of retries to attempt. Defaults to 2.
    */
  var noResponseRetries: js.UndefOr[Double] = js.undefined
  /**
    * Function to invoke when a retry attempt is made.
    */
  var onRetryAttempt: js.UndefOr[js.Function1[/* err */ GaxiosError[_], Unit]] = js.undefined
  /**
    * The number of times to retry the request.  Defaults to 3.
    */
  var retry: js.UndefOr[Double] = js.undefined
  /**
    * The amount of time to initially delay the retry.  Defaults to 100.
    */
  var retryDelay: js.UndefOr[Double] = js.undefined
  /**
    * Function to invoke which determines if you should retry
    */
  var shouldRetry: js.UndefOr[js.Function1[/* err */ GaxiosError[_], Boolean]] = js.undefined
  /**
    * The HTTP response status codes that will automatically be retried.
    * Defaults to: [[100, 199], [429, 429], [500, 599]]
    */
  var statusCodesToRetry: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
}

object RetryConfig {
  @scala.inline
  def apply(
    currentRetryAttempt: Int | Double = null,
    httpMethodsToRetry: js.Array[String] = null,
    noResponseRetries: Int | Double = null,
    onRetryAttempt: /* err */ GaxiosError[js.Any] => Callback = null,
    retry: Int | Double = null,
    retryDelay: Int | Double = null,
    shouldRetry: /* err */ GaxiosError[js.Any] => CallbackTo[Boolean] = null,
    statusCodesToRetry: js.Array[js.Array[Double]] = null
  ): RetryConfig = {
    val __obj = js.Dynamic.literal()
    if (currentRetryAttempt != null) __obj.updateDynamic("currentRetryAttempt")(currentRetryAttempt.asInstanceOf[js.Any])
    if (httpMethodsToRetry != null) __obj.updateDynamic("httpMethodsToRetry")(httpMethodsToRetry.asInstanceOf[js.Any])
    if (noResponseRetries != null) __obj.updateDynamic("noResponseRetries")(noResponseRetries.asInstanceOf[js.Any])
    if (onRetryAttempt != null) __obj.updateDynamic("onRetryAttempt")(js.Any.fromFunction1((t0: /* err */ typingsJapgolly.gaxios.commonMod.GaxiosError[js.Any]) => onRetryAttempt(t0).runNow()))
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (retryDelay != null) __obj.updateDynamic("retryDelay")(retryDelay.asInstanceOf[js.Any])
    if (shouldRetry != null) __obj.updateDynamic("shouldRetry")(js.Any.fromFunction1((t0: /* err */ typingsJapgolly.gaxios.commonMod.GaxiosError[js.Any]) => shouldRetry(t0).runNow()))
    if (statusCodesToRetry != null) __obj.updateDynamic("statusCodesToRetry")(statusCodesToRetry.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryConfig]
  }
}

