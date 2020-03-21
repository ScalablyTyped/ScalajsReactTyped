package typingsJapgolly.winrt.Windows.Storage

import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.Provider.FileUpdateStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.CachedFileManager")
@js.native
class CachedFileManager () extends js.Object

/* static members */
@JSGlobal("Windows.Storage.CachedFileManager")
@js.native
object CachedFileManager extends js.Object {
  def completeUpdatesAsync(file: IStorageFile): IAsyncOperation[FileUpdateStatus] = js.native
  def deferUpdates(file: IStorageFile): Unit = js.native
}

