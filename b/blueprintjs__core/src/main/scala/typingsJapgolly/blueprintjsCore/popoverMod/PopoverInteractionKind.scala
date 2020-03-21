package typingsJapgolly.blueprintjsCore.popoverMod

import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`click-target`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`hover-target`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.click
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.hover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.click
  - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`click-target`
  - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.hover
  - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`hover-target`
*/
trait PopoverInteractionKind extends js.Object

@JSImport("@blueprintjs/core/lib/esm/components/popover/popover", "PopoverInteractionKind")
@js.native
object PopoverInteractionKind extends js.Object {
  var CLICK: click = js.native
  var CLICK_TARGET_ONLY: `click-target` = js.native
  var HOVER: hover = js.native
  var HOVER_TARGET_ONLY: `hover-target` = js.native
}

