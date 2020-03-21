package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.commonTypesMod.IgAppModule
import typingsJapgolly.instagramPrivateApi.feedMod.Feed
import typingsJapgolly.instagramPrivateApi.reelsMediaFeedResponseMod.ReelsMediaFeedResponseItem
import typingsJapgolly.instagramPrivateApi.reelsMediaFeedResponseMod.ReelsMediaFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/reels-media.feed", JSImport.Namespace)
@js.native
object reelsMediaFeedMod extends js.Object {
  @js.native
  class ReelsMediaFeed () extends Feed[ReelsMediaFeedResponseRootObject, ReelsMediaFeedResponseItem] {
    var source: IgAppModule = js.native
    var userIds: js.Array[Double | String] = js.native
    def request(): js.Promise[ReelsMediaFeedResponseRootObject] = js.native
    /* protected */ def state(body: js.Any): js.Any = js.native
  }
  
}

