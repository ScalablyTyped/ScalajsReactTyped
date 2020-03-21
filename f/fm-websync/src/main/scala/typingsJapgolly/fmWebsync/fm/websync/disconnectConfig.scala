package typingsJapgolly.fmWebsync.fm.websync

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait disconnectConfig extends baseRequestConfig {
  /**
    * The callback to invoke after onSuccess or onFailure. See disconnectCompleteArgs for callback argument details.
    */
  var onComplete: js.UndefOr[js.Function1[/* args */ baseResponseArgs, Unit]] = js.undefined
  /**
    * The callback to invoke if the disconnect fails. See disconnectFailureArgs for callback argument details.
    */
  var onFailure: js.UndefOr[js.Function1[/* args */ baseFailureArgs, Unit]] = js.undefined
  /**
    * The callback to invoke if the disconnect succeeds. See disconnectSuccessArgs for callback argument details.
    */
  var onSuccess: js.UndefOr[js.Function1[/* args */ baseResponseArgs, Unit]] = js.undefined
}

object disconnectConfig {
  @scala.inline
  def apply(
    meta: js.Any = null,
    onComplete: /* args */ baseResponseArgs => Callback = null,
    onFailure: /* args */ baseFailureArgs => Callback = null,
    onSuccess: /* args */ baseResponseArgs => Callback = null,
    requestUrl: String = null,
    suppressErrors: js.UndefOr[Boolean] = js.undefined,
    sync: js.UndefOr[Boolean] = js.undefined
  ): disconnectConfig = {
    val __obj = js.Dynamic.literal()
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.fmWebsync.fm.websync.baseResponseArgs) => onComplete(t0).runNow()))
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.fmWebsync.fm.websync.baseFailureArgs) => onFailure(t0).runNow()))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.fmWebsync.fm.websync.baseResponseArgs) => onSuccess(t0).runNow()))
    if (requestUrl != null) __obj.updateDynamic("requestUrl")(requestUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressErrors)) __obj.updateDynamic("suppressErrors")(suppressErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[disconnectConfig]
  }
}

