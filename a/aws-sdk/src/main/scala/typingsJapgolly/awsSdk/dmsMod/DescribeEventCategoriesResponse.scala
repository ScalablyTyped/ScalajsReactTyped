package typingsJapgolly.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventCategoriesResponse extends js.Object {
  /**
    * A list of event categories.
    */
  var EventCategoryGroupList: js.UndefOr[typingsJapgolly.awsSdk.dmsMod.EventCategoryGroupList] = js.native
}

object DescribeEventCategoriesResponse {
  @scala.inline
  def apply(EventCategoryGroupList: EventCategoryGroupList = null): DescribeEventCategoriesResponse = {
    val __obj = js.Dynamic.literal()
    if (EventCategoryGroupList != null) __obj.updateDynamic("EventCategoryGroupList")(EventCategoryGroupList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventCategoriesResponse]
  }
}

