package typingsJapgolly.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowContent extends js.Object {
  var template: js.UndefOr[String] = js.undefined
}

object WindowContent {
  @scala.inline
  def apply(template: String = null): WindowContent = {
    val __obj = js.Dynamic.literal()
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowContent]
  }
}

