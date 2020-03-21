package typingsJapgolly.vegaTypings

import typingsJapgolly.vegaTypings.scaleMod._RangeScheme
import typingsJapgolly.vegaTypings.schemeMod.ColorScheme
import typingsJapgolly.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtent extends _RangeScheme {
  var count: js.UndefOr[Double | SignalRef] = js.undefined
  var extent: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.undefined
  var scheme: String | js.Array[String] | SignalRef | ColorScheme
}

object AnonExtent {
  @scala.inline
  def apply(
    scheme: String | js.Array[String] | SignalRef | ColorScheme,
    count: Double | SignalRef = null,
    extent: (js.Array[Double | SignalRef]) | SignalRef = null
  ): AnonExtent = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtent]
  }
}

