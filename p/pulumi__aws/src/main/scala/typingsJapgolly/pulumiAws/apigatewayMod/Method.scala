package typingsJapgolly.pulumiAws.apigatewayMod

import typingsJapgolly.pulumiAws.methodMod.MethodArgs
import typingsJapgolly.pulumiAws.methodMod.MethodState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway", "Method")
@js.native
class Method protected ()
  extends typingsJapgolly.pulumiAws.methodMod.Method {
  /**
    * Create a Method resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: MethodArgs) = this()
  def this(name: String, args: MethodArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/apigateway", "Method")
@js.native
object Method extends js.Object {
  /**
    * Get an existing Method resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.methodMod.Method = js.native
  def get(name: String, id: Input[ID], state: MethodState): typingsJapgolly.pulumiAws.methodMod.Method = js.native
  def get(name: String, id: Input[ID], state: MethodState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.methodMod.Method = js.native
  /**
    * Returns true if the given object is an instance of Method.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/method.Method */ Boolean = js.native
}

