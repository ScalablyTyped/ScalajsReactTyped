package typingsJapgolly.oracleOraclejet.ojbuttonMod

import typingsJapgolly.oracleOraclejet.mod.baseComponentSettableProperties
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.all
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.full
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.half
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.icons
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.oneTabstop
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.outlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojButtonsetOneSettableProperties extends baseComponentSettableProperties {
  var chroming: full | half | outlined
  var disabled: Boolean
  var display: all | icons
  var focusManagement: oneTabstop | none
  var value: js.Any
}

object ojButtonsetOneSettableProperties {
  @scala.inline
  def apply(
    chroming: full | half | outlined,
    disabled: Boolean,
    display: all | icons,
    focusManagement: oneTabstop | none,
    value: js.Any,
    translations: js.Object = null
  ): ojButtonsetOneSettableProperties = {
    val __obj = js.Dynamic.literal(chroming = chroming.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], focusManagement = focusManagement.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojButtonsetOneSettableProperties]
  }
}

