package typingsJapgolly.ejWebAll.ej.CheckBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the state of the checkbox
    */
  var checkState: js.UndefOr[String] = js.undefined
  /** returns the event arguments
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the status whether the element is checked or not.
    */
  var isChecked: js.UndefOr[Boolean] = js.undefined
  /** returns the CheckBox model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    checkState: String = null,
    event: js.Any = null,
    isChecked: js.UndefOr[Boolean] = js.undefined,
    model: Model = null,
    `type`: String = null
  ): ChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (checkState != null) __obj.updateDynamic("checkState")(checkState.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (!js.isUndefined(isChecked)) __obj.updateDynamic("isChecked")(isChecked.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventArgs]
  }
}

