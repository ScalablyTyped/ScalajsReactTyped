package typingsJapgolly.oracleOraclejet.ojbuttonMod

import typingsJapgolly.oracleOraclejet.mod.baseComponentSettableProperties
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.all
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.full
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.half
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.icons
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.outlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojButtonSettableProperties extends baseComponentSettableProperties {
  var chroming: full | half | outlined
  var disabled: Boolean
  var display: all | icons
}

object ojButtonSettableProperties {
  @scala.inline
  def apply(
    chroming: full | half | outlined,
    disabled: Boolean,
    display: all | icons,
    translations: js.Object = null
  ): ojButtonSettableProperties = {
    val __obj = js.Dynamic.literal(chroming = chroming.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojButtonSettableProperties]
  }
}

