package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonHeight
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizesResource extends js.Object {
  /** Gets one size by ID. */
  def get(request: AnonFields): Request_[Size]
  /** Inserts a new size. */
  def insert(request: AnonKey): Request_[Size]
  /** Retrieves a list of sizes, possibly filtered. */
  def list(request: AnonHeight): Request_[SizesListResponse]
}

object SizesResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[Size]],
    insert: AnonKey => CallbackTo[Request_[Size]],
    list: AnonHeight => CallbackTo[Request_[SizesListResponse]]
  ): SizesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonHeight) => list(t0).runNow()))
    __obj.asInstanceOf[SizesResource]
  }
}

