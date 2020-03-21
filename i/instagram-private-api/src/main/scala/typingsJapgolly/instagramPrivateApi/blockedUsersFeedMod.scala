package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.blockedUsersFeedResponseMod.BlockedUsersFeedResponseRootObject
import typingsJapgolly.instagramPrivateApi.feedMod.Feed
import typingsJapgolly.instagramPrivateApi.responsesMod.BlockedUsersFeedResponseBlockedListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/blocked-users.feed", JSImport.Namespace)
@js.native
object blockedUsersFeedMod extends js.Object {
  @js.native
  class BlockedUsersFeed () extends Feed[BlockedUsersFeedResponseRootObject, BlockedUsersFeedResponseBlockedListItem] {
    var nextMaxId: js.Any = js.native
    def request(): js.Promise[BlockedUsersFeedResponseRootObject] = js.native
  }
  
}

