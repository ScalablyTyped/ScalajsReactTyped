package typingsJapgolly.winrt.Windows.Web.Syndication

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationClient extends js.Object {
  var bypassCacheOnRetrieve: Boolean
  var maxResponseBufferSize: Double
  var proxyCredential: PasswordCredential
  var serverCredential: PasswordCredential
  var timeout: Double
  def retrieveFeedAsync(uri: Uri): IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress]
  def setRequestHeader(name: String, value: String): Unit
}

object ISyndicationClient {
  @scala.inline
  def apply(
    bypassCacheOnRetrieve: Boolean,
    maxResponseBufferSize: Double,
    proxyCredential: PasswordCredential,
    retrieveFeedAsync: Uri => CallbackTo[IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress]],
    serverCredential: PasswordCredential,
    setRequestHeader: (String, String) => Callback,
    timeout: Double
  ): ISyndicationClient = {
    val __obj = js.Dynamic.literal(bypassCacheOnRetrieve = bypassCacheOnRetrieve.asInstanceOf[js.Any], maxResponseBufferSize = maxResponseBufferSize.asInstanceOf[js.Any], proxyCredential = proxyCredential.asInstanceOf[js.Any], serverCredential = serverCredential.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.updateDynamic("retrieveFeedAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Uri) => retrieveFeedAsync(t0).runNow()))
    __obj.updateDynamic("setRequestHeader")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setRequestHeader(t0, t1).runNow()))
    __obj.asInstanceOf[ISyndicationClient]
  }
}

