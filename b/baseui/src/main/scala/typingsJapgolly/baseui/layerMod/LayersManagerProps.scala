package typingsJapgolly.baseui.layerMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersManagerProps extends js.Object {
  var children: Node
  var zIndex: js.UndefOr[Double] = js.undefined
}

object LayersManagerProps {
  @scala.inline
  def apply(children: VdomNode = null, zIndex: Int | Double = null): LayersManagerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersManagerProps]
  }
}

