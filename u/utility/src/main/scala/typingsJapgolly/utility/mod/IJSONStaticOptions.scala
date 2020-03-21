package typingsJapgolly.utility.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ----------------0_0-----------------------
  * @description Defines For JSON methods
  * @see https://github.com/node-modules/utility#json
  * -----------------0^0-----------------------
  */
trait IJSONStaticOptions extends js.Object {
  var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.undefined
  var space: js.UndefOr[Double | String] = js.undefined
}

object IJSONStaticOptions {
  @scala.inline
  def apply(
    replacer: (/* key */ String, /* value */ js.Any) => CallbackTo[js.Any] = null,
    space: Double | String = null
  ): IJSONStaticOptions = {
    val __obj = js.Dynamic.literal()
    if (replacer != null) __obj.updateDynamic("replacer")(js.Any.fromFunction2((t0: /* key */ java.lang.String, t1: /* value */ js.Any) => replacer(t0, t1).runNow()))
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJSONStaticOptions]
  }
}

