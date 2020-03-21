package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.DisplayState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessControl
  extends UiCanGetVisibleElement
     with UiCanSetVisibleElement {
  /**
    * Gets the display state of the process flow control.
    */
  def getDisplayState(): DisplayState
  /**
    * Reflow the UI of the process control
    * @param updateUI Specify true to update the UI of the process control; false otherwise.
    * @param parentStage ID of the parent stage.
    * @param nextStage ID of the next stage.
    */
  def reflow(updateUI: Boolean, parentStage: String, nextStage: String): Unit
  /**
    * Sets display state of the process flow control.
    * @param displayState Display state of the process flow control, as either "expanded" or "collapsed"
    */
  def setDisplayState(displayState: DisplayState): Unit
}

object ProcessControl {
  @scala.inline
  def apply(
    getDisplayState: CallbackTo[DisplayState],
    getVisible: CallbackTo[Boolean],
    reflow: (Boolean, String, String) => Callback,
    setDisplayState: DisplayState => Callback,
    setVisible: Boolean => Callback
  ): ProcessControl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDisplayState")(getDisplayState.toJsFn)
    __obj.updateDynamic("getVisible")(getVisible.toJsFn)
    __obj.updateDynamic("reflow")(js.Any.fromFunction3((t0: scala.Boolean, t1: java.lang.String, t2: java.lang.String) => reflow(t0, t1, t2).runNow()))
    __obj.updateDynamic("setDisplayState")(js.Any.fromFunction1((t0: typingsJapgolly.xrm.Xrm.DisplayState) => setDisplayState(t0).runNow()))
    __obj.updateDynamic("setVisible")(js.Any.fromFunction1((t0: scala.Boolean) => setVisible(t0).runNow()))
    __obj.asInstanceOf[ProcessControl]
  }
}

