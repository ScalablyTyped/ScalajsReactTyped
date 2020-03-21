package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.feedMod.Feed
import typingsJapgolly.instagramPrivateApi.tagFeedResponseMod.TagFeedResponse
import typingsJapgolly.instagramPrivateApi.tagFeedResponseMod.TagFeedResponseItemsItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/tag.feed", JSImport.Namespace)
@js.native
object tagFeedMod extends js.Object {
  @js.native
  class TagFeed () extends Feed[TagFeedResponse, TagFeedResponseItemsItem] {
    var nextMaxId: js.Any = js.native
    var tag: String = js.native
    def request(): js.Promise[TagFeedResponse] = js.native
  }
  
}

