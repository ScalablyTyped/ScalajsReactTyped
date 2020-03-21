package typingsJapgolly.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAccountYouTubeChannelLink extends js.Object {
  /**
    * Channel ID.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * Status of the link between this Merchant Center account and the YouTube
    * channel. Upon retrieval, it represents the actual status of the link and
    * can be either active if it was approved in YT Creator Studio or pending
    * if it&#39;s pending approval. Upon insertion, it represents the intended
    * status of the link. Re-uploading a link with status active when it&#39;s
    * still pending or with status pending when it&#39;s already active will
    * have no effect: the status will remain unchanged. Re-uploading a link
    * with deprecated status inactive is equivalent to not submitting the link
    * at all and will delete the link if it was active or cancel the link
    * request if it was pending.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaAccountYouTubeChannelLink {
  @scala.inline
  def apply(channelId: String = null, status: String = null): SchemaAccountYouTubeChannelLink = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountYouTubeChannelLink]
  }
}

