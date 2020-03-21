package typingsJapgolly.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebsiteAuthorizationProviderSummary extends js.Object {
  /**
    * A unique identifier for the authorization provider.
    */
  var AuthorizationProviderId: js.UndefOr[Id] = js.native
  /**
    * The authorization provider type.
    */
  var AuthorizationProviderType: typingsJapgolly.awsSdk.worklinkMod.AuthorizationProviderType = js.native
  /**
    * The time of creation.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  /**
    * The domain name of the authorization provider. This applies only to SAML-based authorization providers.
    */
  var DomainName: js.UndefOr[typingsJapgolly.awsSdk.worklinkMod.DomainName] = js.native
}

object WebsiteAuthorizationProviderSummary {
  @scala.inline
  def apply(
    AuthorizationProviderType: AuthorizationProviderType,
    AuthorizationProviderId: Id = null,
    CreatedTime: js.Date = null,
    DomainName: DomainName = null
  ): WebsiteAuthorizationProviderSummary = {
    val __obj = js.Dynamic.literal(AuthorizationProviderType = AuthorizationProviderType.asInstanceOf[js.Any])
    if (AuthorizationProviderId != null) __obj.updateDynamic("AuthorizationProviderId")(AuthorizationProviderId.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebsiteAuthorizationProviderSummary]
  }
}

