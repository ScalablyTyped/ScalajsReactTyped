package typingsJapgolly.materialUiCore.cssBaselineCssBaselineMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CssBaselineProps extends js.Object {
  var children: js.UndefOr[Element] = js.native
}

object CssBaselineProps {
  @scala.inline
  def apply(children: VdomElement = null): CssBaselineProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssBaselineProps]
  }
}

