package typingsJapgolly.pulumiAws.ecrLifecyclePolicyMod

import typingsJapgolly.pulumiAws.lifecyclePolicyDocumentMod.LifecyclePolicyDocument
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicyArgs extends js.Object {
  val policy: Input[String | LifecyclePolicyDocument] = js.native
  /**
    * Name of the repository to apply the policy.
    */
  val repository: Input[String] = js.native
}

object LifecyclePolicyArgs {
  @scala.inline
  def apply(policy: Input[String | LifecyclePolicyDocument], repository: Input[String]): LifecyclePolicyArgs = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LifecyclePolicyArgs]
  }
}

