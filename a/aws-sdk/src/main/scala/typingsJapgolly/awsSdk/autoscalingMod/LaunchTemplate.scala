package typingsJapgolly.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplate extends js.Object {
  /**
    * The launch template to use. You must specify either the launch template ID or launch template name in the request.
    */
  var LaunchTemplateSpecification: js.UndefOr[typingsJapgolly.awsSdk.autoscalingMod.LaunchTemplateSpecification] = js.native
  /**
    * An optional setting. Any parameters that you specify override the same parameters in the launch template. Currently, the only supported override is instance type. You can specify between 1 and 20 instance types.
    */
  var Overrides: js.UndefOr[typingsJapgolly.awsSdk.autoscalingMod.Overrides] = js.native
}

object LaunchTemplate {
  @scala.inline
  def apply(LaunchTemplateSpecification: LaunchTemplateSpecification = null, Overrides: Overrides = null): LaunchTemplate = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplateSpecification != null) __obj.updateDynamic("LaunchTemplateSpecification")(LaunchTemplateSpecification.asInstanceOf[js.Any])
    if (Overrides != null) __obj.updateDynamic("Overrides")(Overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplate]
  }
}

