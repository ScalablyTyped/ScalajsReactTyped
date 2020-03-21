package typingsJapgolly.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFlowResponse extends js.Object {
  /**
    * The ARN of the flow that was deleted.
    */
  var FlowArn: js.UndefOr[string] = js.native
  /**
    * The status of the flow when the DeleteFlow process begins.
    */
  var Status: js.UndefOr[typingsJapgolly.awsSdk.mediaconnectMod.Status] = js.native
}

object DeleteFlowResponse {
  @scala.inline
  def apply(FlowArn: string = null, Status: Status = null): DeleteFlowResponse = {
    val __obj = js.Dynamic.literal()
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFlowResponse]
  }
}

