package typingsJapgolly.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserHierarchyRequest extends js.Object {
  /**
    * The identifier of the hierarchy group.
    */
  var HierarchyGroupId: js.UndefOr[typingsJapgolly.awsSdk.connectMod.HierarchyGroupId] = js.native
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.connectMod.InstanceId = js.native
  /**
    * The identifier of the user account.
    */
  var UserId: typingsJapgolly.awsSdk.connectMod.UserId = js.native
}

object UpdateUserHierarchyRequest {
  @scala.inline
  def apply(InstanceId: InstanceId, UserId: UserId, HierarchyGroupId: HierarchyGroupId = null): UpdateUserHierarchyRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    if (HierarchyGroupId != null) __obj.updateDynamic("HierarchyGroupId")(HierarchyGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserHierarchyRequest]
  }
}

