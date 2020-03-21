package typingsJapgolly.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackResourceOutput extends js.Object {
  /**
    * A StackResourceDetail structure containing the description of the specified resource in the specified stack.
    */
  var StackResourceDetail: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.StackResourceDetail] = js.native
}

object DescribeStackResourceOutput {
  @scala.inline
  def apply(StackResourceDetail: StackResourceDetail = null): DescribeStackResourceOutput = {
    val __obj = js.Dynamic.literal()
    if (StackResourceDetail != null) __obj.updateDynamic("StackResourceDetail")(StackResourceDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackResourceOutput]
  }
}

