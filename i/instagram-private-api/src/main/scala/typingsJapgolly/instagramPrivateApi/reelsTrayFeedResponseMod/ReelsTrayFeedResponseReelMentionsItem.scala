package typingsJapgolly.instagramPrivateApi.reelsTrayFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsTrayFeedResponseReelMentionsItem extends js.Object {
  var display_type: String
  var height: Double | String
  var is_hidden: Double
  var is_pinned: Double
  var is_sticker: Double
  var rotation: String | Double
  var user: ReelsTrayFeedResponseUser
  var width: Double
  var x: Double
  var y: String | Double
  var z: Double
}

object ReelsTrayFeedResponseReelMentionsItem {
  @scala.inline
  def apply(
    display_type: String,
    height: Double | String,
    is_hidden: Double,
    is_pinned: Double,
    is_sticker: Double,
    rotation: String | Double,
    user: ReelsTrayFeedResponseUser,
    width: Double,
    x: Double,
    y: String | Double,
    z: Double
  ): ReelsTrayFeedResponseReelMentionsItem = {
    val __obj = js.Dynamic.literal(display_type = display_type.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReelsTrayFeedResponseReelMentionsItem]
  }
}

