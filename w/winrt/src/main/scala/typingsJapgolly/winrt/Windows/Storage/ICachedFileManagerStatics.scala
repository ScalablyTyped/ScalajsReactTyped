package typingsJapgolly.winrt.Windows.Storage

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.Provider.FileUpdateStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICachedFileManagerStatics extends js.Object {
  def completeUpdatesAsync(file: IStorageFile): IAsyncOperation[FileUpdateStatus]
  def deferUpdates(file: IStorageFile): Unit
}

object ICachedFileManagerStatics {
  @scala.inline
  def apply(
    completeUpdatesAsync: IStorageFile => CallbackTo[IAsyncOperation[FileUpdateStatus]],
    deferUpdates: IStorageFile => Callback
  ): ICachedFileManagerStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("completeUpdatesAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.IStorageFile) => completeUpdatesAsync(t0).runNow()))
    __obj.updateDynamic("deferUpdates")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.IStorageFile) => deferUpdates(t0).runNow()))
    __obj.asInstanceOf[ICachedFileManagerStatics]
  }
}

