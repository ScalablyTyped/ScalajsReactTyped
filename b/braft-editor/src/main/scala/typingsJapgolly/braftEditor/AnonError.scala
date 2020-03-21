package typingsJapgolly.braftEditor

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var file: File
  var libraryId: String
  def error(err: AnonMsg): Unit
  def progress(progress: Double): Unit
  def success(res: AnonMeta): Unit
}

object AnonError {
  @scala.inline
  def apply(
    error: AnonMsg => Callback,
    file: File,
    libraryId: String,
    progress: Double => Callback,
    success: AnonMeta => Callback
  ): AnonError = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], libraryId = libraryId.asInstanceOf[js.Any])
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: typingsJapgolly.braftEditor.AnonMsg) => error(t0).runNow()))
    __obj.updateDynamic("progress")(js.Any.fromFunction1((t0: scala.Double) => progress(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.braftEditor.AnonMeta) => success(t0).runNow()))
    __obj.asInstanceOf[AnonError]
  }
}

