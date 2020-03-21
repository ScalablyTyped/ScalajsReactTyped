package typingsJapgolly.gapiClientAppengine.gapi.client.appengine

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAppengine.AnonAccesstoken
import typingsJapgolly.gapiClientAppengine.AnonAlt
import typingsJapgolly.gapiClientAppengine.AnonAppsId
import typingsJapgolly.gapiClientAppengine.AnonAuthorizedCertificatesId
import typingsJapgolly.gapiClientAppengine.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizedCertificatesResource extends js.Object {
  /** Uploads the specified SSL certificate. */
  def create(request: AnonAccesstoken): Request_[AuthorizedCertificate]
  /** Deletes the specified SSL certificate. */
  def delete(request: AnonAlt): Request_[js.Object]
  /** Gets the specified SSL certificate. */
  def get(request: AnonAppsId): Request_[AuthorizedCertificate]
  /** Lists all SSL certificates the user is authorized to administer. */
  def list(request: AnonBearertoken): Request_[ListAuthorizedCertificatesResponse]
  /**
    * Updates the specified SSL certificate. To renew a certificate and maintain its existing domain mappings, update certificate_data with a new
    * certificate. The new certificate must be applicable to the same domains as the original certificate. The certificate display_name may also be updated.
    */
  def patch(request: AnonAuthorizedCertificatesId): Request_[AuthorizedCertificate]
}

object AuthorizedCertificatesResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => CallbackTo[Request_[AuthorizedCertificate]],
    delete: AnonAlt => CallbackTo[Request_[js.Object]],
    get: AnonAppsId => CallbackTo[Request_[AuthorizedCertificate]],
    list: AnonBearertoken => CallbackTo[Request_[ListAuthorizedCertificatesResponse]],
    patch: AnonAuthorizedCertificatesId => CallbackTo[Request_[AuthorizedCertificate]]
  ): AuthorizedCertificatesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonAccesstoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonAppsId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonBearertoken) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonAuthorizedCertificatesId) => patch(t0).runNow()))
    __obj.asInstanceOf[AuthorizedCertificatesResource]
  }
}

