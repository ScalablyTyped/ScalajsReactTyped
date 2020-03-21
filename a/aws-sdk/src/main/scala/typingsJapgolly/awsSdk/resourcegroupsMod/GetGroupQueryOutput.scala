package typingsJapgolly.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupQueryOutput extends js.Object {
  /**
    * The resource query associated with the specified group.
    */
  var GroupQuery: js.UndefOr[typingsJapgolly.awsSdk.resourcegroupsMod.GroupQuery] = js.native
}

object GetGroupQueryOutput {
  @scala.inline
  def apply(GroupQuery: GroupQuery = null): GetGroupQueryOutput = {
    val __obj = js.Dynamic.literal()
    if (GroupQuery != null) __obj.updateDynamic("GroupQuery")(GroupQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroupQueryOutput]
  }
}

