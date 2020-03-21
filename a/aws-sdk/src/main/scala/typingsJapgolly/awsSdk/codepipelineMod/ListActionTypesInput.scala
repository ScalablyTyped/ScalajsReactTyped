package typingsJapgolly.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListActionTypesInput extends js.Object {
  /**
    * Filters the list of action types to those created by a specified entity.
    */
  var actionOwnerFilter: js.UndefOr[ActionOwner] = js.native
  /**
    * An identifier that was returned from the previous list action types call, which can be used to return the next set of action types in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListActionTypesInput {
  @scala.inline
  def apply(actionOwnerFilter: ActionOwner = null, nextToken: NextToken = null): ListActionTypesInput = {
    val __obj = js.Dynamic.literal()
    if (actionOwnerFilter != null) __obj.updateDynamic("actionOwnerFilter")(actionOwnerFilter.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListActionTypesInput]
  }
}

