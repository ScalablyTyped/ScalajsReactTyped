package typingsJapgolly.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPipelinesResponse extends js.Object {
  /**
    * The token to retrieve the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of "PipelineSummary" objects.
    */
  var pipelineSummaries: js.UndefOr[PipelineSummaries] = js.native
}

object ListPipelinesResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, pipelineSummaries: PipelineSummaries = null): ListPipelinesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (pipelineSummaries != null) __obj.updateDynamic("pipelineSummaries")(pipelineSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPipelinesResponse]
  }
}

