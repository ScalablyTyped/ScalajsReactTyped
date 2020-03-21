package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.commonTypesMod.IgAppModule
import typingsJapgolly.instagramPrivateApi.feedMod.Feed
import typingsJapgolly.instagramPrivateApi.musicGenreFeedResponseMod.MusicGenreFeedResponseItemsItem
import typingsJapgolly.instagramPrivateApi.musicGenreFeedResponseMod.MusicGenreFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/music-genre.feed", JSImport.Namespace)
@js.native
object musicGenreFeedMod extends js.Object {
  @js.native
  class MusicGenreFeed () extends Feed[MusicGenreFeedResponseRootObject, MusicGenreFeedResponseItemsItem] {
    var id: Double | String = js.native
    var nextCursor: js.UndefOr[String] = js.native
    var product: IgAppModule = js.native
    def request(): js.Promise[MusicGenreFeedResponseRootObject] = js.native
  }
  
}

