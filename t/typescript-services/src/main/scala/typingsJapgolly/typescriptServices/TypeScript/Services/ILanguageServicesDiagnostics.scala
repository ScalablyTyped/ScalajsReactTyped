package typingsJapgolly.typescriptServices.TypeScript.Services

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageServicesDiagnostics extends js.Object {
  def log(content: String): Unit
}

object ILanguageServicesDiagnostics {
  @scala.inline
  def apply(log: String => Callback): ILanguageServicesDiagnostics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: java.lang.String) => log(t0).runNow()))
    __obj.asInstanceOf[ILanguageServicesDiagnostics]
  }
}

