package typingsJapgolly.asciichart.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotConfig extends js.Object {
  var format: js.UndefOr[js.Function2[/* x */ Double, /* i */ Double, String]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[String] = js.undefined
}

object PlotConfig {
  @scala.inline
  def apply(
    format: (/* x */ Double, /* i */ Double) => CallbackTo[String] = null,
    height: Int | Double = null,
    offset: Int | Double = null,
    padding: String = null
  ): PlotConfig = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction2((t0: /* x */ scala.Double, t1: /* i */ scala.Double) => format(t0, t1).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotConfig]
  }
}

