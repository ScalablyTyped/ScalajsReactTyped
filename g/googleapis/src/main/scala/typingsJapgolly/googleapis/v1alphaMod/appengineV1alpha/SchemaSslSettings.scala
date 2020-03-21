package typingsJapgolly.googleapis.v1alphaMod.appengineV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SSL configuration for a DomainMapping resource.
  */
@js.native
trait SchemaSslSettings extends js.Object {
  /**
    * ID of the AuthorizedCertificate resource configuring SSL for the
    * application. Clearing this field will remove SSL support.By default, a
    * managed certificate is automatically created for every domain mapping. To
    * omit SSL support or to configure SSL manually, specify
    * no_managed_certificate on a CREATE or UPDATE request. You must be
    * authorized to administer the AuthorizedCertificate resource to manually
    * map it to a DomainMapping resource. Example: 12345.
    */
  var certificateId: js.UndefOr[String] = js.native
  /**
    * Whether the mapped certificate is an App Engine managed certificate.
    * Managed certificates are created by default with a domain mapping. To opt
    * out, specify no_managed_certificate on a CREATE or UPDATE
    * request.@OutputOnly
    */
  var isManagedCertificate: js.UndefOr[Boolean] = js.native
}

object SchemaSslSettings {
  @scala.inline
  def apply(certificateId: String = null, isManagedCertificate: js.UndefOr[Boolean] = js.undefined): SchemaSslSettings = {
    val __obj = js.Dynamic.literal()
    if (certificateId != null) __obj.updateDynamic("certificateId")(certificateId.asInstanceOf[js.Any])
    if (!js.isUndefined(isManagedCertificate)) __obj.updateDynamic("isManagedCertificate")(isManagedCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSslSettings]
  }
}

