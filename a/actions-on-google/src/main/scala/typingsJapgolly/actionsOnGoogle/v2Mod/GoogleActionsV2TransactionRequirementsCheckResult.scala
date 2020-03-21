package typingsJapgolly.actionsOnGoogle.v2Mod

import typingsJapgolly.actionsOnGoogle.requirementsMod.TransactionRequirementsArgument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2TransactionRequirementsCheckResult extends TransactionRequirementsArgument {
  /**
    * Result of the operation.
    */
  var resultType: js.UndefOr[GoogleActionsV2TransactionRequirementsCheckResultResultType] = js.undefined
}

object GoogleActionsV2TransactionRequirementsCheckResult {
  @scala.inline
  def apply(resultType: GoogleActionsV2TransactionRequirementsCheckResultResultType = null): GoogleActionsV2TransactionRequirementsCheckResult = {
    val __obj = js.Dynamic.literal()
    if (resultType != null) __obj.updateDynamic("resultType")(resultType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2TransactionRequirementsCheckResult]
  }
}

