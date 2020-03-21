package typingsJapgolly.apolloServerCaching

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxSize[V] extends js.Object {
  var maxSize: js.UndefOr[Double] = js.undefined
  var onDispose: js.UndefOr[js.Function2[/* key */ String, /* value */ V, Unit]] = js.undefined
  var sizeCalculator: js.UndefOr[js.Function2[/* value */ V, /* key */ String, Double]] = js.undefined
}

object AnonMaxSize {
  @scala.inline
  def apply[V](
    maxSize: Int | Double = null,
    onDispose: (/* key */ String, /* value */ V) => Callback = null,
    sizeCalculator: (/* value */ V, /* key */ String) => CallbackTo[Double] = null
  ): AnonMaxSize[V] = {
    val __obj = js.Dynamic.literal()
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (onDispose != null) __obj.updateDynamic("onDispose")(js.Any.fromFunction2((t0: /* key */ java.lang.String, t1: /* value */ V) => onDispose(t0, t1).runNow()))
    if (sizeCalculator != null) __obj.updateDynamic("sizeCalculator")(js.Any.fromFunction2((t0: /* value */ V, t1: /* key */ java.lang.String) => sizeCalculator(t0, t1).runNow()))
    __obj.asInstanceOf[AnonMaxSize[V]]
  }
}

