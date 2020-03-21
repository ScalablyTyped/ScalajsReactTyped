package typingsJapgolly.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Threshold extends js.Object {
  var borderColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var shortDesc: js.UndefOr[String] = js.undefined
}

object Threshold {
  @scala.inline
  def apply(
    borderColor: String = null,
    color: String = null,
    max: Int | Double = null,
    shortDesc: String = null
  ): Threshold = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Threshold]
  }
}

