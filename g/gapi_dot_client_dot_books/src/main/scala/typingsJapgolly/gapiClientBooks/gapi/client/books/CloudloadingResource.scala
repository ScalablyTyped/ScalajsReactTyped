package typingsJapgolly.gapiClientBooks.gapi.client.books

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBooks.AnonAltFields
import typingsJapgolly.gapiClientBooks.AnonDrivedocumentid
import typingsJapgolly.gapiClientBooks.AnonVolumeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudloadingResource extends js.Object {
  def addBook(request: AnonDrivedocumentid): Request_[BooksCloudloadingResource]
  /** Remove the book and its contents */
  def deleteBook(request: AnonVolumeId): Request_[Unit]
  def updateBook(request: AnonAltFields): Request_[BooksCloudloadingResource]
}

object CloudloadingResource {
  @scala.inline
  def apply(
    addBook: AnonDrivedocumentid => CallbackTo[Request_[BooksCloudloadingResource]],
    deleteBook: AnonVolumeId => CallbackTo[Request_[Unit]],
    updateBook: AnonAltFields => CallbackTo[Request_[BooksCloudloadingResource]]
  ): CloudloadingResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addBook")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonDrivedocumentid) => addBook(t0).runNow()))
    __obj.updateDynamic("deleteBook")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonVolumeId) => deleteBook(t0).runNow()))
    __obj.updateDynamic("updateBook")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonAltFields) => updateBook(t0).runNow()))
    __obj.asInstanceOf[CloudloadingResource]
  }
}

