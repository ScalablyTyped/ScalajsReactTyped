package typingsJapgolly.oracleOraclejet.ojtimeaxisMod

import typingsJapgolly.oracleOraclejet.AnonLabelAndValue
import typingsJapgolly.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typingsJapgolly.oracleOraclejet.ojtimeaxisMod.ojTimeAxis.Converters
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.days
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hours
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.minutes
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.months
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.quarters
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.seconds
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.weeks
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTimeAxisSettableProperties extends dvtBaseComponentSettableProperties {
  var converter: Converters | Converter[String]
  var end: String
  var scale: seconds | minutes | hours | days | weeks | months | quarters | years
  var start: String
  @JSName("translations")
  var translations_ojTimeAxisSettableProperties: AnonLabelAndValue
}

object ojTimeAxisSettableProperties {
  @scala.inline
  def apply(
    converter: Converters | Converter[String],
    end: String,
    scale: seconds | minutes | hours | days | weeks | months | quarters | years,
    start: String,
    trackResize: on | off,
    translations: AnonLabelAndValue
  ): ojTimeAxisSettableProperties = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojTimeAxisSettableProperties]
  }
}

