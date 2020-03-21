package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.feedMod.Feed
import typingsJapgolly.instagramPrivateApi.likedFeedResponseMod.LikedFeedResponseItemsItem
import typingsJapgolly.instagramPrivateApi.likedFeedResponseMod.LikedFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/liked.feed", JSImport.Namespace)
@js.native
object likedFeedMod extends js.Object {
  @js.native
  class LikedFeed () extends Feed[LikedFeedResponseRootObject, LikedFeedResponseItemsItem] {
    var maxId: js.Any = js.native
    def request(): js.Promise[LikedFeedResponseRootObject] = js.native
  }
  
}

