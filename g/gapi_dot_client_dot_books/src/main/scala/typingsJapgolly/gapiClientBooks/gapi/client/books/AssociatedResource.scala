package typingsJapgolly.gapiClientBooks.gapi.client.books

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBooks.AnonAssociation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociatedResource extends js.Object {
  /** Return a list of associated books. */
  def list(request: AnonAssociation): Request_[Volumes]
}

object AssociatedResource {
  @scala.inline
  def apply(list: AnonAssociation => CallbackTo[Request_[Volumes]]): AssociatedResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonAssociation) => list(t0).runNow()))
    __obj.asInstanceOf[AssociatedResource]
  }
}

