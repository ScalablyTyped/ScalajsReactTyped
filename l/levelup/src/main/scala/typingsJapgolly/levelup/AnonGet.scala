package typingsJapgolly.levelup

import japgolly.scalajs.react.Callback
import typingsJapgolly.abstractLeveldown.mod.ErrorValueCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGet extends js.Object {
  def get(
    key: /* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any,
    callback: ErrorValueCallback[
      /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any
    ]
  ): Unit
}

object AnonGet {
  @scala.inline
  def apply(
    get: (/* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, ErrorValueCallback[
      /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any
    ]) => Callback
  ): AnonGet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction3((t0: /* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, t1: /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, t2: typingsJapgolly.abstractLeveldown.mod.ErrorValueCallback[
  /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any]) => get(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonGet]
  }
}

