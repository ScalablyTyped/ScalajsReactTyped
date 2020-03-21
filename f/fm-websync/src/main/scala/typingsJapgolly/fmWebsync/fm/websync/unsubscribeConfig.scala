package typingsJapgolly.fmWebsync.fm.websync

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait unsubscribeConfig extends baseRequestConfig {
  /**
    * The channel from which the client should be unsubscribed. Must start with a forward slash (/). Overrides channels.
    */
  var channel: js.UndefOr[String] = js.undefined
  /**
    * The channels from which the client should be unsubscribed. Each must start with a forward slash (/). Overrides channel.
    */
  var channels: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The callback to invoke after onSuccess or onFailure. See unsubscribeCompleteArgs for callback argument details.
    */
  var onComplete: js.UndefOr[js.Function1[/* args */ baseResponseArgs, Unit]] = js.undefined
  /**
    * The callback to invoke if the unsubscribe fails. See unsubscribeFailureArgs for callback argument details.
    */
  var onFailure: js.UndefOr[js.Function1[/* args */ baseFailureArgs, Unit]] = js.undefined
  /**
    * The callback to invoke if the unsubscribe succeeds. See unsubscribeSuccessArgs for callback argument details.
    */
  var onSuccess: js.UndefOr[js.Function1[/* args */ unsubscribeSuccessArgs, Unit]] = js.undefined
}

object unsubscribeConfig {
  @scala.inline
  def apply(
    channel: String = null,
    channels: js.Array[String] = null,
    meta: js.Any = null,
    onComplete: /* args */ baseResponseArgs => Callback = null,
    onFailure: /* args */ baseFailureArgs => Callback = null,
    onSuccess: /* args */ unsubscribeSuccessArgs => Callback = null,
    requestUrl: String = null,
    suppressErrors: js.UndefOr[Boolean] = js.undefined,
    sync: js.UndefOr[Boolean] = js.undefined
  ): unsubscribeConfig = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.fmWebsync.fm.websync.baseResponseArgs) => onComplete(t0).runNow()))
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.fmWebsync.fm.websync.baseFailureArgs) => onFailure(t0).runNow()))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.fmWebsync.fm.websync.unsubscribeSuccessArgs) => onSuccess(t0).runNow()))
    if (requestUrl != null) __obj.updateDynamic("requestUrl")(requestUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressErrors)) __obj.updateDynamic("suppressErrors")(suppressErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[unsubscribeConfig]
  }
}

