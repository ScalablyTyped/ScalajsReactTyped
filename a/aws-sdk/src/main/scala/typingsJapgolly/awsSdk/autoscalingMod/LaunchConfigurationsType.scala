package typingsJapgolly.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchConfigurationsType extends js.Object {
  /**
    * The launch configurations.
    */
  var LaunchConfigurations: typingsJapgolly.awsSdk.autoscalingMod.LaunchConfigurations = js.native
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.native
}

object LaunchConfigurationsType {
  @scala.inline
  def apply(LaunchConfigurations: LaunchConfigurations, NextToken: XmlString = null): LaunchConfigurationsType = {
    val __obj = js.Dynamic.literal(LaunchConfigurations = LaunchConfigurations.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfigurationsType]
  }
}

