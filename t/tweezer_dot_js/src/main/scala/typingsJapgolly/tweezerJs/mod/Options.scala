package typingsJapgolly.tweezerJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[
    js.Function4[
      /* currentTime */ Double, 
      /* beginningTime */ Double, 
      /* changeInValue */ Double, 
      /* duration */ Double, 
      Double
    ]
  ] = js.undefined
  var end: Double
  var start: Double
}

object Options {
  @scala.inline
  def apply(
    end: Double,
    start: Double,
    duration: Int | Double = null,
    easing: (/* currentTime */ Double, /* beginningTime */ Double, /* changeInValue */ Double, /* duration */ Double) => CallbackTo[Double] = null
  ): Options = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction4((t0: /* currentTime */ scala.Double, t1: /* beginningTime */ scala.Double, t2: /* changeInValue */ scala.Double, t3: /* duration */ scala.Double) => easing(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[Options]
  }
}

