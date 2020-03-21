package typingsJapgolly.awsSdkClientGlacierNode.typesGranteeMod

import typingsJapgolly.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.AmazonCustomerByEmail
import typingsJapgolly.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.CanonicalUser
import typingsJapgolly.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grantee extends js.Object {
  /**
    * <p>Screen name of the grantee.</p>
    */
  var DisplayName: js.UndefOr[String] = js.undefined
  /**
    * <p>Email address of the grantee.</p>
    */
  var EmailAddress: js.UndefOr[String] = js.undefined
  /**
    * <p>The canonical user ID of the grantee.</p>
    */
  var ID: js.UndefOr[String] = js.undefined
  /**
    * <p>Type of grantee</p>
    */
  var Type: AmazonCustomerByEmail | CanonicalUser | Group | String
  /**
    * <p>URI of the grantee group.</p>
    */
  var URI: js.UndefOr[String] = js.undefined
}

object Grantee {
  @scala.inline
  def apply(
    Type: AmazonCustomerByEmail | CanonicalUser | Group | String,
    DisplayName: String = null,
    EmailAddress: String = null,
    ID: String = null,
    URI: String = null
  ): Grantee = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (EmailAddress != null) __obj.updateDynamic("EmailAddress")(EmailAddress.asInstanceOf[js.Any])
    if (ID != null) __obj.updateDynamic("ID")(ID.asInstanceOf[js.Any])
    if (URI != null) __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grantee]
  }
}

