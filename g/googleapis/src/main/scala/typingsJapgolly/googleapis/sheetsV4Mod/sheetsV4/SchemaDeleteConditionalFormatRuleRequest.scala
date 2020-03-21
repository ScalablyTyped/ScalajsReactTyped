package typingsJapgolly.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes a conditional format rule at the given index. All subsequent
  * rules&#39; indexes are decremented.
  */
@js.native
trait SchemaDeleteConditionalFormatRuleRequest extends js.Object {
  /**
    * The zero-based index of the rule to be deleted.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * The sheet the rule is being deleted from.
    */
  var sheetId: js.UndefOr[Double] = js.native
}

object SchemaDeleteConditionalFormatRuleRequest {
  @scala.inline
  def apply(index: Int | Double = null, sheetId: Int | Double = null): SchemaDeleteConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeleteConditionalFormatRuleRequest]
  }
}

