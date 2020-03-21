package typingsJapgolly.pulumiAws.mod.apigateway

import typingsJapgolly.pulumiAws.apiKeyMod.ApiKeyArgs
import typingsJapgolly.pulumiAws.apiKeyMod.ApiKeyState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "apigateway.ApiKey")
@js.native
class ApiKey protected ()
  extends typingsJapgolly.pulumiAws.apigatewayMod.ApiKey {
  /**
    * Create a ApiKey resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ApiKeyArgs) = this()
  def this(name: String, args: ApiKeyArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "apigateway.ApiKey")
@js.native
object ApiKey extends js.Object {
  /**
    * Get an existing ApiKey resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.apiKeyMod.ApiKey = js.native
  def get(name: String, id: Input[ID], state: ApiKeyState): typingsJapgolly.pulumiAws.apiKeyMod.ApiKey = js.native
  def get(name: String, id: Input[ID], state: ApiKeyState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.apiKeyMod.ApiKey = js.native
  /**
    * Returns true if the given object is an instance of ApiKey.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/apiKey.ApiKey */ Boolean = js.native
}

