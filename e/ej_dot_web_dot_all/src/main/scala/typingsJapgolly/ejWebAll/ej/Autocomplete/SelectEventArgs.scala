package typingsJapgolly.ejWebAll.ej.Autocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectEventArgs extends js.Object {
  /** Data object of the selected item.
    */
  var Item: js.UndefOr[Model] = js.undefined
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Key of the selected item.
    */
  var key: js.UndefOr[String] = js.undefined
  /** Instance of the autocomplete model object.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Text of the selected item.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** Value of the autocomplete textbox.
    */
  var value: js.UndefOr[String] = js.undefined
}

object SelectEventArgs {
  @scala.inline
  def apply(
    Item: Model = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    model: Model = null,
    text: String = null,
    `type`: String = null,
    value: String = null
  ): SelectEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectEventArgs]
  }
}

