package typingsJapgolly.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTerminologiesResponse extends js.Object {
  /**
    *  If the response to the ListTerminologies was truncated, the NextToken fetches the next group of custom terminologies.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.translateMod.NextToken] = js.native
  /**
    * The properties list of the custom terminologies returned on the list request.
    */
  var TerminologyPropertiesList: js.UndefOr[typingsJapgolly.awsSdk.translateMod.TerminologyPropertiesList] = js.native
}

object ListTerminologiesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, TerminologyPropertiesList: TerminologyPropertiesList = null): ListTerminologiesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TerminologyPropertiesList != null) __obj.updateDynamic("TerminologyPropertiesList")(TerminologyPropertiesList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTerminologiesResponse]
  }
}

