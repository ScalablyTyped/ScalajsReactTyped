package typingsJapgolly.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTableReplicaAutoScalingOutput extends js.Object {
  /**
    * Represents the auto scaling properties of the table.
    */
  var TableAutoScalingDescription: js.UndefOr[typingsJapgolly.awsSdk.dynamodbMod.TableAutoScalingDescription] = js.native
}

object DescribeTableReplicaAutoScalingOutput {
  @scala.inline
  def apply(TableAutoScalingDescription: TableAutoScalingDescription = null): DescribeTableReplicaAutoScalingOutput = {
    val __obj = js.Dynamic.literal()
    if (TableAutoScalingDescription != null) __obj.updateDynamic("TableAutoScalingDescription")(TableAutoScalingDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTableReplicaAutoScalingOutput]
  }
}

