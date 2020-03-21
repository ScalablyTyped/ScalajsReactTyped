package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonCreativeFieldId
import typingsJapgolly.gapiClientDfareporting.AnonProfileId
import typingsJapgolly.gapiClientDfareporting.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeFieldValuesResource extends js.Object {
  /** Deletes an existing creative field value. */
  def delete(request: AnonCreativeFieldId): Request_[Unit]
  /** Gets one creative field value by ID. */
  def get(request: AnonCreativeFieldId): Request_[CreativeFieldValue]
  /** Inserts a new creative field value. */
  def insert(request: AnonProfileId): Request_[CreativeFieldValue]
  /** Retrieves a list of creative field values, possibly filtered. This method supports paging. */
  def list(request: AnonQuotaUser): Request_[CreativeFieldValuesListResponse]
  /** Updates an existing creative field value. This method supports patch semantics. */
  def patch(request: AnonCreativeFieldId): Request_[CreativeFieldValue]
  /** Updates an existing creative field value. */
  def update(request: AnonProfileId): Request_[CreativeFieldValue]
}

object CreativeFieldValuesResource {
  @scala.inline
  def apply(
    delete: AnonCreativeFieldId => CallbackTo[Request_[Unit]],
    get: AnonCreativeFieldId => CallbackTo[Request_[CreativeFieldValue]],
    insert: AnonProfileId => CallbackTo[Request_[CreativeFieldValue]],
    list: AnonQuotaUser => CallbackTo[Request_[CreativeFieldValuesListResponse]],
    patch: AnonCreativeFieldId => CallbackTo[Request_[CreativeFieldValue]],
    update: AnonProfileId => CallbackTo[Request_[CreativeFieldValue]]
  ): CreativeFieldValuesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonCreativeFieldId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonCreativeFieldId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonProfileId) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonQuotaUser) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonCreativeFieldId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonProfileId) => update(t0).runNow()))
    __obj.asInstanceOf[CreativeFieldValuesResource]
  }
}

