package typingsJapgolly.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIntegrationResponsesResponse extends js.Object {
  /**
    * The elements from this collection.
    */
  var Items: js.UndefOr[listOfIntegrationResponse] = js.native
  /**
    * The next page of elements from this collection. Not valid for the last element of the collection.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.apigatewayv2Mod.NextToken] = js.native
}

object GetIntegrationResponsesResponse {
  @scala.inline
  def apply(Items: listOfIntegrationResponse = null, NextToken: NextToken = null): GetIntegrationResponsesResponse = {
    val __obj = js.Dynamic.literal()
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIntegrationResponsesResponse]
  }
}

