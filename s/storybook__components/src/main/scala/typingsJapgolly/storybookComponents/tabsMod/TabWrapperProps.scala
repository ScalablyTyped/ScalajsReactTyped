package typingsJapgolly.storybookComponents.tabsMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabWrapperProps extends js.Object {
  var active: Boolean = js.native
  var children: js.UndefOr[Node] = js.native
  var render: js.UndefOr[js.Function0[Element]] = js.native
}

object TabWrapperProps {
  @scala.inline
  def apply(active: Boolean, children: VdomNode = null, render: js.UndefOr[CallbackTo[Element]] = js.undefined): TabWrapperProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    render.foreach(p => __obj.updateDynamic("render")(p.toJsFn))
    __obj.asInstanceOf[TabWrapperProps]
  }
}

