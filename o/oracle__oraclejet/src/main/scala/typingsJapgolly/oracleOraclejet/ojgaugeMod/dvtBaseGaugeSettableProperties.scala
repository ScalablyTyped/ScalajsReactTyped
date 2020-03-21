package typingsJapgolly.oracleOraclejet.ojgaugeMod

import typingsJapgolly.oracleOraclejet.AnonLabelAndValue
import typingsJapgolly.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dvtBaseGaugeSettableProperties extends dvtBaseComponentSettableProperties {
  @JSName("translations")
  var translations_dvtBaseGaugeSettableProperties: AnonLabelAndValue
}

object dvtBaseGaugeSettableProperties {
  @scala.inline
  def apply(trackResize: on | off, translations: AnonLabelAndValue): dvtBaseGaugeSettableProperties = {
    val __obj = js.Dynamic.literal(trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[dvtBaseGaugeSettableProperties]
  }
}

