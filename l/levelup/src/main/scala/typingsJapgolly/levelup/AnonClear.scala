package typingsJapgolly.levelup

import japgolly.scalajs.react.Callback
import typingsJapgolly.abstractLeveldown.mod.ErrorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClear extends js.Object {
  def clear(
    options: /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any,
    callback: ErrorCallback
  ): Unit
}

object AnonClear {
  @scala.inline
  def apply(
    clear: (/* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, ErrorCallback) => Callback
  ): AnonClear = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(js.Any.fromFunction2((t0: /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, t1: typingsJapgolly.abstractLeveldown.mod.ErrorCallback) => clear(t0, t1).runNow()))
    __obj.asInstanceOf[AnonClear]
  }
}

