package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.accountFriendshipsFeedResponseMod.PendingFriendshipsFeedResponse
import typingsJapgolly.instagramPrivateApi.feedMod.Feed
import typingsJapgolly.instagramPrivateApi.responsesMod.PendingFriendshipsFeedResponseUsersItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/account-friendships.feed", JSImport.Namespace)
@js.native
object accountFriendshipsFeedMod extends js.Object {
  @js.native
  class PendingFriendshipsFeed () extends Feed[PendingFriendshipsFeedResponse, PendingFriendshipsFeedResponseUsersItem] {
    var nextMaxId: js.Any = js.native
    def request(): js.Promise[PendingFriendshipsFeedResponse] = js.native
  }
  
}

