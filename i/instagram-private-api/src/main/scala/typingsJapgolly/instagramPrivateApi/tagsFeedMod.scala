package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.feedMod.Feed
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.places
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.recent
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.top
import typingsJapgolly.instagramPrivateApi.tagsFeedResponseMod.TagsFeedResponse
import typingsJapgolly.instagramPrivateApi.tagsFeedResponseMod.TagsFeedResponseMedia
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/tags.feed", JSImport.Namespace)
@js.native
object tagsFeedMod extends js.Object {
  @js.native
  class TagsFeed () extends Feed[TagsFeedResponse, TagsFeedResponseMedia] {
    var nextMaxId: js.Any = js.native
    var nextMediaIds: js.Any = js.native
    var nextPage: js.Any = js.native
    var tab: top | recent | places = js.native
    var tag: String = js.native
    def request(): js.Promise[TagsFeedResponse] = js.native
  }
  
}

