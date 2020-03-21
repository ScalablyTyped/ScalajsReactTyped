package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatDiagnosticsHost extends js.Object {
  def getCanonicalFileName(fileName: java.lang.String): java.lang.String
  def getCurrentDirectory(): java.lang.String
  def getNewLine(): java.lang.String
}

object FormatDiagnosticsHost {
  @scala.inline
  def apply(
    getCanonicalFileName: java.lang.String => CallbackTo[java.lang.String],
    getCurrentDirectory: CallbackTo[java.lang.String],
    getNewLine: CallbackTo[java.lang.String]
  ): FormatDiagnosticsHost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCanonicalFileName")(js.Any.fromFunction1((t0: java.lang.String) => getCanonicalFileName(t0).runNow()))
    __obj.updateDynamic("getCurrentDirectory")(getCurrentDirectory.toJsFn)
    __obj.updateDynamic("getNewLine")(getNewLine.toJsFn)
    __obj.asInstanceOf[FormatDiagnosticsHost]
  }
}

