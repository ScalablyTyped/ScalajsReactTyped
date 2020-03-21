package typingsJapgolly.blueprintjsSelect

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  children ? :react.react.ReactNode}> */
trait ReadonlychildrenReactNode extends js.Object {
  val children: js.UndefOr[Node] = js.undefined
}

object ReadonlychildrenReactNode {
  @scala.inline
  def apply(children: VdomNode = null): ReadonlychildrenReactNode = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlychildrenReactNode]
  }
}

