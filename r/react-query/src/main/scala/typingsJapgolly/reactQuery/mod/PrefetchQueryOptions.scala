package typingsJapgolly.reactQuery.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrefetchQueryOptions[TResult] extends QueryOptions[TResult] {
  var force: js.UndefOr[Boolean] = js.undefined
}

object PrefetchQueryOptions {
  @scala.inline
  def apply[TResult](
    cacheTime: Int | Double = null,
    force: js.UndefOr[Boolean] = js.undefined,
    initialData: TResult = null,
    manual: js.UndefOr[Boolean] = js.undefined,
    onError: /* err */ js.Any => Callback = null,
    onSuccess: TResult => Callback = null,
    refetchInterval: `false` | Double = null,
    refetchIntervalInBackground: js.UndefOr[Boolean] = js.undefined,
    refetchOnWindowFocus: js.UndefOr[Boolean] = js.undefined,
    retry: Boolean | Double = null,
    retryDelay: /* retryAttempt */ Double => CallbackTo[Double] = null,
    staleTime: Int | Double = null,
    suspense: js.UndefOr[Boolean] = js.undefined
  ): PrefetchQueryOptions[TResult] = {
    val __obj = js.Dynamic.literal()
    if (cacheTime != null) __obj.updateDynamic("cacheTime")(cacheTime.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (initialData != null) __obj.updateDynamic("initialData")(initialData.asInstanceOf[js.Any])
    if (!js.isUndefined(manual)) __obj.updateDynamic("manual")(manual.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* err */ js.Any) => onError(t0).runNow()))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1((t0: TResult) => onSuccess(t0).runNow()))
    if (refetchInterval != null) __obj.updateDynamic("refetchInterval")(refetchInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(refetchIntervalInBackground)) __obj.updateDynamic("refetchIntervalInBackground")(refetchIntervalInBackground.asInstanceOf[js.Any])
    if (!js.isUndefined(refetchOnWindowFocus)) __obj.updateDynamic("refetchOnWindowFocus")(refetchOnWindowFocus.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (retryDelay != null) __obj.updateDynamic("retryDelay")(js.Any.fromFunction1((t0: /* retryAttempt */ scala.Double) => retryDelay(t0).runNow()))
    if (staleTime != null) __obj.updateDynamic("staleTime")(staleTime.asInstanceOf[js.Any])
    if (!js.isUndefined(suspense)) __obj.updateDynamic("suspense")(suspense.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefetchQueryOptions[TResult]]
  }
}

