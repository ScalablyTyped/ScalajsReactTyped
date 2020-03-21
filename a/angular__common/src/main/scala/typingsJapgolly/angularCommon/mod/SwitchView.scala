package typingsJapgolly.angularCommon.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchView extends js.Object {
  var _created: js.Any
  var _templateRef: js.Any
  var _viewContainerRef: js.Any
  def create(): Unit
  def destroy(): Unit
  def enforceState(created: Boolean): Unit
}

object SwitchView {
  @scala.inline
  def apply(
    _created: js.Any,
    _templateRef: js.Any,
    _viewContainerRef: js.Any,
    create: Callback,
    destroy: Callback,
    enforceState: Boolean => Callback
  ): SwitchView = {
    val __obj = js.Dynamic.literal(_created = _created.asInstanceOf[js.Any], _templateRef = _templateRef.asInstanceOf[js.Any], _viewContainerRef = _viewContainerRef.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(create.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("enforceState")(js.Any.fromFunction1((t0: scala.Boolean) => enforceState(t0).runNow()))
    __obj.asInstanceOf[SwitchView]
  }
}

