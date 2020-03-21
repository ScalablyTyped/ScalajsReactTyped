package typingsJapgolly.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateComponentRequest extends js.Object {
  /**
    * The name of the component.
    */
  var ComponentName: typingsJapgolly.awsSdk.applicationinsightsMod.ComponentName = js.native
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typingsJapgolly.awsSdk.applicationinsightsMod.ResourceGroupName = js.native
  /**
    * The list of resource ARNs that belong to the component.
    */
  var ResourceList: typingsJapgolly.awsSdk.applicationinsightsMod.ResourceList = js.native
}

object CreateComponentRequest {
  @scala.inline
  def apply(ComponentName: ComponentName, ResourceGroupName: ResourceGroupName, ResourceList: ResourceList): CreateComponentRequest = {
    val __obj = js.Dynamic.literal(ComponentName = ComponentName.asInstanceOf[js.Any], ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any], ResourceList = ResourceList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateComponentRequest]
  }
}

