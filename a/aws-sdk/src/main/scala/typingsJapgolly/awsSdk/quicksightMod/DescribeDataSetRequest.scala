package typingsJapgolly.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDataSetRequest extends js.Object {
  /**
    * The AWS account ID.
    */
  var AwsAccountId: typingsJapgolly.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The ID for the dataset that you want to create. This ID is unique per AWS Region for each AWS account.
    */
  var DataSetId: ResourceId = js.native
}

object DescribeDataSetRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, DataSetId: ResourceId): DescribeDataSetRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeDataSetRequest]
  }
}

