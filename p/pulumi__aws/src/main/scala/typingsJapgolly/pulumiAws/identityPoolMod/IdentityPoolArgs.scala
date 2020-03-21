package typingsJapgolly.pulumiAws.identityPoolMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.inputMod.cognito.IdentityPoolCognitoIdentityProvider
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityPoolArgs extends js.Object {
  /**
    * Whether the identity pool supports unauthenticated logins or not.
    */
  val allowUnauthenticatedIdentities: js.UndefOr[Input[Boolean]] = js.native
  /**
    * An array of Amazon Cognito Identity user pools and their client IDs.
    */
  val cognitoIdentityProviders: js.UndefOr[Input[js.Array[Input[IdentityPoolCognitoIdentityProvider]]]] = js.native
  /**
    * The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your
    * backend and the Cognito service to communicate about the developer provider.
    */
  val developerProviderName: js.UndefOr[Input[String]] = js.native
  /**
    * The Cognito Identity Pool name.
    */
  val identityPoolName: Input[String] = js.native
  /**
    * A list of OpendID Connect provider ARNs.
    */
  val openidConnectProviderArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * An array of Amazon Resource Names (ARNs) of the SAML provider for your identity.
    */
  val samlProviderArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Key-Value pairs mapping provider names to provider app IDs.
    */
  val supportedLoginProviders: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * A mapping of tags to assign to the Identity Pool.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object IdentityPoolArgs {
  @scala.inline
  def apply(
    identityPoolName: Input[String],
    allowUnauthenticatedIdentities: Input[Boolean] = null,
    cognitoIdentityProviders: Input[js.Array[Input[IdentityPoolCognitoIdentityProvider]]] = null,
    developerProviderName: Input[String] = null,
    openidConnectProviderArns: Input[js.Array[Input[String]]] = null,
    samlProviderArns: Input[js.Array[Input[String]]] = null,
    supportedLoginProviders: Input[StringDictionary[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): IdentityPoolArgs = {
    val __obj = js.Dynamic.literal(identityPoolName = identityPoolName.asInstanceOf[js.Any])
    if (allowUnauthenticatedIdentities != null) __obj.updateDynamic("allowUnauthenticatedIdentities")(allowUnauthenticatedIdentities.asInstanceOf[js.Any])
    if (cognitoIdentityProviders != null) __obj.updateDynamic("cognitoIdentityProviders")(cognitoIdentityProviders.asInstanceOf[js.Any])
    if (developerProviderName != null) __obj.updateDynamic("developerProviderName")(developerProviderName.asInstanceOf[js.Any])
    if (openidConnectProviderArns != null) __obj.updateDynamic("openidConnectProviderArns")(openidConnectProviderArns.asInstanceOf[js.Any])
    if (samlProviderArns != null) __obj.updateDynamic("samlProviderArns")(samlProviderArns.asInstanceOf[js.Any])
    if (supportedLoginProviders != null) __obj.updateDynamic("supportedLoginProviders")(supportedLoginProviders.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolArgs]
  }
}

