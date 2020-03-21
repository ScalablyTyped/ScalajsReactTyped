package typingsJapgolly.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackSetOperationOutput extends js.Object {
  /**
    * The specified stack set operation.
    */
  var StackSetOperation: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.StackSetOperation] = js.native
}

object DescribeStackSetOperationOutput {
  @scala.inline
  def apply(StackSetOperation: StackSetOperation = null): DescribeStackSetOperationOutput = {
    val __obj = js.Dynamic.literal()
    if (StackSetOperation != null) __obj.updateDynamic("StackSetOperation")(StackSetOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackSetOperationOutput]
  }
}

