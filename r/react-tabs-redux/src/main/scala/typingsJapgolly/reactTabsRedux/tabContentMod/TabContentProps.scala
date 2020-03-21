package typingsJapgolly.reactTabsRedux.tabContentMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabContentProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disableInlineStyles: js.UndefOr[Boolean] = js.undefined
  var `for`: String | Double
  var isVisible: js.UndefOr[Boolean] = js.undefined
  var renderActiveTabContentOnly: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var visibleClassName: js.UndefOr[String] = js.undefined
  var visibleStyle: js.UndefOr[js.Object] = js.undefined
}

object TabContentProps {
  @scala.inline
  def apply(
    `for`: String | Double,
    children: VdomNode = null,
    className: String = null,
    disableInlineStyles: js.UndefOr[Boolean] = js.undefined,
    isVisible: js.UndefOr[Boolean] = js.undefined,
    renderActiveTabContentOnly: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    visibleClassName: String = null,
    visibleStyle: js.Object = null
  ): TabContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disableInlineStyles)) __obj.updateDynamic("disableInlineStyles")(disableInlineStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(isVisible)) __obj.updateDynamic("isVisible")(isVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(renderActiveTabContentOnly)) __obj.updateDynamic("renderActiveTabContentOnly")(renderActiveTabContentOnly.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (visibleClassName != null) __obj.updateDynamic("visibleClassName")(visibleClassName.asInstanceOf[js.Any])
    if (visibleStyle != null) __obj.updateDynamic("visibleStyle")(visibleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabContentProps]
  }
}

