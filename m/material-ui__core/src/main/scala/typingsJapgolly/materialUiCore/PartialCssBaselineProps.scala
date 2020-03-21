package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/CssBaseline.CssBaselineProps> */
@js.native
trait PartialCssBaselineProps extends js.Object {
  var children: js.UndefOr[Element] = js.native
}

object PartialCssBaselineProps {
  @scala.inline
  def apply(children: VdomElement = null): PartialCssBaselineProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCssBaselineProps]
  }
}

