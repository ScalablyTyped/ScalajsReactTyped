package typingsJapgolly.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListElasticsearchVersionsRequest extends js.Object {
  /**
    *  Set this value to limit the number of results returned. Value provided must be greater than 10 else it wont be honored. 
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.esMod.MaxResults] = js.native
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.esMod.NextToken] = js.native
}

object ListElasticsearchVersionsRequest {
  @scala.inline
  def apply(MaxResults: Int | scala.Double = null, NextToken: NextToken = null): ListElasticsearchVersionsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListElasticsearchVersionsRequest]
  }
}

