package typingsJapgolly.webrtc

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.mediastream.MediaDeviceInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaDevices extends js.Object {
  def enumerateDevices(): js.Promise[js.Array[MediaDeviceInfo]]
  def getSupportedConstraints(): MediaTrackSupportedConstraints
  def getUserMedia(constraints: MediaStreamConstraints): js.Promise[MediaStream]
}

object MediaDevices {
  @scala.inline
  def apply(
    enumerateDevices: CallbackTo[js.Promise[js.Array[MediaDeviceInfo]]],
    getSupportedConstraints: CallbackTo[MediaTrackSupportedConstraints],
    getUserMedia: MediaStreamConstraints => CallbackTo[js.Promise[MediaStream]]
  ): MediaDevices = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enumerateDevices")(enumerateDevices.toJsFn)
    __obj.updateDynamic("getSupportedConstraints")(getSupportedConstraints.toJsFn)
    __obj.updateDynamic("getUserMedia")(js.Any.fromFunction1((t0: typingsJapgolly.webrtc.MediaStreamConstraints) => getUserMedia(t0).runNow()))
    __obj.asInstanceOf[MediaDevices]
  }
}

