package typingsJapgolly.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackDriftDetectionStatusInput extends js.Object {
  /**
    * The ID of the drift detection results of this operation.  AWS CloudFormation generates new results, with a new drift detection ID, each time this operation is run. However, the number of drift results AWS CloudFormation retains for any given stack, and for how long, may vary. 
    */
  var StackDriftDetectionId: typingsJapgolly.awsSdk.cloudformationMod.StackDriftDetectionId = js.native
}

object DescribeStackDriftDetectionStatusInput {
  @scala.inline
  def apply(StackDriftDetectionId: StackDriftDetectionId): DescribeStackDriftDetectionStatusInput = {
    val __obj = js.Dynamic.literal(StackDriftDetectionId = StackDriftDetectionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeStackDriftDetectionStatusInput]
  }
}

