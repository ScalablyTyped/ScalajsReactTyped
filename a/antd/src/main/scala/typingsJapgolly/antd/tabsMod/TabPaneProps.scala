package typingsJapgolly.antd.tabsMod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabPaneProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var closable: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var forceRender: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  /** 选项卡头显示文字 */
  var tab: js.UndefOr[Node | String] = js.undefined
}

object TabPaneProps {
  @scala.inline
  def apply(
    className: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    forceRender: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    style: CSSProperties = null,
    tab: Node | String = null
  ): TabPaneProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tab != null) __obj.updateDynamic("tab")(tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabPaneProps]
  }
}

