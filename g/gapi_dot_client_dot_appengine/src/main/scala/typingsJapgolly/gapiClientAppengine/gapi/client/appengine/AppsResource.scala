package typingsJapgolly.gapiClientAppengine.gapi.client.appengine

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAppengine.AnonAccesstoken
import typingsJapgolly.gapiClientAppengine.AnonUpdateMask
import typingsJapgolly.gapiClientAppengine.AnonUploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsResource extends js.Object {
  var authorizedCertificates: AuthorizedCertificatesResource
  var authorizedDomains: AuthorizedDomainsResource
  var domainMappings: DomainMappingsResource
  var firewall: FirewallResource
  var locations: LocationsResource
  var operations: OperationsResource
  var services: ServicesResource
  /**
    * Creates an App Engine application for a Google Cloud Platform project. Required fields:
    * id - The ID of the target Cloud Platform project.
    * location - The region (https://cloud.google.com/appengine/docs/locations) where you want the App Engine application located.For more information about
    * App Engine applications, see Managing Projects, Applications, and Billing (https://cloud.google.com/appengine/docs/python/console/).
    */
  def create(request: AnonUploadType): Request_[Operation]
  /** Gets information about an application. */
  def get(request: AnonAccesstoken): Request_[Application]
  /**
    * Updates the specified Application resource. You can update the following fields:
    * auth_domain - Google authentication domain for controlling user access to the application.
    * default_cookie_expiration - Cookie expiration policy for the application.
    */
  def patch(request: AnonUpdateMask): Request_[Operation]
  /**
    * Recreates the required App Engine features for the specified App Engine application, for example a Cloud Storage bucket or App Engine service account.
    * Use this method if you receive an error message about a missing feature, for example, Error retrieving the App Engine service account.
    */
  def repair(request: AnonAccesstoken): Request_[Operation]
}

object AppsResource {
  @scala.inline
  def apply(
    authorizedCertificates: AuthorizedCertificatesResource,
    authorizedDomains: AuthorizedDomainsResource,
    create: AnonUploadType => CallbackTo[Request_[Operation]],
    domainMappings: DomainMappingsResource,
    firewall: FirewallResource,
    get: AnonAccesstoken => CallbackTo[Request_[Application]],
    locations: LocationsResource,
    operations: OperationsResource,
    patch: AnonUpdateMask => CallbackTo[Request_[Operation]],
    repair: AnonAccesstoken => CallbackTo[Request_[Operation]],
    services: ServicesResource
  ): AppsResource = {
    val __obj = js.Dynamic.literal(authorizedCertificates = authorizedCertificates.asInstanceOf[js.Any], authorizedDomains = authorizedDomains.asInstanceOf[js.Any], domainMappings = domainMappings.asInstanceOf[js.Any], firewall = firewall.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonUploadType) => create(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonAccesstoken) => get(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonUpdateMask) => patch(t0).runNow()))
    __obj.updateDynamic("repair")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonAccesstoken) => repair(t0).runNow()))
    __obj.asInstanceOf[AppsResource]
  }
}

