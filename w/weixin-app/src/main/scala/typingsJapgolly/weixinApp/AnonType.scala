package typingsJapgolly.weixinApp

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var value: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
  ] = js.undefined
  def `type`(args: js.Any*): /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
}

object AnonType {
  @scala.inline
  def apply(
    `type`: /* repeated */ js.Any => CallbackTo[
      /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any = null
  ): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => `type`(t0).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

