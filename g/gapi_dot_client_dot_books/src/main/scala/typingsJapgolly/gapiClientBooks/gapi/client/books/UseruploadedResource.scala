package typingsJapgolly.gapiClientBooks.gapi.client.books

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBooks.AnonStartIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseruploadedResource extends js.Object {
  /** Return a list of books uploaded by the current user. */
  def list(request: AnonStartIndex): Request_[Volumes]
}

object UseruploadedResource {
  @scala.inline
  def apply(list: AnonStartIndex => CallbackTo[Request_[Volumes]]): UseruploadedResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonStartIndex) => list(t0).runNow()))
    __obj.asInstanceOf[UseruploadedResource]
  }
}

