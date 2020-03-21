package typingsJapgolly.naverWhale.whale.devtools.panels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Button extends js.Object {
  /** Fired when the button is clicked. */
  var onClicked: typingsJapgolly.chrome.chrome.devtools.panels.ButtonClickedEvent = js.native
  /**
    * Updates the attributes of the button. If some of the arguments are omitted or null, the corresponding attributes are not updated.
    * @param iconPath Path to the new icon of the button.
    * @param tooltipText Text shown as a tooltip when user hovers the mouse over the button.
    * @param disabled Whether the button is disabled.
    */
  def update(): Unit = js.native
  def update(iconPath: String): Unit = js.native
  def update(iconPath: String, tooltipText: String): Unit = js.native
  def update(iconPath: String, tooltipText: String, disabled: Boolean): Unit = js.native
  def update(iconPath: String, tooltipText: Null, disabled: Boolean): Unit = js.native
  def update(iconPath: Null, tooltipText: String): Unit = js.native
  def update(iconPath: Null, tooltipText: String, disabled: Boolean): Unit = js.native
  def update(iconPath: Null, tooltipText: Null, disabled: Boolean): Unit = js.native
}

