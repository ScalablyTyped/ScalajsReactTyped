package typingsJapgolly.reactTable.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{initialRowStateAccessor (row : react-table.react-table.Row<D>): react-table.react-table.UseRowStateLocalState<D, unknown>, getResetRowStateDeps (instance : react-table.react-table.TableInstance<D>): std.Array<any>,   autoResetRowState ? :boolean}> */
trait UseRowStateOptions[D /* <: js.Object */] extends js.Object {
  var autoResetRowState: js.UndefOr[Boolean] = js.undefined
  var getResetRowStateDeps: js.UndefOr[js.Function1[/* instance */ TableInstance[D], js.Array[_]]] = js.undefined
  var initialRowStateAccessor: js.UndefOr[js.Function1[/* row */ Row[D], UseRowStateLocalState[D, _]]] = js.undefined
}

object UseRowStateOptions {
  @scala.inline
  def apply[D /* <: js.Object */](
    autoResetRowState: js.UndefOr[Boolean] = js.undefined,
    getResetRowStateDeps: /* instance */ TableInstance[D] => CallbackTo[js.Array[js.Any]] = null,
    initialRowStateAccessor: /* row */ Row[D] => CallbackTo[UseRowStateLocalState[D, js.Any]] = null
  ): UseRowStateOptions[D] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoResetRowState)) __obj.updateDynamic("autoResetRowState")(autoResetRowState.asInstanceOf[js.Any])
    if (getResetRowStateDeps != null) __obj.updateDynamic("getResetRowStateDeps")(js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.reactTable.mod.TableInstance[D]) => getResetRowStateDeps(t0).runNow()))
    if (initialRowStateAccessor != null) __obj.updateDynamic("initialRowStateAccessor")(js.Any.fromFunction1((t0: /* row */ typingsJapgolly.reactTable.mod.Row[D]) => initialRowStateAccessor(t0).runNow()))
    __obj.asInstanceOf[UseRowStateOptions[D]]
  }
}

