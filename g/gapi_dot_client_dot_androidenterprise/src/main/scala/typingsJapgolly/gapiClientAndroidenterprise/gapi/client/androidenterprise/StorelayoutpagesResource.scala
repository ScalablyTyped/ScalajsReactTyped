package typingsJapgolly.gapiClientAndroidenterprise.gapi.client.androidenterprise

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidenterprise.AnonKey
import typingsJapgolly.gapiClientAndroidenterprise.AnonPageId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorelayoutpagesResource extends js.Object {
  /** Deletes a store page. */
  def delete(request: AnonPageId): Request_[Unit]
  /** Retrieves details of a store page. */
  def get(request: AnonPageId): Request_[StorePage]
  /** Inserts a new store page. */
  def insert(request: AnonKey): Request_[StorePage]
  /** Retrieves the details of all pages in the store. */
  def list(request: AnonKey): Request_[StoreLayoutPagesListResponse]
  /** Updates the content of a store page. This method supports patch semantics. */
  def patch(request: AnonPageId): Request_[StorePage]
  /** Updates the content of a store page. */
  def update(request: AnonPageId): Request_[StorePage]
}

object StorelayoutpagesResource {
  @scala.inline
  def apply(
    delete: AnonPageId => CallbackTo[Request_[Unit]],
    get: AnonPageId => CallbackTo[Request_[StorePage]],
    insert: AnonKey => CallbackTo[Request_[StorePage]],
    list: AnonKey => CallbackTo[Request_[StoreLayoutPagesListResponse]],
    patch: AnonPageId => CallbackTo[Request_[StorePage]],
    update: AnonPageId => CallbackTo[Request_[StorePage]]
  ): StorelayoutpagesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonPageId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonPageId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonKey) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonPageId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonPageId) => update(t0).runNow()))
    __obj.asInstanceOf[StorelayoutpagesResource]
  }
}

