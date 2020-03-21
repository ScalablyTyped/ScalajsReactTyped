package typingsJapgolly.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGlobalSecondaryIndexAction extends js.Object {
  /**
    * The name of the global secondary index to be updated.
    */
  var IndexName: typingsJapgolly.awsSdk.documentClientMod.DocumentClient.IndexName = js.native
  /**
    * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Limits in the Amazon DynamoDB Developer Guide.
    */
  var ProvisionedThroughput: typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ProvisionedThroughput = js.native
}

object UpdateGlobalSecondaryIndexAction {
  @scala.inline
  def apply(IndexName: IndexName, ProvisionedThroughput: ProvisionedThroughput): UpdateGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateGlobalSecondaryIndexAction]
  }
}

