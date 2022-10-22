package typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadOperation
  extends StObject
     with IDownloadOperation
object DownloadOperation {
  
  inline def apply(
    attachAsync: CallbackTo[IAsyncOperationWithProgress[DownloadOperation, DownloadOperation]],
    costPolicy: BackgroundTransferCostPolicy,
    getResponseInformation: CallbackTo[ResponseInformation],
    getResultStreamAt: Double => IInputStream,
    group: String,
    guid: String,
    method: String,
    pause: Callback,
    progress: BackgroundDownloadProgress,
    requestedUri: Uri,
    resultFile: IStorageFile,
    resume: Callback,
    startAsync: CallbackTo[IAsyncOperationWithProgress[DownloadOperation, DownloadOperation]]
  ): DownloadOperation = {
    val __obj = js.Dynamic.literal(attachAsync = attachAsync.toJsFn, costPolicy = costPolicy.asInstanceOf[js.Any], getResponseInformation = getResponseInformation.toJsFn, getResultStreamAt = js.Any.fromFunction1(getResultStreamAt), group = group.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pause = pause.toJsFn, progress = progress.asInstanceOf[js.Any], requestedUri = requestedUri.asInstanceOf[js.Any], resultFile = resultFile.asInstanceOf[js.Any], resume = resume.toJsFn, startAsync = startAsync.toJsFn)
    __obj.asInstanceOf[DownloadOperation]
  }
}
