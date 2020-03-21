package typingsJapgolly.cachefactory.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPutOptions extends ItemInfo {
  var maxAge: js.UndefOr[Double] = js.undefined
  var onExpire: js.UndefOr[OnExpireCallback] = js.undefined
  var storeOnReject: js.UndefOr[Boolean] = js.undefined
  var storeOnResolve: js.UndefOr[Boolean] = js.undefined
}

object GetPutOptions {
  @scala.inline
  def apply(
    accessed: Int | Double = null,
    created: Int | Double = null,
    expires: Int | Double = null,
    isExpired: js.UndefOr[Boolean] = js.undefined,
    maxAge: Int | Double = null,
    onExpire: (/* key */ String, /* value */ js.Any, /* done */ js.UndefOr[js.Function]) => Callback = null,
    storeOnReject: js.UndefOr[Boolean] = js.undefined,
    storeOnResolve: js.UndefOr[Boolean] = js.undefined
  ): GetPutOptions = {
    val __obj = js.Dynamic.literal()
    if (accessed != null) __obj.updateDynamic("accessed")(accessed.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpired)) __obj.updateDynamic("isExpired")(isExpired.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (onExpire != null) __obj.updateDynamic("onExpire")(js.Any.fromFunction3((t0: /* key */ java.lang.String, t1: /* value */ js.Any, t2: /* done */ js.UndefOr[js.Function]) => onExpire(t0, t1, t2).runNow()))
    if (!js.isUndefined(storeOnReject)) __obj.updateDynamic("storeOnReject")(storeOnReject.asInstanceOf[js.Any])
    if (!js.isUndefined(storeOnResolve)) __obj.updateDynamic("storeOnResolve")(storeOnResolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPutOptions]
  }
}

