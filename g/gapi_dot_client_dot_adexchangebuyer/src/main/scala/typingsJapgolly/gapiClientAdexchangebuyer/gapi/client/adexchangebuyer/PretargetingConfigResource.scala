package typingsJapgolly.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangebuyer.AnonConfigId
import typingsJapgolly.gapiClientAdexchangebuyer.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PretargetingConfigResource extends js.Object {
  /** Deletes an existing pretargeting config. */
  def delete(request: AnonConfigId): Request_[Unit]
  /** Gets a specific pretargeting configuration */
  def get(request: AnonConfigId): Request_[PretargetingConfig]
  /** Inserts a new pretargeting configuration. */
  def insert(request: AnonQuotaUser): Request_[PretargetingConfig]
  /** Retrieves a list of the authenticated user's pretargeting configurations. */
  def list(request: AnonQuotaUser): Request_[PretargetingConfigList]
  /** Updates an existing pretargeting config. This method supports patch semantics. */
  def patch(request: AnonConfigId): Request_[PretargetingConfig]
  /** Updates an existing pretargeting config. */
  def update(request: AnonConfigId): Request_[PretargetingConfig]
}

object PretargetingConfigResource {
  @scala.inline
  def apply(
    delete: AnonConfigId => CallbackTo[Request_[Unit]],
    get: AnonConfigId => CallbackTo[Request_[PretargetingConfig]],
    insert: AnonQuotaUser => CallbackTo[Request_[PretargetingConfig]],
    list: AnonQuotaUser => CallbackTo[Request_[PretargetingConfigList]],
    patch: AnonConfigId => CallbackTo[Request_[PretargetingConfig]],
    update: AnonConfigId => CallbackTo[Request_[PretargetingConfig]]
  ): PretargetingConfigResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonConfigId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonConfigId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonQuotaUser) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonQuotaUser) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonConfigId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonConfigId) => update(t0).runNow()))
    __obj.asInstanceOf[PretargetingConfigResource]
  }
}

