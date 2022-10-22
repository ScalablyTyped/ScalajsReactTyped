package typingsJapgolly.winrtUwp.Windows.Networking.BackgroundTransfer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.Storage.IStorageFile
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Performs an asynchronous download operation. The Background Transfer sample demonstrates this functionality. For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
trait DownloadOperation extends StObject {
  
  /**
    * Returns an asynchronous operation that can be used to monitor progress and completion of the attached download. Calling this method allows an app to attach download operations that were started in a previous app instance.
    * @return Download operation with callback.
    */
  def attachAsync(): IPromiseWithIAsyncOperationWithProgress[DownloadOperation, DownloadOperation]
  
  /** Gets and sets the cost policy for the download. */
  var costPolicy: BackgroundTransferCostPolicy
  
  /**
    * Gets the response information.
    * @return Contains the data returned by a server response.
    */
  def getResponseInformation(): ResponseInformation
  
  /**
    * Gets the partially downloaded response at the specified position.
    * @param position The position at which to start reading.
    * @return The result stream.
    */
  def getResultStreamAt(position: Double): IInputStream
  
  /** Gets a string value indicating the group the transfer belongs to. */
  var group: String
  
  /** This is a unique identifier for a specific download operation. A GUID associated to a download operation will not change for the duration of the download. */
  var guid: String
  
  /** Gets the method to use for the download. */
  var method: String
  
  /** Pauses a download operation. */
  def pause(): Unit
  
  /** Gets or sets the transfer priority of this download operation when within a BackgroundTransferGroup . Possible values are defined by BackgroundTransferPriority . */
  var priority: BackgroundTransferPriority
  
  /** Gets the current progress of the upload operation. */
  var progress: BackgroundDownloadProgress
  
  /** Gets the URI from which to download the file. */
  var requestedUri: Uri
  
  /** Returns the IStorageFile object provided by the caller when creating the DownloadOperation object using CreateDownload . */
  var resultFile: IStorageFile
  
  /** Resumes a paused download operation. */
  def resume(): Unit
  
  /**
    * Starts an asynchronous download operation.
    * @return An asynchronous download operation that includes progress updates.
    */
  def startAsync(): IPromiseWithIAsyncOperationWithProgress[DownloadOperation, DownloadOperation]
  
  /** Gets the group that this download operation belongs to. */
  var transferGroup: BackgroundTransferGroup
}
object DownloadOperation {
  
  inline def apply(
    attachAsync: CallbackTo[IPromiseWithIAsyncOperationWithProgress[DownloadOperation, DownloadOperation]],
    costPolicy: BackgroundTransferCostPolicy,
    getResponseInformation: CallbackTo[ResponseInformation],
    getResultStreamAt: Double => IInputStream,
    group: String,
    guid: String,
    method: String,
    pause: Callback,
    priority: BackgroundTransferPriority,
    progress: BackgroundDownloadProgress,
    requestedUri: Uri,
    resultFile: IStorageFile,
    resume: Callback,
    startAsync: CallbackTo[IPromiseWithIAsyncOperationWithProgress[DownloadOperation, DownloadOperation]],
    transferGroup: BackgroundTransferGroup
  ): DownloadOperation = {
    val __obj = js.Dynamic.literal(attachAsync = attachAsync.toJsFn, costPolicy = costPolicy.asInstanceOf[js.Any], getResponseInformation = getResponseInformation.toJsFn, getResultStreamAt = js.Any.fromFunction1(getResultStreamAt), group = group.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pause = pause.toJsFn, priority = priority.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], requestedUri = requestedUri.asInstanceOf[js.Any], resultFile = resultFile.asInstanceOf[js.Any], resume = resume.toJsFn, startAsync = startAsync.toJsFn, transferGroup = transferGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadOperation]
  }
  
  extension [Self <: DownloadOperation](x: Self) {
    
    inline def setAttachAsync(value: CallbackTo[IPromiseWithIAsyncOperationWithProgress[DownloadOperation, DownloadOperation]]): Self = StObject.set(x, "attachAsync", value.toJsFn)
    
    inline def setCostPolicy(value: BackgroundTransferCostPolicy): Self = StObject.set(x, "costPolicy", value.asInstanceOf[js.Any])
    
    inline def setGetResponseInformation(value: CallbackTo[ResponseInformation]): Self = StObject.set(x, "getResponseInformation", value.toJsFn)
    
    inline def setGetResultStreamAt(value: Double => IInputStream): Self = StObject.set(x, "getResultStreamAt", js.Any.fromFunction1(value))
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setPriority(value: BackgroundTransferPriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: BackgroundDownloadProgress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setRequestedUri(value: Uri): Self = StObject.set(x, "requestedUri", value.asInstanceOf[js.Any])
    
    inline def setResultFile(value: IStorageFile): Self = StObject.set(x, "resultFile", value.asInstanceOf[js.Any])
    
    inline def setResume(value: Callback): Self = StObject.set(x, "resume", value.toJsFn)
    
    inline def setStartAsync(value: CallbackTo[IPromiseWithIAsyncOperationWithProgress[DownloadOperation, DownloadOperation]]): Self = StObject.set(x, "startAsync", value.toJsFn)
    
    inline def setTransferGroup(value: BackgroundTransferGroup): Self = StObject.set(x, "transferGroup", value.asInstanceOf[js.Any])
  }
}
