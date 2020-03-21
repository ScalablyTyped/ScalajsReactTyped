package typingsJapgolly.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLifecyclePolicyOutput extends js.Object {
  /**
    * The object lifecycle policy that is assigned to the container.
    */
  var LifecyclePolicy: typingsJapgolly.awsSdk.mediastoreMod.LifecyclePolicy = js.native
}

object GetLifecyclePolicyOutput {
  @scala.inline
  def apply(LifecyclePolicy: LifecyclePolicy): GetLifecyclePolicyOutput = {
    val __obj = js.Dynamic.literal(LifecyclePolicy = LifecyclePolicy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetLifecyclePolicyOutput]
  }
}

