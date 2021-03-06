package typingsJapgolly.pulumiAws.mod.opsworks

import typingsJapgolly.pulumiAws.opsworksApplicationMod.ApplicationArgs
import typingsJapgolly.pulumiAws.opsworksApplicationMod.ApplicationState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "opsworks.Application")
@js.native
class Application protected ()
  extends typingsJapgolly.pulumiAws.opsworksMod.Application {
  /**
    * Create a Application resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ApplicationArgs) = this()
  def this(name: String, args: ApplicationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "opsworks.Application")
@js.native
object Application extends js.Object {
  /**
    * Get an existing Application resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.opsworksApplicationMod.Application = js.native
  def get(name: String, id: Input[ID], state: ApplicationState): typingsJapgolly.pulumiAws.opsworksApplicationMod.Application = js.native
  def get(name: String, id: Input[ID], state: ApplicationState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.opsworksApplicationMod.Application = js.native
  /**
    * Returns true if the given object is an instance of Application.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/application.Application */ Boolean = js.native
}

