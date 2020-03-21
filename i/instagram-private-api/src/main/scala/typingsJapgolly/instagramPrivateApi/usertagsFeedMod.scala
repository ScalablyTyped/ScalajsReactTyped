package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.feedMod.Feed
import typingsJapgolly.instagramPrivateApi.usertagsFeedResponseMod.UsertagsFeedResponseItemsItem
import typingsJapgolly.instagramPrivateApi.usertagsFeedResponseMod.UsertagsFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/usertags.feed", JSImport.Namespace)
@js.native
object usertagsFeedMod extends js.Object {
  @js.native
  class UsertagsFeed () extends Feed[UsertagsFeedResponseRootObject, UsertagsFeedResponseItemsItem] {
    var id: Double | String = js.native
    var nextMaxId: js.Any = js.native
    def request(): js.Promise[UsertagsFeedResponseRootObject] = js.native
  }
  
}

