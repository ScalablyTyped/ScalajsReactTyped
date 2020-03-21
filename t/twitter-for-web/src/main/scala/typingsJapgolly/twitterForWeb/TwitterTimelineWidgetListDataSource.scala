package typingsJapgolly.twitterForWeb

import typingsJapgolly.twitterForWeb.twitterForWebStrings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twitterForWeb.AnonOwnerScreenName
  - typingsJapgolly.twitterForWeb.AnonId
*/
trait TwitterTimelineWidgetListDataSource extends _TwitterTimelineWidgetDataSource

object TwitterTimelineWidgetListDataSource {
  @scala.inline
  def AnonOwnerScreenName(ownerScreenName: String, slug: String, sourceType: list): TwitterTimelineWidgetListDataSource = {
    val __obj = js.Dynamic.literal(ownerScreenName = ownerScreenName.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TwitterTimelineWidgetListDataSource]
  }
  @scala.inline
  def AnonId(id: String, sourceType: list): TwitterTimelineWidgetListDataSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TwitterTimelineWidgetListDataSource]
  }
}

