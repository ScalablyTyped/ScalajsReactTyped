package typingsJapgolly.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtensions extends js.Object {
  var extensions: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object AnonExtensions {
  @scala.inline
  def apply(extensions: String = null, title: String = null): AnonExtensions = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtensions]
  }
}

