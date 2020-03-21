package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgColorPickerSplitButtonMethods extends js.Object {
  /**
  	 * Collapse the widget.
  	 *
  	 * @param e
  	 */
  def collapse(e: js.Object): js.Object
  /**
  	 * Destroys the widget.
  	 */
  def destroy(): js.Object
  /**
  	 * Expands the widget.
  	 *
  	 * @param e
  	 */
  def expand(e: js.Object): js.Object
  /**
  	 * Sets the color of the split button
  	 *
  	 * @param color The color value to be set.
  	 */
  def setColor(color: String): js.Object
  /**
  	 * Switch to given igToolbar button.
  	 *
  	 * @param button . The button jQuery element.
  	 */
  def switchToButton(button: js.Object): Unit
  /**
  	 * Toggle widget state between collapsed and expanded.
  	 *
  	 * @param e The igSplitButton to be expanded/collapsed.
  	 */
  def toggle(e: js.Object): js.Object
  def widget(): Unit
}

object IgColorPickerSplitButtonMethods {
  @scala.inline
  def apply(
    collapse: js.Object => CallbackTo[js.Object],
    destroy: CallbackTo[js.Object],
    expand: js.Object => CallbackTo[js.Object],
    setColor: String => CallbackTo[js.Object],
    switchToButton: js.Object => Callback,
    toggle: js.Object => CallbackTo[js.Object],
    widget: Callback
  ): IgColorPickerSplitButtonMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collapse")(js.Any.fromFunction1((t0: js.Object) => collapse(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("expand")(js.Any.fromFunction1((t0: js.Object) => expand(t0).runNow()))
    __obj.updateDynamic("setColor")(js.Any.fromFunction1((t0: java.lang.String) => setColor(t0).runNow()))
    __obj.updateDynamic("switchToButton")(js.Any.fromFunction1((t0: js.Object) => switchToButton(t0).runNow()))
    __obj.updateDynamic("toggle")(js.Any.fromFunction1((t0: js.Object) => toggle(t0).runNow()))
    __obj.updateDynamic("widget")(widget.toJsFn)
    __obj.asInstanceOf[IgColorPickerSplitButtonMethods]
  }
}

