package typingsJapgolly.dexie.mod.Dexie

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatingHookContext[T, Key] extends js.Object {
  var onerror: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.undefined
  var onsuccess: js.UndefOr[js.Function1[/* updatedObj */ T, Unit]] = js.undefined
}

object UpdatingHookContext {
  @scala.inline
  def apply[T, Key](onerror: /* err */ js.Any => Callback = null, onsuccess: /* updatedObj */ T => Callback = null): UpdatingHookContext[T, Key] = {
    val __obj = js.Dynamic.literal()
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction1((t0: /* err */ js.Any) => onerror(t0).runNow()))
    if (onsuccess != null) __obj.updateDynamic("onsuccess")(js.Any.fromFunction1((t0: /* updatedObj */ T) => onsuccess(t0).runNow()))
    __obj.asInstanceOf[UpdatingHookContext[T, Key]]
  }
}

