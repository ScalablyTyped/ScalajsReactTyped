package typingsJapgolly.jqrangeslider

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait jQRangeSliderScale extends js.Object {
  var first: js.UndefOr[js.Function2[/* min */ Double, /* max */ Double, Double]] = js.undefined
   // 'true' to stop scale generating ticks from a given value
  var format: js.UndefOr[
    js.Function3[
      /* tickContainer */ js.Any, 
      /* tickStartValue */ js.Any, 
      /* tickEndValue */ js.Any, 
      Unit
    ]
  ] = js.undefined
   // compute the next value.
  var label: js.UndefOr[js.Function2[/* value */ js.Any, /* nextValue */ js.Any, String]] = js.undefined
   // compute displayed text for a given internal
  var stop: js.UndefOr[js.Function1[/* value */ js.Any, Boolean]] = js.undefined
   // compute the ruler first value.
  def next(value: js.Any): js.Any
}

object jQRangeSliderScale {
  @scala.inline
  def apply(
    next: js.Any => CallbackTo[js.Any],
    first: (/* min */ Double, /* max */ Double) => CallbackTo[Double] = null,
    format: (/* tickContainer */ js.Any, /* tickStartValue */ js.Any, /* tickEndValue */ js.Any) => Callback = null,
    label: (/* value */ js.Any, /* nextValue */ js.Any) => CallbackTo[String] = null,
    stop: /* value */ js.Any => CallbackTo[Boolean] = null
  ): jQRangeSliderScale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("next")(js.Any.fromFunction1((t0: js.Any) => next(t0).runNow()))
    if (first != null) __obj.updateDynamic("first")(js.Any.fromFunction2((t0: /* min */ scala.Double, t1: /* max */ scala.Double) => first(t0, t1).runNow()))
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction3((t0: /* tickContainer */ js.Any, t1: /* tickStartValue */ js.Any, t2: /* tickEndValue */ js.Any) => format(t0, t1, t2).runNow()))
    if (label != null) __obj.updateDynamic("label")(js.Any.fromFunction2((t0: /* value */ js.Any, t1: /* nextValue */ js.Any) => label(t0, t1).runNow()))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: /* value */ js.Any) => stop(t0).runNow()))
    __obj.asInstanceOf[jQRangeSliderScale]
  }
}

