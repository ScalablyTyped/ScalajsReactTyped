package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotFleetTagSpecification extends js.Object {
  /**
    * The type of resource. Currently, the only resource types that are supported are spot-fleet-request and instance.
    */
  var ResourceType: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.ResourceType] = js.native
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object SpotFleetTagSpecification {
  @scala.inline
  def apply(ResourceType: ResourceType = null, Tags: TagList = null): SpotFleetTagSpecification = {
    val __obj = js.Dynamic.literal()
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetTagSpecification]
  }
}

