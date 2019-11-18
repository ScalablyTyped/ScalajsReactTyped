package typingsJapgolly.atMaterialDashUiCore.withWidthWithWidthMod

import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.raw.React.RefHandle
import typingsJapgolly.atMaterialDashUiCore.stylesCreateBreakpointsMod.Breakpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@material-ui/core.@material-ui/core/withWidth/withWidth.WithWidth> */
trait WithWidthProps extends js.Object {
  var innerRef: js.UndefOr[Ref | RefHandle[_]] = js.undefined
  var width: js.UndefOr[Breakpoint] = js.undefined
}

object WithWidthProps {
  @scala.inline
  def apply(innerRef: Ref | RefHandle[_] = null, width: Breakpoint = null): WithWidthProps = {
    val __obj = js.Dynamic.literal()
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithWidthProps]
  }
}

