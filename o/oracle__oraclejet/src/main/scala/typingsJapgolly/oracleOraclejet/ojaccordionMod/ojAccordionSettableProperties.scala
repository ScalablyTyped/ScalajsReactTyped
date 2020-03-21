package typingsJapgolly.oracleOraclejet.ojaccordionMod

import typingsJapgolly.oracleOraclejet.AnonId
import typingsJapgolly.oracleOraclejet.mod.baseComponentSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojAccordionSettableProperties extends baseComponentSettableProperties {
  var expanded: (js.Array[AnonId | Double | String]) | Null
  var multiple: Boolean
}

object ojAccordionSettableProperties {
  @scala.inline
  def apply(
    multiple: Boolean,
    expanded: js.Array[AnonId | Double | String] = null,
    translations: js.Object = null
  ): ojAccordionSettableProperties = {
    val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any])
    if (expanded != null) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojAccordionSettableProperties]
  }
}

