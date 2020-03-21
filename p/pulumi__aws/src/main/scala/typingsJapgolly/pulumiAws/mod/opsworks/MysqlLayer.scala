package typingsJapgolly.pulumiAws.mod.opsworks

import typingsJapgolly.pulumiAws.mysqlLayerMod.MysqlLayerArgs
import typingsJapgolly.pulumiAws.mysqlLayerMod.MysqlLayerState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "opsworks.MysqlLayer")
@js.native
class MysqlLayer protected ()
  extends typingsJapgolly.pulumiAws.opsworksMod.MysqlLayer {
  /**
    * Create a MysqlLayer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: MysqlLayerArgs) = this()
  def this(name: String, args: MysqlLayerArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "opsworks.MysqlLayer")
@js.native
object MysqlLayer extends js.Object {
  /**
    * Get an existing MysqlLayer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.mysqlLayerMod.MysqlLayer = js.native
  def get(name: String, id: Input[ID], state: MysqlLayerState): typingsJapgolly.pulumiAws.mysqlLayerMod.MysqlLayer = js.native
  def get(name: String, id: Input[ID], state: MysqlLayerState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.mysqlLayerMod.MysqlLayer = js.native
  /**
    * Returns true if the given object is an instance of MysqlLayer.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/mysqlLayer.MysqlLayer */ Boolean = js.native
}

