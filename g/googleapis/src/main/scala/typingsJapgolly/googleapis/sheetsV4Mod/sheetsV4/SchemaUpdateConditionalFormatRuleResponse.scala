package typingsJapgolly.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of updating a conditional format rule.
  */
@js.native
trait SchemaUpdateConditionalFormatRuleResponse extends js.Object {
  /**
    * The index of the new rule.
    */
  var newIndex: js.UndefOr[Double] = js.native
  /**
    * The new rule that replaced the old rule (if replacing), or the rule that
    * was moved (if moved)
    */
  var newRule: js.UndefOr[SchemaConditionalFormatRule] = js.native
  /**
    * The old index of the rule. Not set if a rule was replaced (because it is
    * the same as new_index).
    */
  var oldIndex: js.UndefOr[Double] = js.native
  /**
    * The old (deleted) rule. Not set if a rule was moved (because it is the
    * same as new_rule).
    */
  var oldRule: js.UndefOr[SchemaConditionalFormatRule] = js.native
}

object SchemaUpdateConditionalFormatRuleResponse {
  @scala.inline
  def apply(
    newIndex: Int | Double = null,
    newRule: SchemaConditionalFormatRule = null,
    oldIndex: Int | Double = null,
    oldRule: SchemaConditionalFormatRule = null
  ): SchemaUpdateConditionalFormatRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (newIndex != null) __obj.updateDynamic("newIndex")(newIndex.asInstanceOf[js.Any])
    if (newRule != null) __obj.updateDynamic("newRule")(newRule.asInstanceOf[js.Any])
    if (oldIndex != null) __obj.updateDynamic("oldIndex")(oldIndex.asInstanceOf[js.Any])
    if (oldRule != null) __obj.updateDynamic("oldRule")(oldRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateConditionalFormatRuleResponse]
  }
}

