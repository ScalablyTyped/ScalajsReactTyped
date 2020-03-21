package typingsJapgolly.backboneFetchCache.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCacheKeyObject extends _GetCacheKeyOptions {
  var getCacheKey: js.UndefOr[js.Function1[/* opts */ js.UndefOr[GetCacheOptions], String]] = js.undefined
  var url: js.UndefOr[js.Function0[String]] = js.undefined
}

object GetCacheKeyObject {
  @scala.inline
  def apply(
    getCacheKey: /* opts */ js.UndefOr[GetCacheOptions] => CallbackTo[String] = null,
    url: js.UndefOr[CallbackTo[String]] = js.undefined
  ): GetCacheKeyObject = {
    val __obj = js.Dynamic.literal()
    if (getCacheKey != null) __obj.updateDynamic("getCacheKey")(js.Any.fromFunction1((t0: /* opts */ js.UndefOr[typingsJapgolly.backboneFetchCache.mod.GetCacheOptions]) => getCacheKey(t0).runNow()))
    url.foreach(p => __obj.updateDynamic("url")(p.toJsFn))
    __obj.asInstanceOf[GetCacheKeyObject]
  }
}

