package typingsJapgolly.cordovaPluginCamera

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A handle to the popover dialog created by navigator.camera.getPicture. Used on iOS only.
  */
trait CameraPopoverHandle extends js.Object {
  /**
    * Set the position of the popover.
    * @param popoverOptions the CameraPopoverOptions that specify the new position.
    */
  def setPosition(popoverOptions: CameraPopoverOptions): Unit
}

object CameraPopoverHandle {
  @scala.inline
  def apply(setPosition: CameraPopoverOptions => Callback): CameraPopoverHandle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setPosition")(js.Any.fromFunction1((t0: typingsJapgolly.cordovaPluginCamera.CameraPopoverOptions) => setPosition(t0).runNow()))
    __obj.asInstanceOf[CameraPopoverHandle]
  }
}

