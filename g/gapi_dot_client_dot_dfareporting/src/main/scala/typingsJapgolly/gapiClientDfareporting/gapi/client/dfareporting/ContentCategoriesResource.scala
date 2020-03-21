package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonKey
import typingsJapgolly.gapiClientDfareporting.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentCategoriesResource extends js.Object {
  /** Deletes an existing content category. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets one content category by ID. */
  def get(request: AnonFields): Request_[ContentCategory]
  /** Inserts a new content category. */
  def insert(request: AnonKey): Request_[ContentCategory]
  /** Retrieves a list of content categories, possibly filtered. This method supports paging. */
  def list(request: AnonOauthtoken): Request_[ContentCategoriesListResponse]
  /** Updates an existing content category. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[ContentCategory]
  /** Updates an existing content category. */
  def update(request: AnonKey): Request_[ContentCategory]
}

object ContentCategoriesResource {
  @scala.inline
  def apply(
    delete: AnonFields => CallbackTo[Request_[Unit]],
    get: AnonFields => CallbackTo[Request_[ContentCategory]],
    insert: AnonKey => CallbackTo[Request_[ContentCategory]],
    list: AnonOauthtoken => CallbackTo[Request_[ContentCategoriesListResponse]],
    patch: AnonFields => CallbackTo[Request_[ContentCategory]],
    update: AnonKey => CallbackTo[Request_[ContentCategory]]
  ): ContentCategoriesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonOauthtoken) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[ContentCategoriesResource]
  }
}

