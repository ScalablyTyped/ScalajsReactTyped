package typingsJapgolly.googleapis.appengineV1Mod.appengineV1

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
    * SslManagementType.MANUAL on a CREATE or UPDATE request. You must be
    * authorized to administer the AuthorizedCertificate resource to manually
    * map it to a DomainMapping resource. Example: 12345.
    */
  var certificateId: js.UndefOr[String] = js.native
  /**
    * ID of the managed AuthorizedCertificate resource currently being
    * provisioned, if applicable. Until the new managed certificate has been
    * successfully provisioned, the previous SSL state will be preserved. Once
    * the provisioning process completes, the certificate_id field will reflect
    * the new managed certificate and this field will be left empty. To remove
    * SSL support while there is still a pending managed certificate, clear the
    * certificate_id field with an UpdateDomainMappingRequest.@OutputOnly
    */
  var pendingManagedCertificateId: js.UndefOr[String] = js.native
  /**
    * SSL management type for this domain. If AUTOMATIC, a managed certificate
    * is automatically provisioned. If MANUAL, certificate_id must be manually
    * specified in order to configure SSL for this domain.
    */
  var sslManagementType: js.UndefOr[String] = js.native
}

object SchemaSslSettings {
  @scala.inline
  def apply(
    certificateId: String = null,
    pendingManagedCertificateId: String = null,
    sslManagementType: String = null
  ): SchemaSslSettings = {
    val __obj = js.Dynamic.literal()
    if (certificateId != null) __obj.updateDynamic("certificateId")(certificateId.asInstanceOf[js.Any])
    if (pendingManagedCertificateId != null) __obj.updateDynamic("pendingManagedCertificateId")(pendingManagedCertificateId.asInstanceOf[js.Any])
    if (sslManagementType != null) __obj.updateDynamic("sslManagementType")(sslManagementType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSslSettings]
  }
}

