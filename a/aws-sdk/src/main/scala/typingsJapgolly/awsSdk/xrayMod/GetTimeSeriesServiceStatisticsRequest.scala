package typingsJapgolly.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTimeSeriesServiceStatisticsRequest extends js.Object {
  /**
    * The end of the time frame for which to aggregate statistics.
    */
  var EndTime: js.Date = js.native
  /**
    * A filter expression defining entities that will be aggregated for statistics. Supports ID, service, and edge functions. If no selector expression is specified, edge statistics are returned. 
    */
  var EntitySelectorExpression: js.UndefOr[typingsJapgolly.awsSdk.xrayMod.EntitySelectorExpression] = js.native
  /**
    * The ARN of the group for which to pull statistics from.
    */
  var GroupARN: js.UndefOr[typingsJapgolly.awsSdk.xrayMod.GroupARN] = js.native
  /**
    * The case-sensitive name of the group for which to pull statistics from.
    */
  var GroupName: js.UndefOr[typingsJapgolly.awsSdk.xrayMod.GroupName] = js.native
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Aggregation period in seconds.
    */
  var Period: js.UndefOr[NullableInteger] = js.native
  /**
    * The start of the time frame for which to aggregate statistics.
    */
  var StartTime: js.Date = js.native
}

object GetTimeSeriesServiceStatisticsRequest {
  @scala.inline
  def apply(
    EndTime: js.Date,
    StartTime: js.Date,
    EntitySelectorExpression: EntitySelectorExpression = null,
    GroupARN: GroupARN = null,
    GroupName: GroupName = null,
    NextToken: String = null,
    Period: Int | scala.Double = null
  ): GetTimeSeriesServiceStatisticsRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    if (EntitySelectorExpression != null) __obj.updateDynamic("EntitySelectorExpression")(EntitySelectorExpression.asInstanceOf[js.Any])
    if (GroupARN != null) __obj.updateDynamic("GroupARN")(GroupARN.asInstanceOf[js.Any])
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Period != null) __obj.updateDynamic("Period")(Period.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTimeSeriesServiceStatisticsRequest]
  }
}

