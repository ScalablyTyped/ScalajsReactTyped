package typingsJapgolly.smoothScrollbar.scrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollbarSize extends js.Object {
  var container: Metrics
  var content: Metrics
}

object ScrollbarSize {
  @scala.inline
  def apply(container: Metrics, content: Metrics): ScrollbarSize = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScrollbarSize]
  }
}

