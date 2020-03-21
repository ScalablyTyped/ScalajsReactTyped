package typingsJapgolly.rcMenu

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuiltinPlacements extends js.Object {
  var className: String
  var defaultOpenKeys: js.Array[_]
  var defaultSelectedKeys: js.Array[_]
  var mode: String
  var onClick: js.Function0[Unit]
  var onDeselect: js.Function0[Unit]
  var onOpenChange: js.Function0[Unit]
  var onSelect: js.Function0[Unit]
  var overflowedIndicator: Element
  var prefixCls: String
  var selectable: Boolean
  var subMenuCloseDelay: Double
  var subMenuOpenDelay: Double
  var triggerSubMenuAction: String
}

object AnonBuiltinPlacements {
  @scala.inline
  def apply(
    className: String,
    defaultOpenKeys: js.Array[_],
    defaultSelectedKeys: js.Array[_],
    mode: String,
    onClick: Callback,
    onDeselect: Callback,
    onOpenChange: Callback,
    onSelect: Callback,
    overflowedIndicator: VdomElement,
    prefixCls: String,
    selectable: Boolean,
    subMenuCloseDelay: Double,
    subMenuOpenDelay: Double,
    triggerSubMenuAction: String
  ): AnonBuiltinPlacements = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], defaultOpenKeys = defaultOpenKeys.asInstanceOf[js.Any], defaultSelectedKeys = defaultSelectedKeys.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], subMenuCloseDelay = subMenuCloseDelay.asInstanceOf[js.Any], subMenuOpenDelay = subMenuOpenDelay.asInstanceOf[js.Any], triggerSubMenuAction = triggerSubMenuAction.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(onClick.toJsFn)
    __obj.updateDynamic("onDeselect")(onDeselect.toJsFn)
    __obj.updateDynamic("onOpenChange")(onOpenChange.toJsFn)
    __obj.updateDynamic("onSelect")(onSelect.toJsFn)
    if (overflowedIndicator != null) __obj.updateDynamic("overflowedIndicator")(overflowedIndicator.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBuiltinPlacements]
  }
}

