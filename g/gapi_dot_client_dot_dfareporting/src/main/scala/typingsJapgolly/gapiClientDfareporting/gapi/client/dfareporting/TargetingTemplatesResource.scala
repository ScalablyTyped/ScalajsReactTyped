package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonAdvertiserIdAlt
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetingTemplatesResource extends js.Object {
  /** Gets one targeting template by ID. */
  def get(request: AnonFields): Request_[TargetingTemplate]
  /** Inserts a new targeting template. */
  def insert(request: AnonKey): Request_[TargetingTemplate]
  /** Retrieves a list of targeting templates, optionally filtered. This method supports paging. */
  def list(request: AnonAdvertiserIdAlt): Request_[TargetingTemplatesListResponse]
  /** Updates an existing targeting template. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[TargetingTemplate]
  /** Updates an existing targeting template. */
  def update(request: AnonKey): Request_[TargetingTemplate]
}

object TargetingTemplatesResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[TargetingTemplate]],
    insert: AnonKey => CallbackTo[Request_[TargetingTemplate]],
    list: AnonAdvertiserIdAlt => CallbackTo[Request_[TargetingTemplatesListResponse]],
    patch: AnonFields => CallbackTo[Request_[TargetingTemplate]],
    update: AnonKey => CallbackTo[Request_[TargetingTemplate]]
  ): TargetingTemplatesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonAdvertiserIdAlt) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[TargetingTemplatesResource]
  }
}

