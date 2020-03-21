package typingsJapgolly.levelup

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPut extends js.Object {
  def put(
    key: /* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any,
    value: /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any,
    cb: js.Any
  ): Unit
}

object AnonPut {
  @scala.inline
  def apply(
    put: (/* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, js.Any) => Callback
  ): AnonPut = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("put")(js.Any.fromFunction4((t0: /* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, t1: /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any, t2: /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, t3: js.Any) => put(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[AnonPut]
  }
}

