package typingsJapgolly.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorPickerMessages extends js.Object {
  @JSName("apply")
  var apply: js.UndefOr[String] = js.undefined
  var cancel: js.UndefOr[String] = js.undefined
  var previewInput: js.UndefOr[String] = js.undefined
}

object ColorPickerMessages {
  @scala.inline
  def apply(apply: String = null, cancel: String = null, previewInput: String = null): ColorPickerMessages = {
    val __obj = js.Dynamic.literal()
    if (apply != null) __obj.updateDynamic("apply")(apply.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (previewInput != null) __obj.updateDynamic("previewInput")(previewInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorPickerMessages]
  }
}

