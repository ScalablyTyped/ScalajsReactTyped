package typingsJapgolly.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVocabulariesRequest extends js.Object {
  /**
    * The maximum number of vocabularies to return in the response. If there are fewer results in the list, this response contains only the actual results.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.transcribeserviceMod.MaxResults] = js.native
  /**
    * When specified, the vocabularies returned in the list are limited to vocabularies whose name contains the specified string. The search is case-insensitive, ListVocabularies will return both "vocabularyname" and "VocabularyName" in the response list.
    */
  var NameContains: js.UndefOr[VocabularyName] = js.native
  /**
    * If the result of the previous request to ListVocabularies was truncated, include the NextToken to fetch the next set of jobs.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.transcribeserviceMod.NextToken] = js.native
  /**
    * When specified, only returns vocabularies with the VocabularyState field equal to the specified state.
    */
  var StateEquals: js.UndefOr[VocabularyState] = js.native
}

object ListVocabulariesRequest {
  @scala.inline
  def apply(
    MaxResults: Int | Double = null,
    NameContains: VocabularyName = null,
    NextToken: NextToken = null,
    StateEquals: VocabularyState = null
  ): ListVocabulariesRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NameContains != null) __obj.updateDynamic("NameContains")(NameContains.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StateEquals != null) __obj.updateDynamic("StateEquals")(StateEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVocabulariesRequest]
  }
}

