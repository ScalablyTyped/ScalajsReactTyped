package typingsJapgolly.ejWebAll.ej.Menu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeydownEventArgs extends js.Object {
  /** returns clicked menu item element
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** returns the event
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns clicked menu item text
    */
  var menuText: js.UndefOr[String] = js.undefined
  /** returns the menu model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object KeydownEventArgs {
  @scala.inline
  def apply(
    element: js.Any = null,
    event: js.Any = null,
    menuText: String = null,
    model: Model = null,
    `type`: String = null
  ): KeydownEventArgs = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (menuText != null) __obj.updateDynamic("menuText")(menuText.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeydownEventArgs]
  }
}

