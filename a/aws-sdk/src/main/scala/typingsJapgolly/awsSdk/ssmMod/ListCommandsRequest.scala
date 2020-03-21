package typingsJapgolly.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCommandsRequest extends js.Object {
  /**
    * (Optional) If provided, lists only the specified command.
    */
  var CommandId: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.CommandId] = js.native
  /**
    * (Optional) One or more filters. Use a filter to return a more specific list of results. 
    */
  var Filters: js.UndefOr[CommandFilterList] = js.native
  /**
    * (Optional) Lists commands issued against this instance ID.
    */
  var InstanceId: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.InstanceId] = js.native
  /**
    * (Optional) The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[CommandMaxResults] = js.native
  /**
    * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.NextToken] = js.native
}

object ListCommandsRequest {
  @scala.inline
  def apply(
    CommandId: CommandId = null,
    Filters: CommandFilterList = null,
    InstanceId: InstanceId = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): ListCommandsRequest = {
    val __obj = js.Dynamic.literal()
    if (CommandId != null) __obj.updateDynamic("CommandId")(CommandId.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCommandsRequest]
  }
}

