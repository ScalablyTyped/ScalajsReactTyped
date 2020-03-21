package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.discoverFeedResponseMod.DiscoverFeedResponseRootObject
import typingsJapgolly.instagramPrivateApi.feedMod.Feed
import typingsJapgolly.instagramPrivateApi.responsesMod.DiscoverFeedResponseUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/discover.feed", JSImport.Namespace)
@js.native
object discoverFeedMod extends js.Object {
  @js.native
  class DiscoverFeed () extends Feed[DiscoverFeedResponseRootObject, DiscoverFeedResponseUser] {
    var nextMaxId: js.Any = js.native
    def request(): js.Promise[DiscoverFeedResponseRootObject] = js.native
  }
  
}

