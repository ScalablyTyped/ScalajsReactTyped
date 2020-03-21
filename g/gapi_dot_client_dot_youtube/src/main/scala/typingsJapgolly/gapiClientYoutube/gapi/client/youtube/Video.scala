package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Video extends js.Object {
  /** Age restriction details related to a video. This data can only be retrieved by the video owner. */
  var ageGating: js.UndefOr[VideoAgeGating] = js.undefined
  /** The contentDetails object contains information about the video content, including the length of the video and its aspect ratio. */
  var contentDetails: js.UndefOr[VideoContentDetails] = js.undefined
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  /**
    * The fileDetails object encapsulates information about the video file that was uploaded to YouTube, including the file's resolution, duration, audio and
    * video codecs, stream bitrates, and more. This data can only be retrieved by the video owner.
    */
  var fileDetails: js.UndefOr[VideoFileDetails] = js.undefined
  /** The ID that YouTube uses to uniquely identify the video. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#video". */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The liveStreamingDetails object contains metadata about a live video broadcast. The object will only be present in a video resource if the video is an
    * upcoming, live, or completed live broadcast.
    */
  var liveStreamingDetails: js.UndefOr[VideoLiveStreamingDetails] = js.undefined
  /** List with all localizations. */
  var localizations: js.UndefOr[Record[String, VideoLocalization]] = js.undefined
  /** The monetizationDetails object encapsulates information about the monetization status of the video. */
  var monetizationDetails: js.UndefOr[VideoMonetizationDetails] = js.undefined
  /** The player object contains information that you would use to play the video in an embedded player. */
  var player: js.UndefOr[VideoPlayer] = js.undefined
  /**
    * The processingProgress object encapsulates information about YouTube's progress in processing the uploaded video file. The properties in the object
    * identify the current processing status and an estimate of the time remaining until YouTube finishes processing the video. This part also indicates
    * whether different types of data or content, such as file details or thumbnail images, are available for the video.
    *
    * The processingProgress object is designed to be polled so that the video uploaded can track the progress that YouTube has made in processing the
    * uploaded video file. This data can only be retrieved by the video owner.
    */
  var processingDetails: js.UndefOr[VideoProcessingDetails] = js.undefined
  /** The projectDetails object contains information about the project specific video metadata. */
  var projectDetails: js.UndefOr[VideoProjectDetails] = js.undefined
  /** The recordingDetails object encapsulates information about the location, date and address where the video was recorded. */
  var recordingDetails: js.UndefOr[VideoRecordingDetails] = js.undefined
  /** The snippet object contains basic details about the video, such as its title, description, and category. */
  var snippet: js.UndefOr[VideoSnippet] = js.undefined
  /** The statistics object contains statistics about the video. */
  var statistics: js.UndefOr[VideoStatistics] = js.undefined
  /** The status object contains information about the video's uploading, processing, and privacy statuses. */
  var status: js.UndefOr[VideoStatus] = js.undefined
  /**
    * The suggestions object encapsulates suggestions that identify opportunities to improve the video quality or the metadata for the uploaded video. This
    * data can only be retrieved by the video owner.
    */
  var suggestions: js.UndefOr[VideoSuggestions] = js.undefined
  /** The topicDetails object encapsulates information about Freebase topics associated with the video. */
  var topicDetails: js.UndefOr[VideoTopicDetails] = js.undefined
}

object Video {
  @scala.inline
  def apply(
    ageGating: VideoAgeGating = null,
    contentDetails: VideoContentDetails = null,
    etag: String = null,
    fileDetails: VideoFileDetails = null,
    id: String = null,
    kind: String = null,
    liveStreamingDetails: VideoLiveStreamingDetails = null,
    localizations: Record[String, VideoLocalization] = null,
    monetizationDetails: VideoMonetizationDetails = null,
    player: VideoPlayer = null,
    processingDetails: VideoProcessingDetails = null,
    projectDetails: VideoProjectDetails = null,
    recordingDetails: VideoRecordingDetails = null,
    snippet: VideoSnippet = null,
    statistics: VideoStatistics = null,
    status: VideoStatus = null,
    suggestions: VideoSuggestions = null,
    topicDetails: VideoTopicDetails = null
  ): Video = {
    val __obj = js.Dynamic.literal()
    if (ageGating != null) __obj.updateDynamic("ageGating")(ageGating.asInstanceOf[js.Any])
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (fileDetails != null) __obj.updateDynamic("fileDetails")(fileDetails.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (liveStreamingDetails != null) __obj.updateDynamic("liveStreamingDetails")(liveStreamingDetails.asInstanceOf[js.Any])
    if (localizations != null) __obj.updateDynamic("localizations")(localizations.asInstanceOf[js.Any])
    if (monetizationDetails != null) __obj.updateDynamic("monetizationDetails")(monetizationDetails.asInstanceOf[js.Any])
    if (player != null) __obj.updateDynamic("player")(player.asInstanceOf[js.Any])
    if (processingDetails != null) __obj.updateDynamic("processingDetails")(processingDetails.asInstanceOf[js.Any])
    if (projectDetails != null) __obj.updateDynamic("projectDetails")(projectDetails.asInstanceOf[js.Any])
    if (recordingDetails != null) __obj.updateDynamic("recordingDetails")(recordingDetails.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (statistics != null) __obj.updateDynamic("statistics")(statistics.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (topicDetails != null) __obj.updateDynamic("topicDetails")(topicDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Video]
  }
}

