package typingsJapgolly.ejWebAll.ej.Uploadbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** To pass additional information to the server.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Selected FileList Object.
    */
  var files: js.UndefOr[js.Any] = js.undefined
  /** returns the Uploadbox model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BeginEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    files: js.Any = null,
    model: js.Any = null,
    `type`: String = null
  ): BeginEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginEventArgs]
  }
}

