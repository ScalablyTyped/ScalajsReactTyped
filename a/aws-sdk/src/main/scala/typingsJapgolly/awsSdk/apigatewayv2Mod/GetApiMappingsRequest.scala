package typingsJapgolly.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApiMappingsRequest extends js.Object {
  /**
    * The domain name.
    */
  var DomainName: string = js.native
  /**
    * The maximum number of elements to be returned for this resource.
    */
  var MaxResults: js.UndefOr[string] = js.native
  /**
    * The next page of elements from this collection. Not valid for the last element of the collection.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object GetApiMappingsRequest {
  @scala.inline
  def apply(DomainName: string, MaxResults: string = null, NextToken: string = null): GetApiMappingsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApiMappingsRequest]
  }
}

