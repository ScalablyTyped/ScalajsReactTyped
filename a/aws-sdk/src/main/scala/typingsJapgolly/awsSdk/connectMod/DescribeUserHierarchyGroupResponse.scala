package typingsJapgolly.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserHierarchyGroupResponse extends js.Object {
  /**
    * Information about the hierarchy group.
    */
  var HierarchyGroup: js.UndefOr[typingsJapgolly.awsSdk.connectMod.HierarchyGroup] = js.native
}

object DescribeUserHierarchyGroupResponse {
  @scala.inline
  def apply(HierarchyGroup: HierarchyGroup = null): DescribeUserHierarchyGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (HierarchyGroup != null) __obj.updateDynamic("HierarchyGroup")(HierarchyGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserHierarchyGroupResponse]
  }
}

