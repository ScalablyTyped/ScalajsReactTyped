package typingsJapgolly.dexie.mod.Dexie

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletingHookContext[T, Key] extends js.Object {
  var onerror: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.undefined
  var onsuccess: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object DeletingHookContext {
  @scala.inline
  def apply[T, Key](onerror: /* err */ js.Any => Callback = null, onsuccess: js.UndefOr[Callback] = js.undefined): DeletingHookContext[T, Key] = {
    val __obj = js.Dynamic.literal()
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction1((t0: /* err */ js.Any) => onerror(t0).runNow()))
    onsuccess.foreach(p => __obj.updateDynamic("onsuccess")(p.toJsFn))
    __obj.asInstanceOf[DeletingHookContext[T, Key]]
  }
}

