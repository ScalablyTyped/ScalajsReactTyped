package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.gestalt.gestaltStrings.down
import typingsJapgolly.gestalt.gestaltStrings.left
import typingsJapgolly.gestalt.gestaltStrings.lg
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.right
import typingsJapgolly.gestalt.gestaltStrings.sm
import typingsJapgolly.gestalt.gestaltStrings.up
import typingsJapgolly.gestalt.gestaltStrings.xl
import typingsJapgolly.gestalt.gestaltStrings.xs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends js.Object {
  var anchor: js.Any
  var children: js.UndefOr[Node] = js.undefined
  var idealDirection: js.UndefOr[up | right | down | left] = js.undefined
  var positionRelativeToAnchor: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[xs | sm | md | lg | xl] = js.undefined
  def onDismiss(): Unit
}

object TooltipProps {
  @scala.inline
  def apply(
    anchor: js.Any,
    onDismiss: Callback,
    children: VdomNode = null,
    idealDirection: up | right | down | left = null,
    positionRelativeToAnchor: js.UndefOr[Boolean] = js.undefined,
    size: xs | sm | md | lg | xl = null
  ): TooltipProps = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any])
    __obj.updateDynamic("onDismiss")(onDismiss.toJsFn)
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (idealDirection != null) __obj.updateDynamic("idealDirection")(idealDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(positionRelativeToAnchor)) __obj.updateDynamic("positionRelativeToAnchor")(positionRelativeToAnchor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}

