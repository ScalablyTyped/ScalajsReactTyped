package typingsJapgolly.levelup

import japgolly.scalajs.react.Callback
import typingsJapgolly.abstractLeveldown.mod.ErrorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDel extends js.Object {
  def del(
    key: /* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any,
    callback: ErrorCallback
  ): Unit
}

object AnonDel {
  @scala.inline
  def apply(
    del: (/* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, ErrorCallback) => Callback
  ): AnonDel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("del")(js.Any.fromFunction3((t0: /* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, t1: /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, t2: typingsJapgolly.abstractLeveldown.mod.ErrorCallback) => del(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonDel]
  }
}

