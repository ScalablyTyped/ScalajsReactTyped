package typingsJapgolly.instagramPrivateApi.igtvChannelFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgtvChannelFeedResponseUser extends js.Object {
  var friendship_status: js.UndefOr[IgtvChannelFeedResponseFriendshipStatus] = js.undefined
  var full_name: String
  var has_anonymous_profile_picture: js.UndefOr[Boolean] = js.undefined
  var is_favorite: js.UndefOr[Boolean] = js.undefined
  var is_private: Boolean
  var is_unpublished: js.UndefOr[Boolean] = js.undefined
  var is_verified: Boolean
  var pk: Double
  var profile_pic_id: js.UndefOr[String] = js.undefined
  var profile_pic_url: String
  var username: String
}

object IgtvChannelFeedResponseUser {
  @scala.inline
  def apply(
    full_name: String,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_url: String,
    username: String,
    friendship_status: IgtvChannelFeedResponseFriendshipStatus = null,
    has_anonymous_profile_picture: js.UndefOr[Boolean] = js.undefined,
    is_favorite: js.UndefOr[Boolean] = js.undefined,
    is_unpublished: js.UndefOr[Boolean] = js.undefined,
    profile_pic_id: String = null
  ): IgtvChannelFeedResponseUser = {
    val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (friendship_status != null) __obj.updateDynamic("friendship_status")(friendship_status.asInstanceOf[js.Any])
    if (!js.isUndefined(has_anonymous_profile_picture)) __obj.updateDynamic("has_anonymous_profile_picture")(has_anonymous_profile_picture.asInstanceOf[js.Any])
    if (!js.isUndefined(is_favorite)) __obj.updateDynamic("is_favorite")(is_favorite.asInstanceOf[js.Any])
    if (!js.isUndefined(is_unpublished)) __obj.updateDynamic("is_unpublished")(is_unpublished.asInstanceOf[js.Any])
    if (profile_pic_id != null) __obj.updateDynamic("profile_pic_id")(profile_pic_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvChannelFeedResponseUser]
  }
}

