package typingsJapgolly.winrt.Windows.Storage

import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.DownloadsFolder")
@js.native
class DownloadsFolder () extends js.Object

/* static members */
@JSGlobal("Windows.Storage.DownloadsFolder")
@js.native
object DownloadsFolder extends js.Object {
  def createFileAsync(desiredName: String): IAsyncOperation[StorageFile] = js.native
  def createFileAsync(desiredName: String, option: CreationCollisionOption): IAsyncOperation[StorageFile] = js.native
  def createFolderAsync(desiredName: String): IAsyncOperation[StorageFolder] = js.native
  def createFolderAsync(desiredName: String, option: CreationCollisionOption): IAsyncOperation[StorageFolder] = js.native
}

