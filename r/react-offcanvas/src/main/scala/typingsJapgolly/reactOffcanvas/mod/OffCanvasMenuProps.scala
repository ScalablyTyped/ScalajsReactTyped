package typingsJapgolly.reactOffcanvas.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOffcanvas.reactOffcanvasStrings.left
import typingsJapgolly.reactOffcanvas.reactOffcanvasStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffCanvasMenuProps extends js.Object {
  var children: Node
  var className: js.UndefOr[String] = js.undefined
  var isMenuOpened: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[left | right] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var transitionDuration: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object OffCanvasMenuProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    className: String = null,
    isMenuOpened: js.UndefOr[Boolean] = js.undefined,
    position: left | right = null,
    style: CSSProperties = null,
    transitionDuration: Int | Double = null,
    width: Int | Double = null
  ): OffCanvasMenuProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isMenuOpened)) __obj.updateDynamic("isMenuOpened")(isMenuOpened.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffCanvasMenuProps]
  }
}

