package typingsJapgolly.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSkillsStoreCategoriesRequest extends js.Object {
  /**
    * The maximum number of categories returned, per paginated calls.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.alexaforbusinessMod.MaxResults] = js.native
  /**
    * The tokens used for pagination.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.alexaforbusinessMod.NextToken] = js.native
}

object ListSkillsStoreCategoriesRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: NextToken = null): ListSkillsStoreCategoriesRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSkillsStoreCategoriesRequest]
  }
}

