package typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISidenavObject extends js.Object {
  def close(): IPromise[Unit]
  def isLockedOpen(): Boolean
  def isOpen(): Boolean
  def onClose(onClose: js.Function0[Unit]): Unit
  def open(): IPromise[Unit]
  def toggle(): IPromise[Unit]
}

object ISidenavObject {
  @scala.inline
  def apply(
    close: CallbackTo[IPromise[Unit]],
    isLockedOpen: CallbackTo[Boolean],
    isOpen: CallbackTo[Boolean],
    onClose: js.Function0[Unit] => Callback,
    open: CallbackTo[IPromise[Unit]],
    toggle: CallbackTo[IPromise[Unit]]
  ): ISidenavObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("isLockedOpen")(isLockedOpen.toJsFn)
    __obj.updateDynamic("isOpen")(isOpen.toJsFn)
    __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => onClose(t0).runNow()))
    __obj.updateDynamic("open")(open.toJsFn)
    __obj.updateDynamic("toggle")(toggle.toJsFn)
    __obj.asInstanceOf[ISidenavObject]
  }
}

