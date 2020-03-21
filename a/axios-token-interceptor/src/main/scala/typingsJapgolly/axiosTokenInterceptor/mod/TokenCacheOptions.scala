package typingsJapgolly.axiosTokenInterceptor.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenCacheOptions extends js.Object {
  var getMaxAge: js.UndefOr[js.Function0[Double]] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
}

object TokenCacheOptions {
  @scala.inline
  def apply(getMaxAge: js.UndefOr[CallbackTo[Double]] = js.undefined, maxAge: Int | Double = null): TokenCacheOptions = {
    val __obj = js.Dynamic.literal()
    getMaxAge.foreach(p => __obj.updateDynamic("getMaxAge")(p.toJsFn))
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenCacheOptions]
  }
}

