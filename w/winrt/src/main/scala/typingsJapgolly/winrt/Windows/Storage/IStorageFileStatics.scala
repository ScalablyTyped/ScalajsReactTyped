package typingsJapgolly.winrt.Windows.Storage

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorageFileStatics extends js.Object {
  def createStreamedFileAsync(
    displayNameWithExtension: String,
    dataRequested: StreamedFileDataRequestedHandler,
    thumbnail: IRandomAccessStreamReference
  ): IAsyncOperation[StorageFile]
  def createStreamedFileFromUriAsync(displayNameWithExtension: String, uri: Uri, thumbnail: IRandomAccessStreamReference): IAsyncOperation[StorageFile]
  def getFileFromApplicationUriAsync(uri: Uri): IAsyncOperation[StorageFile]
  def getFileFromPathAsync(path: String): IAsyncOperation[StorageFile]
  def replaceWithStreamedFileAsync(
    fileToReplace: IStorageFile,
    dataRequested: StreamedFileDataRequestedHandler,
    thumbnail: IRandomAccessStreamReference
  ): IAsyncOperation[StorageFile]
  def replaceWithStreamedFileFromUriAsync(fileToReplace: IStorageFile, uri: Uri, thumbnail: IRandomAccessStreamReference): IAsyncOperation[StorageFile]
}

object IStorageFileStatics {
  @scala.inline
  def apply(
    createStreamedFileAsync: (String, StreamedFileDataRequestedHandler, IRandomAccessStreamReference) => CallbackTo[IAsyncOperation[StorageFile]],
    createStreamedFileFromUriAsync: (String, Uri, IRandomAccessStreamReference) => CallbackTo[IAsyncOperation[StorageFile]],
    getFileFromApplicationUriAsync: Uri => CallbackTo[IAsyncOperation[StorageFile]],
    getFileFromPathAsync: String => CallbackTo[IAsyncOperation[StorageFile]],
    replaceWithStreamedFileAsync: (IStorageFile, StreamedFileDataRequestedHandler, IRandomAccessStreamReference) => CallbackTo[IAsyncOperation[StorageFile]],
    replaceWithStreamedFileFromUriAsync: (IStorageFile, Uri, IRandomAccessStreamReference) => CallbackTo[IAsyncOperation[StorageFile]]
  ): IStorageFileStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createStreamedFileAsync")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.winrt.Windows.Storage.StreamedFileDataRequestedHandler, t2: typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStreamReference) => createStreamedFileAsync(t0, t1, t2).runNow()))
    __obj.updateDynamic("createStreamedFileFromUriAsync")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.winrt.Windows.Foundation.Uri, t2: typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStreamReference) => createStreamedFileFromUriAsync(t0, t1, t2).runNow()))
    __obj.updateDynamic("getFileFromApplicationUriAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Uri) => getFileFromApplicationUriAsync(t0).runNow()))
    __obj.updateDynamic("getFileFromPathAsync")(js.Any.fromFunction1((t0: java.lang.String) => getFileFromPathAsync(t0).runNow()))
    __obj.updateDynamic("replaceWithStreamedFileAsync")(js.Any.fromFunction3((t0: typingsJapgolly.winrt.Windows.Storage.IStorageFile, t1: typingsJapgolly.winrt.Windows.Storage.StreamedFileDataRequestedHandler, t2: typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStreamReference) => replaceWithStreamedFileAsync(t0, t1, t2).runNow()))
    __obj.updateDynamic("replaceWithStreamedFileFromUriAsync")(js.Any.fromFunction3((t0: typingsJapgolly.winrt.Windows.Storage.IStorageFile, t1: typingsJapgolly.winrt.Windows.Foundation.Uri, t2: typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStreamReference) => replaceWithStreamedFileFromUriAsync(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IStorageFileStatics]
  }
}

