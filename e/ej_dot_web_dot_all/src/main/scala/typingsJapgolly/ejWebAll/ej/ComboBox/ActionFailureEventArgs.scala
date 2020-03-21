package typingsJapgolly.ejWebAll.ej.ComboBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionFailureEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the error message
    */
  var e: js.UndefOr[js.Any] = js.undefined
  /** returns the Autocomplete model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ActionFailureEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    e: js.Any = null,
    model: js.Any = null,
    `type`: String = null
  ): ActionFailureEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (e != null) __obj.updateDynamic("e")(e.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionFailureEventArgs]
  }
}

