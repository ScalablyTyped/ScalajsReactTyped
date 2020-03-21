package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object twitterForWeb {
  /**
    * Base type for TwitterTimelineWidgetOptions. TwitterTimelineWidgetOptions can
    * use all options of tweet widgets and button widgets
    */
  type TwitterTimelineWidgetBaseOptions = typingsJapgolly.twitterForWeb.TwitterTweetWidgetOptions with typingsJapgolly.twitterForWeb.TwitterButtonWidgetOptions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.twitterForWeb.TwitterTimelineWidgetProfileDataSource
    - typingsJapgolly.twitterForWeb.TwitterTimelineWidgetLikesDataSource
    - typingsJapgolly.twitterForWeb.TwitterTimelineWidgetListDataSource
    - typingsJapgolly.twitterForWeb.TwitterTimelineWidgetCollectionDataSource
    - typingsJapgolly.twitterForWeb.TwitterTimelineWidgetUrlDataSource
    - java.lang.String
  */
  type TwitterTimelineWidgetDataSource = typingsJapgolly.twitterForWeb._TwitterTimelineWidgetDataSource | java.lang.String
}
