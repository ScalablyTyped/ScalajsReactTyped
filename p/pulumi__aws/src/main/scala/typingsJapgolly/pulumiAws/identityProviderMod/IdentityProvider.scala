package typingsJapgolly.pulumiAws.identityProviderMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cognito/identityProvider", "IdentityProvider")
@js.native
class IdentityProvider protected () extends CustomResource {
  /**
    * Create a IdentityProvider resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: IdentityProviderArgs) = this()
  def this(name: String, args: IdentityProviderArgs, opts: CustomResourceOptions) = this()
  /**
    * The map of attribute mapping of user pool attributes. [AttributeMapping in AWS API documentation](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-AttributeMapping)
    */
  val attributeMapping: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The list of identity providers.
    */
  val idpIdentifiers: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The map of identity details, such as access token
    */
  val providerDetails: Output_[StringDictionary[_]] = js.native
  /**
    * The provider name
    */
  val providerName: Output_[String] = js.native
  /**
    * The provider type.  [See AWS API for valid values](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-ProviderType)
    */
  val providerType: Output_[String] = js.native
  /**
    * The user pool id
    */
  val userPoolId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cognito/identityProvider", "IdentityProvider")
@js.native
object IdentityProvider extends js.Object {
  /**
    * Get an existing IdentityProvider resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): IdentityProvider = js.native
  def get(name: String, id: Input[ID], state: IdentityProviderState): IdentityProvider = js.native
  def get(name: String, id: Input[ID], state: IdentityProviderState, opts: CustomResourceOptions): IdentityProvider = js.native
  /**
    * Returns true if the given object is an instance of IdentityProvider.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/identityProvider.IdentityProvider */ Boolean = js.native
}

