package typingsJapgolly.oracleOraclejet.ojmenuMod

import typingsJapgolly.oracleOraclejet.AnonAriaFocusSkipLink
import typingsJapgolly.oracleOraclejet.mod.baseComponentSettableProperties
import typingsJapgolly.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojMenuSettableProperties extends baseComponentSettableProperties {
  var disabled: Boolean
  var openOptions: OpenOptions
  @JSName("translations")
  var translations_ojMenuSettableProperties: AnonAriaFocusSkipLink
}

object ojMenuSettableProperties {
  @scala.inline
  def apply(disabled: Boolean, openOptions: OpenOptions, translations: AnonAriaFocusSkipLink): ojMenuSettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], openOptions = openOptions.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojMenuSettableProperties]
  }
}

