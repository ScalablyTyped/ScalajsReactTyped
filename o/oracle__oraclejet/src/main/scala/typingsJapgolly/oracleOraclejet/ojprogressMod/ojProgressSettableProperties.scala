package typingsJapgolly.oracleOraclejet.ojprogressMod

import typingsJapgolly.oracleOraclejet.AnonAriaIndeterminateProgressText
import typingsJapgolly.oracleOraclejet.mod.baseComponentSettableProperties
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.bar
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.circle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojProgressSettableProperties extends baseComponentSettableProperties {
  var max: Double
  @JSName("translations")
  var translations_ojProgressSettableProperties: AnonAriaIndeterminateProgressText
  var `type`: bar | circle
  var value: Double
}

object ojProgressSettableProperties {
  @scala.inline
  def apply(max: Double, translations: AnonAriaIndeterminateProgressText, `type`: bar | circle, value: Double): ojProgressSettableProperties = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojProgressSettableProperties]
  }
}

