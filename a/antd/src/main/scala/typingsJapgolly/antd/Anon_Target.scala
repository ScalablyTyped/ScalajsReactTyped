package typingsJapgolly.antd

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Target extends js.Object {
  var target: js.Function0[
    (Window with (/* import warning: importer.ImportType#apply Failed type conversion: typeof globalThis */ js.Any)) | Null
  ]
}

object Anon_Target {
  @scala.inline
  def apply(
    target: CallbackTo[
      (Window with (/* import warning: importer.ImportType#apply Failed type conversion: typeof globalThis */ js.Any)) | Null
    ]
  ): Anon_Target = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("target")(target.toJsFn)
    __obj.asInstanceOf[Anon_Target]
  }
}

