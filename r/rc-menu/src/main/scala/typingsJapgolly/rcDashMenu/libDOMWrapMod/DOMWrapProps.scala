package typingsJapgolly.rcDashMenu.libDOMWrapMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.rcDashMenu.libInterfaceMod.MenuMode
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMWrapProps extends js.Object {
  var children: js.UndefOr[js.Array[Element]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[MenuMode] = js.undefined
  var overflowedIndicator: js.UndefOr[Node] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object DOMWrapProps {
  @scala.inline
  def apply(
    children: js.Array[Element] = null,
    className: String = null,
    level: Int | Double = null,
    mode: MenuMode = null,
    overflowedIndicator: VdomNode = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    tag: String = null,
    theme: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): DOMWrapProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (overflowedIndicator != null) __obj.updateDynamic("overflowedIndicator")(overflowedIndicator.rawNode.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMWrapProps]
  }
}

