package typingsJapgolly.pulumiAws.containerPolicyMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerPolicyState extends js.Object {
  /**
    * The name of the container.
    */
  val containerName: js.UndefOr[Input[String]] = js.native
  val policy: js.UndefOr[Input[String]] = js.native
}

object ContainerPolicyState {
  @scala.inline
  def apply(containerName: Input[String] = null, policy: Input[String] = null): ContainerPolicyState = {
    val __obj = js.Dynamic.literal()
    if (containerName != null) __obj.updateDynamic("containerName")(containerName.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerPolicyState]
  }
}

