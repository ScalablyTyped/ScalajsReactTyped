package typingsJapgolly.winrt.global.Windows.Networking

import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.BackgroundDownloadProgress
import typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy
import typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.BackgroundUploadProgress
import typingsJapgolly.winrt.Windows.Security.Credentials.PasswordCredential
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrt.Windows.Web.WebErrorStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BackgroundTransfer {
  
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundDownloader")
  @js.native
  open class BackgroundDownloader ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.BackgroundDownloader {
    
    /* CompleteClass */
    var costPolicy: BackgroundTransferCostPolicy = js.native
    
    /* CompleteClass */
    var group: String = js.native
    
    /* CompleteClass */
    var method: String = js.native
    
    /* CompleteClass */
    var proxyCredential: PasswordCredential = js.native
    
    /* CompleteClass */
    var serverCredential: PasswordCredential = js.native
    
    /* CompleteClass */
    override def setRequestHeader(headerName: String, headerValue: String): Unit = js.native
  }
  /* static members */
  object BackgroundDownloader {
    
    @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundDownloader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getCurrentDownloadsAsync(): IAsyncOperation[
        IVectorView[typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.DownloadOperation]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentDownloadsAsync")().asInstanceOf[IAsyncOperation[
        IVectorView[typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.DownloadOperation]
      ]]
    inline def getCurrentDownloadsAsync(group: String): IAsyncOperation[
        IVectorView[typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.DownloadOperation]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentDownloadsAsync")(group.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[
        IVectorView[typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.DownloadOperation]
      ]]
  }
  
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferContentPart")
  @js.native
  open class BackgroundTransferContentPart ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferContentPart {
    def this(name: String) = this()
    def this(name: String, fileName: String) = this()
    
    /* CompleteClass */
    override def setFile(value: IStorageFile): Unit = js.native
    
    /* CompleteClass */
    override def setHeader(headerName: String, headerValue: String): Unit = js.native
    
    /* CompleteClass */
    override def setText(value: String): Unit = js.native
  }
  
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy")
  @js.native
  object BackgroundTransferCostPolicy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy & Double
      ] = js.native
    
    /* 0 */ val default: typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy.default & Double = js.native
    
    /* 2 */ val always: typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy.always & Double = js.native
    
    /* 1 */ val unrestrictedOnly: typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy.unrestrictedOnly & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferError")
  @js.native
  open class BackgroundTransferError ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferError
  /* static members */
  object BackgroundTransferError {
    
    @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getStatus(hresult: Double): WebErrorStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatus")(hresult.asInstanceOf[js.Any]).asInstanceOf[WebErrorStatus]
  }
  
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferStatus")
  @js.native
  object BackgroundTransferStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus & Double
      ] = js.native
    
    /* 6 */ val canceled: typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.canceled & Double = js.native
    
    /* 5 */ val completed: typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.completed & Double = js.native
    
    /* 7 */ val error: typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.error & Double = js.native
    
    /* 0 */ val idle: typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.idle & Double = js.native
    
    /* 2 */ val pausedByApplication: typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedByApplication & Double = js.native
    
    /* 3 */ val pausedCostedNetwork: typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedCostedNetwork & Double = js.native
    
    /* 4 */ val pausedNoNetwork: typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedNoNetwork & Double = js.native
    
    /* 1 */ val running: typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.running & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundUploader")
  @js.native
  open class BackgroundUploader ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.BackgroundUploader {
    
    /* CompleteClass */
    var costPolicy: BackgroundTransferCostPolicy = js.native
    
    /* CompleteClass */
    var group: String = js.native
    
    /* CompleteClass */
    var method: String = js.native
    
    /* CompleteClass */
    var proxyCredential: PasswordCredential = js.native
    
    /* CompleteClass */
    var serverCredential: PasswordCredential = js.native
    
    /* CompleteClass */
    override def setRequestHeader(headerName: String, headerValue: String): Unit = js.native
  }
  /* static members */
  object BackgroundUploader {
    
    @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundUploader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getCurrentUploadsAsync(): IAsyncOperation[
        IVectorView[typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.UploadOperation]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentUploadsAsync")().asInstanceOf[IAsyncOperation[
        IVectorView[typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.UploadOperation]
      ]]
    inline def getCurrentUploadsAsync(group: String): IAsyncOperation[
        IVectorView[typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.UploadOperation]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentUploadsAsync")(group.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[
        IVectorView[typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.UploadOperation]
      ]]
  }
  
  @JSGlobal("Windows.Networking.BackgroundTransfer.DownloadOperation")
  @js.native
  open class DownloadOperation ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.DownloadOperation {
    
    /* CompleteClass */
    override def attachAsync(): IAsyncOperationWithProgress[
        typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.DownloadOperation, 
        typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.DownloadOperation
      ] = js.native
    
    /* CompleteClass */
    var costPolicy: BackgroundTransferCostPolicy = js.native
    
    /* CompleteClass */
    override def getResponseInformation(): typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.ResponseInformation = js.native
    
    /* CompleteClass */
    override def getResultStreamAt(position: Double): IInputStream = js.native
    
    /* CompleteClass */
    var group: String = js.native
    
    /* CompleteClass */
    var guid: String = js.native
    
    /* CompleteClass */
    var method: String = js.native
    
    /* CompleteClass */
    override def pause(): Unit = js.native
    
    /* CompleteClass */
    var progress: BackgroundDownloadProgress = js.native
    
    /* CompleteClass */
    var requestedUri: Uri = js.native
    
    /* CompleteClass */
    var resultFile: IStorageFile = js.native
    
    /* CompleteClass */
    override def resume(): Unit = js.native
    
    /* CompleteClass */
    override def startAsync(): IAsyncOperationWithProgress[
        typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.DownloadOperation, 
        typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.DownloadOperation
      ] = js.native
  }
  
  @JSGlobal("Windows.Networking.BackgroundTransfer.ResponseInformation")
  @js.native
  open class ResponseInformation ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.ResponseInformation {
    
    /* CompleteClass */
    var actualUri: Uri = js.native
    
    /* CompleteClass */
    var headers: IMapView[String, String] = js.native
    
    /* CompleteClass */
    var isResumable: Boolean = js.native
    
    /* CompleteClass */
    var statusCode: Double = js.native
  }
  
  @JSGlobal("Windows.Networking.BackgroundTransfer.UploadOperation")
  @js.native
  open class UploadOperation ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.UploadOperation {
    
    /* CompleteClass */
    override def attachAsync(): IAsyncOperationWithProgress[
        typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.UploadOperation, 
        typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.UploadOperation
      ] = js.native
    
    /* CompleteClass */
    var costPolicy: BackgroundTransferCostPolicy = js.native
    
    /* CompleteClass */
    override def getResponseInformation(): typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.ResponseInformation = js.native
    
    /* CompleteClass */
    override def getResultStreamAt(position: Double): IInputStream = js.native
    
    /* CompleteClass */
    var group: String = js.native
    
    /* CompleteClass */
    var guid: String = js.native
    
    /* CompleteClass */
    var method: String = js.native
    
    /* CompleteClass */
    var progress: BackgroundUploadProgress = js.native
    
    /* CompleteClass */
    var requestedUri: Uri = js.native
    
    /* CompleteClass */
    var sourceFile: IStorageFile = js.native
    
    /* CompleteClass */
    override def startAsync(): IAsyncOperationWithProgress[
        typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.UploadOperation, 
        typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer.UploadOperation
      ] = js.native
  }
}
