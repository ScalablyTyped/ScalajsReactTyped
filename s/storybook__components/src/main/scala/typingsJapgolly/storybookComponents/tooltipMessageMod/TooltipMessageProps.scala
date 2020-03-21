package typingsJapgolly.storybookComponents.tooltipMessageMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.storybookComponents.AnonHref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipMessageProps extends js.Object {
  var desc: js.UndefOr[Node] = js.native
  var links: js.UndefOr[js.Array[AnonHref]] = js.native
  var title: js.UndefOr[Node] = js.native
}

object TooltipMessageProps {
  @scala.inline
  def apply(desc: VdomNode = null, links: js.Array[AnonHref] = null, title: VdomNode = null): TooltipMessageProps = {
    val __obj = js.Dynamic.literal()
    if (desc != null) __obj.updateDynamic("desc")(desc.rawNode.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipMessageProps]
  }
}

