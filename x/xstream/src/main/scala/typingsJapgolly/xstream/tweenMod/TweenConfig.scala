package typingsJapgolly.xstream.tweenMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TweenConfig extends js.Object {
  var duration: Double
  var ease: js.UndefOr[Ease] = js.undefined
  var from: Double
  var interval: js.UndefOr[Double] = js.undefined
  var to: Double
}

object TweenConfig {
  @scala.inline
  def apply(
    duration: Double,
    from: Double,
    to: Double,
    ease: (/* x */ Double, /* from */ Double, /* to */ Double) => CallbackTo[Double] = null,
    interval: Int | Double = null
  ): TweenConfig = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(js.Any.fromFunction3((t0: /* x */ scala.Double, t1: /* from */ scala.Double, t2: /* to */ scala.Double) => ease(t0, t1, t2).runNow()))
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[TweenConfig]
  }
}

