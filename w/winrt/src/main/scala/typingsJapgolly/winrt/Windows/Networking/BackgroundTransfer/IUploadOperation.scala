package typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUploadOperation extends IBackgroundTransferOperation {
  var progress: BackgroundUploadProgress
  var sourceFile: IStorageFile
  def attachAsync(): IAsyncOperationWithProgress[UploadOperation, UploadOperation]
  def startAsync(): IAsyncOperationWithProgress[UploadOperation, UploadOperation]
}

object IUploadOperation {
  @scala.inline
  def apply(
    attachAsync: CallbackTo[IAsyncOperationWithProgress[UploadOperation, UploadOperation]],
    costPolicy: BackgroundTransferCostPolicy,
    getResponseInformation: CallbackTo[ResponseInformation],
    getResultStreamAt: Double => CallbackTo[IInputStream],
    group: String,
    guid: String,
    method: String,
    progress: BackgroundUploadProgress,
    requestedUri: Uri,
    sourceFile: IStorageFile,
    startAsync: CallbackTo[IAsyncOperationWithProgress[UploadOperation, UploadOperation]]
  ): IUploadOperation = {
    val __obj = js.Dynamic.literal(costPolicy = costPolicy.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], requestedUri = requestedUri.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any])
    __obj.updateDynamic("attachAsync")(attachAsync.toJsFn)
    __obj.updateDynamic("getResponseInformation")(getResponseInformation.toJsFn)
    __obj.updateDynamic("getResultStreamAt")(js.Any.fromFunction1((t0: scala.Double) => getResultStreamAt(t0).runNow()))
    __obj.updateDynamic("startAsync")(startAsync.toJsFn)
    __obj.asInstanceOf[IUploadOperation]
  }
}

