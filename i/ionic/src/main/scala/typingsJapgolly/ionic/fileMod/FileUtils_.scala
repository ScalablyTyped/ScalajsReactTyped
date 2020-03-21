package typingsJapgolly.ionic.fileMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUtils_ extends js.Object {
  var filenameReservedRegex: js.Any
  var filenameReservedRegexWindows: js.Any
  def isValidFileName(fileName: js.Any): Boolean
}

object FileUtils_ {
  @scala.inline
  def apply(
    filenameReservedRegex: js.Any,
    filenameReservedRegexWindows: js.Any,
    isValidFileName: js.Any => CallbackTo[Boolean]
  ): FileUtils_ = {
    val __obj = js.Dynamic.literal(filenameReservedRegex = filenameReservedRegex.asInstanceOf[js.Any], filenameReservedRegexWindows = filenameReservedRegexWindows.asInstanceOf[js.Any])
    __obj.updateDynamic("isValidFileName")(js.Any.fromFunction1((t0: js.Any) => isValidFileName(t0).runNow()))
    __obj.asInstanceOf[FileUtils_]
  }
}

