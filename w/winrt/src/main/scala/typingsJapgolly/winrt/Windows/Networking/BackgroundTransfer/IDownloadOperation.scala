package typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDownloadOperation extends IBackgroundTransferOperation {
  var progress: BackgroundDownloadProgress
  var resultFile: IStorageFile
  def attachAsync(): IAsyncOperationWithProgress[DownloadOperation, DownloadOperation]
  def pause(): Unit
  def resume(): Unit
  def startAsync(): IAsyncOperationWithProgress[DownloadOperation, DownloadOperation]
}

object IDownloadOperation {
  @scala.inline
  def apply(
    attachAsync: CallbackTo[IAsyncOperationWithProgress[DownloadOperation, DownloadOperation]],
    costPolicy: BackgroundTransferCostPolicy,
    getResponseInformation: CallbackTo[ResponseInformation],
    getResultStreamAt: Double => CallbackTo[IInputStream],
    group: String,
    guid: String,
    method: String,
    pause: Callback,
    progress: BackgroundDownloadProgress,
    requestedUri: Uri,
    resultFile: IStorageFile,
    resume: Callback,
    startAsync: CallbackTo[IAsyncOperationWithProgress[DownloadOperation, DownloadOperation]]
  ): IDownloadOperation = {
    val __obj = js.Dynamic.literal(costPolicy = costPolicy.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], requestedUri = requestedUri.asInstanceOf[js.Any], resultFile = resultFile.asInstanceOf[js.Any])
    __obj.updateDynamic("attachAsync")(attachAsync.toJsFn)
    __obj.updateDynamic("getResponseInformation")(getResponseInformation.toJsFn)
    __obj.updateDynamic("getResultStreamAt")(js.Any.fromFunction1((t0: scala.Double) => getResultStreamAt(t0).runNow()))
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("resume")(resume.toJsFn)
    __obj.updateDynamic("startAsync")(startAsync.toJsFn)
    __obj.asInstanceOf[IDownloadOperation]
  }
}

