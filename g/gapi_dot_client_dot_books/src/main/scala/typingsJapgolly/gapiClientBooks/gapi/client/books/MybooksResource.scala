package typingsJapgolly.gapiClientBooks.gapi.client.books

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBooks.AnonAcquireMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MybooksResource extends js.Object {
  /** Return a list of books in My Library. */
  def list(request: AnonAcquireMethod): Request_[Volumes]
}

object MybooksResource {
  @scala.inline
  def apply(list: AnonAcquireMethod => CallbackTo[Request_[Volumes]]): MybooksResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonAcquireMethod) => list(t0).runNow()))
    __obj.asInstanceOf[MybooksResource]
  }
}

