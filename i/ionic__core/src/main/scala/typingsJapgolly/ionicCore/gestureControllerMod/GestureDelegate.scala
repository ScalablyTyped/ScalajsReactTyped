package typingsJapgolly.ionicCore.gestureControllerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureDelegate extends js.Object {
  var ctrl: js.UndefOr[js.Any] = js.undefined
  var disableScroll: js.Any
  var id: js.Any
  var name: js.Any
  var priority: js.Any
  def canStart(): Boolean
  def capture(): Boolean
  def destroy(): Unit
  def release(): Unit
  def start(): Boolean
}

object GestureDelegate {
  @scala.inline
  def apply(
    canStart: CallbackTo[Boolean],
    capture: CallbackTo[Boolean],
    destroy: Callback,
    disableScroll: js.Any,
    id: js.Any,
    name: js.Any,
    priority: js.Any,
    release: Callback,
    start: CallbackTo[Boolean],
    ctrl: js.Any = null
  ): GestureDelegate = {
    val __obj = js.Dynamic.literal(disableScroll = disableScroll.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("canStart")(canStart.toJsFn)
    __obj.updateDynamic("capture")(capture.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("release")(release.toJsFn)
    __obj.updateDynamic("start")(start.toJsFn)
    if (ctrl != null) __obj.updateDynamic("ctrl")(ctrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureDelegate]
  }
}

