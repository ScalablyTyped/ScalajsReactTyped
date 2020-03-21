package typingsJapgolly.pulumiAws.associationMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationState extends js.Object {
  /**
    * ARN of the license configuration.
    */
  val licenseConfigurationArn: js.UndefOr[Input[String]] = js.native
  /**
    * ARN of the resource associated with the license configuration.
    */
  val resourceArn: js.UndefOr[Input[String]] = js.native
}

object AssociationState {
  @scala.inline
  def apply(licenseConfigurationArn: Input[String] = null, resourceArn: Input[String] = null): AssociationState = {
    val __obj = js.Dynamic.literal()
    if (licenseConfigurationArn != null) __obj.updateDynamic("licenseConfigurationArn")(licenseConfigurationArn.asInstanceOf[js.Any])
    if (resourceArn != null) __obj.updateDynamic("resourceArn")(resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationState]
  }
}

