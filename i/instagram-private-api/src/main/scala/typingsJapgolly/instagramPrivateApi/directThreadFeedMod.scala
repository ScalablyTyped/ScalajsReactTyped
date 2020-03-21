package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.directThreadFeedResponseMod.DirectThreadFeedResponse
import typingsJapgolly.instagramPrivateApi.directThreadFeedResponseMod.DirectThreadFeedResponseItemsItem
import typingsJapgolly.instagramPrivateApi.feedMod.Feed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/direct-thread.feed", JSImport.Namespace)
@js.native
object directThreadFeedMod extends js.Object {
  @js.native
  class DirectThreadFeed () extends Feed[DirectThreadFeedResponse, DirectThreadFeedResponseItemsItem] {
    var cursor: String = js.native
    var id: String = js.native
    var seqId: Double = js.native
    def request(): js.Promise[DirectThreadFeedResponse] = js.native
  }
  
}

