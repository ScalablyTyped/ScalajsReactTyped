package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.RefHandle
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.gestalt.gestaltStrings.blue
import typingsJapgolly.gestalt.gestaltStrings.darkGray
import typingsJapgolly.gestalt.gestaltStrings.down
import typingsJapgolly.gestalt.gestaltStrings.left
import typingsJapgolly.gestalt.gestaltStrings.lg
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.orange
import typingsJapgolly.gestalt.gestaltStrings.red
import typingsJapgolly.gestalt.gestaltStrings.right
import typingsJapgolly.gestalt.gestaltStrings.sm
import typingsJapgolly.gestalt.gestaltStrings.up
import typingsJapgolly.gestalt.gestaltStrings.white
import typingsJapgolly.gestalt.gestaltStrings.xl
import typingsJapgolly.gestalt.gestaltStrings.xs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlyoutProps extends js.Object {
  var anchor: RefHandle[_]
  var children: js.UndefOr[Node] = js.undefined
  var color: js.UndefOr[blue | orange | red | white | darkGray] = js.undefined
  var idealDirection: js.UndefOr[up | right | down | left] = js.undefined
  var positionRelativeToAnchor: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[xs | sm | md | lg | xl | Double] = js.undefined
  def onDismiss(): Unit
}

object FlyoutProps {
  @scala.inline
  def apply(
    anchor: RefHandle[_],
    onDismiss: Callback,
    children: VdomNode = null,
    color: blue | orange | red | white | darkGray = null,
    idealDirection: up | right | down | left = null,
    positionRelativeToAnchor: js.UndefOr[Boolean] = js.undefined,
    size: xs | sm | md | lg | xl | Double = null
  ): FlyoutProps = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any])
    __obj.updateDynamic("onDismiss")(onDismiss.toJsFn)
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (idealDirection != null) __obj.updateDynamic("idealDirection")(idealDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(positionRelativeToAnchor)) __obj.updateDynamic("positionRelativeToAnchor")(positionRelativeToAnchor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlyoutProps]
  }
}

