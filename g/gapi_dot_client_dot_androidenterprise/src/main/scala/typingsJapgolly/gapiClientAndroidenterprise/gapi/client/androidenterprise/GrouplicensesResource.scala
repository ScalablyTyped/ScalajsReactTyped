package typingsJapgolly.gapiClientAndroidenterprise.gapi.client.androidenterprise

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidenterprise.AnonGroupLicenseId
import typingsJapgolly.gapiClientAndroidenterprise.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrouplicensesResource extends js.Object {
  /** Retrieves details of an enterprise's group license for a product. */
  def get(request: AnonGroupLicenseId): Request_[GroupLicense]
  /** Retrieves IDs of all products for which the enterprise has a group license. */
  def list(request: AnonKey): Request_[GroupLicensesListResponse]
}

object GrouplicensesResource {
  @scala.inline
  def apply(
    get: AnonGroupLicenseId => CallbackTo[Request_[GroupLicense]],
    list: AnonKey => CallbackTo[Request_[GroupLicensesListResponse]]
  ): GrouplicensesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonGroupLicenseId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonKey) => list(t0).runNow()))
    __obj.asInstanceOf[GrouplicensesResource]
  }
}

