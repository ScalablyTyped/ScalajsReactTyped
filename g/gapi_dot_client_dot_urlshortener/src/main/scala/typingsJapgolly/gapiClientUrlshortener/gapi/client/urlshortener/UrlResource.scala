package typingsJapgolly.gapiClientUrlshortener.gapi.client.urlshortener

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientUrlshortener.AnonAlt
import typingsJapgolly.gapiClientUrlshortener.AnonFields
import typingsJapgolly.gapiClientUrlshortener.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlResource extends js.Object {
  /** Expands a short URL or gets creation time and analytics. */
  def get(request: AnonAlt): Request_[Url]
  /** Creates a new short URL. */
  def insert(request: AnonFields): Request_[Url]
  /** Retrieves a list of URLs shortened by a user. */
  def list(request: AnonKey): Request_[UrlHistory]
}

object UrlResource {
  @scala.inline
  def apply(
    get: AnonAlt => CallbackTo[Request_[Url]],
    insert: AnonFields => CallbackTo[Request_[Url]],
    list: AnonKey => CallbackTo[Request_[UrlHistory]]
  ): UrlResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientUrlshortener.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientUrlshortener.AnonFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientUrlshortener.AnonKey) => list(t0).runNow()))
    __obj.asInstanceOf[UrlResource]
  }
}

