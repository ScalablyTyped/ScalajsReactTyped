package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.Callback
import typingsJapgolly.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureHelpResult extends IDisposable {
  var value: SignatureHelp
}

object SignatureHelpResult {
  @scala.inline
  def apply(dispose: Callback, value: SignatureHelp): SignatureHelpResult = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.asInstanceOf[SignatureHelpResult]
  }
}

