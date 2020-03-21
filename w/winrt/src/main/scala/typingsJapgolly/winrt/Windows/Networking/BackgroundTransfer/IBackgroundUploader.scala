package typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer

import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackgroundUploader extends IBackgroundTransferBase {
  def createUpload(uri: Uri, sourceFile: IStorageFile): UploadOperation = js.native
  def createUploadAsync(uri: Uri, parts: IIterable[BackgroundTransferContentPart]): IAsyncOperation[UploadOperation] = js.native
  def createUploadAsync(uri: Uri, parts: IIterable[BackgroundTransferContentPart], subType: String): IAsyncOperation[UploadOperation] = js.native
  def createUploadAsync(uri: Uri, parts: IIterable[BackgroundTransferContentPart], subType: String, boundary: String): IAsyncOperation[UploadOperation] = js.native
  def createUploadFromStreamAsync(uri: Uri, sourceStream: IInputStream): IAsyncOperation[UploadOperation] = js.native
}

