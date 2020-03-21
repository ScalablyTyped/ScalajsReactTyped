package typingsJapgolly.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSAMLProviderResponse extends js.Object {
  /**
    * The date and time when the SAML provider was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.native
  /**
    * The XML metadata document that includes information about an identity provider.
    */
  var SAMLMetadataDocument: js.UndefOr[SAMLMetadataDocumentType] = js.native
  /**
    * The expiration date and time for the SAML provider.
    */
  var ValidUntil: js.UndefOr[js.Date] = js.native
}

object GetSAMLProviderResponse {
  @scala.inline
  def apply(
    CreateDate: js.Date = null,
    SAMLMetadataDocument: SAMLMetadataDocumentType = null,
    ValidUntil: js.Date = null
  ): GetSAMLProviderResponse = {
    val __obj = js.Dynamic.literal()
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate.asInstanceOf[js.Any])
    if (SAMLMetadataDocument != null) __obj.updateDynamic("SAMLMetadataDocument")(SAMLMetadataDocument.asInstanceOf[js.Any])
    if (ValidUntil != null) __obj.updateDynamic("ValidUntil")(ValidUntil.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSAMLProviderResponse]
  }
}

