package typingsJapgolly.asyncRetry.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.retry.mod.OperationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends OperationOptions {
  var onRetry: js.UndefOr[js.Function2[/* e */ js.Error, /* attempt */ Double, _]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    factor: Int | Double = null,
    forever: js.UndefOr[Boolean] = js.undefined,
    maxRetryTime: Int | Double = null,
    maxTimeout: Int | Double = null,
    minTimeout: Int | Double = null,
    onRetry: (/* e */ js.Error, /* attempt */ Double) => CallbackTo[js.Any] = null,
    randomize: js.UndefOr[Boolean] = js.undefined,
    retries: Int | Double = null,
    unref: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (!js.isUndefined(forever)) __obj.updateDynamic("forever")(forever.asInstanceOf[js.Any])
    if (maxRetryTime != null) __obj.updateDynamic("maxRetryTime")(maxRetryTime.asInstanceOf[js.Any])
    if (maxTimeout != null) __obj.updateDynamic("maxTimeout")(maxTimeout.asInstanceOf[js.Any])
    if (minTimeout != null) __obj.updateDynamic("minTimeout")(minTimeout.asInstanceOf[js.Any])
    if (onRetry != null) __obj.updateDynamic("onRetry")(js.Any.fromFunction2((t0: /* e */ js.Error, t1: /* attempt */ scala.Double) => onRetry(t0, t1).runNow()))
    if (!js.isUndefined(randomize)) __obj.updateDynamic("randomize")(randomize.asInstanceOf[js.Any])
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (!js.isUndefined(unref)) __obj.updateDynamic("unref")(unref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

