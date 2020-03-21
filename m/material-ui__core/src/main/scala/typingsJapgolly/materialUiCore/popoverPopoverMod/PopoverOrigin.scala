package typingsJapgolly.materialUiCore.popoverPopoverMod

import typingsJapgolly.materialUiCore.materialUiCoreStrings.bottom
import typingsJapgolly.materialUiCore.materialUiCoreStrings.center
import typingsJapgolly.materialUiCore.materialUiCoreStrings.left
import typingsJapgolly.materialUiCore.materialUiCoreStrings.right
import typingsJapgolly.materialUiCore.materialUiCoreStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopoverOrigin extends js.Object {
  var horizontal: left | center | right | Double = js.native
  var vertical: top | center | bottom | Double = js.native
}

object PopoverOrigin {
  @scala.inline
  def apply(horizontal: left | center | right | Double, vertical: top | center | bottom | Double): PopoverOrigin = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PopoverOrigin]
  }
}

