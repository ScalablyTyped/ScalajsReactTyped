package typingsJapgolly.ejWebAll.ej.Dialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeStartEventArgs extends js.Object {
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Current event object.
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** Instance of the dialog model object.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ResizeStartEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    event: js.Any = null,
    model: Model = null,
    `type`: String = null
  ): ResizeStartEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeStartEventArgs]
  }
}

