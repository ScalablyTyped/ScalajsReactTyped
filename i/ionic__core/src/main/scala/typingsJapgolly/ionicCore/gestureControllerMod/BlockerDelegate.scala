package typingsJapgolly.ionicCore.gestureControllerMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockerDelegate extends js.Object {
  var ctrl: js.UndefOr[js.Any] = js.undefined
  var disable: js.Any
  var disableScroll: js.Any
  var id: js.Any
  def block(): Unit
  def destroy(): Unit
  def unblock(): Unit
}

object BlockerDelegate {
  @scala.inline
  def apply(
    block: Callback,
    destroy: Callback,
    disable: js.Any,
    disableScroll: js.Any,
    id: js.Any,
    unblock: Callback,
    ctrl: js.Any = null
  ): BlockerDelegate = {
    val __obj = js.Dynamic.literal(disable = disable.asInstanceOf[js.Any], disableScroll = disableScroll.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("block")(block.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("unblock")(unblock.toJsFn)
    if (ctrl != null) __obj.updateDynamic("ctrl")(ctrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockerDelegate]
  }
}

