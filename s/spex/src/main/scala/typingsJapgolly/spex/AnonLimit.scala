package typingsJapgolly.spex

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLimit extends js.Object {
  var dest: js.UndefOr[js.Function3[/* index */ Double, /* data */ js.Any, /* delay */ Double, _]] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var track: js.UndefOr[Boolean] = js.undefined
}

object AnonLimit {
  @scala.inline
  def apply(
    dest: (/* index */ Double, /* data */ js.Any, /* delay */ Double) => CallbackTo[js.Any] = null,
    limit: Int | Double = null,
    track: js.UndefOr[Boolean] = js.undefined
  ): AnonLimit = {
    val __obj = js.Dynamic.literal()
    if (dest != null) __obj.updateDynamic("dest")(js.Any.fromFunction3((t0: /* index */ scala.Double, t1: /* data */ js.Any, t2: /* delay */ scala.Double) => dest(t0, t1, t2).runNow()))
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(track)) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLimit]
  }
}

