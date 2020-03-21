package typingsJapgolly.pulumiAws.inputMod.cloudwatch

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTargetKinesisTarget extends js.Object {
  /**
    * The JSON path to be extracted from the event and used as the partition key.
    */
  var partitionKeyPath: js.UndefOr[Input[String]] = js.native
}

object EventTargetKinesisTarget {
  @scala.inline
  def apply(partitionKeyPath: Input[String] = null): EventTargetKinesisTarget = {
    val __obj = js.Dynamic.literal()
    if (partitionKeyPath != null) __obj.updateDynamic("partitionKeyPath")(partitionKeyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTargetKinesisTarget]
  }
}

