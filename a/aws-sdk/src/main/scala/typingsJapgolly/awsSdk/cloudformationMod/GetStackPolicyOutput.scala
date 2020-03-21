package typingsJapgolly.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStackPolicyOutput extends js.Object {
  /**
    * Structure containing the stack policy body. (For more information, go to  Prevent Updates to Stack Resources in the AWS CloudFormation User Guide.)
    */
  var StackPolicyBody: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.StackPolicyBody] = js.native
}

object GetStackPolicyOutput {
  @scala.inline
  def apply(StackPolicyBody: StackPolicyBody = null): GetStackPolicyOutput = {
    val __obj = js.Dynamic.literal()
    if (StackPolicyBody != null) __obj.updateDynamic("StackPolicyBody")(StackPolicyBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStackPolicyOutput]
  }
}

