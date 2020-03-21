package typingsJapgolly.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTagValuesInput extends js.Object {
  /**
    * The key for which you want to list all existing values in the specified Region for the AWS account.
    */
  var Key: TagKey = js.native
  /**
    * A string that indicates that additional data is available. Leave this value empty for your initial request. If the response includes a PaginationToken, use that string for this value to request an additional page of data.
    */
  var PaginationToken: js.UndefOr[typingsJapgolly.awsSdk.resourcegroupstaggingapiMod.PaginationToken] = js.native
}

object GetTagValuesInput {
  @scala.inline
  def apply(Key: TagKey, PaginationToken: PaginationToken = null): GetTagValuesInput = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTagValuesInput]
  }
}

