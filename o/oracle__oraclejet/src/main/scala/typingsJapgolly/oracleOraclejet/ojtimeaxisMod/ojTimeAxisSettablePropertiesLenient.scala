package typingsJapgolly.oracleOraclejet.ojtimeaxisMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.AnonLabelAndValue
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

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojtimeaxis.ojTimeAxisSettableProperties> */
trait ojTimeAxisSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var converter: js.UndefOr[Converters | Converter[String]] = js.undefined
  var end: js.UndefOr[String] = js.undefined
  var scale: js.UndefOr[seconds | minutes | hours | days | weeks | months | quarters | years] = js.undefined
  var start: js.UndefOr[String] = js.undefined
  var trackResize: js.UndefOr[on | off] = js.undefined
  var translations: js.UndefOr[AnonLabelAndValue] = js.undefined
}

object ojTimeAxisSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    converter: Converters | Converter[String] = null,
    end: String = null,
    scale: seconds | minutes | hours | days | weeks | months | quarters | years = null,
    start: String = null,
    trackResize: on | off = null,
    translations: AnonLabelAndValue = null
  ): ojTimeAxisSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trackResize != null) __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTimeAxisSettablePropertiesLenient]
  }
}

