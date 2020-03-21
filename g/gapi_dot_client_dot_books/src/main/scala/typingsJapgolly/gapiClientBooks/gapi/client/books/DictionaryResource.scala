package typingsJapgolly.gapiClientBooks.gapi.client.books

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBooks.AnonCpksver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictionaryResource extends js.Object {
  /** Returns a list of offline dictionary metadata available */
  def listOfflineMetadata(request: AnonCpksver): Request_[Metadata]
}

object DictionaryResource {
  @scala.inline
  def apply(listOfflineMetadata: AnonCpksver => CallbackTo[Request_[Metadata]]): DictionaryResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("listOfflineMetadata")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonCpksver) => listOfflineMetadata(t0).runNow()))
    __obj.asInstanceOf[DictionaryResource]
  }
}

