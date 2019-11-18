package typingsJapgolly.atMaterialDashUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.Element
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreNumbers.`false`
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onClick
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onMouseDown
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onMouseUp
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onTouchEnd
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onTouchStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/ClickAwayListener.ClickAwayListenerProps> */
trait PartialClickAwayListenerProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var mouseEvent: js.UndefOr[onClick | onMouseDown | onMouseUp | `false`] = js.undefined
  var onClickAway: js.UndefOr[js.Function1[/* event */ ReactEventFrom[js.Object with Element], Unit]] = js.undefined
  var touchEvent: js.UndefOr[onTouchStart | onTouchEnd | `false`] = js.undefined
}

object PartialClickAwayListenerProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    mouseEvent: onClick | onMouseDown | onMouseUp | `false` = null,
    onClickAway: /* event */ ReactEventFrom[js.Object with Element] => Callback = null,
    touchEvent: onTouchStart | onTouchEnd | `false` = null
  ): PartialClickAwayListenerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (mouseEvent != null) __obj.updateDynamic("mouseEvent")(mouseEvent.asInstanceOf[js.Any])
    if (onClickAway != null) __obj.updateDynamic("onClickAway")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onClickAway(t0).runNow()))
    if (touchEvent != null) __obj.updateDynamic("touchEvent")(touchEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClickAwayListenerProps]
  }
}

