package typingsJapgolly.twitterForWeb

import typingsJapgolly.twitterForWeb.twitterForWebStrings.likes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twitterForWeb.AnonScreenNameSourceType
  - typingsJapgolly.twitterForWeb.AnonUserId
*/
trait TwitterTimelineWidgetLikesDataSource extends _TwitterTimelineWidgetDataSource

object TwitterTimelineWidgetLikesDataSource {
  @scala.inline
  def AnonScreenNameSourceType(screenName: String, sourceType: likes): TwitterTimelineWidgetLikesDataSource = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TwitterTimelineWidgetLikesDataSource]
  }
  @scala.inline
  def AnonUserId(sourceType: likes, userId: String): TwitterTimelineWidgetLikesDataSource = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TwitterTimelineWidgetLikesDataSource]
  }
}

