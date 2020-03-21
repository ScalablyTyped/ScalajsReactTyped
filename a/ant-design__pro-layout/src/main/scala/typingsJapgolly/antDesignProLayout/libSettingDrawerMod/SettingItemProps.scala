package typingsJapgolly.antDesignProLayout.libSettingDrawerMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingItemProps extends js.Object {
  var action: Element
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledReason: js.UndefOr[Node] = js.undefined
  var title: Node
}

object SettingItemProps {
  @scala.inline
  def apply(
    action: VdomElement,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledReason: VdomNode = null,
    title: VdomNode = null
  ): SettingItemProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.rawElement.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledReason != null) __obj.updateDynamic("disabledReason")(disabledReason.rawNode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingItemProps]
  }
}

