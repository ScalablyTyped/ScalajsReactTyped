package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.commonTypesMod.IgAppModule
import typingsJapgolly.instagramPrivateApi.feedMod.Feed
import typingsJapgolly.instagramPrivateApi.musicSearchFeedResponseMod.MusicSearchFeedResponseItemsItem
import typingsJapgolly.instagramPrivateApi.musicSearchFeedResponseMod.MusicSearchFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/music-search.feed", JSImport.Namespace)
@js.native
object musicSearchFeedMod extends js.Object {
  @js.native
  class MusicSearchFeed () extends Feed[MusicSearchFeedResponseRootObject, MusicSearchFeedResponseItemsItem] {
    var nextCursor: js.UndefOr[String] = js.native
    var product: IgAppModule = js.native
    var query: String = js.native
    var searchSessionId: String = js.native
    def request(): js.Promise[MusicSearchFeedResponseRootObject] = js.native
    /* protected */ def state(response: js.Any): js.Any = js.native
  }
  
}

