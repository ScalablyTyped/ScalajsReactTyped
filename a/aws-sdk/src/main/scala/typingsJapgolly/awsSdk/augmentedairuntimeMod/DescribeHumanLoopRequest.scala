package typingsJapgolly.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHumanLoopRequest extends js.Object {
  /**
    * The name of the human loop.
    */
  var HumanLoopName: typingsJapgolly.awsSdk.augmentedairuntimeMod.HumanLoopName = js.native
}

object DescribeHumanLoopRequest {
  @scala.inline
  def apply(HumanLoopName: HumanLoopName): DescribeHumanLoopRequest = {
    val __obj = js.Dynamic.literal(HumanLoopName = HumanLoopName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeHumanLoopRequest]
  }
}

