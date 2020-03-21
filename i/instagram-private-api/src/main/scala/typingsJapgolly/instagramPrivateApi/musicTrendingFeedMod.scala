package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.commonTypesMod.IgAppModule
import typingsJapgolly.instagramPrivateApi.feedMod.Feed
import typingsJapgolly.instagramPrivateApi.musicTrendingFeedResponseMod.MusicTrendingFeedResponseItemsItem
import typingsJapgolly.instagramPrivateApi.musicTrendingFeedResponseMod.MusicTrendingFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/music-trending.feed", JSImport.Namespace)
@js.native
object musicTrendingFeedMod extends js.Object {
  @js.native
  class MusicTrendingFeed () extends Feed[MusicTrendingFeedResponseRootObject, MusicTrendingFeedResponseItemsItem] {
    var nextCursor: js.UndefOr[String] = js.native
    var product: IgAppModule = js.native
    def request(): js.Promise[MusicTrendingFeedResponseRootObject] = js.native
  }
  
}

