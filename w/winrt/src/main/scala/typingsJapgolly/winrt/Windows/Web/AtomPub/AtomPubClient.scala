package typingsJapgolly.winrt.Windows.Web.AtomPub

import typingsJapgolly.winrt.Windows.Foundation.IAsyncActionWithProgress
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Security.Credentials.PasswordCredential
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrt.Windows.Web.Syndication.RetrievalProgress
import typingsJapgolly.winrt.Windows.Web.Syndication.SyndicationFeed
import typingsJapgolly.winrt.Windows.Web.Syndication.SyndicationItem
import typingsJapgolly.winrt.Windows.Web.Syndication.TransferProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Web.AtomPub.AtomPubClient")
@js.native
class AtomPubClient () extends IAtomPubClient {
  def this(serverCredential: PasswordCredential) = this()
  /* CompleteClass */
  override var bypassCacheOnRetrieve: Boolean = js.native
  /* CompleteClass */
  override var maxResponseBufferSize: Double = js.native
  /* CompleteClass */
  override var proxyCredential: PasswordCredential = js.native
  /* CompleteClass */
  override var serverCredential: PasswordCredential = js.native
  /* CompleteClass */
  override var timeout: Double = js.native
  /* CompleteClass */
  override def cancelAsyncOperations(): Unit = js.native
  /* CompleteClass */
  override def createMediaResourceAsync(uri: Uri, mediaType: String, description: String, mediaStream: IInputStream): IAsyncOperationWithProgress[SyndicationItem, TransferProgress] = js.native
  /* CompleteClass */
  override def createResourceAsync(uri: Uri, description: String, item: SyndicationItem): IAsyncOperationWithProgress[SyndicationItem, TransferProgress] = js.native
  /* CompleteClass */
  override def deleteResourceAsync(uri: Uri): IAsyncActionWithProgress[TransferProgress] = js.native
  /* CompleteClass */
  override def deleteResourceItemAsync(item: SyndicationItem): IAsyncActionWithProgress[TransferProgress] = js.native
  /* CompleteClass */
  override def retrieveFeedAsync(uri: Uri): IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress] = js.native
  /* CompleteClass */
  override def retrieveMediaResourceAsync(uri: Uri): IAsyncOperationWithProgress[IInputStream, RetrievalProgress] = js.native
  /* CompleteClass */
  override def retrieveResourceAsync(uri: Uri): IAsyncOperationWithProgress[SyndicationItem, RetrievalProgress] = js.native
  /* CompleteClass */
  override def retrieveServiceDocumentAsync(uri: Uri): IAsyncOperationWithProgress[ServiceDocument, RetrievalProgress] = js.native
  /* CompleteClass */
  override def setRequestHeader(name: String, value: String): Unit = js.native
  /* CompleteClass */
  override def updateMediaResourceAsync(uri: Uri, mediaType: String, mediaStream: IInputStream): IAsyncActionWithProgress[TransferProgress] = js.native
  /* CompleteClass */
  override def updateResourceAsync(uri: Uri, item: SyndicationItem): IAsyncActionWithProgress[TransferProgress] = js.native
  /* CompleteClass */
  override def updateResourceItemAsync(item: SyndicationItem): IAsyncActionWithProgress[TransferProgress] = js.native
}

