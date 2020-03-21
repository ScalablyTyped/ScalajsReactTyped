package typingsJapgolly.pulumiAws.dynamodbMod

import typingsJapgolly.pulumiAws.dynamodbMixinsMod.TableEventHandler
import typingsJapgolly.pulumiAws.dynamodbMixinsMod.TableEventSubscriptionArgs
import typingsJapgolly.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dynamodb", "TableEventSubscription")
@js.native
class TableEventSubscription protected ()
  extends typingsJapgolly.pulumiAws.dynamodbMixinsMod.TableEventSubscription {
  def this(
    name: String,
    table: typingsJapgolly.pulumiAws.tableMod.Table,
    handler: TableEventHandler,
    args: TableEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    table: typingsJapgolly.pulumiAws.tableMod.Table,
    handler: TableEventHandler,
    args: TableEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

