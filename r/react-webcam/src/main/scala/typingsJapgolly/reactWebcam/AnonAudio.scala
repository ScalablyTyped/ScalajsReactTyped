package typingsJapgolly.reactWebcam

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAudio extends js.Object {
  var audio: Boolean
  var imageSmoothing: Boolean
  var mirrored: Boolean
  var screenshotFormat: String
  var screenshotQuality: Double
  def onUserMedia(): Unit
  def onUserMediaError(): Unit
}

object AnonAudio {
  @scala.inline
  def apply(
    audio: Boolean,
    imageSmoothing: Boolean,
    mirrored: Boolean,
    onUserMedia: Callback,
    onUserMediaError: Callback,
    screenshotFormat: String,
    screenshotQuality: Double
  ): AnonAudio = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], imageSmoothing = imageSmoothing.asInstanceOf[js.Any], mirrored = mirrored.asInstanceOf[js.Any], screenshotFormat = screenshotFormat.asInstanceOf[js.Any], screenshotQuality = screenshotQuality.asInstanceOf[js.Any])
    __obj.updateDynamic("onUserMedia")(onUserMedia.toJsFn)
    __obj.updateDynamic("onUserMediaError")(onUserMediaError.toJsFn)
    __obj.asInstanceOf[AnonAudio]
  }
}

