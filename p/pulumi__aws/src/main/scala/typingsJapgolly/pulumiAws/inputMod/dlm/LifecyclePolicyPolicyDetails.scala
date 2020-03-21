package typingsJapgolly.pulumiAws.inputMod.dlm

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicyPolicyDetails extends js.Object {
  /**
    * A list of resource types that should be targeted by the lifecycle policy. `VOLUME` is currently the only allowed value.
    */
  var resourceTypes: Input[js.Array[Input[String]]] = js.native
  /**
    * See the `schedule` configuration block.
    */
  var schedules: Input[js.Array[Input[LifecyclePolicyPolicyDetailsSchedule]]] = js.native
  /**
    * A mapping of tag keys and their values. Any resources that match the `resourceTypes` and are tagged with _any_ of these tags will be targeted.
    */
  var targetTags: Input[StringDictionary[_]] = js.native
}

object LifecyclePolicyPolicyDetails {
  @scala.inline
  def apply(
    resourceTypes: Input[js.Array[Input[String]]],
    schedules: Input[js.Array[Input[LifecyclePolicyPolicyDetailsSchedule]]],
    targetTags: Input[StringDictionary[_]]
  ): LifecyclePolicyPolicyDetails = {
    val __obj = js.Dynamic.literal(resourceTypes = resourceTypes.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any], targetTags = targetTags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LifecyclePolicyPolicyDetails]
  }
}

