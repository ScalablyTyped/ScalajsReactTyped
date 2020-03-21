package typingsJapgolly.nvd3.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolMap extends js.Object {
  def set(name: String, func: js.Function1[/* size */ js.Any, Unit]): Unit
}

object SymbolMap {
  @scala.inline
  def apply(set: (String, js.Function1[/* size */ js.Any, Unit]) => Callback): SymbolMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* size */ js.Any, scala.Unit]) => set(t0, t1).runNow()))
    __obj.asInstanceOf[SymbolMap]
  }
}

