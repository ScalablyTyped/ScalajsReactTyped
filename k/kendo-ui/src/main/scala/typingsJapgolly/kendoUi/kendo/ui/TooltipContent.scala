package typingsJapgolly.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipContent extends js.Object {
  var url: js.UndefOr[String] = js.undefined
}

object TooltipContent {
  @scala.inline
  def apply(url: String = null): TooltipContent = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipContent]
  }
}

