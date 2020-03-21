package typingsJapgolly.asyncCache.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T]
  extends typingsJapgolly.lruCache.mod.Options[String, T] {
  def load(
    key: String,
    callback: js.Function3[/* error */ js.Any, /* asyncValue */ T, /* maxAge */ js.UndefOr[Double], Unit]
  ): Unit
}

object Options {
  @scala.inline
  def apply[T](
    load: (String, js.Function3[/* error */ js.Any, /* asyncValue */ T, /* maxAge */ js.UndefOr[Double], Unit]) => Callback,
    dispose: (String, T) => Callback = null,
    length: (T, /* key */ js.UndefOr[String]) => CallbackTo[Double] = null,
    max: Int | Double = null,
    maxAge: Int | Double = null,
    noDisposeOnSet: js.UndefOr[Boolean] = js.undefined,
    stale: js.UndefOr[Boolean] = js.undefined,
    updateAgeOnGet: js.UndefOr[Boolean] = js.undefined
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("load")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function3[
  /* error */ js.Any, 
  /* asyncValue */ T, 
  /* maxAge */ js.UndefOr[scala.Double], 
  scala.Unit]) => load(t0, t1).runNow()))
    if (dispose != null) __obj.updateDynamic("dispose")(js.Any.fromFunction2((t0: java.lang.String, t1: T) => dispose(t0, t1).runNow()))
    if (length != null) __obj.updateDynamic("length")(js.Any.fromFunction2((t0: T, t1: /* key */ js.UndefOr[java.lang.String]) => length(t0, t1).runNow()))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (!js.isUndefined(noDisposeOnSet)) __obj.updateDynamic("noDisposeOnSet")(noDisposeOnSet.asInstanceOf[js.Any])
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale.asInstanceOf[js.Any])
    if (!js.isUndefined(updateAgeOnGet)) __obj.updateDynamic("updateAgeOnGet")(updateAgeOnGet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[T]]
  }
}

