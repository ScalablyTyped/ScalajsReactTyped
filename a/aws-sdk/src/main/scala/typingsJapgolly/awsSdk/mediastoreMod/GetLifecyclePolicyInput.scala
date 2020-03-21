package typingsJapgolly.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLifecyclePolicyInput extends js.Object {
  /**
    * The name of the container that the object lifecycle policy is assigned to.
    */
  var ContainerName: typingsJapgolly.awsSdk.mediastoreMod.ContainerName = js.native
}

object GetLifecyclePolicyInput {
  @scala.inline
  def apply(ContainerName: ContainerName): GetLifecyclePolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetLifecyclePolicyInput]
  }
}

