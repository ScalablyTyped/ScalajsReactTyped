package typingsJapgolly.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video statistics of the local stream.
  *
  * If {@link getLocalVideoStats} is called successfully, the {@link LocalVideoStatsMap} interface provides the UID and {@link LocalVideoStats} of the local user.
  */
trait LocalVideoStats extends js.Object {
  /** Frame rate of the captured video, in fps. */
  val CaptureFrameRate: js.UndefOr[String] = js.undefined
  /** Height (pixels) of the captured video. */
  val CaptureResolutionHeight: js.UndefOr[String] = js.undefined
  /** Width (pixels) of the captured video. */
  val CaptureResolutionWidth: js.UndefOr[String] = js.undefined
  /** Delay from capturing to encoding the local video, in ms. */
  val EncodeDelay: js.UndefOr[String] = js.undefined
  /**
    * Whether the video is muted or not.
    *
    * - "1": Muted.
    * - "0": Unmuted.
    */
  val MuteState: js.UndefOr[String] = js.undefined
  /** Bitrate of the sent video, in Kbps. */
  val SendBitrate: js.UndefOr[String] = js.undefined
  /** Frame rate of the sent video, in fps. */
  val SendFrameRate: js.UndefOr[String] = js.undefined
  /** Height of the sent video, in pixels. */
  val SendResolutionHeight: js.UndefOr[String] = js.undefined
  /** Width of the sent video, in pixels. */
  val SendResolutionWidth: js.UndefOr[String] = js.undefined
  /** Bitrate of the local video set in [[setVideoProfile]]. */
  val TargetSendBitrate: js.UndefOr[String] = js.undefined
  /** Total duration of the published video, in seconds. */
  val TotalDuration: js.UndefOr[String] = js.undefined
  /** Total freeze time of the encoded video, in seconds. */
  val TotalFreezeTime: js.UndefOr[String] = js.undefined
}

object LocalVideoStats {
  @scala.inline
  def apply(
    CaptureFrameRate: String = null,
    CaptureResolutionHeight: String = null,
    CaptureResolutionWidth: String = null,
    EncodeDelay: String = null,
    MuteState: String = null,
    SendBitrate: String = null,
    SendFrameRate: String = null,
    SendResolutionHeight: String = null,
    SendResolutionWidth: String = null,
    TargetSendBitrate: String = null,
    TotalDuration: String = null,
    TotalFreezeTime: String = null
  ): LocalVideoStats = {
    val __obj = js.Dynamic.literal()
    if (CaptureFrameRate != null) __obj.updateDynamic("CaptureFrameRate")(CaptureFrameRate.asInstanceOf[js.Any])
    if (CaptureResolutionHeight != null) __obj.updateDynamic("CaptureResolutionHeight")(CaptureResolutionHeight.asInstanceOf[js.Any])
    if (CaptureResolutionWidth != null) __obj.updateDynamic("CaptureResolutionWidth")(CaptureResolutionWidth.asInstanceOf[js.Any])
    if (EncodeDelay != null) __obj.updateDynamic("EncodeDelay")(EncodeDelay.asInstanceOf[js.Any])
    if (MuteState != null) __obj.updateDynamic("MuteState")(MuteState.asInstanceOf[js.Any])
    if (SendBitrate != null) __obj.updateDynamic("SendBitrate")(SendBitrate.asInstanceOf[js.Any])
    if (SendFrameRate != null) __obj.updateDynamic("SendFrameRate")(SendFrameRate.asInstanceOf[js.Any])
    if (SendResolutionHeight != null) __obj.updateDynamic("SendResolutionHeight")(SendResolutionHeight.asInstanceOf[js.Any])
    if (SendResolutionWidth != null) __obj.updateDynamic("SendResolutionWidth")(SendResolutionWidth.asInstanceOf[js.Any])
    if (TargetSendBitrate != null) __obj.updateDynamic("TargetSendBitrate")(TargetSendBitrate.asInstanceOf[js.Any])
    if (TotalDuration != null) __obj.updateDynamic("TotalDuration")(TotalDuration.asInstanceOf[js.Any])
    if (TotalFreezeTime != null) __obj.updateDynamic("TotalFreezeTime")(TotalFreezeTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalVideoStats]
  }
}

