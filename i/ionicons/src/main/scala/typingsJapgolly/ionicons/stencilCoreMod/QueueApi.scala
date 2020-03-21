package typingsJapgolly.ionicons.stencilCoreMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueApi extends js.Object {
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  var flush: js.UndefOr[js.Function1[/* cb */ js.UndefOr[js.Function0[Unit]], Unit]] = js.undefined
  def read(cb: RafCallback): Unit
  def tick(cb: RafCallback): Unit
  def write(cb: RafCallback): Unit
}

object QueueApi {
  @scala.inline
  def apply(
    read: RafCallback => Callback,
    tick: RafCallback => Callback,
    write: RafCallback => Callback,
    clear: js.UndefOr[Callback] = js.undefined,
    flush: /* cb */ js.UndefOr[js.Function0[Unit]] => Callback = null
  ): QueueApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("read")(js.Any.fromFunction1((t0: typingsJapgolly.ionicons.stencilCoreMod.RafCallback) => read(t0).runNow()))
    __obj.updateDynamic("tick")(js.Any.fromFunction1((t0: typingsJapgolly.ionicons.stencilCoreMod.RafCallback) => tick(t0).runNow()))
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: typingsJapgolly.ionicons.stencilCoreMod.RafCallback) => write(t0).runNow()))
    clear.foreach(p => __obj.updateDynamic("clear")(p.toJsFn))
    if (flush != null) __obj.updateDynamic("flush")(js.Any.fromFunction1((t0: /* cb */ js.UndefOr[js.Function0[scala.Unit]]) => flush(t0).runNow()))
    __obj.asInstanceOf[QueueApi]
  }
}

