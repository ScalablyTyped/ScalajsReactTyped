package typingsJapgolly.gapiClientPlusdomains.gapi.client.plusdomains

import typingsJapgolly.gapiClientPlusdomains.AnonImage
import typingsJapgolly.gapiClientPlusdomains.AnonTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Media extends js.Object {
  /** The person who uploaded this media. */
  var author: js.UndefOr[AnonImage] = js.undefined
  /** The display name for this media. */
  var displayName: js.UndefOr[String] = js.undefined
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.undefined
  /** Exif information of the media item. */
  var exif: js.UndefOr[AnonTime] = js.undefined
  /** The height in pixels of the original image. */
  var height: js.UndefOr[Double] = js.undefined
  /** ID of this media, which is generated by the API. */
  var id: js.UndefOr[String] = js.undefined
  /** The type of resource. */
  var kind: js.UndefOr[String] = js.undefined
  /** The time at which this media was originally created in UTC. Formatted as an RFC 3339 timestamp that matches this example: 2010-11-25T14:30:27.655Z */
  var mediaCreatedTime: js.UndefOr[String] = js.undefined
  /** The URL of this photo or video's still image. */
  var mediaUrl: js.UndefOr[String] = js.undefined
  /** The time at which this media was uploaded. Formatted as an RFC 3339 timestamp. */
  var published: js.UndefOr[String] = js.undefined
  /** The size in bytes of this video. */
  var sizeBytes: js.UndefOr[String] = js.undefined
  /** The list of video streams for this video. There might be several different streams available for a single video, either Flash or MPEG, of various sizes */
  var streams: js.UndefOr[js.Array[Videostream]] = js.undefined
  /** A description, or caption, for this media. */
  var summary: js.UndefOr[String] = js.undefined
  /** The time at which this media was last updated. This includes changes to media metadata. Formatted as an RFC 3339 timestamp. */
  var updated: js.UndefOr[String] = js.undefined
  /** The URL for the page that hosts this media. */
  var url: js.UndefOr[String] = js.undefined
  /** The duration in milliseconds of this video. */
  var videoDuration: js.UndefOr[String] = js.undefined
  /**
    * The encoding status of this video. Possible values are:
    * - "UPLOADING" - Not all the video bytes have been received.
    * - "PENDING" - Video not yet processed.
    * - "FAILED" - Video processing failed.
    * - "READY" - A single video stream is playable.
    * - "FINAL" - All video streams are playable.
    */
  var videoStatus: js.UndefOr[String] = js.undefined
  /** The width in pixels of the original image. */
  var width: js.UndefOr[Double] = js.undefined
}

object Media {
  @scala.inline
  def apply(
    author: AnonImage = null,
    displayName: String = null,
    etag: String = null,
    exif: AnonTime = null,
    height: Int | Double = null,
    id: String = null,
    kind: String = null,
    mediaCreatedTime: String = null,
    mediaUrl: String = null,
    published: String = null,
    sizeBytes: String = null,
    streams: js.Array[Videostream] = null,
    summary: String = null,
    updated: String = null,
    url: String = null,
    videoDuration: String = null,
    videoStatus: String = null,
    width: Int | Double = null
  ): Media = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (exif != null) __obj.updateDynamic("exif")(exif.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (mediaCreatedTime != null) __obj.updateDynamic("mediaCreatedTime")(mediaCreatedTime.asInstanceOf[js.Any])
    if (mediaUrl != null) __obj.updateDynamic("mediaUrl")(mediaUrl.asInstanceOf[js.Any])
    if (published != null) __obj.updateDynamic("published")(published.asInstanceOf[js.Any])
    if (sizeBytes != null) __obj.updateDynamic("sizeBytes")(sizeBytes.asInstanceOf[js.Any])
    if (streams != null) __obj.updateDynamic("streams")(streams.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (videoDuration != null) __obj.updateDynamic("videoDuration")(videoDuration.asInstanceOf[js.Any])
    if (videoStatus != null) __obj.updateDynamic("videoStatus")(videoStatus.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Media]
  }
}

