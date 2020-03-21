package typingsJapgolly.gapiClientAndroidenterprise.gapi.client.androidenterprise

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidenterprise.AnonEnterpriseId
import typingsJapgolly.gapiClientAndroidenterprise.AnonEntitlementId
import typingsJapgolly.gapiClientAndroidenterprise.AnonInstall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntitlementsResource extends js.Object {
  /** Removes an entitlement to an app for a user. */
  def delete(request: AnonEntitlementId): Request_[Unit]
  /** Retrieves details of an entitlement. */
  def get(request: AnonEntitlementId): Request_[Entitlement]
  /** Lists all entitlements for the specified user. Only the ID is set. */
  def list(request: AnonEnterpriseId): Request_[EntitlementsListResponse]
  /** Adds or updates an entitlement to an app for a user. This method supports patch semantics. */
  def patch(request: AnonInstall): Request_[Entitlement]
  /** Adds or updates an entitlement to an app for a user. */
  def update(request: AnonInstall): Request_[Entitlement]
}

object EntitlementsResource {
  @scala.inline
  def apply(
    delete: AnonEntitlementId => CallbackTo[Request_[Unit]],
    get: AnonEntitlementId => CallbackTo[Request_[Entitlement]],
    list: AnonEnterpriseId => CallbackTo[Request_[EntitlementsListResponse]],
    patch: AnonInstall => CallbackTo[Request_[Entitlement]],
    update: AnonInstall => CallbackTo[Request_[Entitlement]]
  ): EntitlementsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonEntitlementId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonEntitlementId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonEnterpriseId) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonInstall) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonInstall) => update(t0).runNow()))
    __obj.asInstanceOf[EntitlementsResource]
  }
}

