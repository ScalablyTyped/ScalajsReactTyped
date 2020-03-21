package typingsJapgolly.reactNativeUuid.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait v4 extends js.Object {
  var random: js.UndefOr[js.Array[Double]] = js.undefined
  var rng: js.UndefOr[js.Function1[/* args */ js.Any, Unit]] = js.undefined
}

object v4 {
  @scala.inline
  def apply(random: js.Array[Double] = null, rng: /* args */ js.Any => Callback = null): v4 = {
    val __obj = js.Dynamic.literal()
    if (random != null) __obj.updateDynamic("random")(random.asInstanceOf[js.Any])
    if (rng != null) __obj.updateDynamic("rng")(js.Any.fromFunction1((t0: /* args */ js.Any) => rng(t0).runNow()))
    __obj.asInstanceOf[v4]
  }
}

