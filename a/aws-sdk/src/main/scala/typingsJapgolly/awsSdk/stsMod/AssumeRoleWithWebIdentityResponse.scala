package typingsJapgolly.awsSdk.stsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssumeRoleWithWebIdentityResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) and the assumed role ID, which are identifiers that you can use to refer to the resulting temporary security credentials. For example, you can reference these credentials as a principal in a resource-based policy by using the ARN or assumed role ID. The ARN and ID include the RoleSessionName that you specified when you called AssumeRole. 
    */
  var AssumedRoleUser: js.UndefOr[typingsJapgolly.awsSdk.stsMod.AssumedRoleUser] = js.native
  /**
    * The intended audience (also known as client ID) of the web identity token. This is traditionally the client identifier issued to the application that requested the web identity token.
    */
  var Audience: js.UndefOr[typingsJapgolly.awsSdk.stsMod.Audience] = js.native
  /**
    * The temporary security credentials, which include an access key ID, a secret access key, and a security token.  The size of the security token that STS API operations return is not fixed. We strongly recommend that you make no assumptions about the maximum size. 
    */
  var Credentials: js.UndefOr[typingsJapgolly.awsSdk.stsMod.Credentials] = js.native
  /**
    * A percentage value that indicates the packed size of the session policies and session tags combined passed in the request. The request fails if the packed size is greater than 100 percent, which means the policies and tags exceeded the allowed space.
    */
  var PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.native
  /**
    *  The issuing authority of the web identity token presented. For OpenID Connect ID tokens, this contains the value of the iss field. For OAuth 2.0 access tokens, this contains the value of the ProviderId parameter that was passed in the AssumeRoleWithWebIdentity request.
    */
  var Provider: js.UndefOr[Issuer] = js.native
  /**
    * The unique user identifier that is returned by the identity provider. This identifier is associated with the WebIdentityToken that was submitted with the AssumeRoleWithWebIdentity call. The identifier is typically unique to the user and the application that acquired the WebIdentityToken (pairwise identifier). For OpenID Connect ID tokens, this field contains the value returned by the identity provider as the token's sub (Subject) claim. 
    */
  var SubjectFromWebIdentityToken: js.UndefOr[webIdentitySubjectType] = js.native
}

object AssumeRoleWithWebIdentityResponse {
  @scala.inline
  def apply(
    AssumedRoleUser: AssumedRoleUser = null,
    Audience: Audience = null,
    Credentials: Credentials = null,
    PackedPolicySize: Int | Double = null,
    Provider: Issuer = null,
    SubjectFromWebIdentityToken: webIdentitySubjectType = null
  ): AssumeRoleWithWebIdentityResponse = {
    val __obj = js.Dynamic.literal()
    if (AssumedRoleUser != null) __obj.updateDynamic("AssumedRoleUser")(AssumedRoleUser.asInstanceOf[js.Any])
    if (Audience != null) __obj.updateDynamic("Audience")(Audience.asInstanceOf[js.Any])
    if (Credentials != null) __obj.updateDynamic("Credentials")(Credentials.asInstanceOf[js.Any])
    if (PackedPolicySize != null) __obj.updateDynamic("PackedPolicySize")(PackedPolicySize.asInstanceOf[js.Any])
    if (Provider != null) __obj.updateDynamic("Provider")(Provider.asInstanceOf[js.Any])
    if (SubjectFromWebIdentityToken != null) __obj.updateDynamic("SubjectFromWebIdentityToken")(SubjectFromWebIdentityToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssumeRoleWithWebIdentityResponse]
  }
}

