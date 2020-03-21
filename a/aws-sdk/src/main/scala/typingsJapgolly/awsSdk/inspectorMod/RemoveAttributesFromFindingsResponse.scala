package typingsJapgolly.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveAttributesFromFindingsResponse extends js.Object {
  /**
    * Attributes details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems = js.native
}

object RemoveAttributesFromFindingsResponse {
  @scala.inline
  def apply(failedItems: FailedItems): RemoveAttributesFromFindingsResponse = {
    val __obj = js.Dynamic.literal(failedItems = failedItems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveAttributesFromFindingsResponse]
  }
}

