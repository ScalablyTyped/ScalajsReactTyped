package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTransformJobsResponse extends js.Object {
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of transform jobs, use it in the next request.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * An array of TransformJobSummary objects.
    */
  var TransformJobSummaries: typingsJapgolly.awsSdk.sagemakerMod.TransformJobSummaries = js.native
}

object ListTransformJobsResponse {
  @scala.inline
  def apply(TransformJobSummaries: TransformJobSummaries, NextToken: NextToken = null): ListTransformJobsResponse = {
    val __obj = js.Dynamic.literal(TransformJobSummaries = TransformJobSummaries.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTransformJobsResponse]
  }
}

