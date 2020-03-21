package typingsJapgolly.oracleOraclejet.ojdvtBaseMod

import typingsJapgolly.oracleOraclejet.AnonLabelCountWithTotal
import typingsJapgolly.oracleOraclejet.mod.baseComponentSettableProperties
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dvtBaseComponentSettableProperties extends baseComponentSettableProperties {
  var trackResize: on | off
  @JSName("translations")
  var translations_dvtBaseComponentSettableProperties: AnonLabelCountWithTotal
}

object dvtBaseComponentSettableProperties {
  @scala.inline
  def apply(trackResize: on | off, translations: AnonLabelCountWithTotal): dvtBaseComponentSettableProperties = {
    val __obj = js.Dynamic.literal(trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[dvtBaseComponentSettableProperties]
  }
}

