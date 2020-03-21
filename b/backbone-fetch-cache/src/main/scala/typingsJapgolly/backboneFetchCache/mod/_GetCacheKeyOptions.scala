package typingsJapgolly.backboneFetchCache.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _GetCacheKeyOptions extends js.Object

object _GetCacheKeyOptions {
  @scala.inline
  def AnonUrl(url: String): _GetCacheKeyOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_GetCacheKeyOptions]
  }
  @scala.inline
  def GetCacheKeyObject(
    getCacheKey: /* opts */ js.UndefOr[GetCacheOptions] => CallbackTo[String] = null,
    url: js.UndefOr[CallbackTo[String]] = js.undefined
  ): _GetCacheKeyOptions = {
    val __obj = js.Dynamic.literal()
    if (getCacheKey != null) __obj.updateDynamic("getCacheKey")(js.Any.fromFunction1((t0: /* opts */ js.UndefOr[typingsJapgolly.backboneFetchCache.mod.GetCacheOptions]) => getCacheKey(t0).runNow()))
    url.foreach(p => __obj.updateDynamic("url")(p.toJsFn))
    __obj.asInstanceOf[_GetCacheKeyOptions]
  }
}

