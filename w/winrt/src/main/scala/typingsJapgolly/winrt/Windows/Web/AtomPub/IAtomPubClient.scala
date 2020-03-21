package typingsJapgolly.winrt.Windows.Web.AtomPub

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncActionWithProgress
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Security.Credentials.PasswordCredential
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrt.Windows.Web.Syndication.ISyndicationClient
import typingsJapgolly.winrt.Windows.Web.Syndication.RetrievalProgress
import typingsJapgolly.winrt.Windows.Web.Syndication.SyndicationFeed
import typingsJapgolly.winrt.Windows.Web.Syndication.SyndicationItem
import typingsJapgolly.winrt.Windows.Web.Syndication.TransferProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAtomPubClient extends ISyndicationClient {
  def cancelAsyncOperations(): Unit
  def createMediaResourceAsync(uri: Uri, mediaType: String, description: String, mediaStream: IInputStream): IAsyncOperationWithProgress[SyndicationItem, TransferProgress]
  def createResourceAsync(uri: Uri, description: String, item: SyndicationItem): IAsyncOperationWithProgress[SyndicationItem, TransferProgress]
  def deleteResourceAsync(uri: Uri): IAsyncActionWithProgress[TransferProgress]
  def deleteResourceItemAsync(item: SyndicationItem): IAsyncActionWithProgress[TransferProgress]
  def retrieveMediaResourceAsync(uri: Uri): IAsyncOperationWithProgress[IInputStream, RetrievalProgress]
  def retrieveResourceAsync(uri: Uri): IAsyncOperationWithProgress[SyndicationItem, RetrievalProgress]
  def retrieveServiceDocumentAsync(uri: Uri): IAsyncOperationWithProgress[ServiceDocument, RetrievalProgress]
  def updateMediaResourceAsync(uri: Uri, mediaType: String, mediaStream: IInputStream): IAsyncActionWithProgress[TransferProgress]
  def updateResourceAsync(uri: Uri, item: SyndicationItem): IAsyncActionWithProgress[TransferProgress]
  def updateResourceItemAsync(item: SyndicationItem): IAsyncActionWithProgress[TransferProgress]
}

object IAtomPubClient {
  @scala.inline
  def apply(
    bypassCacheOnRetrieve: Boolean,
    cancelAsyncOperations: Callback,
    createMediaResourceAsync: (Uri, String, String, IInputStream) => CallbackTo[IAsyncOperationWithProgress[SyndicationItem, TransferProgress]],
    createResourceAsync: (Uri, String, SyndicationItem) => CallbackTo[IAsyncOperationWithProgress[SyndicationItem, TransferProgress]],
    deleteResourceAsync: Uri => CallbackTo[IAsyncActionWithProgress[TransferProgress]],
    deleteResourceItemAsync: SyndicationItem => CallbackTo[IAsyncActionWithProgress[TransferProgress]],
    maxResponseBufferSize: Double,
    proxyCredential: PasswordCredential,
    retrieveFeedAsync: Uri => CallbackTo[IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress]],
    retrieveMediaResourceAsync: Uri => CallbackTo[IAsyncOperationWithProgress[IInputStream, RetrievalProgress]],
    retrieveResourceAsync: Uri => CallbackTo[IAsyncOperationWithProgress[SyndicationItem, RetrievalProgress]],
    retrieveServiceDocumentAsync: Uri => CallbackTo[IAsyncOperationWithProgress[ServiceDocument, RetrievalProgress]],
    serverCredential: PasswordCredential,
    setRequestHeader: (String, String) => Callback,
    timeout: Double,
    updateMediaResourceAsync: (Uri, String, IInputStream) => CallbackTo[IAsyncActionWithProgress[TransferProgress]],
    updateResourceAsync: (Uri, SyndicationItem) => CallbackTo[IAsyncActionWithProgress[TransferProgress]],
    updateResourceItemAsync: SyndicationItem => CallbackTo[IAsyncActionWithProgress[TransferProgress]]
  ): IAtomPubClient = {
    val __obj = js.Dynamic.literal(bypassCacheOnRetrieve = bypassCacheOnRetrieve.asInstanceOf[js.Any], maxResponseBufferSize = maxResponseBufferSize.asInstanceOf[js.Any], proxyCredential = proxyCredential.asInstanceOf[js.Any], serverCredential = serverCredential.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.updateDynamic("cancelAsyncOperations")(cancelAsyncOperations.toJsFn)
    __obj.updateDynamic("createMediaResourceAsync")(js.Any.fromFunction4((t0: typingsJapgolly.winrt.Windows.Foundation.Uri, t1: java.lang.String, t2: java.lang.String, t3: typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream) => createMediaResourceAsync(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("createResourceAsync")(js.Any.fromFunction3((t0: typingsJapgolly.winrt.Windows.Foundation.Uri, t1: java.lang.String, t2: typingsJapgolly.winrt.Windows.Web.Syndication.SyndicationItem) => createResourceAsync(t0, t1, t2).runNow()))
    __obj.updateDynamic("deleteResourceAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Uri) => deleteResourceAsync(t0).runNow()))
    __obj.updateDynamic("deleteResourceItemAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Web.Syndication.SyndicationItem) => deleteResourceItemAsync(t0).runNow()))
    __obj.updateDynamic("retrieveFeedAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Uri) => retrieveFeedAsync(t0).runNow()))
    __obj.updateDynamic("retrieveMediaResourceAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Uri) => retrieveMediaResourceAsync(t0).runNow()))
    __obj.updateDynamic("retrieveResourceAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Uri) => retrieveResourceAsync(t0).runNow()))
    __obj.updateDynamic("retrieveServiceDocumentAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Uri) => retrieveServiceDocumentAsync(t0).runNow()))
    __obj.updateDynamic("setRequestHeader")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setRequestHeader(t0, t1).runNow()))
    __obj.updateDynamic("updateMediaResourceAsync")(js.Any.fromFunction3((t0: typingsJapgolly.winrt.Windows.Foundation.Uri, t1: java.lang.String, t2: typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream) => updateMediaResourceAsync(t0, t1, t2).runNow()))
    __obj.updateDynamic("updateResourceAsync")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Foundation.Uri, t1: typingsJapgolly.winrt.Windows.Web.Syndication.SyndicationItem) => updateResourceAsync(t0, t1).runNow()))
    __obj.updateDynamic("updateResourceItemAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Web.Syndication.SyndicationItem) => updateResourceItemAsync(t0).runNow()))
    __obj.asInstanceOf[IAtomPubClient]
  }
}

