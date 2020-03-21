package typingsJapgolly.winrt.Windows.Storage

import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStreamReference
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageFile
  extends IStorageItem
     with IRandomAccessStreamReference
     with IInputStreamReference {
  var contentType: String = js.native
  var fileType: String = js.native
  def copyAndReplaceAsync(fileToReplace: IStorageFile): IAsyncAction = js.native
  def copyAsync(destinationFolder: IStorageFolder): IAsyncOperation[StorageFile] = js.native
  def copyAsync(destinationFolder: IStorageFolder, desiredNewName: String): IAsyncOperation[StorageFile] = js.native
  def copyAsync(destinationFolder: IStorageFolder, desiredNewName: String, option: NameCollisionOption): IAsyncOperation[StorageFile] = js.native
  def moveAndReplaceAsync(fileToReplace: IStorageFile): IAsyncAction = js.native
  def moveAsync(destinationFolder: IStorageFolder): IAsyncAction = js.native
  def moveAsync(destinationFolder: IStorageFolder, desiredNewName: String): IAsyncAction = js.native
  def moveAsync(destinationFolder: IStorageFolder, desiredNewName: String, option: NameCollisionOption): IAsyncAction = js.native
  def openAsync(accessMode: FileAccessMode): IAsyncOperation[IRandomAccessStream] = js.native
  def openTransactedWriteAsync(): IAsyncOperation[StorageStreamTransaction] = js.native
}

