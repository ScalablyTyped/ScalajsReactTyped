package typingsJapgolly.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateComponentRequest extends js.Object {
  /**
    * The name of the component.
    */
  var ComponentName: typingsJapgolly.awsSdk.applicationinsightsMod.ComponentName = js.native
  /**
    * The new name of the component.
    */
  var NewComponentName: js.UndefOr[typingsJapgolly.awsSdk.applicationinsightsMod.NewComponentName] = js.native
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typingsJapgolly.awsSdk.applicationinsightsMod.ResourceGroupName = js.native
  /**
    * The list of resource ARNs that belong to the component.
    */
  var ResourceList: js.UndefOr[typingsJapgolly.awsSdk.applicationinsightsMod.ResourceList] = js.native
}

object UpdateComponentRequest {
  @scala.inline
  def apply(
    ComponentName: ComponentName,
    ResourceGroupName: ResourceGroupName,
    NewComponentName: NewComponentName = null,
    ResourceList: ResourceList = null
  ): UpdateComponentRequest = {
    val __obj = js.Dynamic.literal(ComponentName = ComponentName.asInstanceOf[js.Any], ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    if (NewComponentName != null) __obj.updateDynamic("NewComponentName")(NewComponentName.asInstanceOf[js.Any])
    if (ResourceList != null) __obj.updateDynamic("ResourceList")(ResourceList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateComponentRequest]
  }
}

