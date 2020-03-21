package typingsJapgolly.pulumiAws.opsworksMod

import typingsJapgolly.pulumiAws.nodejsAppLayerMod.NodejsAppLayerArgs
import typingsJapgolly.pulumiAws.nodejsAppLayerMod.NodejsAppLayerState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/opsworks", "NodejsAppLayer")
@js.native
class NodejsAppLayer protected ()
  extends typingsJapgolly.pulumiAws.nodejsAppLayerMod.NodejsAppLayer {
  /**
    * Create a NodejsAppLayer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: NodejsAppLayerArgs) = this()
  def this(name: String, args: NodejsAppLayerArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/opsworks", "NodejsAppLayer")
@js.native
object NodejsAppLayer extends js.Object {
  /**
    * Get an existing NodejsAppLayer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.nodejsAppLayerMod.NodejsAppLayer = js.native
  def get(name: String, id: Input[ID], state: NodejsAppLayerState): typingsJapgolly.pulumiAws.nodejsAppLayerMod.NodejsAppLayer = js.native
  def get(name: String, id: Input[ID], state: NodejsAppLayerState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.nodejsAppLayerMod.NodejsAppLayer = js.native
  /**
    * Returns true if the given object is an instance of NodejsAppLayer.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/nodejsAppLayer.NodejsAppLayer */ Boolean = js.native
}

