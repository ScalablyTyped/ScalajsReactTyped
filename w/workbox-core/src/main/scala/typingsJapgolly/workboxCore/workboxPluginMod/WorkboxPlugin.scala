package typingsJapgolly.workboxCore.workboxPluginMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkboxPlugin extends js.Object {
  var cacheDidUpdate: js.UndefOr[CacheDidUpdateCallback] = js.undefined
  var cacheKeyWillBeUsed: js.UndefOr[CacheKeyWillBeUsedCallback] = js.undefined
  var cacheWillUpdate: js.UndefOr[CacheWillUpdateCallback] = js.undefined
  var cachedResponseWillBeUsed: js.UndefOr[CachedResponseWillBeUsedCallback] = js.undefined
  var fetchDidFail: js.UndefOr[FetchDidFailCallback] = js.undefined
  var fetchDidSucceed: js.UndefOr[FetchDidSucceedCallback] = js.undefined
  var requestWillFetch: js.UndefOr[RequestWillFetchCallback] = js.undefined
}

object WorkboxPlugin {
  @scala.inline
  def apply(
    cacheDidUpdate: /* param */ CacheDidUpdateCallbackParam => CallbackTo[js.Promise[Unit]] = null,
    cacheKeyWillBeUsed: /* param */ CacheKeyWillBeUsedCallbackParam => CallbackTo[js.Promise[Request | String]] = null,
    cacheWillUpdate: /* param */ CacheWillUpdateCallbackParamParam => CallbackTo[js.Promise[js.UndefOr[Response]]] = null,
    cachedResponseWillBeUsed: /* param */ CachedResponseWillBeUsedCallbackParam => CallbackTo[js.Promise[js.UndefOr[Response]]] = null,
    fetchDidFail: /* param */ FetchDidFailCallbackParam => CallbackTo[js.Promise[Unit]] = null,
    fetchDidSucceed: /* param */ FetchDidSucceedCallbackParam => CallbackTo[js.Promise[Response]] = null,
    requestWillFetch: /* param */ RequestWillFetchCallbackParam => CallbackTo[js.Promise[js.UndefOr[Request]]] = null
  ): WorkboxPlugin = {
    val __obj = js.Dynamic.literal()
    if (cacheDidUpdate != null) __obj.updateDynamic("cacheDidUpdate")(js.Any.fromFunction1((t0: /* param */ typingsJapgolly.workboxCore.workboxPluginMod.CacheDidUpdateCallbackParam) => cacheDidUpdate(t0).runNow()))
    if (cacheKeyWillBeUsed != null) __obj.updateDynamic("cacheKeyWillBeUsed")(js.Any.fromFunction1((t0: /* param */ typingsJapgolly.workboxCore.workboxPluginMod.CacheKeyWillBeUsedCallbackParam) => cacheKeyWillBeUsed(t0).runNow()))
    if (cacheWillUpdate != null) __obj.updateDynamic("cacheWillUpdate")(js.Any.fromFunction1((t0: /* param */ typingsJapgolly.workboxCore.workboxPluginMod.CacheWillUpdateCallbackParamParam) => cacheWillUpdate(t0).runNow()))
    if (cachedResponseWillBeUsed != null) __obj.updateDynamic("cachedResponseWillBeUsed")(js.Any.fromFunction1((t0: /* param */ typingsJapgolly.workboxCore.workboxPluginMod.CachedResponseWillBeUsedCallbackParam) => cachedResponseWillBeUsed(t0).runNow()))
    if (fetchDidFail != null) __obj.updateDynamic("fetchDidFail")(js.Any.fromFunction1((t0: /* param */ typingsJapgolly.workboxCore.workboxPluginMod.FetchDidFailCallbackParam) => fetchDidFail(t0).runNow()))
    if (fetchDidSucceed != null) __obj.updateDynamic("fetchDidSucceed")(js.Any.fromFunction1((t0: /* param */ typingsJapgolly.workboxCore.workboxPluginMod.FetchDidSucceedCallbackParam) => fetchDidSucceed(t0).runNow()))
    if (requestWillFetch != null) __obj.updateDynamic("requestWillFetch")(js.Any.fromFunction1((t0: /* param */ typingsJapgolly.workboxCore.workboxPluginMod.RequestWillFetchCallbackParam) => requestWillFetch(t0).runNow()))
    __obj.asInstanceOf[WorkboxPlugin]
  }
}

