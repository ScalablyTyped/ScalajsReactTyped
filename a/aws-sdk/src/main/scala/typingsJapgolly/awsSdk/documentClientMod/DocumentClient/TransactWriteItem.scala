package typingsJapgolly.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactWriteItem extends js.Object {
  /**
    * A request to perform a check item operation.
    */
  var ConditionCheck: js.UndefOr[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ConditionCheck] = js.native
  /**
    * A request to perform a DeleteItem operation.
    */
  var Delete: js.UndefOr[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.Delete] = js.native
  /**
    * A request to perform a PutItem operation.
    */
  var Put: js.UndefOr[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.Put] = js.native
  /**
    * A request to perform an UpdateItem operation.
    */
  var Update: js.UndefOr[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.Update] = js.native
}

object TransactWriteItem {
  @scala.inline
  def apply(
    ConditionCheck: ConditionCheck = null,
    Delete: Delete = null,
    Put: Put = null,
    Update: Update = null
  ): TransactWriteItem = {
    val __obj = js.Dynamic.literal()
    if (ConditionCheck != null) __obj.updateDynamic("ConditionCheck")(ConditionCheck.asInstanceOf[js.Any])
    if (Delete != null) __obj.updateDynamic("Delete")(Delete.asInstanceOf[js.Any])
    if (Put != null) __obj.updateDynamic("Put")(Put.asInstanceOf[js.Any])
    if (Update != null) __obj.updateDynamic("Update")(Update.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactWriteItem]
  }
}

