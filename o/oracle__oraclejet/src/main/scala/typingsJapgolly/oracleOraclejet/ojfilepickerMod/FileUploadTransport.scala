package typingsJapgolly.oracleOraclejet.ojfilepickerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.FileList
import typingsJapgolly.oracleOraclejet.ojprogresslistMod.ProgressItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUploadTransport extends js.Object {
  def flush(): Unit
  def queue(fileList: FileList): js.Array[ProgressItem]
}

object FileUploadTransport {
  @scala.inline
  def apply(flush: Callback, queue: FileList => CallbackTo[js.Array[ProgressItem]]): FileUploadTransport = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.updateDynamic("queue")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.FileList) => queue(t0).runNow()))
    __obj.asInstanceOf[FileUploadTransport]
  }
}

