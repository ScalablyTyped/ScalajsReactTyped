package typingsJapgolly.instagramPrivateApi.uploadVideoOptionsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.instagramPrivateApi.AnonBuffer
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadSegmentedVideoOptions extends UploadVideoOptions {
  var retryContext: js.UndefOr[UploadRetryContext] = js.undefined
  var segmentDivider: js.UndefOr[SegmentDivider] = js.undefined
  var segments: js.UndefOr[js.Array[Buffer]] = js.undefined
}

object UploadSegmentedVideoOptions {
  @scala.inline
  def apply(
    duration: Double,
    video: Buffer,
    forAlbum: js.UndefOr[Boolean] = js.undefined,
    forDirectStory: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    isDirect: js.UndefOr[Boolean] = js.undefined,
    isDirectVoice: js.UndefOr[Boolean] = js.undefined,
    isIgtvVideo: js.UndefOr[Boolean] = js.undefined,
    isSidecar: js.UndefOr[Boolean] = js.undefined,
    mediaType: String = null,
    offset: Int | Double = null,
    retryContext: UploadRetryContext = null,
    segmentDivider: /* options */ AnonBuffer => CallbackTo[js.Array[Buffer]] = null,
    segments: js.Array[Buffer] = null,
    uploadId: String = null,
    uploadName: String = null,
    waterfallId: String = null,
    width: Int | Double = null
  ): UploadSegmentedVideoOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    if (!js.isUndefined(forAlbum)) __obj.updateDynamic("forAlbum")(forAlbum.asInstanceOf[js.Any])
    if (!js.isUndefined(forDirectStory)) __obj.updateDynamic("forDirectStory")(forDirectStory.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isDirect)) __obj.updateDynamic("isDirect")(isDirect.asInstanceOf[js.Any])
    if (!js.isUndefined(isDirectVoice)) __obj.updateDynamic("isDirectVoice")(isDirectVoice.asInstanceOf[js.Any])
    if (!js.isUndefined(isIgtvVideo)) __obj.updateDynamic("isIgtvVideo")(isIgtvVideo.asInstanceOf[js.Any])
    if (!js.isUndefined(isSidecar)) __obj.updateDynamic("isSidecar")(isSidecar.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (retryContext != null) __obj.updateDynamic("retryContext")(retryContext.asInstanceOf[js.Any])
    if (segmentDivider != null) __obj.updateDynamic("segmentDivider")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.instagramPrivateApi.AnonBuffer) => segmentDivider(t0).runNow()))
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    if (uploadId != null) __obj.updateDynamic("uploadId")(uploadId.asInstanceOf[js.Any])
    if (uploadName != null) __obj.updateDynamic("uploadName")(uploadName.asInstanceOf[js.Any])
    if (waterfallId != null) __obj.updateDynamic("waterfallId")(waterfallId.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadSegmentedVideoOptions]
  }
}

