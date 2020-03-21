package typingsJapgolly.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIntentVersionsResponse extends js.Object {
  /**
    * An array of IntentMetadata objects, one for each numbered version of the intent plus one for the $LATEST version.
    */
  var intents: js.UndefOr[IntentMetadataList] = js.native
  /**
    * A pagination token for fetching the next page of intent versions. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetIntentVersionsResponse {
  @scala.inline
  def apply(intents: IntentMetadataList = null, nextToken: NextToken = null): GetIntentVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (intents != null) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIntentVersionsResponse]
  }
}

