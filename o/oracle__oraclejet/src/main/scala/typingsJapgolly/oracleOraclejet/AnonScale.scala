package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.ojtimeaxisMod.ojTimeAxis.Converters
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.days
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hours
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.minutes
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.months
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.quarters
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.seconds
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.weeks
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScale extends js.Object {
  var converter: js.UndefOr[Converters | Converter[String]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var scale: seconds | minutes | hours | days | weeks | months | quarters | years
  var zoomOrder: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonScale {
  @scala.inline
  def apply(
    scale: seconds | minutes | hours | days | weeks | months | quarters | years,
    converter: Converters | Converter[String] = null,
    height: Int | Double = null,
    zoomOrder: js.Array[String] = null
  ): AnonScale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (zoomOrder != null) __obj.updateDynamic("zoomOrder")(zoomOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScale]
  }
}

