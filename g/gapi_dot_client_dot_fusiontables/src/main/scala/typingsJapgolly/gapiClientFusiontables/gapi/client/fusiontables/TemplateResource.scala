package typingsJapgolly.gapiClientFusiontables.gapi.client.fusiontables

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientFusiontables.AnonFields
import typingsJapgolly.gapiClientFusiontables.AnonKey
import typingsJapgolly.gapiClientFusiontables.AnonTemplateId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateResource extends js.Object {
  /** Deletes a template */
  def delete(request: AnonTemplateId): Request_[Unit]
  /** Retrieves a specific template by its id */
  def get(request: AnonTemplateId): Request_[Template]
  /** Creates a new template for the table. */
  def insert(request: AnonFields): Request_[Template]
  /** Retrieves a list of templates. */
  def list(request: AnonKey): Request_[TemplateList]
  /** Updates an existing template. This method supports patch semantics. */
  def patch(request: AnonTemplateId): Request_[Template]
  /** Updates an existing template */
  def update(request: AnonTemplateId): Request_[Template]
}

object TemplateResource {
  @scala.inline
  def apply(
    delete: AnonTemplateId => CallbackTo[Request_[Unit]],
    get: AnonTemplateId => CallbackTo[Request_[Template]],
    insert: AnonFields => CallbackTo[Request_[Template]],
    list: AnonKey => CallbackTo[Request_[TemplateList]],
    patch: AnonTemplateId => CallbackTo[Request_[Template]],
    update: AnonTemplateId => CallbackTo[Request_[Template]]
  ): TemplateResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonTemplateId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonTemplateId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonKey) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonTemplateId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonTemplateId) => update(t0).runNow()))
    __obj.asInstanceOf[TemplateResource]
  }
}

