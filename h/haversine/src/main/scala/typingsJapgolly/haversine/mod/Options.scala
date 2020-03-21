package typingsJapgolly.haversine.mod

import typingsJapgolly.haversine.haversineStrings.LeftcurlybracketlatCommalngRightcurlybracket
import typingsJapgolly.haversine.haversineStrings.LeftcurlybracketlonCommalatRightcurlybracket
import typingsJapgolly.haversine.haversineStrings.`[latCommalon]`
import typingsJapgolly.haversine.haversineStrings.`[lonCommalat]`
import typingsJapgolly.haversine.haversineStrings.geojson
import typingsJapgolly.haversine.haversineStrings.km
import typingsJapgolly.haversine.haversineStrings.meter
import typingsJapgolly.haversine.haversineStrings.mile
import typingsJapgolly.haversine.haversineStrings.nmi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Format of coordinate arguments. */
  var format: js.UndefOr[
    `[latCommalon]` | `[lonCommalat]` | LeftcurlybracketlonCommalatRightcurlybracket | LeftcurlybracketlatCommalngRightcurlybracket | geojson
  ] = js.undefined
  /**
    * If passed, will result in library returning boolean value of whether or not the start and end points are within that supplied threshold.
    */
  var threshold: js.UndefOr[Double | Null] = js.undefined
  /** Unit of measurement applied to result. Default: "km". */
  var unit: js.UndefOr[km | mile | meter | nmi] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    format: `[latCommalon]` | `[lonCommalat]` | LeftcurlybracketlonCommalatRightcurlybracket | LeftcurlybracketlatCommalngRightcurlybracket | geojson = null,
    threshold: Int | Double = null,
    unit: km | mile | meter | nmi = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

