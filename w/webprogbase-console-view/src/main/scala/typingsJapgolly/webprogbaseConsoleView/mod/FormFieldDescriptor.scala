package typingsJapgolly.webprogbaseConsoleView.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormFieldDescriptor extends js.Object {
  var auto: js.UndefOr[String] = js.undefined
  var default: js.UndefOr[String] = js.undefined
  var description: String
}

object FormFieldDescriptor {
  @scala.inline
  def apply(description: String, auto: String = null, default: String = null): FormFieldDescriptor = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    if (auto != null) __obj.updateDynamic("auto")(auto.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormFieldDescriptor]
  }
}

