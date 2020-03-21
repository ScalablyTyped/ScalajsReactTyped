package typingsJapgolly.pulumiAws.mod.ec2

import typingsJapgolly.pulumiAws.ec2RouteTableMod.RouteTableArgs
import typingsJapgolly.pulumiAws.ec2RouteTableMod.RouteTableState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.RouteTable")
@js.native
class RouteTable protected ()
  extends typingsJapgolly.pulumiAws.ec2Mod.RouteTable {
  /**
    * Create a RouteTable resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RouteTableArgs) = this()
  def this(name: String, args: RouteTableArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "ec2.RouteTable")
@js.native
object RouteTable extends js.Object {
  /**
    * Get an existing RouteTable resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.ec2RouteTableMod.RouteTable = js.native
  def get(name: String, id: Input[ID], state: RouteTableState): typingsJapgolly.pulumiAws.ec2RouteTableMod.RouteTable = js.native
  def get(name: String, id: Input[ID], state: RouteTableState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.ec2RouteTableMod.RouteTable = js.native
  /**
    * Returns true if the given object is an instance of RouteTable.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/routeTable.RouteTable */ Boolean = js.native
}

