package typingsJapgolly.typescriptServices.TypeScript.CompilerDiagnostics

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDiagnosticWriter extends js.Object {
  def Alert(output: String): Unit
}

object IDiagnosticWriter {
  @scala.inline
  def apply(Alert: String => Callback): IDiagnosticWriter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Alert")(js.Any.fromFunction1((t0: java.lang.String) => Alert(t0).runNow()))
    __obj.asInstanceOf[IDiagnosticWriter]
  }
}

