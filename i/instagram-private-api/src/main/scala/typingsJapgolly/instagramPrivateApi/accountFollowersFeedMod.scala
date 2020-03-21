package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.accountFollowersFeedResponseMod.AccountFollowersFeedResponse
import typingsJapgolly.instagramPrivateApi.feedMod.Feed
import typingsJapgolly.instagramPrivateApi.responsesMod.AccountFollowersFeedResponseUsersItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/account-followers.feed", JSImport.Namespace)
@js.native
object accountFollowersFeedMod extends js.Object {
  @js.native
  class AccountFollowersFeed () extends Feed[AccountFollowersFeedResponse, AccountFollowersFeedResponseUsersItem] {
    var id: Double | String = js.native
    var nextMaxId: js.Any = js.native
    def request(): js.Promise[AccountFollowersFeedResponse] = js.native
  }
  
}

