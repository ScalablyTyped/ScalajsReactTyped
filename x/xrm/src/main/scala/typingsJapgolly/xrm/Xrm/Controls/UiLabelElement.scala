package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for UI elements with labels.
  */
trait UiLabelElement extends js.Object {
  /**
    * Gets the label.
    * @returns The label.
    */
  def getLabel(): String
  /**
    * Sets the label.
    * @param label The label.
    */
  def setLabel(label: String): Unit
}

object UiLabelElement {
  @scala.inline
  def apply(getLabel: CallbackTo[String], setLabel: String => Callback): UiLabelElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getLabel")(getLabel.toJsFn)
    __obj.updateDynamic("setLabel")(js.Any.fromFunction1((t0: java.lang.String) => setLabel(t0).runNow()))
    __obj.asInstanceOf[UiLabelElement]
  }
}

