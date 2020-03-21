package typingsJapgolly.pulumiAws.mod.apigateway

import typingsJapgolly.pulumiAws.modelMod.ModelArgs
import typingsJapgolly.pulumiAws.modelMod.ModelState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "apigateway.Model")
@js.native
class Model protected ()
  extends typingsJapgolly.pulumiAws.apigatewayMod.Model {
  /**
    * Create a Model resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ModelArgs) = this()
  def this(name: String, args: ModelArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "apigateway.Model")
@js.native
object Model extends js.Object {
  /**
    * Get an existing Model resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.modelMod.Model = js.native
  def get(name: String, id: Input[ID], state: ModelState): typingsJapgolly.pulumiAws.modelMod.Model = js.native
  def get(name: String, id: Input[ID], state: ModelState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.modelMod.Model = js.native
  /**
    * Returns true if the given object is an instance of Model.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/model.Model */ Boolean = js.native
}

