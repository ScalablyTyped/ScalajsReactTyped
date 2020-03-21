package typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTransferContentPart extends js.Object {
  def setFile(value: IStorageFile): Unit
  def setHeader(headerName: String, headerValue: String): Unit
  def setText(value: String): Unit
}

object IBackgroundTransferContentPart {
  @scala.inline
  def apply(
    setFile: IStorageFile => Callback,
    setHeader: (String, String) => Callback,
    setText: String => Callback
  ): IBackgroundTransferContentPart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setFile")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.IStorageFile) => setFile(t0).runNow()))
    __obj.updateDynamic("setHeader")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setHeader(t0, t1).runNow()))
    __obj.updateDynamic("setText")(js.Any.fromFunction1((t0: java.lang.String) => setText(t0).runNow()))
    __obj.asInstanceOf[IBackgroundTransferContentPart]
  }
}

