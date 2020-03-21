package typingsJapgolly.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIdentityPoolUsageResponse extends js.Object {
  /**
    * Total number of identities for the identity pool.
    */
  var Count: js.UndefOr[Integer] = js.native
  /**
    * Usage information for the identity pools.
    */
  var IdentityPoolUsages: js.UndefOr[IdentityPoolUsageList] = js.native
  /**
    * The maximum number of results to be returned.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  /**
    * A pagination token for obtaining the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListIdentityPoolUsageResponse {
  @scala.inline
  def apply(
    Count: Int | Double = null,
    IdentityPoolUsages: IdentityPoolUsageList = null,
    MaxResults: Int | Double = null,
    NextToken: String = null
  ): ListIdentityPoolUsageResponse = {
    val __obj = js.Dynamic.literal()
    if (Count != null) __obj.updateDynamic("Count")(Count.asInstanceOf[js.Any])
    if (IdentityPoolUsages != null) __obj.updateDynamic("IdentityPoolUsages")(IdentityPoolUsages.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentityPoolUsageResponse]
  }
}

