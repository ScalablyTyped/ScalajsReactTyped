package typingsJapgolly.winrtUwp.Windows.Networking.BackgroundTransfer

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.Security.Credentials.PasswordCredential
import typingsJapgolly.winrtUwp.Windows.Storage.IStorageFile
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrtUwp.Windows.UI.Notifications.TileNotification
import typingsJapgolly.winrtUwp.Windows.UI.Notifications.ToastNotification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to configure upload prior to the actual creation of the upload operation using CreateUpload . For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundUploader")
@js.native
/** Instantiates a new BackgroundUploader object. */
class BackgroundUploader () extends js.Object {
  /**
    * Instantiates a new BackgroundUploader object as a member of a completion group.
    * @param completionGroup The completion group that the created BackgroundUploader instance is to be a member of.
    */
  def this(completionGroup: BackgroundTransferCompletionGroup) = this()
  /** Gets the BackgroundTransferCompletionGroup associated with the BackgroundUploader . */
  var completionGroup: BackgroundTransferCompletionGroup = js.native
  /** Gets or sets the cost policy for the background upload operation. */
  var costPolicy: BackgroundTransferCostPolicy = js.native
  /** Gets and sets the TileNotification used to define the visuals, identification tag, and expiration time of a tile notification used to update the app tile when indicating failure of an upload to the user. */
  var failureTileNotification: TileNotification = js.native
  /** Gets or sets the ToastNotification that defines the content, associated metadata, and events used in a toast notification to indicate failure of an upload to the user. */
  var failureToastNotification: ToastNotification = js.native
  /** Gets or sets a string value (e.g. a GUID) indicating the group the upload will belong to. An upload operation with a group ID will only appear in operation enumerations using GetCurrentDownloadsAsync(String) with the specific group string value. */
  var group: String = js.native
  /** Gets or sets the HTTP method used for the upload. The default method used for upload operations is POST. */
  var method: String = js.native
  /** Gets or sets the proxy credentials for the upload. */
  var proxyCredential: PasswordCredential = js.native
  /** Gets or sets the credentials to use to authenticate with the origin server. */
  var serverCredential: PasswordCredential = js.native
  /** Gets and sets the TileNotification used to define the visuals, identification tag, and expiration time of a tile notification used to update the app tile when indicating success of an upload to the user. */
  var successTileNotification: TileNotification = js.native
  /** Gets or sets the ToastNotification that defines the content, associated metadata, and events used in a toast notification to indicate success of an upload to the user. */
  var successToastNotification: ToastNotification = js.native
  /** Gets or sets the group that an upload operation will belong to. */
  var transferGroup: BackgroundTransferGroup = js.native
  /**
    * Initializes an UploadOperation that indicates the location for and file for upload.
    * @param uri The location for the upload.
    * @param sourceFile The file for upload.
    * @return The resultant upload operation.
    */
  def createUpload(uri: Uri, sourceFile: IStorageFile): UploadOperation = js.native
  /**
    * Returns an asynchronous operation that, on completion, returns an UploadOperation with the specified URI and one or more BackgroundTransferContentPart objects.
    * @param uri The location for the upload.
    * @param parts One or more BackgroundTransferContentPart objects.
    * @return The resultant asynchronous UploadOperation
    */
  def createUploadAsync(uri: Uri, parts: IIterable[BackgroundTransferContentPart]): IPromiseWithIAsyncOperation[UploadOperation] = js.native
  /**
    * Returns an asynchronous operation that, on completion, returns an UploadOperation with the specified URI, one or more BackgroundTransferContentPart objects, and the multipart subtype.
    * @param uri The location for the upload.
    * @param parts One or more BackgroundTransferContentPart objects.
    * @param subType The multipart subtype. For example, "related" for content of type "multipart/ related".
    * @return The resultant asynchronous UploadOperation .
    */
  def createUploadAsync(uri: Uri, parts: IIterable[BackgroundTransferContentPart], subType: String): IPromiseWithIAsyncOperation[UploadOperation] = js.native
  /**
    * Returns an asynchronous operation that, on completion, returns an UploadOperation with the specified URI, multipart subtype, one or more BackgroundTransferContentPart objects, and the delimiter boundary value used to separate each part.
    * @param uri The location for the upload.
    * @param parts One or more BackgroundTransferContentPart objects.
    * @param subType The multipart subtype. For example, "related" for content of type "multipart/ related".
    * @param boundary A string that is used to identify the delimiter used to indicate separation between provided content parts.
    * @return The resultant asynchronous UploadOperation
    */
  def createUploadAsync(uri: Uri, parts: IIterable[BackgroundTransferContentPart], subType: String, boundary: String): IPromiseWithIAsyncOperation[UploadOperation] = js.native
  /**
    * Returns an asynchronous operation that, on completion, returns an UploadOperation with the specified URI and the source stream.
    * @param uri The URI associated with the resource.
    * @param sourceStream Represents the source stream.
    * @return The resultant asynchronous upload operation.
    */
  def createUploadFromStreamAsync(uri: Uri, sourceStream: IInputStream): IPromiseWithIAsyncOperation[UploadOperation] = js.native
  /**
    * Used to set an HTTP request header.
    * @param headerName The header name.
    * @param headerValue The header value.
    */
  def setRequestHeader(headerName: String, headerValue: String): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundUploader")
@js.native
object BackgroundUploader extends js.Object {
  /**
    * Returns a collection of pending uploads that are not associated with a group.
    * @return A collection of pending uploads for the current application instance.
    */
  def getCurrentUploadsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Returns a collection of pending uploads for a specific Group .
    * @param group A string indicating a specific group of uploads.
    * @return A collection of pending uploads for the specific group.
    */
  def getCurrentUploadsAsync(group: String): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets all uploads associated with the provided BackgroundTransferGroup .
    * @param group Contains information used to identify a group of uploads.
    * @return A list of uploads currently associated with the specified group.
    */
  def getCurrentUploadsForTransferGroupAsync(group: BackgroundTransferGroup): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Used to request an unconstrained upload operation. When this method is called the user is provided with a UI prompt that they can use to indicate their consent for an unconstrained operation.
    * @param operations The upload operation to run unconstrained.
    * @return Indicates if the operations will run unconstrained.
    */
  def requestUnconstrainedUploadsAsync(operations: IIterable[UploadOperation]): IPromiseWithIAsyncOperation[UnconstrainedTransferRequestResult] = js.native
}

