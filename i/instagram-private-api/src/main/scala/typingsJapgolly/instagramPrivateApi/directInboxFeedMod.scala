package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.directInboxFeedResponseMod.DirectInboxFeedResponse
import typingsJapgolly.instagramPrivateApi.entitiesMod.DirectThreadEntity
import typingsJapgolly.instagramPrivateApi.feedMod.Feed
import typingsJapgolly.instagramPrivateApi.responsesMod.DirectInboxFeedResponseThreadsItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/direct-inbox.feed", JSImport.Namespace)
@js.native
object directInboxFeedMod extends js.Object {
  @js.native
  class DirectInboxFeed () extends Feed[DirectInboxFeedResponse, DirectInboxFeedResponseThreadsItem] {
    var cursor: js.Any = js.native
    var seqId: js.Any = js.native
    def records(): js.Promise[js.Array[DirectThreadEntity]] = js.native
    def request(): js.Promise[DirectInboxFeedResponse] = js.native
  }
  
}

