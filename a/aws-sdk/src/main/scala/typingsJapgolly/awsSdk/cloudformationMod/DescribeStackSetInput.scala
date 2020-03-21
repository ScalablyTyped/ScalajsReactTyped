package typingsJapgolly.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackSetInput extends js.Object {
  /**
    * The name or unique ID of the stack set whose description you want.
    */
  var StackSetName: typingsJapgolly.awsSdk.cloudformationMod.StackSetName = js.native
}

object DescribeStackSetInput {
  @scala.inline
  def apply(StackSetName: StackSetName): DescribeStackSetInput = {
    val __obj = js.Dynamic.literal(StackSetName = StackSetName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeStackSetInput]
  }
}

