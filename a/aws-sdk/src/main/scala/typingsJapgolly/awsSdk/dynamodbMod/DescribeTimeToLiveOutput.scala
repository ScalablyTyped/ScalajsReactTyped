package typingsJapgolly.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTimeToLiveOutput extends js.Object {
  /**
    * 
    */
  var TimeToLiveDescription: js.UndefOr[typingsJapgolly.awsSdk.dynamodbMod.TimeToLiveDescription] = js.native
}

object DescribeTimeToLiveOutput {
  @scala.inline
  def apply(TimeToLiveDescription: TimeToLiveDescription = null): DescribeTimeToLiveOutput = {
    val __obj = js.Dynamic.literal()
    if (TimeToLiveDescription != null) __obj.updateDynamic("TimeToLiveDescription")(TimeToLiveDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTimeToLiveOutput]
  }
}

