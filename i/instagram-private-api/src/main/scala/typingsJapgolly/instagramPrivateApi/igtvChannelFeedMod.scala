package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.feedMod.Feed
import typingsJapgolly.instagramPrivateApi.igtvChannelFeedResponseMod.IgtvChannelFeedResponseItemsItem
import typingsJapgolly.instagramPrivateApi.igtvChannelFeedResponseMod.IgtvChannelFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/igtv.channel.feed", JSImport.Namespace)
@js.native
object igtvChannelFeedMod extends js.Object {
  @js.native
  class IgtvChannelFeed () extends Feed[IgtvChannelFeedResponseRootObject, IgtvChannelFeedResponseItemsItem] {
    var channelId: String = js.native
    var maxId: js.Any = js.native
    def request(): js.Promise[IgtvChannelFeedResponseRootObject] = js.native
  }
  
}

