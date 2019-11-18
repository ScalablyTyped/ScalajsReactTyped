package typingsJapgolly.typescript.typescriptMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatDiagnosticsHost extends js.Object {
  def getCanonicalFileName(fileName: String): String
  def getCurrentDirectory(): String
  def getNewLine(): String
}

object FormatDiagnosticsHost {
  @scala.inline
  def apply(
    getCanonicalFileName: String => CallbackTo[String],
    getCurrentDirectory: CallbackTo[String],
    getNewLine: CallbackTo[String]
  ): FormatDiagnosticsHost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCanonicalFileName")(js.Any.fromFunction1((t0: java.lang.String) => getCanonicalFileName(t0).runNow()))
    __obj.updateDynamic("getCurrentDirectory")(getCurrentDirectory.toJsFn)
    __obj.updateDynamic("getNewLine")(getNewLine.toJsFn)
    __obj.asInstanceOf[FormatDiagnosticsHost]
  }
}

