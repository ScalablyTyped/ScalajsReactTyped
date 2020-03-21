package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.feedMod.Feed
import typingsJapgolly.instagramPrivateApi.newsFeedResponseMod.NewsFeedResponseRootObject
import typingsJapgolly.instagramPrivateApi.responsesMod.NewsFeedResponseStoriesItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/news.feed", JSImport.Namespace)
@js.native
object newsFeedMod extends js.Object {
  @js.native
  class NewsFeed () extends Feed[NewsFeedResponseRootObject, NewsFeedResponseStoriesItem] {
    var nextMaxId: js.Any = js.native
    def request(): js.Promise[NewsFeedResponseRootObject] = js.native
  }
  
}

