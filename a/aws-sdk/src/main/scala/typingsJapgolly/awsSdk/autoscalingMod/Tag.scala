package typingsJapgolly.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  /**
    * The tag key.
    */
  var Key: TagKey = js.native
  /**
    * Determines whether the tag is added to new instances as they are launched in the group.
    */
  var PropagateAtLaunch: js.UndefOr[typingsJapgolly.awsSdk.autoscalingMod.PropagateAtLaunch] = js.native
  /**
    * The name of the group.
    */
  var ResourceId: js.UndefOr[XmlString] = js.native
  /**
    * The type of resource. The only supported value is auto-scaling-group.
    */
  var ResourceType: js.UndefOr[XmlString] = js.native
  /**
    * The tag value.
    */
  var Value: js.UndefOr[TagValue] = js.native
}

object Tag {
  @scala.inline
  def apply(
    Key: TagKey,
    PropagateAtLaunch: js.UndefOr[Boolean] = js.undefined,
    ResourceId: XmlString = null,
    ResourceType: XmlString = null,
    Value: TagValue = null
  ): Tag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    if (!js.isUndefined(PropagateAtLaunch)) __obj.updateDynamic("PropagateAtLaunch")(PropagateAtLaunch.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}

