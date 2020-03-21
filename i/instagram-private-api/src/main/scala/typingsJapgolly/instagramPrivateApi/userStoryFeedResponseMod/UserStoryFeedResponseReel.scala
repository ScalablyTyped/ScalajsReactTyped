package typingsJapgolly.instagramPrivateApi.userStoryFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserStoryFeedResponseReel extends js.Object {
  var can_reply: Boolean
  var can_reshare: Boolean
  var expiring_at: Double
  var has_besties_media: Boolean
  var has_pride_media: Boolean
  var id: Double
  var items: js.Array[UserStoryFeedResponseItemsItem]
  var latest_reel_media: Double
  var media_count: Double
  var prefetch_count: Double
  var reel_type: String
  var seen: Double
  var user: UserStoryFeedResponseUser
}

object UserStoryFeedResponseReel {
  @scala.inline
  def apply(
    can_reply: Boolean,
    can_reshare: Boolean,
    expiring_at: Double,
    has_besties_media: Boolean,
    has_pride_media: Boolean,
    id: Double,
    items: js.Array[UserStoryFeedResponseItemsItem],
    latest_reel_media: Double,
    media_count: Double,
    prefetch_count: Double,
    reel_type: String,
    seen: Double,
    user: UserStoryFeedResponseUser
  ): UserStoryFeedResponseReel = {
    val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], expiring_at = expiring_at.asInstanceOf[js.Any], has_besties_media = has_besties_media.asInstanceOf[js.Any], has_pride_media = has_pride_media.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], latest_reel_media = latest_reel_media.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], prefetch_count = prefetch_count.asInstanceOf[js.Any], reel_type = reel_type.asInstanceOf[js.Any], seen = seen.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserStoryFeedResponseReel]
  }
}

