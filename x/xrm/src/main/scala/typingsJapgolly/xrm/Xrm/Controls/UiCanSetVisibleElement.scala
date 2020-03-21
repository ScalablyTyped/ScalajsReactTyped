package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for UI elements which can have the visibility value updated.
  */
trait UiCanSetVisibleElement extends js.Object {
  /**
    * Sets the visibility state.
    * @param visible true to show, false to hide.
    */
  def setVisible(visible: Boolean): Unit
}

object UiCanSetVisibleElement {
  @scala.inline
  def apply(setVisible: Boolean => Callback): UiCanSetVisibleElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setVisible")(js.Any.fromFunction1((t0: scala.Boolean) => setVisible(t0).runNow()))
    __obj.asInstanceOf[UiCanSetVisibleElement]
  }
}

