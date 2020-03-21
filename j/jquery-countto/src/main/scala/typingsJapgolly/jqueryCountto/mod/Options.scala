package typingsJapgolly.jqueryCountto.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  from  :number,   to  :number,   speed  :number,   refreshInterval  :number,   decimals  :number, formatter (value : number, options : jquery-countto.jquery-countto.Options): string, onUpdate (value : number): void, onComplete (value : number): void}> */
trait Options extends js.Object {
  var decimals: js.UndefOr[Double] = js.undefined
  var formatter: js.UndefOr[js.Function2[/* value */ Double, /* options */ this.type, String]] = js.undefined
  var from: js.UndefOr[Double] = js.undefined
  var onComplete: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  var onUpdate: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  var refreshInterval: js.UndefOr[Double] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
  var to: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    decimals: Int | Double = null,
    formatter: (/* value */ Double, Options) => CallbackTo[String] = null,
    from: Int | Double = null,
    onComplete: /* value */ Double => Callback = null,
    onUpdate: /* value */ Double => Callback = null,
    refreshInterval: Int | Double = null,
    speed: Int | Double = null,
    to: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (decimals != null) __obj.updateDynamic("decimals")(decimals.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction2((t0: /* value */ scala.Double, t1: typingsJapgolly.jqueryCountto.mod.Options) => formatter(t0, t1).runNow()))
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1((t0: /* value */ scala.Double) => onComplete(t0).runNow()))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1((t0: /* value */ scala.Double) => onUpdate(t0).runNow()))
    if (refreshInterval != null) __obj.updateDynamic("refreshInterval")(refreshInterval.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

