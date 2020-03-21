package typingsJapgolly.ejWebAll.ej.Resizable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelperEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the autocomplete model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object HelperEventArgs {
  @scala.inline
  def apply(cancel: js.UndefOr[Boolean] = js.undefined, model: Model = null, `type`: String = null): HelperEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelperEventArgs]
  }
}

