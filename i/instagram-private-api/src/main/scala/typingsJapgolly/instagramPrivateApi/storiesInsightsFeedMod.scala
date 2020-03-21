package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.feedMod.Feed
import typingsJapgolly.instagramPrivateApi.storiesInsightsFeedResponseMod.StoriesInsightsFeedResponseEdgesItem
import typingsJapgolly.instagramPrivateApi.storiesInsightsFeedResponseMod.StoriesInsightsFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/stories-insights.feed", JSImport.Namespace)
@js.native
object storiesInsightsFeedMod extends js.Object {
  @js.native
  class StoriesInsightsFeed () extends Feed[StoriesInsightsFeedResponseRootObject, StoriesInsightsFeedResponseEdgesItem] {
    var nextCursor: js.Any = js.native
    var timeframe: js.Any = js.native
    def request(): js.Promise[StoriesInsightsFeedResponseRootObject] = js.native
  }
  
}

