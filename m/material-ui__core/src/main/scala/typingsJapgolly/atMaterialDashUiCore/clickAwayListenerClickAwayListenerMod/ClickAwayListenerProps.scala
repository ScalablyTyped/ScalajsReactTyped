package typingsJapgolly.atMaterialDashUiCore.clickAwayListenerClickAwayListenerMod

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

trait ClickAwayListenerProps extends js.Object {
  var children: Node
  var mouseEvent: js.UndefOr[onClick | onMouseDown | onMouseUp | `false`] = js.undefined
  var touchEvent: js.UndefOr[onTouchStart | onTouchEnd | `false`] = js.undefined
  def onClickAway(event: ReactEventFrom[js.Object with Element]): Unit
}

object ClickAwayListenerProps {
  @scala.inline
  def apply(
    onClickAway: ReactEventFrom[js.Object with Element] => Callback,
    children: VdomNode = null,
    mouseEvent: onClick | onMouseDown | onMouseUp | `false` = null,
    touchEvent: onTouchStart | onTouchEnd | `false` = null
  ): ClickAwayListenerProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onClickAway")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onClickAway(t0).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (mouseEvent != null) __obj.updateDynamic("mouseEvent")(mouseEvent.asInstanceOf[js.Any])
    if (touchEvent != null) __obj.updateDynamic("touchEvent")(touchEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickAwayListenerProps]
  }
}

