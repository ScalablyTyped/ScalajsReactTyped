package typingsJapgolly.powerappsComponentFramework.ComponentFramework

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The interface for the context.mode
	 */
trait Mode extends js.Object {
  /**
  		 * Height in pixels allocated to the control. If it's -1, then there is no limit on height
  		 */
  var allocatedHeight: Double
  /**
  		 * Width in pixels allocated to the control.
  		 */
  var allocatedWidth: Double
  /**
  		 * Is the control in 'Read-only' mode.
  		 */
  var isControlDisabled: Boolean
  /**
  		 * Is the control in 'Visible' mode.
  		 */
  var isVisible: Boolean
  /**
  		 * The defined control label
  		 */
  var label: String
  /**
  		 * set control state so that it will be stored in one session
  		 */
  def setControlState(state: Dictionary): Boolean
  /**
  		 * Make the control full screen.
  		 * @param value True if control needs to autosize to full screen. False if control needs to autosize to allocated width.
  		 */
  def setFullScreen(value: Boolean): Unit
  /**
  		 * API to determine container sizing if control needs to react. Control will get allocatedWidth/allocatedHeight if input is 'true'
  		 * @param value True if controls needs to track container size, control will get allocatedWidth/allocatedHeight
  		 */
  def trackContainerResize(value: Boolean): Unit
}

object Mode {
  @scala.inline
  def apply(
    allocatedHeight: Double,
    allocatedWidth: Double,
    isControlDisabled: Boolean,
    isVisible: Boolean,
    label: String,
    setControlState: Dictionary => CallbackTo[Boolean],
    setFullScreen: Boolean => Callback,
    trackContainerResize: Boolean => Callback
  ): Mode = {
    val __obj = js.Dynamic.literal(allocatedHeight = allocatedHeight.asInstanceOf[js.Any], allocatedWidth = allocatedWidth.asInstanceOf[js.Any], isControlDisabled = isControlDisabled.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("setControlState")(js.Any.fromFunction1((t0: typingsJapgolly.powerappsComponentFramework.ComponentFramework.Dictionary) => setControlState(t0).runNow()))
    __obj.updateDynamic("setFullScreen")(js.Any.fromFunction1((t0: scala.Boolean) => setFullScreen(t0).runNow()))
    __obj.updateDynamic("trackContainerResize")(js.Any.fromFunction1((t0: scala.Boolean) => trackContainerResize(t0).runNow()))
    __obj.asInstanceOf[Mode]
  }
}

