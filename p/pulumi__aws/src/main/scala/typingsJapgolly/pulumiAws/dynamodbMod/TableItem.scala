package typingsJapgolly.pulumiAws.dynamodbMod

import typingsJapgolly.pulumiAws.tableItemMod.TableItemArgs
import typingsJapgolly.pulumiAws.tableItemMod.TableItemState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dynamodb", "TableItem")
@js.native
class TableItem protected ()
  extends typingsJapgolly.pulumiAws.tableItemMod.TableItem {
  /**
    * Create a TableItem resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TableItemArgs) = this()
  def this(name: String, args: TableItemArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/dynamodb", "TableItem")
@js.native
object TableItem extends js.Object {
  /**
    * Get an existing TableItem resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.tableItemMod.TableItem = js.native
  def get(name: String, id: Input[ID], state: TableItemState): typingsJapgolly.pulumiAws.tableItemMod.TableItem = js.native
  def get(name: String, id: Input[ID], state: TableItemState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.tableItemMod.TableItem = js.native
  /**
    * Returns true if the given object is an instance of TableItem.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dynamodb/tableItem.TableItem */ Boolean = js.native
}

