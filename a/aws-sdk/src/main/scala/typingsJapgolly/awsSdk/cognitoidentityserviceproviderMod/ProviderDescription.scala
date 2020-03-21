package typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderDescription extends js.Object {
  /**
    * The date the provider was added to the user pool.
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  /**
    * The date the provider was last modified.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * The identity provider name.
    */
  var ProviderName: js.UndefOr[ProviderNameType] = js.native
  /**
    * The identity provider type.
    */
  var ProviderType: js.UndefOr[IdentityProviderTypeType] = js.native
}

object ProviderDescription {
  @scala.inline
  def apply(
    CreationDate: js.Date = null,
    LastModifiedDate: js.Date = null,
    ProviderName: ProviderNameType = null,
    ProviderType: IdentityProviderTypeType = null
  ): ProviderDescription = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (ProviderName != null) __obj.updateDynamic("ProviderName")(ProviderName.asInstanceOf[js.Any])
    if (ProviderType != null) __obj.updateDynamic("ProviderType")(ProviderType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderDescription]
  }
}

