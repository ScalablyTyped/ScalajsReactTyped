package typingsJapgolly.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPlaylistItemContentDetails extends js.Object {
  /**
    * The time, measured in seconds from the start of the video, when the video
    * should stop playing. (The playlist owner can specify the times when the
    * video should start and stop playing when the video is played in the
    * context of the playlist.) By default, assume that the video.endTime is
    * the end of the video.
    */
  var endAt: js.UndefOr[String] = js.native
  /**
    * A user-generated note for this item.
    */
  var note: js.UndefOr[String] = js.native
  /**
    * The time, measured in seconds from the start of the video, when the video
    * should start playing. (The playlist owner can specify the times when the
    * video should start and stop playing when the video is played in the
    * context of the playlist.) The default value is 0.
    */
  var startAt: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify a video. To retrieve the
    * video resource, set the id query parameter to this value in your API
    * request.
    */
  var videoId: js.UndefOr[String] = js.native
  /**
    * The date and time that the video was published to YouTube. The value is
    * specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var videoPublishedAt: js.UndefOr[String] = js.native
}

object SchemaPlaylistItemContentDetails {
  @scala.inline
  def apply(
    endAt: String = null,
    note: String = null,
    startAt: String = null,
    videoId: String = null,
    videoPublishedAt: String = null
  ): SchemaPlaylistItemContentDetails = {
    val __obj = js.Dynamic.literal()
    if (endAt != null) __obj.updateDynamic("endAt")(endAt.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    if (videoPublishedAt != null) __obj.updateDynamic("videoPublishedAt")(videoPublishedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlaylistItemContentDetails]
  }
}

