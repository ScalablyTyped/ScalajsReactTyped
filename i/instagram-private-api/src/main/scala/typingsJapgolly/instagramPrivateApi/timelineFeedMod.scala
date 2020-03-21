package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.feedMod.Feed
import typingsJapgolly.instagramPrivateApi.timelineFeedResponseMod.TimelineFeedResponse
import typingsJapgolly.instagramPrivateApi.timelineFeedResponseMod.TimelineFeedResponseMediaOrAd
import typingsJapgolly.instagramPrivateApi.timelineFeedTypesMod.TimelineFeedReason
import typingsJapgolly.instagramPrivateApi.timelineFeedTypesMod.TimelineFeedsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/timeline.feed", JSImport.Namespace)
@js.native
object timelineFeedMod extends js.Object {
  @js.native
  class TimelineFeed () extends Feed[TimelineFeedResponse, TimelineFeedResponseMediaOrAd] {
    var nextMaxId: js.Any = js.native
    var reason: TimelineFeedReason = js.native
    var tag: String = js.native
    def request(): js.Promise[TimelineFeedResponse] = js.native
    def request(options: TimelineFeedsOptions): js.Promise[TimelineFeedResponse] = js.native
    def state(body: js.Any): js.Any = js.native
  }
  
}

