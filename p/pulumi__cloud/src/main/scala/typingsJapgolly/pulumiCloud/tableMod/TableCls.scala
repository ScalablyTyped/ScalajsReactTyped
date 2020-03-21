package typingsJapgolly.pulumiCloud.tableMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud/table", "Table")
@js.native
class TableCls protected () extends Table {
  /**
    * Creates a new Table.
    *
    * @param name A unique name for the table.
    * @param primaryKey An optional primary key name.
    * @param primaryKeyType An optional primary key type.
    * @param opts A bag of options that controls how this resource behaves.
    */
  def this(name: String) = this()
  def this(name: String, primaryKey: Input[String]) = this()
  def this(name: String, primaryKey: Input[String], primaryKeyType: Input[PrimaryKeyType]) = this()
  def this(
    name: String,
    primaryKey: Input[String],
    primaryKeyType: Input[PrimaryKeyType],
    opts: ResourceOptions
  ) = this()
}

