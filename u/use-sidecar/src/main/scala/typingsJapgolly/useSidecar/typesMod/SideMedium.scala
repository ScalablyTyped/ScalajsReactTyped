package typingsJapgolly.useSidecar.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SideMedium[T] extends js.Object {
  var options: js.UndefOr[js.Object] = js.undefined
  def assignMedium(handler: MediumCallback[T]): Unit
  def assignSyncMedium(handler: MediumCallback[T]): Unit
  def read(): js.UndefOr[T]
  def useMedium(effect: T): removeCb
}

object SideMedium {
  @scala.inline
  def apply[T](
    assignMedium: MediumCallback[T] => Callback,
    assignSyncMedium: MediumCallback[T] => Callback,
    read: CallbackTo[js.UndefOr[T]],
    useMedium: T => CallbackTo[removeCb],
    options: js.Object = null
  ): SideMedium[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assignMedium")(js.Any.fromFunction1((t0: typingsJapgolly.useSidecar.typesMod.MediumCallback[T]) => assignMedium(t0).runNow()))
    __obj.updateDynamic("assignSyncMedium")(js.Any.fromFunction1((t0: typingsJapgolly.useSidecar.typesMod.MediumCallback[T]) => assignSyncMedium(t0).runNow()))
    __obj.updateDynamic("read")(read.toJsFn)
    __obj.updateDynamic("useMedium")(js.Any.fromFunction1((t0: T) => useMedium(t0).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideMedium[T]]
  }
}

