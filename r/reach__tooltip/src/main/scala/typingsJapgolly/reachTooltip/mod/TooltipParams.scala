package typingsJapgolly.reachTooltip.mod

import typingsJapgolly.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipParams extends js.Object {
  var id: String
  var isVisible: Boolean
  var triggerRect: DOMRect
}

object TooltipParams {
  @scala.inline
  def apply(id: String, isVisible: Boolean, triggerRect: DOMRect): TooltipParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], triggerRect = triggerRect.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TooltipParams]
  }
}

