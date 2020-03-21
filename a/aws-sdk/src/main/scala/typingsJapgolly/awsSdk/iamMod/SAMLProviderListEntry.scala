package typingsJapgolly.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SAMLProviderListEntry extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the SAML provider.
    */
  var Arn: js.UndefOr[arnType] = js.native
  /**
    * The date and time when the SAML provider was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.native
  /**
    * The expiration date and time for the SAML provider.
    */
  var ValidUntil: js.UndefOr[js.Date] = js.native
}

object SAMLProviderListEntry {
  @scala.inline
  def apply(Arn: arnType = null, CreateDate: js.Date = null, ValidUntil: js.Date = null): SAMLProviderListEntry = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate.asInstanceOf[js.Any])
    if (ValidUntil != null) __obj.updateDynamic("ValidUntil")(ValidUntil.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAMLProviderListEntry]
  }
}

