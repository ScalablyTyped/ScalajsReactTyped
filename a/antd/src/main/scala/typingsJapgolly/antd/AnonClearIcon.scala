package typingsJapgolly.antd

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClearIcon extends js.Object {
  var clearIcon: js.UndefOr[Node] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var menuItemSelectedIcon: js.UndefOr[Node] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var removeIcon: js.UndefOr[Node] = js.undefined
  var suffixIcon: js.UndefOr[Node] = js.undefined
}

object AnonClearIcon {
  @scala.inline
  def apply(
    clearIcon: VdomNode = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    menuItemSelectedIcon: VdomNode = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    removeIcon: VdomNode = null,
    suffixIcon: VdomNode = null
  ): AnonClearIcon = {
    val __obj = js.Dynamic.literal()
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (menuItemSelectedIcon != null) __obj.updateDynamic("menuItemSelectedIcon")(menuItemSelectedIcon.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (removeIcon != null) __obj.updateDynamic("removeIcon")(removeIcon.rawNode.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClearIcon]
  }
}

