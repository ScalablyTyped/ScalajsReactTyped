package typingsJapgolly.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Error messages of stream playback
  *
  * When [[Stream.play]] fails to play the stream, this interface provides detailed error messages.
  *
  * In most cases, you can prompt the user to resume the playback ([[Stream.resume]]) by a user gesture except when the {@link status} is "aborted".
  */
trait StreamPlayError extends js.Object {
  /**
    * The reason why the playback fails. Usually, this value is an event that triggers the playback failure. Possible values include the following:
    * - "stalled": The failure might be caused by the browser policy. See [stalled event](https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/stalled_event).
    * - "pause": The stream playback might be paused by the user. See [pause event](https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/pause_event).
    * - "suspend": The failure might be caused by the browser policy. See [suspend event](https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/suspend_event).
    * - "canplay": Some browsers automatically stop the playback when the playback window is not displayed on the screen. See [canplay event](https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/canplay_event).
    * - "timer": The playback failure is caused by an unknown reason and captured by the internal timer.
    *
    * Due to the differences in browsers, `reason` might have different values for the same event.
    */
  val reason: String
  /**
    * The status of the player:
    * - "aborted": The player is removed before the stream is played successfully.
    * - "paused": The player is stopped.
    */
  val status: String
}

object StreamPlayError {
  @scala.inline
  def apply(reason: String, status: String): StreamPlayError = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StreamPlayError]
  }
}

