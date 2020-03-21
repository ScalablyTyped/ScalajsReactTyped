package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonKey
import typingsJapgolly.gapiClientDfareporting.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvertiserGroupsResource extends js.Object {
  /** Deletes an existing advertiser group. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets one advertiser group by ID. */
  def get(request: AnonFields): Request_[AdvertiserGroup]
  /** Inserts a new advertiser group. */
  def insert(request: AnonKey): Request_[AdvertiserGroup]
  /** Retrieves a list of advertiser groups, possibly filtered. This method supports paging. */
  def list(request: AnonOauthtoken): Request_[AdvertiserGroupsListResponse]
  /** Updates an existing advertiser group. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[AdvertiserGroup]
  /** Updates an existing advertiser group. */
  def update(request: AnonKey): Request_[AdvertiserGroup]
}

object AdvertiserGroupsResource {
  @scala.inline
  def apply(
    delete: AnonFields => CallbackTo[Request_[Unit]],
    get: AnonFields => CallbackTo[Request_[AdvertiserGroup]],
    insert: AnonKey => CallbackTo[Request_[AdvertiserGroup]],
    list: AnonOauthtoken => CallbackTo[Request_[AdvertiserGroupsListResponse]],
    patch: AnonFields => CallbackTo[Request_[AdvertiserGroup]],
    update: AnonKey => CallbackTo[Request_[AdvertiserGroup]]
  ): AdvertiserGroupsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonOauthtoken) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[AdvertiserGroupsResource]
  }
}

