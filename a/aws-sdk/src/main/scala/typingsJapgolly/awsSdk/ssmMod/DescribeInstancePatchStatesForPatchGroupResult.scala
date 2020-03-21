package typingsJapgolly.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstancePatchStatesForPatchGroupResult extends js.Object {
  /**
    * The high-level patch state for the requested instances. 
    */
  var InstancePatchStates: js.UndefOr[InstancePatchStatesList] = js.native
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.NextToken] = js.native
}

object DescribeInstancePatchStatesForPatchGroupResult {
  @scala.inline
  def apply(InstancePatchStates: InstancePatchStatesList = null, NextToken: NextToken = null): DescribeInstancePatchStatesForPatchGroupResult = {
    val __obj = js.Dynamic.literal()
    if (InstancePatchStates != null) __obj.updateDynamic("InstancePatchStates")(InstancePatchStates.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstancePatchStatesForPatchGroupResult]
  }
}

