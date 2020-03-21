package typingsJapgolly.instagramPrivateApi.mediaRepositoryConfigureSidecarResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaRepositoryConfigureSidecarResponseMedia extends js.Object {
  var can_see_insights_as_brand: Boolean
  var can_view_more_preview_comments: Boolean
  var can_viewer_reshare: Boolean
  var can_viewer_save: Boolean
  var caption: MediaRepositoryConfigureSidecarResponseCaption
  var caption_is_edited: Boolean
  var carousel_media: js.Array[MediaRepositoryConfigureSidecarResponseCarouselMediaItem]
  var carousel_media_count: Double
  var client_cache_key: String
  var code: String
  var comment_count: Double
  var comment_likes_enabled: Boolean
  var comment_threading_enabled: Boolean
  var device_timestamp: Double
  var fb_user_tags: MediaRepositoryConfigureSidecarResponseFbUserTags
  var filter_type: Double
  var has_more_comments: Boolean
  var id: String
  var max_num_visible_preview_comments: Double
  var media_type: Double
  var organic_tracking_token: String
  var photo_of_you: Boolean
  var pk: String
  var preview_comments: js.Array[_]
  var taken_at: Double
  var user: MediaRepositoryConfigureSidecarResponseUser
  var usertags: MediaRepositoryConfigureSidecarResponseUsertags
}

object MediaRepositoryConfigureSidecarResponseMedia {
  @scala.inline
  def apply(
    can_see_insights_as_brand: Boolean,
    can_view_more_preview_comments: Boolean,
    can_viewer_reshare: Boolean,
    can_viewer_save: Boolean,
    caption: MediaRepositoryConfigureSidecarResponseCaption,
    caption_is_edited: Boolean,
    carousel_media: js.Array[MediaRepositoryConfigureSidecarResponseCarouselMediaItem],
    carousel_media_count: Double,
    client_cache_key: String,
    code: String,
    comment_count: Double,
    comment_likes_enabled: Boolean,
    comment_threading_enabled: Boolean,
    device_timestamp: Double,
    fb_user_tags: MediaRepositoryConfigureSidecarResponseFbUserTags,
    filter_type: Double,
    has_more_comments: Boolean,
    id: String,
    max_num_visible_preview_comments: Double,
    media_type: Double,
    organic_tracking_token: String,
    photo_of_you: Boolean,
    pk: String,
    preview_comments: js.Array[_],
    taken_at: Double,
    user: MediaRepositoryConfigureSidecarResponseUser,
    usertags: MediaRepositoryConfigureSidecarResponseUsertags
  ): MediaRepositoryConfigureSidecarResponseMedia = {
    val __obj = js.Dynamic.literal(can_see_insights_as_brand = can_see_insights_as_brand.asInstanceOf[js.Any], can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], can_viewer_reshare = can_viewer_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], carousel_media = carousel_media.asInstanceOf[js.Any], carousel_media_count = carousel_media_count.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_threading_enabled = comment_threading_enabled.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], fb_user_tags = fb_user_tags.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], max_num_visible_preview_comments = max_num_visible_preview_comments.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], usertags = usertags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MediaRepositoryConfigureSidecarResponseMedia]
  }
}

