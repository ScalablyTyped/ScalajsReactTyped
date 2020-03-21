package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgToolbarButtonMethods extends js.Object {
  /**
  	 * Activate toolbar button
  	 *
  	 * @param event
  	 */
  def activate(event: js.Object): Unit
  /**
  	 * Deactivate toolbar button
  	 *
  	 * @param event
  	 */
  def deactivate(event: js.Object): Unit
  /**
  	 * Destroy the widget.
  	 */
  def destroy(): Unit
  /**
  	 * Toggle toolbar button
  	 */
  def toggle(): Unit
  /**
  	 * Returns the element that represents this widget.
  	 */
  def widget(): js.Object
}

object IgToolbarButtonMethods {
  @scala.inline
  def apply(
    activate: js.Object => Callback,
    deactivate: js.Object => Callback,
    destroy: Callback,
    toggle: Callback,
    widget: CallbackTo[js.Object]
  ): IgToolbarButtonMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activate")(js.Any.fromFunction1((t0: js.Object) => activate(t0).runNow()))
    __obj.updateDynamic("deactivate")(js.Any.fromFunction1((t0: js.Object) => deactivate(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("toggle")(toggle.toJsFn)
    __obj.updateDynamic("widget")(widget.toJsFn)
    __obj.asInstanceOf[IgToolbarButtonMethods]
  }
}

