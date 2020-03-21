package typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.ColorConverter

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hex
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hex3
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hsl
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hsv
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rgb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ConverterOptions extends js.Object {
  var format: js.UndefOr[rgb | hsl | hsv | hex | hex3] = js.undefined
}

object ConverterOptions {
  @scala.inline
  def apply(format: rgb | hsl | hsv | hex | hex3 = null): ConverterOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterOptions]
  }
}

