package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a navigation item.
  * @see {@link UiElement}
  * @see {@link UiFocusable}
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-ui-navigation External Link: formContext.ui.navigation item (Client API reference)}
  */
trait NavigationItem
  extends UiStandardElement
     with UiFocusable {
  /**
    * Gets the name of the item.
    * @returns The identifier.
    */
  def getId(): String
}

object NavigationItem {
  @scala.inline
  def apply(
    getId: CallbackTo[String],
    getLabel: CallbackTo[String],
    getVisible: CallbackTo[Boolean],
    setFocus: Callback,
    setLabel: String => Callback,
    setVisible: Boolean => Callback
  ): NavigationItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getLabel")(getLabel.toJsFn)
    __obj.updateDynamic("getVisible")(getVisible.toJsFn)
    __obj.updateDynamic("setFocus")(setFocus.toJsFn)
    __obj.updateDynamic("setLabel")(js.Any.fromFunction1((t0: java.lang.String) => setLabel(t0).runNow()))
    __obj.updateDynamic("setVisible")(js.Any.fromFunction1((t0: scala.Boolean) => setVisible(t0).runNow()))
    __obj.asInstanceOf[NavigationItem]
  }
}

