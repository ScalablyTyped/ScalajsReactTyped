package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.feedMod.Feed
import typingsJapgolly.instagramPrivateApi.listReelMediaViewerFeedResponseMod.ListReelMediaViewerFeedResponseRootObject
import typingsJapgolly.instagramPrivateApi.listReelMediaViewerFeedResponseMod.ListReelMediaViewerFeedResponseUsersItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/list-reel-media-viewer.feed", JSImport.Namespace)
@js.native
object listReelMediaViewerFeedMod extends js.Object {
  @js.native
  class ListReelMediaViewerFeed () extends Feed[
          ListReelMediaViewerFeedResponseRootObject, 
          ListReelMediaViewerFeedResponseUsersItem
        ] {
    var mediaId: js.Any = js.native
    var nextMaxId: js.UndefOr[js.Any] = js.native
    def request(): js.Promise[ListReelMediaViewerFeedResponseRootObject] = js.native
  }
  
}

