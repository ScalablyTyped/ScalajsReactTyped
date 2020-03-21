package typingsJapgolly.gapiClientLicensing.gapi.client.licensing

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientLicensing.AnonAlt
import typingsJapgolly.gapiClientLicensing.AnonCustomerId
import typingsJapgolly.gapiClientLicensing.AnonFields
import typingsJapgolly.gapiClientLicensing.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseAssignmentsResource extends js.Object {
  /** Revoke License. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Get license assignment of a particular product and sku for a user */
  def get(request: AnonAlt): Request_[LicenseAssignment]
  /** Assign License. */
  def insert(request: AnonFields): Request_[LicenseAssignment]
  /** List license assignments for given product of the customer. */
  def listForProduct(request: AnonCustomerId): Request_[LicenseAssignmentList]
  /** List license assignments for given product and sku of the customer. */
  def listForProductAndSku(request: AnonKey): Request_[LicenseAssignmentList]
  /** Assign License. This method supports patch semantics. */
  def patch(request: AnonAlt): Request_[LicenseAssignment]
  /** Assign License. */
  def update(request: AnonAlt): Request_[LicenseAssignment]
}

object LicenseAssignmentsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => CallbackTo[Request_[Unit]],
    get: AnonAlt => CallbackTo[Request_[LicenseAssignment]],
    insert: AnonFields => CallbackTo[Request_[LicenseAssignment]],
    listForProduct: AnonCustomerId => CallbackTo[Request_[LicenseAssignmentList]],
    listForProductAndSku: AnonKey => CallbackTo[Request_[LicenseAssignmentList]],
    patch: AnonAlt => CallbackTo[Request_[LicenseAssignment]],
    update: AnonAlt => CallbackTo[Request_[LicenseAssignment]]
  ): LicenseAssignmentsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLicensing.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLicensing.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLicensing.AnonFields) => insert(t0).runNow()))
    __obj.updateDynamic("listForProduct")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLicensing.AnonCustomerId) => listForProduct(t0).runNow()))
    __obj.updateDynamic("listForProductAndSku")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLicensing.AnonKey) => listForProductAndSku(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLicensing.AnonAlt) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLicensing.AnonAlt) => update(t0).runNow()))
    __obj.asInstanceOf[LicenseAssignmentsResource]
  }
}

