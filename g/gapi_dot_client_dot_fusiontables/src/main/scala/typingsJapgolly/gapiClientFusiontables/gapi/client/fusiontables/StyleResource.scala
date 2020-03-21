package typingsJapgolly.gapiClientFusiontables.gapi.client.fusiontables

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientFusiontables.AnonFields
import typingsJapgolly.gapiClientFusiontables.AnonKey
import typingsJapgolly.gapiClientFusiontables.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleResource extends js.Object {
  /** Deletes a style. */
  def delete(request: AnonOauthtoken): Request_[Unit]
  /** Gets a specific style. */
  def get(request: AnonOauthtoken): Request_[StyleSetting]
  /** Adds a new style for the table. */
  def insert(request: AnonFields): Request_[StyleSetting]
  /** Retrieves a list of styles. */
  def list(request: AnonKey): Request_[StyleSettingList]
  /** Updates an existing style. This method supports patch semantics. */
  def patch(request: AnonOauthtoken): Request_[StyleSetting]
  /** Updates an existing style. */
  def update(request: AnonOauthtoken): Request_[StyleSetting]
}

object StyleResource {
  @scala.inline
  def apply(
    delete: AnonOauthtoken => CallbackTo[Request_[Unit]],
    get: AnonOauthtoken => CallbackTo[Request_[StyleSetting]],
    insert: AnonFields => CallbackTo[Request_[StyleSetting]],
    list: AnonKey => CallbackTo[Request_[StyleSettingList]],
    patch: AnonOauthtoken => CallbackTo[Request_[StyleSetting]],
    update: AnonOauthtoken => CallbackTo[Request_[StyleSetting]]
  ): StyleResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonOauthtoken) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonOauthtoken) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonKey) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonOauthtoken) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonOauthtoken) => update(t0).runNow()))
    __obj.asInstanceOf[StyleResource]
  }
}

