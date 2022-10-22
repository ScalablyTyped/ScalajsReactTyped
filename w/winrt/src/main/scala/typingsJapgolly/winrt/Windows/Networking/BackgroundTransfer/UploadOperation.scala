package typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadOperation
  extends StObject
     with IUploadOperation
object UploadOperation {
  
  inline def apply(
    attachAsync: CallbackTo[IAsyncOperationWithProgress[UploadOperation, UploadOperation]],
    costPolicy: BackgroundTransferCostPolicy,
    getResponseInformation: CallbackTo[ResponseInformation],
    getResultStreamAt: Double => IInputStream,
    group: String,
    guid: String,
    method: String,
    progress: BackgroundUploadProgress,
    requestedUri: Uri,
    sourceFile: IStorageFile,
    startAsync: CallbackTo[IAsyncOperationWithProgress[UploadOperation, UploadOperation]]
  ): UploadOperation = {
    val __obj = js.Dynamic.literal(attachAsync = attachAsync.toJsFn, costPolicy = costPolicy.asInstanceOf[js.Any], getResponseInformation = getResponseInformation.toJsFn, getResultStreamAt = js.Any.fromFunction1(getResultStreamAt), group = group.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], requestedUri = requestedUri.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], startAsync = startAsync.toJsFn)
    __obj.asInstanceOf[UploadOperation]
  }
}
