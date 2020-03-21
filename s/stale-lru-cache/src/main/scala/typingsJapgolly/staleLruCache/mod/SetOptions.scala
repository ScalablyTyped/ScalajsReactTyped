package typingsJapgolly.staleLruCache.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOptions[K, V] extends js.Object {
  var maxAge: js.UndefOr[Double] = js.undefined
  var revalidate: js.UndefOr[RevalidationCallback[K, V]] = js.undefined
  var staleWhileRevalidate: js.UndefOr[Double] = js.undefined
}

object SetOptions {
  @scala.inline
  def apply[K, V](
    maxAge: Int | Double = null,
    revalidate: (K, /* callback */ OptionsCallback[K, V]) => Callback = null,
    staleWhileRevalidate: Int | Double = null
  ): SetOptions[K, V] = {
    val __obj = js.Dynamic.literal()
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (revalidate != null) __obj.updateDynamic("revalidate")(js.Any.fromFunction2((t0: K, t1: /* callback */ typingsJapgolly.staleLruCache.mod.OptionsCallback[K, V]) => revalidate(t0, t1).runNow()))
    if (staleWhileRevalidate != null) __obj.updateDynamic("staleWhileRevalidate")(staleWhileRevalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOptions[K, V]]
  }
}

