package typingsJapgolly.linguiMacro.renderMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var render: js.UndefOr[Node] = js.undefined
}

object RenderProps {
  @scala.inline
  def apply(className: String = null, description: String = null, render: VdomNode = null): RenderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderProps]
  }
}

