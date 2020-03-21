package typingsJapgolly.antd

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTarget extends js.Object {
  var target: js.Function0[
    (Window_ with (/* import warning: importer.ImportType#apply Failed type conversion: typeof globalThis */ js.Any)) | Null
  ]
}

object AnonTarget {
  @scala.inline
  def apply(
    target: CallbackTo[
      (Window_ with (/* import warning: importer.ImportType#apply Failed type conversion: typeof globalThis */ js.Any)) | Null
    ]
  ): AnonTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("target")(target.toJsFn)
    __obj.asInstanceOf[AnonTarget]
  }
}

