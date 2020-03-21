package typingsJapgolly.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchProfilesResponse extends js.Object {
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.alexaforbusinessMod.NextToken] = js.native
  /**
    * The profiles that meet the specified set of filter criteria, in sort order.
    */
  var Profiles: js.UndefOr[ProfileDataList] = js.native
  /**
    * The total number of room profiles returned.
    */
  var TotalCount: js.UndefOr[typingsJapgolly.awsSdk.alexaforbusinessMod.TotalCount] = js.native
}

object SearchProfilesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Profiles: ProfileDataList = null, TotalCount: Int | Double = null): SearchProfilesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Profiles != null) __obj.updateDynamic("Profiles")(Profiles.asInstanceOf[js.Any])
    if (TotalCount != null) __obj.updateDynamic("TotalCount")(TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchProfilesResponse]
  }
}

