package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base interface for standard UI elements.
  */
trait UiStandardElement
  extends UiCanGetVisibleElement
     with UiLabelElement {
  /**
    * Sets the visibility state.
    * @param visible true to show, false to hide.
    */
  def setVisible(visible: Boolean): Unit
}

object UiStandardElement {
  @scala.inline
  def apply(
    getLabel: CallbackTo[String],
    getVisible: CallbackTo[Boolean],
    setLabel: String => Callback,
    setVisible: Boolean => Callback
  ): UiStandardElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getLabel")(getLabel.toJsFn)
    __obj.updateDynamic("getVisible")(getVisible.toJsFn)
    __obj.updateDynamic("setLabel")(js.Any.fromFunction1((t0: java.lang.String) => setLabel(t0).runNow()))
    __obj.updateDynamic("setVisible")(js.Any.fromFunction1((t0: scala.Boolean) => setVisible(t0).runNow()))
    __obj.asInstanceOf[UiStandardElement]
  }
}

