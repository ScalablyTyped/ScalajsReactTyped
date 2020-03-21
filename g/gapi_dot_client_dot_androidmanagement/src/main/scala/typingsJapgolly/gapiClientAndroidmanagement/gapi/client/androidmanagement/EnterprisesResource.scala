package typingsJapgolly.gapiClientAndroidmanagement.gapi.client.androidmanagement

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidmanagement.AnonAlt
import typingsJapgolly.gapiClientAndroidmanagement.AnonEnterpriseToken
import typingsJapgolly.gapiClientAndroidmanagement.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterprisesResource extends js.Object {
  var applications: ApplicationsResource
  var devices: DevicesResource
  var enrollmentTokens: EnrollmentTokensResource
  var policies: PoliciesResource
  var webTokens: WebTokensResource
  /** Creates an enterprise by completing the enterprise signup flow. */
  def create(request: AnonEnterpriseToken): Request_[Enterprise]
  /** Gets an enterprise. */
  def get(request: AnonAlt): Request_[Enterprise]
  /** Updates an enterprise. */
  def patch(request: AnonFields): Request_[Enterprise]
}

object EnterprisesResource {
  @scala.inline
  def apply(
    applications: ApplicationsResource,
    create: AnonEnterpriseToken => CallbackTo[Request_[Enterprise]],
    devices: DevicesResource,
    enrollmentTokens: EnrollmentTokensResource,
    get: AnonAlt => CallbackTo[Request_[Enterprise]],
    patch: AnonFields => CallbackTo[Request_[Enterprise]],
    policies: PoliciesResource,
    webTokens: WebTokensResource
  ): EnterprisesResource = {
    val __obj = js.Dynamic.literal(applications = applications.asInstanceOf[js.Any], devices = devices.asInstanceOf[js.Any], enrollmentTokens = enrollmentTokens.asInstanceOf[js.Any], policies = policies.asInstanceOf[js.Any], webTokens = webTokens.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidmanagement.AnonEnterpriseToken) => create(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidmanagement.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidmanagement.AnonFields) => patch(t0).runNow()))
    __obj.asInstanceOf[EnterprisesResource]
  }
}

