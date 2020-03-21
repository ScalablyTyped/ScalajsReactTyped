package typingsJapgolly.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSecurityProfilesForTargetRequest extends js.Object {
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * If true, return child groups too.
    */
  var recursive: js.UndefOr[Recursive] = js.native
  /**
    * The ARN of the target (thing group) whose attached security profiles you want to get.
    */
  var securityProfileTargetArn: SecurityProfileTargetArn = js.native
}

object ListSecurityProfilesForTargetRequest {
  @scala.inline
  def apply(
    securityProfileTargetArn: SecurityProfileTargetArn,
    maxResults: Int | Double = null,
    nextToken: NextToken = null,
    recursive: js.UndefOr[scala.Boolean] = js.undefined
  ): ListSecurityProfilesForTargetRequest = {
    val __obj = js.Dynamic.literal(securityProfileTargetArn = securityProfileTargetArn.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSecurityProfilesForTargetRequest]
  }
}

