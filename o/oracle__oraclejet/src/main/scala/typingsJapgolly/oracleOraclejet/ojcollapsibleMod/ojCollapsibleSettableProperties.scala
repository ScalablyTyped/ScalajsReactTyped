package typingsJapgolly.oracleOraclejet.ojcollapsibleMod

import typingsJapgolly.oracleOraclejet.mod.baseComponentSettableProperties
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.disclosureIcon
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojCollapsibleSettableProperties extends baseComponentSettableProperties {
  var disabled: Boolean
  var expandArea: header | disclosureIcon
  var expanded: Boolean
}

object ojCollapsibleSettableProperties {
  @scala.inline
  def apply(
    disabled: Boolean,
    expandArea: header | disclosureIcon,
    expanded: Boolean,
    translations: js.Object = null
  ): ojCollapsibleSettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], expandArea = expandArea.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojCollapsibleSettableProperties]
  }
}

