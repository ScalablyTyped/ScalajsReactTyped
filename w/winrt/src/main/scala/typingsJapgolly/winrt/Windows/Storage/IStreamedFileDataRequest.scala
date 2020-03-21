package typingsJapgolly.winrt.Windows.Storage

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStreamedFileDataRequest extends js.Object {
  def failAndClose(failureMode: StreamedFileFailureMode): Unit
}

object IStreamedFileDataRequest {
  @scala.inline
  def apply(failAndClose: StreamedFileFailureMode => Callback): IStreamedFileDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failAndClose")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.StreamedFileFailureMode) => failAndClose(t0).runNow()))
    __obj.asInstanceOf[IStreamedFileDataRequest]
  }
}

