package typingsJapgolly.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReceiptRuleSetResponse extends js.Object {
  /**
    * The metadata for the receipt rule set, which consists of the rule set name and the timestamp of when the rule set was created.
    */
  var Metadata: js.UndefOr[ReceiptRuleSetMetadata] = js.native
  /**
    * A list of the receipt rules that belong to the specified receipt rule set.
    */
  var Rules: js.UndefOr[ReceiptRulesList] = js.native
}

object DescribeReceiptRuleSetResponse {
  @scala.inline
  def apply(Metadata: ReceiptRuleSetMetadata = null, Rules: ReceiptRulesList = null): DescribeReceiptRuleSetResponse = {
    val __obj = js.Dynamic.literal()
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata.asInstanceOf[js.Any])
    if (Rules != null) __obj.updateDynamic("Rules")(Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReceiptRuleSetResponse]
  }
}

