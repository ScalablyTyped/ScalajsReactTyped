package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTrialComponentsRequest extends js.Object {
  /**
    * A filter that returns only components created after the specified time.
    */
  var CreatedAfter: js.UndefOr[js.Date] = js.native
  /**
    * A filter that returns only components created before the specified time.
    */
  var CreatedBefore: js.UndefOr[js.Date] = js.native
  /**
    * A filter that returns only components that are part of the specified experiment. If you specify ExperimentName, you can't filter by SourceArn or TrialName.
    */
  var ExperimentName: js.UndefOr[ExperimentEntityName] = js.native
  /**
    * The maximum number of components to return in the response. The default value is 10.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.MaxResults] = js.native
  /**
    * If the previous call to ListTrialComponents didn't return the full set of components, the call returns a token for getting the next set of components.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * The property used to sort results. The default value is CreationTime.
    */
  var SortBy: js.UndefOr[SortTrialComponentsBy] = js.native
  /**
    * The sort order. The default value is Descending.
    */
  var SortOrder: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.SortOrder] = js.native
  /**
    * A filter that returns only components that have the specified source Amazon Resource Name (ARN). If you specify SourceArn, you can't filter by ExperimentName or TrialName.
    */
  var SourceArn: js.UndefOr[String256] = js.native
  /**
    * A filter that returns only components that are part of the specified trial. If you specify TrialName, you can't filter by ExperimentName or SourceArn.
    */
  var TrialName: js.UndefOr[ExperimentEntityName] = js.native
}

object ListTrialComponentsRequest {
  @scala.inline
  def apply(
    CreatedAfter: js.Date = null,
    CreatedBefore: js.Date = null,
    ExperimentName: ExperimentEntityName = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    SortBy: SortTrialComponentsBy = null,
    SortOrder: SortOrder = null,
    SourceArn: String256 = null,
    TrialName: ExperimentEntityName = null
  ): ListTrialComponentsRequest = {
    val __obj = js.Dynamic.literal()
    if (CreatedAfter != null) __obj.updateDynamic("CreatedAfter")(CreatedAfter.asInstanceOf[js.Any])
    if (CreatedBefore != null) __obj.updateDynamic("CreatedBefore")(CreatedBefore.asInstanceOf[js.Any])
    if (ExperimentName != null) __obj.updateDynamic("ExperimentName")(ExperimentName.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    if (SourceArn != null) __obj.updateDynamic("SourceArn")(SourceArn.asInstanceOf[js.Any])
    if (TrialName != null) __obj.updateDynamic("TrialName")(TrialName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrialComponentsRequest]
  }
}

