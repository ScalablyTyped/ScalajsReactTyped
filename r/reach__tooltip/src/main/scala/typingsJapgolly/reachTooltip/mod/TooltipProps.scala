package typingsJapgolly.reachTooltip.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends BaseTooltipProps {
  @JSName("children")
  var children_TooltipProps: Node
}

object TooltipProps {
  @scala.inline
  def apply(BaseTooltipProps: BaseTooltipProps, children: VdomNode = null): TooltipProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, BaseTooltipProps)
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}

