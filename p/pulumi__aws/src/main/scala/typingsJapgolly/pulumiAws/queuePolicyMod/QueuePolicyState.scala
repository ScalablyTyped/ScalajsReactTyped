package typingsJapgolly.pulumiAws.queuePolicyMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueuePolicyState extends js.Object {
  val policy: js.UndefOr[Input[String]] = js.native
  /**
    * The URL of the SQS Queue to which to attach the policy
    */
  val queueUrl: js.UndefOr[Input[String]] = js.native
}

object QueuePolicyState {
  @scala.inline
  def apply(policy: Input[String] = null, queueUrl: Input[String] = null): QueuePolicyState = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (queueUrl != null) __obj.updateDynamic("queueUrl")(queueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueuePolicyState]
  }
}

