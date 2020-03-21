package typingsJapgolly.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIdentityPoolUsageRequest extends js.Object {
  /**
    * The maximum number of results to be returned.
    */
  var MaxResults: js.UndefOr[IntegerString] = js.native
  /**
    * A pagination token for obtaining the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListIdentityPoolUsageRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: String = null): ListIdentityPoolUsageRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentityPoolUsageRequest]
  }
}

