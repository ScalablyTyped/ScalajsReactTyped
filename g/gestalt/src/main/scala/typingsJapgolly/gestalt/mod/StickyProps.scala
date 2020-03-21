package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.gestalt.AnonZIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickyProps extends js.Object {
  var bottom: js.UndefOr[Double | String] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var dangerouslySetZIndex: js.UndefOr[AnonZIndex] = js.undefined
  var left: js.UndefOr[Double | String] = js.undefined
  var right: js.UndefOr[Double | String] = js.undefined
  var top: js.UndefOr[Double | String] = js.undefined
}

object StickyProps {
  @scala.inline
  def apply(
    bottom: Double | String = null,
    children: VdomNode = null,
    dangerouslySetZIndex: AnonZIndex = null,
    left: Double | String = null,
    right: Double | String = null,
    top: Double | String = null
  ): StickyProps = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (dangerouslySetZIndex != null) __obj.updateDynamic("dangerouslySetZIndex")(dangerouslySetZIndex.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickyProps]
  }
}

