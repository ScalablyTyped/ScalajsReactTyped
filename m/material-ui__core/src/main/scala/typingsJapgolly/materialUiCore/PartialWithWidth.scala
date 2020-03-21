package typingsJapgolly.materialUiCore

import typingsJapgolly.materialUiCore.createBreakpointsMod.Breakpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/withWidth.WithWidth> */
@js.native
trait PartialWithWidth extends js.Object {
  var width: js.UndefOr[Breakpoint] = js.native
}

object PartialWithWidth {
  @scala.inline
  def apply(width: Breakpoint = null): PartialWithWidth = {
    val __obj = js.Dynamic.literal()
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialWithWidth]
  }
}

