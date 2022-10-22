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

trait IDownloadOperation
  extends StObject
     with IBackgroundTransferOperation {
  
  def attachAsync(): IAsyncOperationWithProgress[DownloadOperation, DownloadOperation]
  
  def pause(): Unit
  
  var progress: BackgroundDownloadProgress
  
  var resultFile: IStorageFile
  
  def resume(): Unit
  
  def startAsync(): IAsyncOperationWithProgress[DownloadOperation, DownloadOperation]
}
object IDownloadOperation {
  
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
  ): IDownloadOperation = {
    val __obj = js.Dynamic.literal(attachAsync = attachAsync.toJsFn, costPolicy = costPolicy.asInstanceOf[js.Any], getResponseInformation = getResponseInformation.toJsFn, getResultStreamAt = js.Any.fromFunction1(getResultStreamAt), group = group.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pause = pause.toJsFn, progress = progress.asInstanceOf[js.Any], requestedUri = requestedUri.asInstanceOf[js.Any], resultFile = resultFile.asInstanceOf[js.Any], resume = resume.toJsFn, startAsync = startAsync.toJsFn)
    __obj.asInstanceOf[IDownloadOperation]
  }
  
  extension [Self <: IDownloadOperation](x: Self) {
    
    inline def setAttachAsync(value: CallbackTo[IAsyncOperationWithProgress[DownloadOperation, DownloadOperation]]): Self = StObject.set(x, "attachAsync", value.toJsFn)
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setProgress(value: BackgroundDownloadProgress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setResultFile(value: IStorageFile): Self = StObject.set(x, "resultFile", value.asInstanceOf[js.Any])
    
    inline def setResume(value: Callback): Self = StObject.set(x, "resume", value.toJsFn)
    
    inline def setStartAsync(value: CallbackTo[IAsyncOperationWithProgress[DownloadOperation, DownloadOperation]]): Self = StObject.set(x, "startAsync", value.toJsFn)
  }
}
