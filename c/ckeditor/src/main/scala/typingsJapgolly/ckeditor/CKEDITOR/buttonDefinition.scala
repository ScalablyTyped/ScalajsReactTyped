package typingsJapgolly.ckeditor.CKEDITOR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait buttonDefinition extends js.Object {
  var command: String
  var icon: js.UndefOr[String] = js.undefined
  var iconOffset: js.UndefOr[Double] = js.undefined
  var label: String
  var toolbar: String
}

object buttonDefinition {
  @scala.inline
  def apply(
    command: String,
    label: String,
    toolbar: String,
    icon: String = null,
    iconOffset: Int | Double = null
  ): buttonDefinition = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconOffset != null) __obj.updateDynamic("iconOffset")(iconOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[buttonDefinition]
  }
}

