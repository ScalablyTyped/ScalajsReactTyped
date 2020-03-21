package typingsJapgolly.yargs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCoerce extends js.Object {
  def coerce(arg: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
}

object AnonCoerce {
  @scala.inline
  def apply(
    coerce: js.Any => CallbackTo[
      /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
    ]
  ): AnonCoerce = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("coerce")(js.Any.fromFunction1((t0: js.Any) => coerce(t0).runNow()))
    __obj.asInstanceOf[AnonCoerce]
  }
}

