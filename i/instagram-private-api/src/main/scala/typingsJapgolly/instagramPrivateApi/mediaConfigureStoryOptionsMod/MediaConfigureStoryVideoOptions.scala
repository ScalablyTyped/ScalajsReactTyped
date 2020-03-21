package typingsJapgolly.instagramPrivateApi.mediaConfigureStoryOptionsMod

import typingsJapgolly.instagramPrivateApi.AnonLength
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.NOT_PROMPTED
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.`1`
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.`2`
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.besties
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.chat_sticker_id
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.countdown_sticker_time
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.once
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.polling_sticker
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.question_sticker_ma
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.replayable
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.story
import typingsJapgolly.instagramPrivateApi.mediaConfigureVideoOptionsMod.MediaConfigureVideoOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.instagramPrivateApi.mediaConfigureStoryOptionsMod.MediaConfigureStoryBaseOptions because var conflicts: geotag_enabled, media_latitude, media_longitude, posting_latitude, posting_longitude. Inlined story_media_creation_date, client_shared_at, audience, configure_mode, camera_position, allow_multi_configures, thread_ids, recipient_users, client_context, view_mode, reply_type, caption, mas_opt_in, story_sticker_ids, story_hashtags, story_locations, reel_mentions, story_polls, internal_features, story_sliders, story_questions, story_countdowns, attached_media, story_chats, story_quizs, story_cta */ trait MediaConfigureStoryVideoOptions extends MediaConfigureVideoOptions {
  var allow_multi_configures: js.UndefOr[`0` | `1`] = js.undefined
  var attached_media: js.UndefOr[js.Array[StoryAttachedMedia] | String] = js.undefined
  var audience: js.UndefOr[besties] = js.undefined
  var camera_position: js.UndefOr[String] = js.undefined
  var caption: js.UndefOr[String] = js.undefined
  var client_context: js.UndefOr[String] = js.undefined
  var client_shared_at: js.UndefOr[String] = js.undefined
  var configure_mode: `1` | `2`
  var internal_features: js.UndefOr[polling_sticker] = js.undefined
  var mas_opt_in: js.UndefOr[NOT_PROMPTED] = js.undefined
  var recipient_users: js.UndefOr[js.Array[String] | String] = js.undefined
  var reel_mentions: js.UndefOr[js.Array[StoryMention] | String] = js.undefined
  var reply_type: js.UndefOr[story | String] = js.undefined
  var story_chats: js.UndefOr[js.Array[StoryChat] | String] = js.undefined
  var story_countdowns: js.UndefOr[js.Array[StoryCountdown] | String] = js.undefined
  var story_cta: js.UndefOr[js.Array[StoryCta] | String] = js.undefined
  var story_hashtags: js.UndefOr[js.Array[StoryHashtag] | String] = js.undefined
  var story_locations: js.UndefOr[js.Array[StoryLocation] | String] = js.undefined
  var story_media_creation_date: js.UndefOr[String] = js.undefined
  var story_polls: js.UndefOr[js.Array[StoryPoll] | String] = js.undefined
  var story_questions: js.UndefOr[js.Array[StoryQuestion] | String] = js.undefined
  var story_quizs: js.UndefOr[js.Array[StoryQuiz] | String] = js.undefined
  var story_sliders: js.UndefOr[js.Array[StorySlider] | String] = js.undefined
  var story_sticker_ids: js.UndefOr[String | question_sticker_ma | countdown_sticker_time | chat_sticker_id] = js.undefined
  var thread_ids: js.UndefOr[js.Array[String] | String] = js.undefined
  var view_mode: js.UndefOr[replayable | once | String] = js.undefined
}

object MediaConfigureStoryVideoOptions {
  @scala.inline
  def apply(
    configure_mode: `1` | `2`,
    height: Double,
    length: Double,
    upload_id: String,
    width: Double,
    allow_multi_configures: `0` | `1` = null,
    attached_media: js.Array[StoryAttachedMedia] | String = null,
    audience: besties = null,
    audio_muted: js.UndefOr[Boolean] = js.undefined,
    camera_position: String = null,
    caption: String = null,
    client_context: String = null,
    client_shared_at: String = null,
    clips: js.Array[AnonLength] = null,
    geotag_enabled: `1` | `0` = null,
    internal_features: polling_sticker = null,
    mas_opt_in: NOT_PROMPTED = null,
    media_latitude: String = null,
    media_longitude: String = null,
    poster_frame_index: Int | Double = null,
    posting_latitude: String = null,
    posting_longitude: String = null,
    recipient_users: js.Array[String] | String = null,
    reel_mentions: js.Array[StoryMention] | String = null,
    reply_type: story | String = null,
    story_chats: js.Array[StoryChat] | String = null,
    story_countdowns: js.Array[StoryCountdown] | String = null,
    story_cta: js.Array[StoryCta] | String = null,
    story_hashtags: js.Array[StoryHashtag] | String = null,
    story_locations: js.Array[StoryLocation] | String = null,
    story_media_creation_date: String = null,
    story_polls: js.Array[StoryPoll] | String = null,
    story_questions: js.Array[StoryQuestion] | String = null,
    story_quizs: js.Array[StoryQuiz] | String = null,
    story_sliders: js.Array[StorySlider] | String = null,
    story_sticker_ids: String | question_sticker_ma | countdown_sticker_time | chat_sticker_id = null,
    thread_ids: js.Array[String] | String = null,
    view_mode: replayable | once | String = null
  ): MediaConfigureStoryVideoOptions = {
    val __obj = js.Dynamic.literal(configure_mode = configure_mode.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (allow_multi_configures != null) __obj.updateDynamic("allow_multi_configures")(allow_multi_configures.asInstanceOf[js.Any])
    if (attached_media != null) __obj.updateDynamic("attached_media")(attached_media.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (!js.isUndefined(audio_muted)) __obj.updateDynamic("audio_muted")(audio_muted.asInstanceOf[js.Any])
    if (camera_position != null) __obj.updateDynamic("camera_position")(camera_position.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (client_context != null) __obj.updateDynamic("client_context")(client_context.asInstanceOf[js.Any])
    if (client_shared_at != null) __obj.updateDynamic("client_shared_at")(client_shared_at.asInstanceOf[js.Any])
    if (clips != null) __obj.updateDynamic("clips")(clips.asInstanceOf[js.Any])
    if (geotag_enabled != null) __obj.updateDynamic("geotag_enabled")(geotag_enabled.asInstanceOf[js.Any])
    if (internal_features != null) __obj.updateDynamic("internal_features")(internal_features.asInstanceOf[js.Any])
    if (mas_opt_in != null) __obj.updateDynamic("mas_opt_in")(mas_opt_in.asInstanceOf[js.Any])
    if (media_latitude != null) __obj.updateDynamic("media_latitude")(media_latitude.asInstanceOf[js.Any])
    if (media_longitude != null) __obj.updateDynamic("media_longitude")(media_longitude.asInstanceOf[js.Any])
    if (poster_frame_index != null) __obj.updateDynamic("poster_frame_index")(poster_frame_index.asInstanceOf[js.Any])
    if (posting_latitude != null) __obj.updateDynamic("posting_latitude")(posting_latitude.asInstanceOf[js.Any])
    if (posting_longitude != null) __obj.updateDynamic("posting_longitude")(posting_longitude.asInstanceOf[js.Any])
    if (recipient_users != null) __obj.updateDynamic("recipient_users")(recipient_users.asInstanceOf[js.Any])
    if (reel_mentions != null) __obj.updateDynamic("reel_mentions")(reel_mentions.asInstanceOf[js.Any])
    if (reply_type != null) __obj.updateDynamic("reply_type")(reply_type.asInstanceOf[js.Any])
    if (story_chats != null) __obj.updateDynamic("story_chats")(story_chats.asInstanceOf[js.Any])
    if (story_countdowns != null) __obj.updateDynamic("story_countdowns")(story_countdowns.asInstanceOf[js.Any])
    if (story_cta != null) __obj.updateDynamic("story_cta")(story_cta.asInstanceOf[js.Any])
    if (story_hashtags != null) __obj.updateDynamic("story_hashtags")(story_hashtags.asInstanceOf[js.Any])
    if (story_locations != null) __obj.updateDynamic("story_locations")(story_locations.asInstanceOf[js.Any])
    if (story_media_creation_date != null) __obj.updateDynamic("story_media_creation_date")(story_media_creation_date.asInstanceOf[js.Any])
    if (story_polls != null) __obj.updateDynamic("story_polls")(story_polls.asInstanceOf[js.Any])
    if (story_questions != null) __obj.updateDynamic("story_questions")(story_questions.asInstanceOf[js.Any])
    if (story_quizs != null) __obj.updateDynamic("story_quizs")(story_quizs.asInstanceOf[js.Any])
    if (story_sliders != null) __obj.updateDynamic("story_sliders")(story_sliders.asInstanceOf[js.Any])
    if (story_sticker_ids != null) __obj.updateDynamic("story_sticker_ids")(story_sticker_ids.asInstanceOf[js.Any])
    if (thread_ids != null) __obj.updateDynamic("thread_ids")(thread_ids.asInstanceOf[js.Any])
    if (view_mode != null) __obj.updateDynamic("view_mode")(view_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureStoryVideoOptions]
  }
}

